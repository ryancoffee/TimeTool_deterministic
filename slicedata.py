#!/reg/g/psdm/sw/conda/inst/miniconda2-prod-rhel7/envs/ana-1.3.58/bin/python
import numpy as np
import math

datadir = './data/raw/'
outputdir = './data/processed/'

vwin = (610,640)
runstr = '119'
expstr = str('xppc00117')

matfilename="%s/%s_r%s_%i_%i_matrix.dat" % (datadir,expstr,runstr,vwin[0],vwin[1])
print(matfilename)
matdata = np.loadtxt(matfilename,dtype=float).T
print(matdata.shape)
filename=datadir + expstr + '_r' + runstr + '_ipm.dat'
ipmdata = np.loadtxt(filename,dtype=float)
filename=datadir + expstr + '_r' + runstr + '_delays.dat'
delaydata = np.loadtxt(filename,usecols=(0,),dtype=float)

#for ipm2 we want logarithmically distributed slice bins
nbins = 10
ipmbins = np.exp(np.linspace(np.log(1e3),np.log(1e5),nbins))
imphist,ipmedges = np.histogram(ipmdata[:,1],bins=ipmbins)
delayhist,delayedges = np.histogram(delaydata,bins=10)
out = np.column_stack((imphist,ipmedges[:-1]))
filename = outputdir + expstr + '_r' + runstr + '_ipm.hist'
np.savetxt(filename,out,fmt='%i')

ipmindices = np.digitize(ipmdata[:,1],ipmedges,right=True)
delayindices = np.digitize(delaydata,delayedges,right=True)
print(ipmindices)
print(delayindices)
#one could do the same to np.digitize the delays and then use the delay indices and the ipmindices set filenames for writing results into disk.
