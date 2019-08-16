#!/reg/g/psdm/sw/releases/ana-current/arch/x86_64-rhel7-gcc48-opt/bin/python

import numpy as np
from cmath import rect
import pdb as debug
import re
from sklearn.preprocessing import MinMaxScaler

from psana import *
from utility import *
#from types import *

from numpy import int8 as int8_t
info_int8_t = np.iinfo(np.int8)
from numpy import uint16 as uint16_t
info_uint16_t = np.iinfo(np.uint16)

def main():
	nprect = np.vectorize(rect)
	
	dirstr = './data_fs/processed/'
	#dirstr = './data_scratch/processed/'
	skipshots = 10
	skipsteps = 1

	runstrs = ['100']
	samplerates = [1000]*len(runstrs)
	printsamples = [False]*len(runstrs)
	expstrs = [str('amox28216')]*len(runstrs)
	dets = ['OPAL1']*len(runstrs) 
	nsamples = 2**10
	nrows = 2**10
	rows = np.arange(nrows,dtype = uint16_t)
	eb_data_hdr = 'ebResults.ebeamL3Energy()\tebResults.ebeamCharge()\tebResults.ebeamEnergyBC1()\tebResults.ebeamEnergyBC2()\tebResults.ebeamLTU250()\tebResults.ebeamLTU450()\tebResults.ebeamLTUAngX()\tebResults.ebeamLTUAngY()\tebResults.ebeamLTUPosX()\tebResults.ebeamLTUPosY()\tebResults.ebeamUndAngX()\tebResults.ebeamUndAngY()\tebResults.ebeamUndPosX()\tebResults.ebeamUndPosY()\tebResults.ebeamPkCurrBC1()\tebResults.ebeamEnergyBC1()\tebResults.ebeamPkCurrBC2()\tebResults.ebeamEnergyBC2()\tebResults.ebeamDumpCharge()'
	gd_data_hdr = 'gdResults.f_11_ENRC()\tgdResults.f_12_ENRC()\tgdResults.f_21_ENRC()\tgdResults.f_22_ENRC()\tgdResults.f_63_ENRC()\tgdResults.f_64_ENRC()'
	d_data_hdr = 'delay\ttimsChoice\tourChoice\trms\tdelay\tattenuation\tgd_11\t12\t21\t22\t63\t64'
	
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
					print('intermittent save at step {}\tpaddle position = {}'.format(nstep,p))

		filename="%s/%s_r%s_knife.dat" % (dirstr,expstr,runstr)
		header = 'x[um]\ty[um]\tz[um]\trowsums, each row is 1024 long, so avg signal is the rowsum/1024'
		np.savetxt(filename,np.column_stack((P,R)),fmt='%i',header=header)

		row = 512
		scaler = MinMaxScaler(feature_range = (info_int8_t.min,info_int8_t.max),copy = False)
		data = np.copy(R)
		data = scaler.fit_transform(data)
		scaleout = np.outer( np.ones((1,R.shape[1])) , np.asarray([info_int8_t.max,info_int8_t.min]).reshape((1,2)) ).T
		valsout = scaler.inverse_transform(scaleout)
		rowscales = valsout[0,:]
		filename="%s/%s_r%s_knife.inversescale" % (dirstr,expstr,runstr)
		header = 'image rownumber\ttransformed max\ttransformed min'
		np.savetxt(filename,np.column_stack((rows,valsout.T)),fmt='%i',header = header)
		filename="%s/%s_r%s_knife.scaled" % (dirstr,expstr,runstr)
		header = 'x[um]\ty[um]\tz[um]\trowsums, each row is 1024 long and values are scaled by sklearn.MinMaxScaler'
		np.savetxt(filename,np.column_stack((P,data)),fmt='%i',header=header)

		low = np.min(P[:,yind])
		high = np.max(P[:,yind])
		nbins = 10
		if nsteps > 20:
			nbins = nsteps//2 
		pbins = np.arange(low,high+25,25)
		pramp = np.tile(pbins[:-1],reps = (2**10,1))
		vbins = np.arange(info_int8_t.min,info_int8_t.max,4)
		vramp = np.tile(vbins[:-1],reps = (len(pbins)-1,1))
		result = np.zeros((len(pbins)-1,2**10),dtype=float)
		for row in range(0,2**10):
			h,bp,bv = np.histogram2d(P[:,yind],data[:,row],bins = [pbins,vbins])
			filename="%s/%s_r%s_knife.row%i.2dhist" % (dirstr,expstr,runstr,row)
			np.savetxt(filename,h.T,fmt='%i')
			num = np.sum(h * vramp,axis = 1)
			denom = np.sum(h,axis = 1)
			inds = np.where(denom > 0)
			result[inds,row] = num[inds] / denom[inds]
		filename="%s/%s_r%s_knife.result" % (dirstr,expstr,runstr)
		np.savetxt(filename,result,fmt='%.3f')

		f = np.fft.fftfreq(result.shape[0])
		ftile = np.tile(f*cossq(f,20./result.shape[0]) ,reps = (result.shape[1],1)).T
		dresult = np.diff(np.row_stack((result,result[-1,:])),axis = 0)
		f2tile = np.tile(np.power(f,int(2))*cossq(f,20./result.shape[0]) ,reps = (dresult.shape[1],1)).T
		D3RESULT = np.fft.fft(dresult,axis = 0) * -1 * f2tile
		d3result = np.fft.ifft(D3RESULT,axis = 0).real
		inds = np.where(dresult > 0)
		dresult[inds] = 0.
		inds = np.where(d3result < 0)
		d3result[inds] = 0.
		result = -dresult*d3result
		thresh = 5e-2*np.max(result)
		inds = np.where(result<thresh)
		result[inds] = 0.
		filename="%s/%s_r%s_knife.modresult" % (dirstr,expstr,runstr)
		header = 'modresult'
		np.savetxt(filename,result,fmt='%.3f',header = header)
		num = np.sum(result * pramp.T,axis = 0)
		denom = np.sum(result,axis = 0)
		centroids = np.zeros(nrows,dtype = float)
		inds = np.where(denom > 0)
		centroids[inds] = num[inds]/denom[inds]

		'''
		Now getting rowscales i nthe fourier method
		'''
		filename="%s/%s_r%s_illumination.dat" % (dirstr,expstr,runstr)
		header = 'rows\trowsums\tddrowsums, each row is 1024 long, so avg signal is the rowsum/1024'
		f = np.fft.fftfreq(rowscales.shape[0])
		bwd = .2
		c2 = np.zeros(rowscales.shape[0],dtype=float)
		inds = np.where(abs(f)<bwd)
		c2[inds] = np.power(np.cos(f[inds]/bwd*np.pi/2),int(2))
		DDROWSCALES = np.fft.fft(rowscales) * -1 * np.power(f,int(2)) * c2
		ddrowscales = - np.fft.ifft(DDROWSCALES).real
		inds = np.where(ddrowscales < 0)
		ddrowscales[inds] = 0
		inds = np.where(ddrowscales > 0) # for use in result computed below
		num = np.fft.ifft( np.fft.fft(ddrowscales * rowscales) * c2 ).real
		denom = np.fft.ifft( np.fft.fft( ddrowscales )* c2 ).real  	
		result = np.zeros(rowscales.shape,dtype=float)
		result[inds] = num[inds]/denom[inds]
		'''
		Done with scales
		'''

		filename="%s/%s_r%s_knife.centroids" % (dirstr,expstr,runstr)
		header = 'rows\tcentroids\tscales\tfouriermethod scales'
		np.savetxt(filename,np.column_stack((rows,centroids,rowscales,result)),fmt='%.3f',header = header)
		
		''' 
		also, make a movie of the 2dhist... mostly because it will be pretty eye candy.
		'''

		print('Done saving for run ',runstr)
	
	print('Done.\n\t\t==== Have a nice day! :-)  =======\n\n')
	return

if __name__ == '__main__':
	main()
