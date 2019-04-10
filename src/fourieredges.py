#!/usr/bin/python3
import sys
import numpy as np
from numpy.fft import fft,ifft,fftfreq
import math
import subprocess
import re as regexp
from scipy import sparse #import coo_matrix


def overfilter(cmat):
    #replot(log((1./x**2)*f(1e8,x,0,20)+exp(10)))
    w=2.5
    a=1.e8
    (ntiles,sz) = cmat.shape
    #print('(ntiles,sz) = (%i,%i))'%(ntiles,sz))
    noise = np.exp(10)
    f = np.zeros(sz,dtype=complex)
    f.real = fftfreq(sz,1./sz)
    f.imag[0] = 1.
    signal = np.power(np.abs(f),int(-2))*1e8*np.exp(-1.*np.power(f/w,int(2)))
    filt = 1.j*f*np.power(signal/(signal+noise),int(2))
    filt.real[0] = 0.
    filttile = np.tile(filt,(ntiles,1))
    return cmat*filttile

def weinerfilter(cmat):
    #replot(log((1./x**2)*f(1e8,x,0,20)+exp(10)))
    w=20.
    a=1.e8
    (ntiles,sz) = cmat.shape
    #print('(ntiles,sz) = (%i,%i))'%(ntiles,sz))
    noise = np.exp(10)
    f = np.zeros(sz,dtype=complex)
    f.real = fftfreq(sz,1./sz)
    f.imag[0] = 1.
    signal = np.power(np.abs(f),int(-2))*1e8*np.exp(-1.*np.power(f/w,int(2)))
    filt = 1.j*f*np.power(signal/(signal+noise),int(2))
    filt.real[0] = 0.
    filttile = np.tile(filt,(ntiles,1))
    return cmat*filttile

def edgedetect(mat):
    matFFT = fft(mat,axis=1)
    matFFT_cpy = np.copy(matFFT)
    matFFT = weinerfilter(matFFT)
    matFFT_cpy = overfilter(matFFT_cpy)
    mat_back = ifft(matFFT).real * np.abs(ifft(matFFT_cpy).real)
    maxinds = np.argmax(mat_back,axis=1)
    print(maxinds)
    mininds = np.argmin(mat_back,axis=1)
    rows=np.arange(len(maxinds))
    (maxvals, minvals) = (mat_back[rows,maxinds].astype(int) , mat_back[rows,mininds].astype(int))
    #(maxvals, minvals) = (mat_back[maxinds,rows].astype(int) , mat_back[mininds,rows].astype(int))
    return (maxinds,mininds,maxvals/1000,minvals/1000)

def main():
    dirname = './data_fs/raw/'
    filename = 'amo11816_r29_refsub_matrix.dat'
    if len(sys.argv)>1:
        m = regexp.search('^\s*(.*data_fs.*/)(.*.dat)$',str(sys.argv[1]))
        if m:
            dirname = m.group(1)
            filename = m.group(2)
    print('This data is {}\t{}'.format(dirname,filename))
    data = np.loadtxt('{}{}'.format(dirname,filename),dtype=float)
    if data.shape[0] == 1024:
        data = data.T
    print(data.shape)
    (maxinds,mininds,maxvals,minvals) = edgedetect(data)
    distance = np.abs(1.1*maxinds.astype(float)+105.-mininds.astype(float))
    np.savetxt('{}{}.inds'.format(dirname,filename),np.column_stack((maxinds,mininds,maxvals,minvals,distance)),fmt='%i')
    trustinds = [i for i,v in enumerate(distance) if np.power(float(v),int(-2))>.01]
    print('{}% is {} rows'.format(len(trustinds)/len(distance),len(trustinds)))
    return

if __name__ == '__main__':
    main() 
