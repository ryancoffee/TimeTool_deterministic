#!/usr/bin/python3

import numpy as np
import sys
import re
from utility import highpass,lowpass,gauss,sigmoid
#import cv2

def logprocess(invec,bwd=1e2,dt=1):
    f = np.fft.fftfreq(invec.shape[0],dt)/bwd
    offset = np.min(invec) - 1
    s = np.log( np.copy(invec) - offset )
    S = np.fft.fft(s) 
    I = np.zeros(S.shape,dtype = complex)
    DS = np.zeros(S.shape,dtype = complex)
    IDS = np.zeros(S.shape,dtype = complex)
    DS = np.zeros(S.shape,dtype = complex)
    DDS = np.zeros(S.shape,dtype = complex)
    MUL = np.zeros(S.shape,dtype = complex)
    inds = np.where(np.abs(f) < 1.)
    center = .2
    width = .05
    risefall = width/4.
    fallinds = np.where( (np.abs(f) > center+width-risefall) * (np.abs(f) < center+width+risefall) )
    riseinds = np.where( (np.abs(f) > center-width-risefall) * (np.abs(f) < center-width+risefall) )
    holdinds = np.where( (np.abs(f) > center-width+risefall) * (np.abs(f) < center+width-risefall) )
    #mulinds = np.where( (np.abs(f) < center+width ) * ( np.abs(f) > center-width) )
    #mulinds = np.where(np.abs(f) < .5)
    c2 = np.zeros(S.shape,dtype = float)
    c2[inds] = np.power(np.cos(np.abs(f[inds])*np.pi/2.),int(2))
    c2mul = np.zeros(S.shape,dtype = float)
    c2mul[riseinds] = np.power(np.cos(np.abs(f[riseinds] - (center-width) )/risefall*np.pi/2.),int(2))
    c2mul[fallinds] = np.power(np.cos(np.abs(f[fallinds] - (center+width) )/risefall*np.pi/2.),int(2))
    c2mul[holdinds] = 1. 
    #c2mul[mulinds] = np.power(np.cos((np.abs(f[mulinds])-center)/width*np.pi/2.),int(2))

    #c2mul[mulinds] = np.power(np.cos(np.abs(f[mulinds])*np.pi/2.),int(2))
    fpow1 = np.zeros(S.shape,dtype = float)
    fpow2 = np.zeros(S.shape,dtype = float)
    fpowm1 = np.zeros(S.shape,dtype = float)
    fpow2 = np.power(f,int(2))
    fpowm1[1:] = np.power(f[1:],int(-1))
    FILT_I = np.zeros(S.shape,dtype = complex)
    FILT_IDS = np.zeros(S.shape,dtype = complex)
    FILT_DS = np.zeros(S.shape,dtype = complex)
    FILT_DDS = np.zeros(S.shape,dtype = complex)
    FILT_MUL = np.zeros(S.shape,dtype = complex)
    FILT_I[inds] = c2[inds]*fpowm1[inds] + 0j
    FILT_IDS[inds] = c2[inds] + 0j
    FILT_DS[inds] = 0. + 1j * f[inds]*c2[inds]
    FILT_DDS[inds] = -fpow2[inds] * c2[inds] + 0j
    FILT_MUL = c2mul
    I[inds] = np.copy(S[inds]) * FILT_I[inds] 
    IDS[inds] = np.copy(S[inds]) * FILT_IDS[inds]
    DS[inds] = np.copy(S[inds]) * FILT_DS[inds] 
    DDS[inds] = np.copy(S[inds]) * FILT_DDS[inds]
    MUL = np.copy(S) * FILT_MUL
    MUL[0] = 0. + 0j
    #MUL[mulinds] = FILT_MUL[mulinds]

    dds = np.fft.ifft(DDS).real
    ds = np.fft.ifft(DS).real
    ids = np.fft.ifft(IDS).real
    i = np.fft.ifft(I).real
    mul = np.fft.ifft(MUL).real
    ########################################### getting close here ########################333

    thresh = np.zeros(ids.shape,dtype = float)
    thresh = ids - mul 
    THRESH = np.fft.fft(thresh) #* c2 * 1j * f
    THRESH[0] = 0.
    deltas = np.zeros(ids.shape,dtype = float)
    deltas = np.fft.ifft(THRESH).real
    mid = (np.max(deltas) + np.min(deltas))/2.
    scale = np.max(deltas) - np.min(deltas)
    deltas = sigmoid((deltas - mid)/scale*20) 
    ddeltas = np.fft.ifft((np.fft.fft(deltas) *1j * f)).real

    filt_i = np.exp(np.roll(np.fft.ifft(FILT_I),100))
    filt_ids = np.exp(np.roll(np.fft.ifft(FILT_IDS),100))
    filt_ds = np.exp(np.roll(np.fft.ifft(FILT_DS),100))
    filt_dds = np.exp(np.roll(np.fft.ifft(FILT_DDS),100))
    filt_mul = np.exp(np.roll(np.fft.ifft(FILT_MUL),100))
    pix = np.arange(len(ids))
    maxind = np.argmax(ddeltas)
    minind = np.argmin(ddeltas)
    win=int(25)
    inds = np.arange(maxind-win,maxind+win,dtype=int)
    risex = np.sum(ddeltas[inds]*pix[inds])/np.sum(ddeltas[inds])
    inds = np.arange(minind-win,minind+win,dtype=int)
    fallx = np.sum(ddeltas[inds]*pix[inds])/np.sum(ddeltas[inds])
    print(risex,fallx,fallx-risex,scale)
    return np.column_stack(( f , np.abs(S), np.abs(I), np.abs(IDS), np.abs(DS), np.abs(DDS) , invec, i, ids,ds,dds,thresh,deltas,filt_i.real,filt_ids.real,filt_ds.real,filt_dds.real, mul, filt_mul.real, np.abs(MUL),ddeltas))


def theoryprocess(invec,bwd=1e2,dt=1):
    f = np.fft.fftfreq(invec.shape[0],dt)/bwd
    s = np.copy(invec)
    S = np.fft.fft(s) 
    I = np.zeros(S.shape,dtype = complex)
    DS = np.zeros(S.shape,dtype = complex)
    IDS = np.zeros(S.shape,dtype = complex)
    DS = np.zeros(S.shape,dtype = complex)
    DDS = np.zeros(S.shape,dtype = complex)
    inds = np.where(np.abs(f) < 1.)
    c2 = np.zeros(S.shape,dtype = float)
    c2[inds] = np.power(np.cos(np.abs(f[inds])*np.pi/2.),int(2))
    fpow1 = np.zeros(S.shape,dtype = float)
    fpow2 = np.zeros(S.shape,dtype = float)
    fpowm1 = np.zeros(S.shape,dtype = float)
    fpow2 = np.power(f,int(2))
    fpowm1[1:] = np.power(f[1:],int(-1))
    FILT_I = np.zeros(S.shape,dtype = complex)
    FILT_IDS = np.zeros(S.shape,dtype = complex)
    FILT_DS = np.zeros(S.shape,dtype = complex)
    FILT_DDS = np.zeros(S.shape,dtype = complex)
    FILT_I[inds] = c2[inds]*fpowm1[inds] + 0j
    FILT_IDS[inds] = c2[inds] + 0j
    FILT_DS[inds] = 0. + 1j * f[inds]*c2[inds]
    FILT_DDS[inds] = -fpow2[inds] * c2[inds] + 0j
    I[inds] = np.copy(S[inds]) * FILT_I[inds] 
    IDS[inds] = np.copy(S[inds]) * FILT_IDS[inds]
    DS[inds] = np.copy(S[inds]) * FILT_DS[inds] 
    DDS[inds] = np.copy(S[inds]) * FILT_DDS[inds]

    dds = np.fft.ifft(DDS).real
    ds = np.fft.ifft(DS).real
    ids = np.fft.ifft(IDS).real
    i = np.fft.ifft(I).real

    thresh = np.zeros(ids.shape,dtype = float)
    thresh = ids * dds
    deltas = np.zeros(ids.shape,dtype = float)
    inds = np.where(thresh < -5e-4)
    deltas[inds] = np.abs(1./(ds[inds]))

    filt_i = np.roll(np.fft.ifft(FILT_I),100)
    filt_ids = np.roll(np.fft.ifft(FILT_IDS),100)
    filt_ds = np.roll(np.fft.ifft(FILT_DS),100)
    filt_dds = np.roll(np.fft.ifft(FILT_DDS),100)

    return np.column_stack(( f , np.abs(S), np.abs(I), np.abs(IDS), np.abs(DS), np.abs(DDS) , invec, i, ids,ds,dds,thresh,deltas,filt_i.real,filt_ids.real,filt_ds.real,filt_dds.real))

def analogprocess(invec,bwd=1e2,dt=1):
    f = np.fft.fftfreq(invec.shape[0],dt)/bwd
    s = np.copy(invec)
    S = np.fft.fft(s)
    I = np.zeros(S.shape,dtype = complex)
    DS = np.zeros(S.shape,dtype = complex)
    IDS = np.zeros(S.shape,dtype = complex)
    DS = np.zeros(S.shape,dtype = complex)
    DDS = np.zeros(S.shape,dtype = complex)
    inds = np.where(np.abs(f) < 1.)
    logscale = 2000
    logf = np.zeros(S.shape,dtype = float)
    logf[1:] = np.log(np.abs(f[1:])*logscale)
    linds = np.where( logf < 0 ) 
    logf[linds] = 0.
    fpowm1p2 = np.zeros(S.shape,dtype = float)
    fpowm0p2 = np.zeros(S.shape,dtype = float)
    fpowm1p2[1:] = np.power(np.abs(f[1:]),-1.2).real
    fpowm0p2[1:] = np.power(np.abs(f[1:]),-0.2).real
    FILT_I = np.zeros(S.shape,dtype = complex)
    FILT_IDS = np.zeros(S.shape,dtype = complex)
    FILT_DS = np.zeros(S.shape,dtype = complex)
    FILT_DDS = np.zeros(S.shape,dtype = complex)
    FILT_I[inds] = np.cos(np.abs(f[inds])*np.pi/2.)*logf[inds]*fpowm1p2[inds] + 0.j
    FILT_IDS[inds] = np.cos(f[inds]*np.pi/2.)*logf[inds]*fpowm0p2[inds] + 0.j# already is leaving the 0th element zero via definition of logf and fpowm0p2
    FILT_DS[inds] = 0. + 1j * np.sin(f[inds]*np.pi) * np.cos(f[inds]*np.pi/2.) * logf[inds] * fpowm0p2[inds]
    FILT_DDS[inds] = -np.sin(f[inds]*np.pi) * np.cos(f[inds]*np.pi/2.) * logf[inds] * fpowm0p2[inds] * f[inds]  + 0.j
    I[inds] = np.copy(S[inds]) * FILT_I[inds] 
    IDS[inds] = np.copy(S[inds]) * FILT_IDS[inds]
    DS[inds] = np.copy(S[inds]) * FILT_DS[inds] 
    DDS[inds] = np.copy(S[inds]) * FILT_DDS[inds]
    dds = np.fft.ifft(DDS).real
    ds = np.fft.ifft(DS).real
    ids = np.fft.ifft(IDS).real
    i = np.fft.ifft(I).real

    filt_i = np.roll(np.fft.ifft(FILT_I),100)
    filt_ids = np.roll(np.fft.ifft(FILT_IDS),100)
    filt_ds = np.roll(np.fft.ifft(FILT_DS),100)
    filt_dds = np.roll(np.fft.ifft(FILT_DDS),100)

    thresh = np.zeros(ids.shape,dtype = float)
    thresh = ids * dds
    deltas = np.zeros(ids.shape,dtype = float)
    inds = np.where(thresh < -.1)
    deltas[inds] = np.abs(1./(ds[inds]))
    return np.column_stack(( f , np.abs(S), np.abs(I), np.abs(IDS), np.abs(DS), np.abs(DDS) , invec, i, ids,ds,dds,thresh,deltas,filt_i.real,filt_ids.real,filt_ds.real,filt_dds.real))

def main():
    if len(sys.argv)<1:
        return
    filenames = sys.argv[1:]
    f = np.array([])
    f_ = np.array([])
    for i,filename in enumerate(filenames):
        m = re.match('(.*)raw/(amox28216_r\d+_step\d+_image\d+.)dat',filename)
        if m:

            #data = np.log(np.abs(np.loadtxt(filename,skiprows=512))+1)
            data = np.loadtxt(filename,skiprows=512)
            scales = 1./(np.max(data,axis=1) - np.min(data,axis=1))
            datanorm = 2.*data*np.tile(scales,(data.shape[1],1)).T - 1.
            #for row in range(datanorm.shape[0]//2):
            row=68
            output = logprocess(data[row,:],bwd=.1,dt=1)
            outname = m.group(1) + 'processed/' + m.group(2) + 'cookiebox_filter.out'
            np.savetxt(outname,output,fmt='%.3e')
            print('saved {}'.format(outname))
            
        continue

############### working a smoother, not boolean, version ##################
        if m:
            outname = m.group(1) + 'processed/' + m.group(2) + 'out'
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
            outname = m.group(1) + 'processed/' + m.group(2) + 'simple.centroids.out'
            np.savetxt(outname,centroids.T,fmt='%.2f')
            print(len(centroids[inds])/centroids.shape[0])

###################### finishing smoother, filtered version #############


            #mulmat = np.outer(scales,derivfilt)
            #out = np.fft.ifft(DATA,axis=1).real
            #outname = m.group(1) + 'processed/' + m.group(2) + 'deriv.out'
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

            scales = 1./(np.max(absout,axis=1) - np.min(absout,axis=1))
            absout = absout*np.tile(scales,(absout.shape[1],1)).T

            a = np.log(absout)
            s = argout#np.sign(out)
            A = np.fft.fft(a,axis=1)
            B = np.copy(A)
            A *= gauss(f,0,.06)
            ALOW = np.copy(A)*gauss(f,0,.02)
            B *= highpass(f,0.1,.1)*lowpass(f,.3,.1)
            aa = np.fft.ifft(A,axis=1).real
            aalow = np.fft.ifft(ALOW,axis=1).real
            bb = np.fft.ifft(B,axis=1).real

            #out = np.ones(aalow.shape,dtype=float)*(aalow > .1)*(aa-bb > .1)
            out = (aa-bb)+(aalow-bb)
            out = out - np.max(out,axis=1) + 1
            out = sigmoid(out*5)
            #out = out * 256./np.max(out)
            #blur = cv2.medianBlur(out.astype(np.uint8),5)
            #out = sigmoid(((blur.astype(float)/256.)-.9)*10)
            #out = np.fft.ifft( np.fft.fft(np.copy(out),axis=0) * gauss(f_,0,.6),axis=0).real 
            #out[inds] = 0.
            #out *= 2.*np.tile(scales,(out.shape[1],1)).T
            #out -= np.tile(np.min(out,axis=1),(out.shape[1],1)).T + 1.



            outname = m.group(1) + 'processed/' + m.group(2) + 'lowfilt.out'
            np.savetxt(outname,out,fmt='%.4e')


            ramp = np.arange(out.shape[1])
            ramp.shape = (1,len(ramp))

            hf_centroids = np.zeros(out.shape[1],dtype=float)
            num = np.sum(out*ramp,axis=1)
            sums = np.sum(out,axis=1)
            inds = np.where(sums>10)
            hf_centroids[inds] = num[inds]/sums[inds]
            outname = m.group(1) + 'processed/' + m.group(2) + 'centroids.out'
            headerstring = 'simple\thomomorph'
            np.savetxt(outname,np.column_stack((centroids,hf_centroids)),fmt='%.2f',header=headerstring)


    return


if __name__ == '__main__':
    main()
