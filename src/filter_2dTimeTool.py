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
    filenames = sys.argv[1:]
    f = np.array([])
    f_ = np.array([])
    for i,filename in enumerate(filenames):
        m = re.match('(.*amox28216_r\d+_step\d+_image\d+.)dat',filename)
        if m:
            outname = m.group(1) + 'out'
            print(outname)
            data = np.log(np.abs(np.loadtxt(filename,skiprows=512))+1)
            if len(f)<data.shape[0]:
                f = np.fft.fftfreq(data.shape[1])
                f_ = np.fft.fftfreq(data.shape[0])
                print(f.shape)
            DATA_ = np.fft.fft(data,axis=0)*gauss(f_,0,.3).reshape(len(f_),1)
            DATAOF_ = np.fft.fft(data,axis=0)*gauss(f_,0,.003).reshape(len(f_),1)
            DATA = np.fft.fft(DATA_,axis=1)*gauss(f,0,.06)
            data_ = np.fft.ifft(DATA,axis=0)
            ddata_ = np.copy(data_)*1j*f
            out = np.fft.ifft(data_,axis=1).real + 1j*np.fft.ifft(ddata_).real
            #out = np.abs(out) - np.fft.ifft(DATAOF_,axis=1)
            np.savetxt(outname,np.abs(out),fmt='%.1e')
    return


if __name__ == '__main__':
    main()
