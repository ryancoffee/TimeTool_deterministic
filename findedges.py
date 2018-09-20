#!/reg/g/psdm/sw/conda/inst/miniconda2-prod-rhel7/envs/ana-1.3.58/bin/python
import numpy as np
import math
import subprocess
import re as regexp
from scipy import sparse #import coo_matrix

def weinerfilter(cmat):
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
	filt = 1.j*f*np.power(signal/(signal+noise),int(2))
	filt.real[0] = 0.
	filttile = np.tile(filt,(ntiles,1))
	return cmat*filttile

wclist = subprocess.check_output('wc -l ./data/processed/*.out', shell=True).split('\n')
I = []
D = []
C = []
imax = 0
dmax = 0
expname = ''
runnum = ''
for line in wclist:
	m = regexp.search('^\s*(\d+)\s+(.*data/processed/(.+)_(r119)_ipm(\d+)_del(\d+).out)$',line)
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
			if (ipmbin<1):
				ref = np.mean(mat,axis=0,dtype=float)
			refmat = np.tile(ref,(mat.shape[0],1))
			mat = mat - refmat 
			filename= fullname + '.diff'
			np.savetxt(filename,mat,fmt='%i')
			matFFT = np.fft.fft(mat,axis=1)
			filename= fullname + '.fftabs'
			np.savetxt(filename,np.abs(matFFT),fmt='%.3f')
			matFFT = weinerfilter(matFFT)
			filename= fullname + '.filteredabs'
			np.savetxt(filename,np.abs(matFFT),fmt='%.3f')
			matback = np.real(np.fft.ifft(matFFT,axis=1))
			filename= fullname + '.fftback'
			np.savetxt(filename,matback,fmt='%.3f')
			inds = np.argmax(matback,axis=1)
			vals = np.max(matback,axis=1).astype(int)
			m_matback=sparse.coo_matrix((vals,(np.arange(inds.shape[0]),inds)),shape=matback.shape)
			#mask[inds[-1,:]-30:inds[-1,:]+30,:] = 0
			#m_matback=np.ma.array(matback,mask = sparse_mask.toarray())
			#outinds[:,1]=m_inds[-1,:]
			filename= fullname + '.maxinds'
			np.savetxt(filename,np.column_stack((inds,vals)),fmt='%i')
			filename= fullname + '.m_matback'
			np.savetxt(filename,m_matback.toarray(),fmt='%i')




print([dmax,imax])
CMAT = sparse.coo_matrix((C,(D,I)),shape=(dmax+1,imax+1)).toarray()
filename='./data/processed/%s_%s_count_mat.hist' % (expname,runnum)
np.savetxt(filename,CMAT,fmt='%i')
print(CMAT.T)


