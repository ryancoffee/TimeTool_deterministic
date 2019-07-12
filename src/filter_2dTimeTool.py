#!/usr/bin/python3.5

import numpy as np
import sys
import re
from utility import highpass,lowpass,gauss,sigmoid




def main():
    if len(sys.argv)<1:
        return
    filenames = sys.argv[1:]
    f = np.array([])
    f_ = np.array([])
    for i,filename in enumerate(filenames):
        m = re.match('(.*amox28216_r\d+_step\d+_image\d+.)dat',filename)
        if m:
############### working a smoother, not boolean, version ##################
            outname = m.group(1) + 'out'
            data = np.log(np.abs(np.loadtxt(filename))+1)#,skiprows=512))+1)
            scales = 1./(np.max(data,axis=1) - np.min(data,axis=1))
            if len(f)<data.shape[0]:
                f = np.fft.fftfreq(data.shape[1])
                f_ = np.fft.fftfreq(data.shape[0])
            out = 2.*data*np.tile(scales,(data.shape[1],1)).T - 1.

            #DATA_ = np.fft.fft(data,axis=0)*gauss(f_,0,.3).reshape(len(f_),1)
            #DATAOF_ = np.fft.fft(data,axis=0)*gauss(f_,0,.003).reshape(len(f_),1)
            DATA = np.fft.fft(out,axis=1)*gauss(f,0,.06)
            out = np.fft.ifft(DATA,axis=1).real
            #ddata_ = np.copy(data_)*1j*f
            #out = np.abs(np.fft.ifft(data_,axis=1).real + 1j*np.fft.ifft(ddata_).real)
            out = 2.*sigmoid(out*5.)-1.
            inds = np.where(out<0.)
            out[inds] = 0.
            np.savetxt(outname,out,fmt='%.2f')
            print(outname)

            ramp = np.arange(out.shape[1])
            ramp.shape = (1,len(ramp))

            centroids = np.zeros(out.shape[1],dtype=float)
            num = np.sum(out*ramp,axis=1)
            sums = np.sum(out,axis=1)
            inds = np.where(sums>10)
            centroids[inds] = num[inds]/sums[inds]
            outname = m.group(1) + 'simple.centroids.out'
            np.savetxt(outname,centroids.T,fmt='%.2f')
            print(len(centroids[inds])/centroids.shape[0])

###################### finishing smoother, filtered version #############


            #mulmat = np.outer(scales,derivfilt)
            #out = np.fft.ifft(DATA,axis=1).real
            #outname = m.group(1) + 'deriv.out'
            #np.savetxt(outname,out,fmt='%.2e')

############## this is the algo for homomorphic analysis #####################

            data = np.loadtxt(filename)#,skiprows=512)
            scales = 1./(np.max(data,axis=1) - np.min(data,axis=1))
            data = data*np.tile(scales,(data.shape[1],1)).T

            DATA = np.fft.fft(data,axis=1) * gauss(f,0,.06)
            DDATA = 1j*f*np.copy(DATA)

            out = np.fft.ifft(DATA).real + 1j * np.fft.ifft(DDATA).real
            absout = np.abs(out)
            argout = np.angle(out)

            a = np.log(absout)
            s = argout#np.sign(out)
            A = np.fft.fft(a,axis=1)
            B = np.copy(A)
            A *= gauss(f,0,.06)
            ALOW = np.copy(A)*gauss(f,0,.02)
            B *= highpass(f,0.1,.1)*lowpass(f,.5,.1)
            aa = np.fft.ifft(A,axis=1).real
            aalow = np.fft.ifft(ALOW,axis=1).real
            bb = np.fft.ifft(B,axis=1).real

            #out = np.ones(aalow.shape,dtype=float)*(aalow > .1)*(aa-bb > .1)
            out = (aa-bb)+(aalow-bb)
            inds = np.where(out<0)
            #out[inds] = 0.
            #out *= 2.*np.tile(scales,(out.shape[1],1)).T
            #out -= np.tile(np.min(out,axis=1),(out.shape[1],1)).T + 1.


            ramp = np.arange(out.shape[1])
            ramp.shape = (1,len(ramp))

            outname = m.group(1) + 'lowfilt.out'
            np.savetxt(outname,out,fmt='%.4e')

            centroids = np.zeros(out.shape[1],dtype=float)
            num = np.sum(out*ramp,axis=1)
            sums = np.sum(out,axis=1)
            inds = np.where(sums>10)
            centroids[inds] = num[inds]/sums[inds]
            outname = m.group(1) + 'centroids.out'
            np.savetxt(outname,centroids.T,fmt='%.2f')


    return


if __name__ == '__main__':
    main()
