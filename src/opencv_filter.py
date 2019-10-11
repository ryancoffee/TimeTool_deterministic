#!/usr/bin/python3

import numpy as np
import cv2
import sys
import re


def main():
    if len(sys.argv)<2:
        print('I need some files to proces')
        return
    fnames = sys.argv[1:]
    szv=8
    szh=64
    szv = (szv//2)*2 + 1
    szh = (szh//2)*2 + 1
    poolkern = np.ones((4,8),dtype=float)
    x=np.linspace(-1,1,szh)
    y=np.linspace(-1,1,szv)
    xx,yy = np.meshgrid(x,y)
    skiprows = 0 #256
    data = np.loadtxt(sys.argv[1],skiprows = skiprows)
    mask = expandkernel( kernel(xx,yy) , data)
    dmask = expandkernel( hdkernel(xx,yy) , data)
    mdmask = expandkernel( hdkernel(-xx,yy) , data)
    MASK = np.fft.fft2(mask,axes=(0,1))
    DMASK = np.fft.fft2(dmask,axes=(0,1))
    MDMASK = np.fft.fft2(mdmask,axes=(0,1))
    m = re.search('(.*)raw/(.*).dat',sys.argv[1])
    if m:
        outdir = m.group(1) + 'processed/'
        out = np.roll( np.roll(kernel(xx,yy),xx.shape[0]//2+1,axis=0) , yy.shape[1]//2,axis=1)
        np.savetxt(outdir + m.group(2) + '.maskcheck.dat',out ) 
        cv2.imwrite(outdir + m.group(2) + '.maskcheck.jpg', jpgnorm(out))
        out = np.roll( np.roll(hdkernel(xx,yy),xx.shape[0]//2+1,axis=0) , yy.shape[1]//2,axis=1)
        np.savetxt(outdir + m.group(2) + '.dmaskcheck.dat', out)
        cv2.imwrite(outdir + m.group(2) + '.dmaskcheck.jpg', jpgnorm(out))
        out = np.roll( np.roll(hdkernel(-xx,yy),xx.shape[0]//2+1,axis=0) , yy.shape[1]//2,axis=1) 
        np.savetxt(outdir + m.group(2) + '.mdmaskcheck.dat', out)
        cv2.imwrite(outdir + m.group(2) + '.mdmaskcheck.jpg', jpgnorm(out))
    
    for name in fnames:
        m = re.search('(.*)raw/(.*).dat',name)
        if m:
            outdir = m.group(1) + 'processed/'
            outname = m.group(2) + '.jpg'
            powername = m.group(2) + '.power'
            data = np.loadtxt(name,skiprows=skiprows)
            cv2.imwrite(outdir + m.group(2) + '.orig.jpg', jpgnorm(np.copy(data)))
            DATA = np.fft.fft2(data,axes=(0,1))
            np.savetxt(outdir + powername,np.abs(DATA),fmt='%.3e')
            out = np.fft.ifft2(DATA*MASK,axes=(0,1)).real
            maxs = np.tile( np.max(out,axis=1).reshape(out.shape[0],1),(1,out.shape[1]) )
            out /= maxs
            res = meanpool(out,poolkern)
            imres = np.zeros((res.shape[0],res.shape[1],3),dtype=float)
            imres[:,:,0] = np.copy(res)*(res>0)
            maskedname = m.group(2) + '.filter0.dat'
            np.savetxt(outdir + maskedname,res,fmt='%.3e')
            cv2.imwrite(outdir + m.group(2) + '.filter0.jpg', jpgnorm(res*(res>0)))
            out = np.fft.ifft2(DATA*DMASK,axes=(0,1)).real
            out /= maxs
            res = meanpool(out,poolkern)
            imres[:,:,1] = np.copy(res)*(res>0)
            maskedname = m.group(2) + '.filter1.dat'
            np.savetxt(outdir + maskedname,res,fmt='%.3e')
            cv2.imwrite(outdir + m.group(2) + '.filter1.jpg', jpgnorm(res*(res>0)))
            out = np.fft.ifft2(DATA*MDMASK,axes=(0,1)).real
            out /= maxs
            res = meanpool(out,poolkern)
            imres[:,:,2] = np.copy(res)*(res>0)
            maskedname = m.group(2) + '.filter2.dat'
            np.savetxt(outdir + maskedname,res,fmt='%.3e')
            cv2.imwrite(outdir + m.group(2) + '.filter2.jpg', jpgnorm(res*(res>0)))
            out = np.uint8(jpgnorm(imres))
            cv2.imwrite(outdir + m.group(2) + '.allfilters.jpg', out)# cv2.cvtColor(out,cv2.COLOR_YCrCb2RGB))
            
            print(outdir + outname)
    return

def meanpool(m,k):
    nh = m.shape[0]//k.shape[0]
    nv = m.shape[1]//k.shape[1]
    r = np.zeros((nh+1,nv+1),dtype = float)
    for i in range(nh):
        for j in range(nv):
            r[i,j] = np.mean(m[i*k.shape[0]:(i+1)*k.shape[0],j*k.shape[1]:(j+1)*k.shape[1]])
    return r

def kernel(xx,yy):
    kk = np.power(np.cos(xx*np.pi/2),int(2))*np.power(np.cos(yy*np.pi/2),int(2))
    kk = np.roll(kk,-xx.shape[0]//2,axis=0)
    kk = np.roll(kk,-yy.shape[1]//2,axis=1)
    return kk

def hdkernel(xx,yy):
    kk = np.cos(xx*np.pi/2)*np.sin(xx*np.pi)*np.power(np.cos(yy*np.pi/2),int(2))
    kk = np.roll(kk,-xx.shape[0]//2,axis=0)
    kk = np.roll(kk,-yy.shape[1]//2,axis=1)
    return kk

def expandkernel(kern,data):
    h = kern.shape[0]//2
    v = kern.shape[1]//2
    mask = np.zeros(data.shape)
    mask[:h,:v] = kern[:h,:v]
    mask[-h-1:,:v] = kern[-h-1:,:v]
    mask[:h,-v-1:] = kern[:h,-v-1:]
    mask[-h-1:,-v-1:] = kern[-h-1:,-v-1:]
    return mask


def jpgnorm(x):
    result = np.zeros(x.shape)
    if len(x.shape)>2:
        for i in range(x.shape[2]):
            r = np.copy(x[:,:,i])
            mn = np.min(r)
            r -= mn
            mx = np.max(r)
            r *= 255./mx
            result[:,:,i] = r
    else:
        r = np.copy(x[:,:])
        mn = np.min(r)
        r -= mn
        mx = np.max(r)
        r *= 255./mx
        result[:,:] = r
    return result

if __name__ == '__main__':
    main()
