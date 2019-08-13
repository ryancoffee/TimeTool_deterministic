#!/reg/g/psdm/sw/releases/ana-current/arch/x86_64-rhel7-gcc48-opt/bin/python

from psana import *;
import numpy as np;
from cmath import rect;
import pdb as debug;
from utility import *
import re

def main():
	nprect = np.vectorize(rect)
	
	#dirstr = './data_fs/raw/'
	dirstr = './data_scratch/processed/'
	skipshots = 10
	skipsteps = 1
	num = 0.0

	ratio = .1
	runstrs = ['100']
	vwins = [(575,585)]*len(runstrs) 
	samplerates = [100]*len(runstrs)
	printsamples = [True]*len(runstrs)
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
		epics14y = Detector('AMO:PPL:MMS:14.RBV')
		epics15z = Detector('AMO:PPL:MMS:15.RBV')
		epics16t = Detector('AMO:PPL:MMS:16.RBV')
		evr = Detector('NoDetector.0:Evr.0')
		cd = Detector('ControlData')
		y_init = 0
		y_final = 0
		R = np.zeros((0,nsamples),dtype=float)
		n_eb_vals = 19
		eb_data = np.zeros(n_eb_vals,dtype=float)
		E = np.zeros((0,eb_data.shape[0]),dtype=float)
		n_gd_vals = 6
		gd_data = np.zeros(n_gd_vals,dtype=float)
		G = np.zeros((0,gd_data.shape[0]),dtype=float)
		d_data = np.zeros(2,dtype=float)
		D = np.zeros((0,d_data.shape[0]),dtype=float)

		'''The third edition: take the average of each step and convert both axes to the right units. '''
		for run in ds.runs():
			img = np.zeros((0,nsamples))
			for nstep,step in enumerate(run.steps()):
				print('checking step ',nstep)
				if nstep%skipsteps==0:
					pvList = cd().pvControls()
					for pv in pvList:
						print(pv.name())
						if y_init == 0:
							y_init = pv.value()
						y_final = pv.value()
						print('Step', nstep, 'name/value',pv.name(),pv.value())
					for nevent,evt in enumerate(step.events()):
						if not nevent%skipshots:
							if (printsample and not nevent%samplerates[i]):
								print('x=%.3f\t%.3f\t%.3f\t%.3f' %(epics13x(),epics14y(),epics15z(),epics16t()))
								print('printing image {}'.format(nevent))
								img = det.image(evt);
								print('image shape = {}'.format(img.shape))
								if (img is None):
									continue
								filename='{}{}_r{}_step{}_image{}.dat'.format(dirstr, expstr, runstr, nstep, nevent)
								np.savetxt(filename,img,fmt='%i')
							lineout = np.zeros(nsamples,dtype=float)
							ebResults = EBdet.get(evt)
							gdResults = GDdet.get(evt)
							img = det.image(evt)
							if img is not None:
								lineout = np.sum(img[vwin[0]:vwin[1],:],axis=0)/num
								if R.shape[0] > 0:
									R = np.row_stack((R,lineout))
								else:
									R=lineout
									R.reshape((len(lineout),1))
									print(R.shape)
							
							if (ebResults is not None):
								eb_data = (ebResults.ebeamL3Energy() , ebResults.ebeamCharge(), ebResults.ebeamEnergyBC1(), ebResults.ebeamEnergyBC2(), ebResults.ebeamLTU250(), ebResults.ebeamLTU450(), ebResults.ebeamLTUAngX(), ebResults.ebeamLTUAngY(), ebResults.ebeamLTUPosX(), ebResults.ebeamLTUPosY(), ebResults.ebeamUndAngX(), ebResults.ebeamUndAngY(), ebResults.ebeamUndPosX(), ebResults.ebeamUndPosY(), ebResults.ebeamPkCurrBC1(), ebResults.ebeamEnergyBC1(), ebResults.ebeamPkCurrBC2(), ebResults.ebeamEnergyBC2(), ebResults.ebeamDumpCharge())
							else:
								eb_data = np.zeros(n_eb_vals,dtype=float)
	
							if (gdResults is not None): 
								gd_data = ( gdResults.f_11_ENRC(), gdResults.f_12_ENRC(), gdResults.f_21_ENRC(), gdResults.f_22_ENRC(), gdResults.f_63_ENRC(), gdResults.f_64_ENRC() )
							else:
								gd_data = np.zeros(n_gd_vals,dtype=float)

							d_data[0] = y_final*delayscales[i]
	
							D = np.row_stack((D,d_data))
							G = np.row_stack((G,gd_data))
							E = np.row_stack((E,eb_data))

				if not nstep%2:
					filename='{}{}_r{}_{}_{}_matrix.dat'.format(dirstr,expstr,runstr,vwin[0],vwin[1])
					np.savetxt(filename,R,fmt='%i')
					d_data_fullhdr = '{}'.format(d_data_hdr)
					filename='{}{}_r{}_delays.dat'.format(dirstr, expstr, runstr)
					np.savetxt(filename,D,fmt='%.6e',header=d_data_fullhdr)
					filename='{}{}_r{}_eb.dat'.format(dirstr, expstr, runstr)
					np.savetxt(filename,E,fmt='%.6e',header=eb_data_hdr)
					filename='{}{}_r{}_gd.dat'.format(dirstr, expstr, runstr)
					np.savetxt(filename,G,fmt='%.6e',header=gd_data_hdr)
		y_dim = int(np.shape(R)[0])
		x_dim = int(np.shape(R)[1])
		lam = i2lam(np.arange(x_dim,dtype=float))

		filename="%s/%s_r%s_%i_%i_matrix.dat" % (dirstr,expstr,runstr,vwin[0],vwin[1])
		np.savetxt(filename,R,fmt='%i')
		d_data_fullhdr = '{}\tgood'.format(d_data_hdr)
		filename=dirstr + expstr + '_r' + runstr + '_delays.dat'
		np.savetxt(filename,D,fmt='%.6e',header=d_data_fullhdr)
		filename=dirstr + expstr + '_r' + runstr + '_eb.dat'
		np.savetxt(filename,E,fmt='%.6e',header=eb_data_hdr)
		filename=dirstr + expstr + '_r' + runstr + '_gd.dat'
		np.savetxt(filename,G,fmt='%.6e',header=gd_data_hdr)
		filename=dirstr + expstr + '_r' + runstr + '_wavelengths.dat'
		np.savetxt(filename,lam,fmt='%.6e')
		print('Done saving for run ',runstr)
	
	print('Done.\n\t\t==== Have a nice day! :-)  =======\n\n')
	return

if __name__ == '__main__':
	main()
