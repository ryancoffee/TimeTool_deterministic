#!/reg/g/psdm/sw/conda/inst/miniconda2-prod-rhel7/envs/ana-1.3.58/bin/python
import numpy as np
import math
import sys

print('syntax: ./slicedata.py nbins_ipm nbins_delay')
print(sys.argv)
if len(sys.argv) < 3:
	nbins_ipm = 20
	nbins_del = 10
else:
	nbins_ipm = int(sys.argv[1])# 10
	nbins_del = int(sys.argv[2])# 10

datadir = './data_fs/raw/'
outputdir = './data_fs/processed/'

vwin = (575,585)#(610,640)
runstr = '136_refsub'
expstr = str('xppc00117')

matfilename="%s%s_r%s_%i_%i_matrix.dat" % (datadir,expstr,runstr,vwin[0],vwin[1])
print(matfilename)
matdata = np.loadtxt(matfilename,dtype=float).T
print(matdata.shape)
filename=datadir + expstr + '_r' + runstr + '_ipm.dat'
ipmdata = np.loadtxt(filename,dtype=float)
filename=datadir + expstr + '_r' + runstr + '_delays.dat'
delaydata = np.loadtxt(filename,usecols=(0,),dtype=float)

#for ipm2 we want logarithmically distributed slice bins
ipmbins = np.exp(np.linspace(np.log(1e2),np.log(1e5),nbins_ipm))
imphist,ipmedges = np.histogram(ipmdata[:,1],bins=ipmbins)
delayhist,delayedges = np.histogram(delaydata,bins=nbins_del)
out = np.column_stack((imphist,ipmedges[:-1]))
filename = outputdir + expstr + '_r' + runstr + '_ipm.hist'
np.savetxt(filename,out,fmt='%i')
out = np.column_stack((delayhist,delayedges[:-1]))
filename = outputdir + expstr + '_r' + runstr + '_delay.hist'
np.savetxt(filename,out,fmt='%f')

delayindices = np.digitize(delaydata,delayedges,right=True)
#print(ipmindices)
#print(delayindices)
#ipmind = 8
#delind = 5
for delind in range(nbins_del):
	#print('matdata.shape = ', matdata.shape)
	thisdelayinds = [i for i,d in enumerate(delayindices) if d==delind]
	delmat = matdata[thisdelayinds,:]
	#print('delmat.shape = ',delmat.shape)
	ipmindices = np.digitize(ipmdata[thisdelayinds,1],ipmedges,right=True)
	for ipmind in range(nbins_ipm):
		thisipminds = [i for i,ipmv in enumerate(ipmindices) if ipmv==ipmind]
		outmat = delmat[thisipminds,:]
		#print('outmat.shape = ',outmat.shape)
		#indicatorstring = ''.join(['.']*int(math.log(outmat.shape[0]+np.exp(1))))
		indicatorstring = ''.join(['.']*int(outmat.shape[0]//10))
		print('%i\t%s' % (outmat.shape[0],indicatorstring))
		filename = outputdir + expstr + '_r' + runstr + '_ipm' + str(ipmind) + '_del' + str(delind) + '.out'
		np.savetxt(filename,outmat,fmt='%i')

#one could do the same to np.digitize the delays and then use the delay indices and the ipmindices set filenames for writing results into disk.
