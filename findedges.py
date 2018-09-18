#!/reg/g/psdm/sw/conda/inst/miniconda2-prod-rhel7/envs/ana-1.3.58/bin/python
import numpy as np
import math
import subprocess
import re as regexp
from scipy import sparse #import coo_matrix

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


print([dmax,imax])
CMAT = sparse.coo_matrix((C,(D,I)),shape=(dmax+1,imax+1)).toarray()
filename='./data/processed/%s_%s_count_mat.hist' % (expname,runnum)
np.savetxt(filename,CMAT,fmt='%i')
print(CMAT.T)


