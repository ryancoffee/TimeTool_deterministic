#!/usr/bin/python3.5

import numpy as np
import sys
import re


def gauss(x,c,w):
    return np.exp(-np.power((x-c)/w,int(2)))
def highpass(f,c,w):
    inds = np.where((abs(f)>c-w/2.)*(abs(f)<c+w/2.))
    y = np.zeros(f.shape,dtype=float)
    y[inds] += np.power(np.sin((np.abs(f[inds])-c-w)/w*np.pi/2.),int(2))
    inds = np.where(abs(f)>=c+w/2.)
    y[inds] = 1.
    return y
def lowpass(f,c,w):
    inds = np.where((abs(f)>c-w/2.)*(abs(f)<c+w/2.))
    y = np.zeros(f.shape,dtype=float)
    y[inds] += np.power(np.cos((np.abs(f[inds])-c-w)/w*np.pi/2.),int(2))
    inds = np.where(abs(f)<=c-w/2.)
    y[inds] = 1.
    return y



def main():
    if len(sys.argv)<1:
        return
    filenames = sys.argv[1:]
    f = np.array([])
    f_ = np.array([])
    for i,filename in enumerate(filenames):
        m = re.match('(.*amox28216_r\d+_step\d+_image\d+.)dat',filename)
        if m:
            outname = m.group(1) + 'out'
            data = np.log(np.abs(np.loadtxt(filename,skiprows=512))+1)
            if len(f)<data.shape[0]:
                f = np.fft.fftfreq(data.shape[1])
                f_ = np.fft.fftfreq(data.shape[0])
            DATA_ = np.fft.fft(data,axis=0)*gauss(f_,0,.3).reshape(len(f_),1)
            DATAOF_ = np.fft.fft(data,axis=0)*gauss(f_,0,.003).reshape(len(f_),1)
            DATA = np.fft.fft(DATA_,axis=1)*gauss(f,0,.06)
            data_ = np.fft.ifft(DATA,axis=0)
            ddata_ = np.copy(data_)*1j*f
            out = np.abs(np.fft.ifft(data_,axis=1).real + 1j*np.fft.ifft(ddata_).real)
            np.savetxt(outname,out,fmt='%.2f')
            print(outname)

            data = np.loadtxt(filename)#,skiprows=512)
            scales = 1./(np.max(data,axis=1) - np.min(data,axis=1))

            derivfilt = gauss(f,0,.06)*1j*f
            mulmat = np.outer(scales,derivfilt)
            DATA = np.fft.fft(data,axis=1)*mulmat # * np.tile(derivfilt,(len(f_),1))
            out = np.fft.ifft(DATA,axis=1).real
            outname = m.group(1) + 'deriv.out'
            np.savetxt(outname,out,fmt='%.2e')

############## this is the algo for simple analysis #####################
            out = data*np.tile(scales,(data.shape[1],1)).T
            out += 1.

            a = np.log(np.abs(out))
            s = np.sign(out)
            A = np.fft.fft(a,axis=1)
            B = np.copy(A)
            A *= gauss(f,0,.06)
            ALOW = np.copy(A)*gauss(f,0,.006)
            B *= highpass(f,0.1,.1)*lowpass(f,.5,.1)
            aa = np.fft.ifft(A,axis=1).real
            aalow = np.fft.ifft(ALOW,axis=1).real
            bb = np.fft.ifft(B,axis=1).real

            out = np.ones(aalow.shape,dtype=float)*(aalow > .1)*(aa-bb > .1)
            ramp = np.arange(out.shape[1])
            ramp.shape = (1,len(ramp))

            outname = m.group(1) + 'lowfilt.out'
            np.savetxt(outname,out,fmt='%i')

            centroids = np.sum(out*ramp,axis=1)
            print(centroids.shape)
            sums = np.sum(out,axis=1)
            inds = np.where(sums>0)
            centroids[inds] /= sums[inds]
            outname = m.group(1) + 'centroids.out'
            np.savetxt(outname,centroids.T,fmt='%.2f')


    return


if __name__ == '__main__':
    main()
