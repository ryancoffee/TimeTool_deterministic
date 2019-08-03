#!/reg/g/psdm/sw/conda/inst/miniconda2-prod-rhel7/envs/ana-1.3.58/bin/python
import numpy as np
import math
import subprocess
import re as regexp
from scipy import sparse #import coo_matrix
from utility import step,gauss

def weinerfilter(cmat,dorder):
    #replot(log((1./x**2)*f(1e8,x,0,20)+exp(10)))
    w=20.
    a=1.e8
    (ntiles,sz) = cmat.shape
    #print('(ntiles,sz) = (%i,%i))'%(ntiles,sz))
    noise = np.exp(10)
    f = np.zeros(sz,dtype=complex)
    f.real = np.fft.fftfreq(sz,1./sz)
    f.imag[0] = 1.
    signal = np.power(np.abs(f),int(-2))*1e8*np.exp(-1.*np.power(f/w,int(2)))
    filt = np.power(1.j*f,int(dorder))*np.power(signal/(signal+noise),int(dorder+1))
    filt.real[0] = 0.
    filttile = np.tile(filt,(ntiles,1))
    return cmat*filttile

def convvec(sz,rise,fall):
    x = np.arange(sz,dtype=float)
    return np.roll(step((x-sz//4)/rise) - step((x-3*sz/4)/fall),sz//4)

def dconvvec(sz,rise):
    x = np.arange(sz,dtype=float)
    return np.roll(gauss((x-sz//2)/rise),sz//2)# - gauss((x-3*sz/4)/fall)


wclist = subprocess.check_output('wc -l ./data/processed/*.out', shell=True).split('\n')
I = []
D = []
C = []
G = []
imax = 0
dmax = 0
expname = ''
runnum = ''

for line in wclist:
    m = regexp.search('^\s*(\d+)\s+(.*data/processed/(.+)_(r136_refsub)_ipm(\d+)_del(\d+).out)$',line)
    if m:
    	nshots = int(m.group(1))
    	fullname = m.group(2)
    	expname = m.group(3)
    	runnum = m.group(4)
    	ipmbin = int(m.group(5))
    	delbin = int(m.group(6))
    	imax = max(imax,ipmbin)
    	dmax = max(dmax,delbin)
    	if nshots>1: # more than 10 spectra in a given delay and ipm 2D-bin
            I = I + [ipmbin]
            D = D + [delbin]
  	    C = C + [nshots]
    	    mat = np.loadtxt(fullname,dtype=float)
            matFFT = np.fft.fft(mat,axis=1)
            (rows,sz)=mat.shape
            """
            matFFT = weinerfilter(matFFT,0)
            convFFT = np.fft.fft(convvec(sz,10,20))
            convFFTtile = np.tile(convFFT,(rows,1))
            matFFT = matFFT * convFFTtile
            matback = np.real(np.fft.ifft(matFFT,axis=1))
            filename= fullname + '.convback'
            np.savetxt(filename,matback,fmt='%.3f')
            """
            dmatFFT = weinerfilter(matFFT,1)
            dconvFFT = np.fft.fft(dconvvec(sz,20))
            dconvFFTtile = np.tile(dconvFFT,(rows,1))
            dmatFFT = dmatFFT * dconvFFTtile
            dmatback = np.real(np.fft.ifft(dmatFFT,axis=1))
            filename= fullname + '.dconvback'
            np.savetxt(filename,dmatback,fmt='%.3f')

            inds = np.argmax(dmatback,axis=1)
            vals = np.max(dmatback,axis=1).astype(int)
            buff = 100
            fallinds = np.argmin(dmatback[:,buff:-buff],axis=1)+buff
            fallvals = np.min(dmatback[:,buff:-buff],axis=1).astype(int)

            filename= fullname + '.dconv.indsvals'
            headerstr = 'maxind\tmax\tminind\tmin'
            np.savetxt(filename,np.column_stack((inds,vals,fallinds,fallvals)),fmt='%i',header=headerstr)
            G = G + [100*len([i for i in inds if (i>300 and i<550)])/len(inds)]

GMAT = sparse.coo_matrix((G,(D,I)),shape=(dmax+1,imax+1)).toarray()
filename='./data/processed/%s_%s_goodpct_mat.dconv.hist' % (expname,runnum)
np.savetxt(filename,GMAT,fmt='%i')
print(GMAT.T)
