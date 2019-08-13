#!/reg/g/psdm/sw/releases/ana-current/arch/x86_64-rhel7-gcc48-opt/bin/python

from psana import *;
import numpy as np;
from cmath import rect;
import pdb as debug;
from utility import *
import re
from sklearn.preprocessing import MinMaxScaler

def main():
	nprect = np.vectorize(rect)
	
	dirstr = './data_fs/processed/'
	#dirstr = './data_scratch/processed/'
	skipshots = 20
	skipsteps = 1
	num = 0.0

	ratio = .1
	runstrs = ['100']
	vwins = [(575,585)]*len(runstrs) 
	samplerates = [1000]*len(runstrs)
	printsamples = [False]*len(runstrs)
	subrefs = [True]*len(runstrs)
	delayscales = [1.e3]*len(runstrs)
	attens = [1.]*len(runstrs)
	expstrs = [str('amox28216')]*len(runstrs)
	dets = ['OPAL1']*len(runstrs) 
	nsamples = 1024
	eb_data_hdr = 'ebResults.ebeamL3Energy()\tebResults.ebeamCharge()\tebResults.ebeamEnergyBC1()\tebResults.ebeamEnergyBC2()\tebResults.ebeamLTU250()\tebResults.ebeamLTU450()\tebResults.ebeamLTUAngX()\tebResults.ebeamLTUAngY()\tebResults.ebeamLTUPosX()\tebResults.ebeamLTUPosY()\tebResults.ebeamUndAngX()\tebResults.ebeamUndAngY()\tebResults.ebeamUndPosX()\tebResults.ebeamUndPosY()\tebResults.ebeamPkCurrBC1()\tebResults.ebeamEnergyBC1()\tebResults.ebeamPkCurrBC2()\tebResults.ebeamEnergyBC2()\tebResults.ebeamDumpCharge()'
	gd_data_hdr = 'gdResults.f_11_ENRC()\tgdResults.f_12_ENRC()\tgdResults.f_21_ENRC()\tgdResults.f_22_ENRC()\tgdResults.f_63_ENRC()\tgdResults.f_64_ENRC()'
	d_data_hdr = 'delay\ttimsChoice\tourChoice\trms\tdelay\tattenuation\tgd_11\t12\t21\t22\t63\t64'
	
	for i in range(len(runstrs)):
		runstr = runstrs[i]
		expstr = expstrs[i]
		atten = attens[i]
		vwin = vwins[i]
		num = vwin[1]-vwin[0]
		printsample = printsamples[i]
		subref = subrefs[i]
		dsourcestr = 'exp={}:run={}:smd'.format(expstr,runstr)
		print("running:\t",dsourcestr)
		ds = DataSource(dsourcestr)
		print(DetNames('detectors'))
		'''print(DetNames('epics'))'''
		det = Detector(dets[i])
		GDdet = Detector('FEEGasDetEnergy')
		EBdet = Detector('EBeam')
		EOrbits = Detector('EOrbits')
		epics13x = Detector('AMO:PPL:MMS:13.RBV')
		xind = int(0)
		epics14y = Detector('AMO:PPL:MMS:14.RBV')
		yind = int(1)
		epics15z = Detector('AMO:PPL:MMS:15.RBV')
		zind = int(2)
		epics16t = Detector('AMO:PPL:MMS:16.RBV')
		tind = int(3)
		evr = Detector('NoDetector.0:Evr.0')
		cd = Detector('ControlData')
		y_init = 0
		y_final = 0
		R = np.zeros((0,nsamples),dtype=float)
		P = np.zeros((0,3),dtype=float)
		nsteps = 0

		for run in ds.runs():
			img = np.zeros((0,nsamples))
			for nstep,step in enumerate(run.steps()):
				nsteps = nstep
				if not nstep % skipsteps:
					for nevent,evt in enumerate(step.events()):
						if not nevent % skipshots:
							if (printsample and not nevent % samplerates[i]):
								print('x %.4f\ty %.4f\tz %.4f\tt %.4f\t\tfor step %i, image %i.' % (epics13x(),epics14y(),epics15z(),epics16t(),nstep,nevent))
								img = det.image(evt);
								if (img is None):
									continue
								filename='{}{}_r{}_step{}_image{}.dat'.format(dirstr, expstr, runstr, nstep, nevent)
								np.savetxt(filename,img,fmt='%i')
								print('image {} shape = {}'.format(filename,img.shape))
							rowsums = np.zeros(img.shape[0],dtype=int)
							img = det.image(evt)
							if img is not None:
								rowsums = np.sum(img,axis=1)
								p = np.array( (1e3*epics13x(),1e3*epics14y(),1e3*epics15z()) )
								if (R.shape[0] > 0 ) * (P.shape[0] > 0):
									R = np.row_stack( (R , rowsums) )
									P = np.row_stack( (P, p) )
								else:
									R = rowsums
									P = p

				if not nstep % 5:
					filename='{}{}_r{}_knife.dat'.format(dirstr,expstr,runstr)
					header = 'x[um]\ty[um]\tz[um]\trowsums, each row is 1024 long, so avg signal is the rowsum/1024'
					np.savetxt(filename,np.column_stack((P,R)),fmt='%i',header=header)
					print('intermittent save at step {}'.format(nstep))

		filename="%s/%s_r%s_knife.dat" % (dirstr,expstr,runstr)
		header = 'x[um]\ty[um]\tz[um]\trowsums, each row is 1024 long, so avg signal is the rowsum/1024'
		np.savetxt(filename,np.column_stack((P,R)),fmt='%i',header=header)

		row = 512
		ii8 = np.iinfo(np.int8)
		scaler = MinMaxScaler(feature_range = (ii8.min,ii8.max),copy = False)
		data = np.copy(R)
		data = scaler.fit_transform(data)
		filename="%s/%s_r%s_knife.scaled" % (dirstr,expstr,runstr)
		header = 'x[um]\ty[um]\tz[um]\trowsums, each row is 1024 long and values are scaled by sklearn.MinMaxScaler'
		np.savetxt(filename,np.column_stack((P,data)),fmt='%i',header=header)

		low = np.min(P[:,yind])
		high = np.max(P[:,yind])
		nbins = 10
		if nsteps > 20:
			nbins = nsteps//2 
		pbins = np.arange(low,high,25)
		vbins = np.arange(ii8.min,ii8.max,4)
		for row in range(0,2**10):
			h,bp,bv = np.histogram2d(P[:,yind],data[:,row],bins = [pbins,vbins])
			filename="%s/%s_r%s_knife.row%i.2dhist" % (dirstr,expstr,runstr,row)
			np.savetxt(filename,h.T,fmt='%i')
		''' 
		Now, centroid the hist over the values (rows) for each of the delay bins.  
		Format this as a tiled operation multiply by the np.sum( h*np.tile(vbins,shape??), axis=1?? ) / np.sum(h, axis = 1??)
		The result should be pbins long.  Now you can fft and derivative the result and do np.sum(dddres * dres * pbins)/npsum(3dres*dres) to get the ... inspired by CookieBox logic dd*ids
		This will give a vector of values that is delaybins long and can be fft differentiated to get the peak of the derivative...
		
		also, make a movie of the 2dhist... mostly because it will be pretty eye candy.
		'''

		print('Done saving for run ',runstr)
	
	print('Done.\n\t\t==== Have a nice day! :-)  =======\n\n')
	return

if __name__ == '__main__':
	main()
