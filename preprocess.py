#!/reg/g/psdm/sw/releases/ana-current/arch/x86_64-rhel7-gcc48-opt/bin/python

import psana;
import numpy as np;
from numpy.fft import fft as FFT;
from numpy.fft import ifft as IFFT;
from numpy.fft import fftfreq as FREQS;
import matplotlib.pyplot as plt;
from cmath import rect;
import pdb as debug;
from utility import *
import re as regexp

nprect = np.vectorize(rect);

dirstr = 'data/raw/'
skipshots = 100;
skipsteps = 5;
samplerate = 10
num = 0.0;

ratio = .1; # how to accumulate a rolling average for referencing
runstrs = ['21','32']#'15']#'136','137','138']#'119','74','77','76','75','84'];#['15'];#,'13','14','15','9','10','9','10']; # 
vwins = [(480,500)]*len(runstrs)#(575,585),(570,580),(580,590)]#,(480,500),(480,500),(480,500),(480,500)]; #,(440,450),(440,450),(577,587),(577,587),(577,587),(577,587)]; # this is the integration window for the stripe projection
printsamples = [True]*len(runstrs)#,True,True,True,True,False,False); # tend to use this to briefly print a smaple image to discover the vwin needed (see below)
subrefs = [True]*len(runstrs)#,True,True,True,True,True,False,False);
delayscales = [1.e3]*len(runstrs)#[1.e12]*len(runstrs)
attens = [1.]*len(runstrs)#[1.0,0.007,0.06,0.04,0.98]# in microjoules
#expstrs = [str('xppc00117')]*len(runstrs)
expstrs = [str('amox28216')]*len(runstrs) #,str('amox28216'),str('amox28216'),str('amox28216'),str('amox28216')];#str('xcsx29616'),str('xcsx29616')];#str('amox28216');#str('amo11816');
dets = ['OPAL1']*len(runstrs)#,'opal_1','OPAL1','OPAL1','OPAL1','OPAL1','OPAL1'];#'opal_usr1','opal_usr1']

nsamples = 1024;

for i in range(len(runstrs)):
	runstr = runstrs[i];
	expstr = expstrs[i];
	atten = attens[i];
	vwin = vwins[i];
	num = vwin[1]-vwin[0];
	nmidshots = int(0);
	ngoodshots = int(0);
	printsample = printsamples[i];
	subref = subrefs[i];
	dsourcestr = 'exp=' + expstr + ':run=' + runstr + ':smd';
	#dsourcestr = 'exp=' + expstr + ':run=' + runstr ;
	print("running:\t",dsourcestr)
	ds = psana.DataSource(dsourcestr);
	print(psana.DetNames('detectors'));
	det = psana.Detector(dets[i]) # for AMO
	GDdet = psana.Detector('FEEGasDetEnergy'); #This I hope is the FEE Gas Detector readings
	EBdet = psana.Detector('EBeam'); #This I hope is the BLD data
	evr = psana.Detector('NoDetector.0:Evr.0');
	cd = psana.Detector('ControlData');
	#if regexp.search('^.*(xpp).*',runstr):
	#lxt = psana.Detector('lxt');
	#ipm1 = psana.Detector('HX2-SB1-BMMON');
	#ipm2 = psana.Detector('XPP-SB2-BMMON');
	#ipm3 = psana.Detector('XPP-SB3-BMMON');

	y_init = 0;
	y_final = 0;
	R = np.zeros((0,nsamples),dtype=float);
	R_back = np.zeros((0,nsamples),dtype=float);
	F_abs = np.zeros((0,nsamples),dtype=float);
	F_arg = np.zeros((0,nsamples),dtype=float);
	eb_data_hdr = '';
	n_eb_vals = 19;
	eb_data = np.zeros(n_eb_vals,dtype=float);
	E = np.zeros((0,eb_data.shape[0]),dtype=float);
	gd_data_hdr = '';
	n_gd_vals = 6;
	gd_data = np.zeros(n_gd_vals,dtype=float);
	G = np.zeros((0,gd_data.shape[0]),dtype=float);
	""""
	ipm_data_hdr = '';
	n_ipm_vals = 3;
	ipm_data = np.zeros(n_ipm_vals,dtype=float);
	I = np.zeros((0,ipm_data.shape[0]),dtype=float);
	"""
	d_data_hdr = '';
	d_data = np.zeros(6+gd_data.shape[0],dtype=float);#+ipm_data.shape[0],dtype=float);
	D = np.zeros((0,d_data.shape[0]),dtype=float);
	#diags_data = np.zeros(3+2*nrolls+nslopes,dtype=float);
	#diagnostics_hdr = '';
	#diagnostics = np.zeros((0,diags_data.shape[0]),dtype=float);
	sumsignal = np.zeros((1,nsamples),dtype=float);

	'''The third edition: take the average of each step and convert both axes to the right units. '''
	for run in ds.runs():
		reference_img = np.zeros(nsamples);
		nrefshots = int(0);
		nsumevents = int(0);
		for nstep,step in enumerate(run.steps()):
			print('checking step ',nstep);
			if nstep%skipsteps==0:
				pvList = cd().pvControls();
				ft_abs = np.zeros((1,nsamples),dtype=float);
				ft_arg = np.zeros((1,nsamples),dtype=float);

				for pv in pvList:
					if y_init == 0:
						y_init = pv.value()
					y_final = pv.value()	
					print('Step', nstep, 'name/value',pv.name(),pv.value());
				for nevent,evt in enumerate(step.events()):
					ec = evr.eventCodes(evt)
					if 162 in ec: 
						if subref:
							img = det.image(evt);
							if (img is None):
								continue;
							if nrefshots==0:
								reference_img = img;
							else:
								reference_img *= (1.-ratio);
								reference_img += ratio*img;
							nrefshots += 1;
						continue;
					if nevent%skipshots == 0:
						if (printsample and not nevent%samplerate):
							print('printing image');
							img = det.image(evt);
							if (img is None):
								continue
							if (subref and 162 in ec):
								continue;
							if subref:
								img -= reference_img
							filename=dirstr + expstr + '_r' + runstr + '_step' + str(nstep) + '_image' + str(nevent) + '.dat';
							np.savetxt(filename,img,fmt='%i');
							"""
						lineout = np.zeros(nsamples,dtype=float);
						lineoutFT = np.zeros(nsamples,dtype=complex);
						ebResults = EBdet.get(evt);
						gdResults = GDdet.get(evt);
						ipm1Results = ipm1.get(evt);
						ipm2Results = ipm2.get(evt);
						ipm3Results = ipm3.get(evt);
						lineout = (np.sum(img[vwin[0]:vwin[1],:],axis=0)/num) ;
						if nsumevents == 0:
							sumsignal = lineout;
							nsumevents += 1;
						else:
							sumsignal *= float(nsumevents)/(nsumevents+1);
							sumsignal += lineout/(nsumevents+1);
							nsumevents + 1;
						R = np.row_stack((R,lineout));#it stacks from top to bottom
						lineoutFT = FFT(lineout);

						ft_abs = np.copy(np.abs(lineoutFT));
						ft_arg = np.copy(np.angle(lineoutFT));
						lineoutback = np.real( IFFT(nprect(ft_abs,ft_arg)) );
						R_back = np.row_stack((R_back,lineoutback));
						
						if (ebResults is not None):
							eb_data = (ebResults.ebeamL3Energy() , ebResults.ebeamCharge(), ebResults.ebeamEnergyBC1(), ebResults.ebeamEnergyBC2(), ebResults.ebeamLTU250(), ebResults.ebeamLTU450(), ebResults.ebeamLTUAngX(), ebResults.ebeamLTUAngY(), ebResults.ebeamLTUPosX(), ebResults.ebeamLTUPosY(), ebResults.ebeamUndAngX(), ebResults.ebeamUndAngY(), ebResults.ebeamUndPosX(), ebResults.ebeamUndPosY(), ebResults.ebeamPkCurrBC1(), ebResults.ebeamEnergyBC1(), ebResults.ebeamPkCurrBC2(), ebResults.ebeamEnergyBC2(), ebResults.ebeamDumpCharge());
						else:
							eb_data = np.zeros(n_eb_vals,dtype=float);

						eb_data_hdr = 'ebResults.ebeamL3Energy()\tebResults.ebeamCharge()\tebResults.ebeamEnergyBC1()\tebResults.ebeamEnergyBC2()\tebResults.ebeamLTU250()\tebResults.ebeamLTU450()\tebResults.ebeamLTUAngX()\tebResults.ebeamLTUAngY()\tebResults.ebeamLTUPosX()\tebResults.ebeamLTUPosY()\tebResults.ebeamUndAngX()\tebResults.ebeamUndAngY()\tebResults.ebeamUndPosX()\tebResults.ebeamUndPosY()\tebResults.ebeamPkCurrBC1()\tebResults.ebeamEnergyBC1()\tebResults.ebeamPkCurrBC2()\tebResults.ebeamEnergyBC2()\tebResults.ebeamDumpCharge()';
						gd_data_hdr = 'gdResults.f_11_ENRC()\tgdResults.f_12_ENRC()\tgdResults.f_21_ENRC()\tgdResults.f_22_ENRC()\tgdResults.f_63_ENRC()\tgdResults.f_64_ENRC()';
						if (gdResults is not None): 
							gd_data = ( gdResults.f_11_ENRC(), gdResults.f_12_ENRC(), gdResults.f_21_ENRC(), gdResults.f_22_ENRC(), gdResults.f_63_ENRC(), gdResults.f_64_ENRC() );
						else:
							gd_data = np.zeros(n_gd_vals,dtype=float)
						

						ipm_data_hdr = 'ipm1\tipm2\tipm3';
						if ((ipm1Results is not None) and (ipm2Results is not None) and (ipm3Results is not None)):
							ipm_data = (ipm1Results.TotalIntensity(), ipm2Results.TotalIntensity(),ipm3Results.TotalIntensity());
						else:
							ipm_data = np.zeros(n_ipm_vals,dtype=float);


						d_data_hdr = 'delay\ttimsChoice\tourChoice\trms\tdelay\tattenuation\tgd_11\t12\t21\t22\t63\t64...\tipm1\tipm2 data'

						d_data[0] = y_final*delayscales[i];
						d_data[6:-3] = gd_data;
						d_data[-3:] = ipm_data;

						D = np.row_stack((D,d_data));
						G = np.row_stack((G,gd_data));
						E = np.row_stack((E,eb_data));
						I = np.row_stack((I,ipm_data));

			if (nstep%2 == 0):
				filename="%s/%s_r%s_%i_%i_matrix.dat" % (dirstr,expstr,runstr,vwin[0],vwin[1]);
				np.savetxt(filename,R.T,fmt='%i');
				filename="%s/%s_r%s_%i_%i_matrix_back.dat" % (dirstr,expstr,runstr,vwin[0],vwin[1]);
				np.savetxt(filename,R_back.T,fmt='%i');
				d_data_hdr += '\tgood %i\t total %i' % (ngoodshots,nmidshots);
				filename=dirstr + expstr + '_r' + runstr + '_delays.dat';
				np.savetxt(filename,D,fmt='%.6e',header=d_data_hdr);
				filename=dirstr + expstr + '_r' + runstr + '_eb.dat';
				np.savetxt(filename,E,fmt='%.6e',header=eb_data_hdr);
				filename=dirstr + expstr + '_r' + runstr + '_gd.dat';
				np.savetxt(filename,G,fmt='%.6e',header=gd_data_hdr);
				filename=dirstr + expstr + '_r' + runstr + '_ipm.dat';
				np.savetxt(filename,I,fmt='%.6e',header=ipm_data_hdr);
	#for plot
	y_dim = int(np.shape(R)[0]);
	x_dim = int(np.shape(R)[1]);
	lam = i2lam(np.arange(x_dim,dtype=float));

	print('\n\n\t\tWatch out!  No longer transposing ouput')
	if subref:
		runstr += "_refsub";
	filename="%s/%s_r%s_%i_%i_matrix.dat" % (dirstr,expstr,runstr,vwin[0],vwin[1]);
	np.savetxt(filename,R,fmt='%i');
	filename="%s/%s_r%s_%i_%i_matrix_back.dat" % (dirstr,expstr,runstr,vwin[0],vwin[1]);
	np.savetxt(filename,R_back,fmt='%i');
	d_data_hdr += '\tgood %i\t total %i' % (ngoodshots,nmidshots);
	filename=dirstr + expstr + '_r' + runstr + '_delays.dat';
	np.savetxt(filename,D,fmt='%.6e',header=d_data_hdr);
	filename=dirstr + expstr + '_r' + runstr + '_eb.dat';
	np.savetxt(filename,E,fmt='%.6e',header=eb_data_hdr);
	filename=dirstr + expstr + '_r' + runstr + '_gd.dat';
	np.savetxt(filename,G,fmt='%.6e',header=gd_data_hdr);
	#filename=dirstr + expstr + '_r' + runstr + '_ipm.dat';
	#np.savetxt(filename,I,fmt='%.6e',header=ipm_data_hdr);
	filename=dirstr + expstr + '_r' + runstr + '_wavelegths.dat';
	np.savetxt(filename,lam,fmt='%.6e');
	print('Done saving for run ',runstr);
	
						"""
print('Done.');
