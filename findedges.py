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
for line in wclist:
	m = regexp.search('^\s*(\d+)\s+.*_r119_ipm(\d+)_del(\d+).out',line)
	if m:
		imax = max(imax,int(m.group(2)))
		dmax = max(dmax,int(m.group(3)))
		if int(m.group(1))>10: # more than 10 spectra in a given delay and ipm 2D-bin
			I = I + [int(m.group(2))]
			D = D + [int(m.group(3))]
			C = C + [int(m.group(1))]
		#print(m.group(0))

print([dmax,imax])
CMAT = sparse.coo_matrix((C,(D,I)),shape=(dmax+1,imax+1)).toarray()
print(CMAT.T)


