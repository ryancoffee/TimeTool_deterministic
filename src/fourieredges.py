#!/usr/bin/python3
import sys
import numpy as np
from numpy.fft import fft,ifft,fftfreq
import math
import subprocess
import re as regexp
from scipy import sparse #import coo_matrix

def edgesagree(rise,fall):
    y = float(rise-fall)
    x = float(rise)
    win = 100.
    a = -245.
    b = -0.37
    x0 = 425
    c = -0.0002
    yhigh=win/2+a+b*(x-x0)+c*math.pow(float(x)-x0,int(2))
    ylow=-win/2+a+b*(x-x0)+c*math.pow(float(x)-x0,int(2))
    return (ylow <= y <= yhigh)

def delta(x):
    x0 = 425.
    a = -241.821 #        +/- 0.1389       (0.05745%)
    b = -0.331548 #       +/- 0.001348     (0.4066%)
    c = -0.000341439 #    +/- 4.462e-06    (1.307%)
    d = -5.70297e-07 #    +/- 2.197e-08    (3.852%)
    return a+b*(x-x0)+c*math.pow(x-x0,int(2))+d*math.pow(x-x0,int(3))
    
def edgesagree3(rise,fall):
    y = float(rise-fall)
    x = float(rise)
    win = 100.
    ylow = -win/2+delta(rise)
    yhigh = ylow + win
    return (ylow <= y <= yhigh)

def delaycalib(x):
    a=-1.2
    b=-8.5e-3
    c=8e-6
    x0=425
    ps = a+b*(x-x0)+c*math.pow(x-x0,int(2))
    dps = b+2.*c
    return (ps,dps)

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
    dirname = './data_fs/processed/'
    basename = 'xppc0117_r136_ipm5'
    if len(sys.argv)>1:
        m = regexp.search('^\s*(.*data_fs.*/)(\w+)\.\w+$',str(sys.argv[1]))
        if m:
            dirname = m.group(1)
            basename = m.group(2)
    ipmname = '{}.out'.format(basename)
    delaysname = '{}.del'.format(basename)
    print('This data is {}\t{}'.format(dirname,ipmname))
    data = np.loadtxt('{}{}'.format(dirname,ipmname),dtype=float)
    delaydata = 1e9*np.loadtxt('{}{}'.format(dirname,delaysname),dtype=float)
    if data.shape[0] == 1024:
        data = data.T
    print(data.shape)
    (maxinds,mininds,maxvals,minvals) = edgedetect(data)
    goodinds = [i for i,v in enumerate(maxinds) if edgesagree3(maxinds[i],mininds[i])]
    errorlist = [delta(v) - (maxinds[i] - mininds[i]) for i,v in enumerate(maxinds)]
    pserrorlist = []
    for i,e in enumerate(errorlist):
        (ps,dps)=delaycalib(maxinds[i])
        pserrorlist.append(dps*e)
    error = np.array(errorlist,dtype=float)
    pserror = np.array(pserrorlist,dtype=float)
    print(len(maxinds))
    print(len(error))
    np.savetxt('{}{}.inds'.format(dirname,basename),np.column_stack((maxinds,mininds,maxvals,minvals,delaydata,error,pserror)),fmt='%.3f')
    np.savetxt('{}{}.goodinds'.format(dirname,basename),np.column_stack((maxinds[goodinds],mininds[goodinds],maxvals[goodinds],minvals[goodinds],delaydata[goodinds],error[goodinds],pserror[goodinds])),fmt='%.3f')
    #trustinds = [i for i,v in enumerate(distance) if np.power(float(v),int(-2))>.01]
    #print('{}% is {} rows'.format(len(trustinds)/len(distance),len(trustinds)))
    psbins=np.linspace(-.2,.2,81)
    h,b=np.histogram(pserror[goodinds],bins=psbins)
    np.savetxt('{}{}.pserrhist'.format(dirname,basename),np.column_stack((b[:-1],h)),fmt='%.3f')
    psbins=np.linspace(-2,2,801)
    h,b=np.histogram(pserror,bins=psbins)
    np.savetxt('{}{}.pserrhistall'.format(dirname,basename),np.column_stack((b[:-1],h)),fmt='%.3f')
    return

if __name__ == '__main__':
    main() 
