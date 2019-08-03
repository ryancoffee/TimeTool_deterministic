#!/usr/bin/python3.5

import numpy as np
import sys

def gauss(x,c,w):
    return np.exp(-np.power((x-c)/w,int(2)))

def sinstep(x,c,w,on=4,off=4):
    start = c-w/2. - on
    stop = c+w/2. + off
    y = np.zeros(x.shape,dtype=float)
    inds = np.where((x>start) * (x <= start+on))
    y[inds] += np.power(np.sin((x[inds]-start)/on*np.pi/2.),int(2))
    inds = np.where((x<stop) * (x >= stop-off))
    y[inds] += np.power(np.sin((stop-x[inds])/off*np.pi/2.),int(2))
    inds = np.where((x>start+on) * (x < stop-off))
    y[inds] = 1.
    print(y)
    return y

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
    x=np.linspace(-10,115,1250+1,dtype=float)
    ringing = np.array([0,11,22,33,44,55,66,77,88,99,110,121],dtype=float)
    s = np.sum( [np.power(-0.8,i)*gauss(x,c,1.5) for i,c in enumerate(ringing)] , axis=0)
    t = gauss(x,0,1.5)
    f = np.fft.fftfreq(len(x),x[1]-x[0])
    out = np.column_stack((x,t,s))
    np.savetxt('data_fs/processed/testmultiplicative.dat',out,fmt='%.4f')
    echo = np.power(np.fft.fft(np.log(np.power(np.fft.fft(s),int(2)))),int(2))
    np.savetxt('data_fs/processed/testmultiplicative.dat.fft',echo.real,fmt='%.4f')
    y = sinstep(x,50,15,5,7) + 1e-8
    mod = 1.-0.5*np.power(np.sin(x/6*np.pi),int(2)) 
    env = gauss(x,40,20)
    res = y*mod *env
    np.savetxt('data_fs/processed/testmultiplicative.mod.dat',np.column_stack((x,y,mod,env,res)),fmt='%.4f')
    Y = np.fft.fft(np.log(y))
    MOD = np.fft.fft(np.log(mod))
    ENV = np.fft.fft(np.log(env))
    RES = np.fft.fft(np.log(res))
    np.savetxt('data_fs/processed/testmultiplicative.mod.fft',np.column_stack((f,np.abs(Y),np.abs(MOD),np.abs(ENV),np.abs(RES))),fmt='%.4f')
    DEENV = RES*lowpass(f,.5,.15)
    DEMOD = RES*highpass(f,.5,.25)
    deenv = np.fft.ifft(DEENV).real
    demod = np.fft.ifft(DEMOD).real # - np.real(np.fft.ifft(DEMOD))) 
    np.savetxt('data_fs/processed/testmultiplicative.demod.dat',np.column_stack((x,y,np.log(res),deenv,demod,np.log(res)-demod)),fmt='%.4f')
    
    R = np.fft.fft(res)
    M = np.fft.fft(mod)
    D = 1j*f
    DR = D*R
    DM = D*M
    DDR = D*D*R
    DDM = D*D*M
    Rp = np.power(R,int(2))
    Mp = np.power(M,int(2))
    dres = np.fft.ifft(DR).real
    dmod = np.fft.ifft(DM).real
    ddres = 2.*np.fft.ifft(DDR).real
    ddmod = 2.*np.fft.ifft(DDM).real
    cres = dres + 1j*ddres
    AMPRES = np.fft.fft(np.abs(cres))
    AMPFILT = 1j*f*AMPRES*gauss(f,0,.25)
    #AMPFILT = AMPRES*lowpass(f,.25,.1)
    ampresfilt = np.fft.ifft(AMPFILT).real
    PHRES = np.fft.fft(np.unwrap(np.angle(cres)))
    AMPMAX = np.max(np.abs(AMPRES))
    AMPRES /= AMPMAX
    PHMAX = np.max(np.abs(PHRES))
    PHRES /= PHMAX
    np.savetxt('data_fs/processed/testconventional.demod.fft',np.column_stack((f,np.power(np.abs(AMPRES),int(2)).real,np.power(np.abs(PHRES),int(2)))),fmt='%.3e')
    np.savetxt('data_fs/processed/testconventional.demod.dat',np.column_stack((x,res,mod,dres,dmod,ddres,ddmod,ampresfilt,np.abs(cres))),fmt='%.4f')



    return

if __name__ == '__main__':
    main()
