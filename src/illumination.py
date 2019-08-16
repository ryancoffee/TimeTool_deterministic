#!/reg/g/psdm/sw/releases/ana-current/arch/x86_64-rhel7-gcc48-opt/bin/python

import numpy as np
from cmath import rect
import pdb as debug
import re
from sklearn.preprocessing import MinMaxScaler

from psana import *
from utility import *
#from types import *

from numpy import uint32 as uint32_t
from numpy import iinfo
info_uint32_t = iinfo(np.uint32)


def main():
	nprect = np.vectorize(rect)
	
	dirstr = './data_fs/processed/'
	#dirstr = './data_scratch/processed/'
	skipshots = 10

	runstrs = ['104']
	samplerates = [1000]*len(runstrs)
	printsamples = [True]*len(runstrs)
	expstrs = [str('amox28216')]*len(runstrs)
	dets = ['OPAL1']*len(runstrs) 
	nsamples = int(2**10)
	nrows = int(2**10)
	rows = np.arange(nrows,dtype = uint32_t()) #this needs to be uint32 so that it can handle 2**12 times npixels = 2**10, e.g. bitdepth * npixels
	
	for i in range(len(runstrs)):
		runstr = runstrs[i]
		expstr = expstrs[i]
		printsample = printsamples[i]
		dsourcestr = 'exp={}:run={}:smd'.format(expstr,runstr)
		print("running:\t",dsourcestr)
		ds = DataSource(dsourcestr)
		print(DetNames('detectors'))
		'''print(DetNames('epics'))'''
		det = Detector(dets[i])

		for run in ds.runs():
			img = np.zeros((0,nsamples),dtype = uint32_t())
			rowsums = np.zeros(nrows,dtype=uint32_t())
			for nevent,evt in enumerate(run.events()):
				if not nevent % skipshots:
					if (printsample and not nevent % samplerates[i]):
						img = det.image(evt);
						if (img is None):
							continue
						filename='{}{}_r{}_image{}.dat'.format(dirstr, expstr, runstr, nevent)
						np.savetxt(filename,img,fmt='%i')
						print('image {} shape = {}'.format(filename,img.shape))
					img = det.image(evt).astype(uint32_t())
					if img is not None:
						rowsums += np.sum(img,axis=1)
						if not nevent % 1000 and nevent > 1:
							filename='{}{}_r{}_illumination.dat'.format(dirstr,expstr,runstr)
							header = 'rowsums, each row is 1024 long, so avg signal is the rowsum/1024'
							out = np.column_stack((rows,rowsums))
							np.savetxt(filename,rowsums,fmt='%i',header=header)
							print('intermittent save at image {}'.format(nevent))

			filename="%s/%s_r%s_illumination.dat" % (dirstr,expstr,runstr)
			header = 'rowsums, each row is 1024 long, so avg signal is the rowsum/1024'
			out = np.column_stack((rows,rowsums))
			np.savetxt(filename,out,fmt='%i',header=header)
			h,b = np.histogram(out,bins = 100)
			filename="%s/%s_r%s_illumination.hist" % (dirstr,expstr,runstr)
			np.savetxt(filename,np.column_stack((b[:-1],h)),fmt='%i',header='Rowwise Illumination historgram')


		print('Done saving for run ',runstr)
	
	print('Done.\n\t\t==== Have a nice day! :-)  =======\n\n')
	return

if __name__ == '__main__':
	main()
