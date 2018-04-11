#!/reg/g/psdm/sw/releases/ana-current/arch/x86_64-rhel7-gcc48-opt/bin/python

import psana;
import numpy as np;
from numpy.fft import fft as FFT;
from numpy.fft import ifft as IFFT;
from numpy.fft import fftfreq as FREQS;
import matplotlib.pyplot as plt;
from cmath import rect;
import pdb as debug;

nprect = np.vectorize(rect);

def i2lam(i):
	#lset = 600nm for amox28216 for lots of the runs.  Chedck the spectrometer wavelength
        lset=600; 
        nmPi=0.217;
        seterr=1.0051;
        return nmPi*i + seterr*lset - 110.072;
#'i' is the pixel index [ 0 .. 1023 ] and the wavelength [nm]
# run 31 is 1 micron SiN and shows strong etalon

def signal_weights(w):
	x=np.linspace(0,np.pi,num = w.shape[0],endpoint = False);
	a=500.;
	b=1e3;
	w = np.ones(x.shape,dtype = float);
	w[1:] = np.copy(a*np.power(np.sin(x[1:]),int(-2))+b);
	return w;

def weiner_weights(w):
	x=np.linspace(0,np.pi,num = w.shape[0],endpoint = False);
	a=500.;
	b=1e3;
	signalPnoise = np.ones(x.shape,dtype=float);
	signalPnoise[1:]=a*np.power(np.sin(x[1:]),int(-2))+b;
	w = np.copy((signalPnoise-np.min(signalPnoise))/signalPnoise);
	return w;
	#sigPnoise(x)=5e2*(1/s(x))+1e3
	#sigPnoise(x)=5e2*(1/s(x))+1e3

def fourier_reshape(vec):
	vecFT = np.array(vec.shape,dtype=complex);
	dvecFT = np.array(vec.shape,dtype=complex);
	ddvecFT = np.array(vec.shape,dtype=complex);
	dddvecFT = np.array(vec.shape,dtype=complex);
	vecFT = FFT(vec);
	freqs = FREQS(len(vec))	
	dvecFT = 1j*(freqs+.01j)*vecFT;
	ddvecFT = -1*np.power(freqs+.01j,int(2))*vecFT;
	dddvecFT = -1j*np.power(freqs+.01j,int(3))*vecFT;
	dvec = np.real(IFFT(dvecFT))/vec.shape[0];	
	ddvec = np.real(IFFT(ddvecFT))/vec.shape[0];	
	dddvec = np.real(IFFT(dddvecFT))/vec.shape[0];	
	return dvec,ddvec,dddvec;

def rewrap(vec,low,high,step):
	inds = np.argwhere(vec>=high);	
	while len(inds)>0:
		vec[inds] -= step;
		inds = np.argwhere(vec>=high);	
	inds = np.argwhere(vec<low);	
	while len(inds)>0:
		vec[inds] += step;
		inds = np.argwhere(vec<low);	
	return vec;

def between(val,low,high):
	return np.logical_and(val>=low,val<high);

"""
def chooseslope(v,n):
	vec = np.copy(v);
	step = 2.*np.pi/n;
	wholestep = 2*np.pi;
	win = 0.05*step;
	#Need to start counting imposed offsets.
	if between(vec[0],-step,0):
		if between(vec[1]+step,vec[0]-win,vec[0]+win):
			vec[1] += step;
			if between(vec[2]+2*step,vec[1]-win,vec[1]+win):
				vec[2] += 2*step;
				if between(vec[3]+3*step - wholestep,vec[2]-win,vec[2]+win):
					vec[3] += 3*step - wholestep;
					if between(vec[4]+4*step - wholestep,vec[3]-win,vec[3]+win):
						vec[4] += 4*step - wholestep;
						return np.mean(vec[:5]);
					return np.mean(vec[:4]);
				return np.mean(vec[:3]);
			return np.mean(vec[:2]);
		return np.mean(vec[:1]);
	else:
		vec = np.roll(vec,1);
		if between(vec[0] - step,-2*step,-1*step):
			vec[0] -= step;
			if between(vec[1] + 0*step - wholestep, vec[0]-win,vec[0]+win):
				vec[1] += 0*step - wholestep;
				if between(vec[2] + 1*step - wholestep, vec[1]-win,vec[1]+win):
					vec[2] += 1*step - wholestep;
					if between(vec[3] + 2*step - wholestep, vec[2]-win,vec[2]+win):
						return np.mean(vec[:4]);
					return np.mean(vec[:3]);
				return np.mean(vec[:2]);
			return np.mean(vec[:1]);
		else:
			vec = np.roll(vec,1);
			if between(vec[0] + -2*step, -3*step, -2*step):
				vec[0] -= 2*step ;
				if between(vec[1] + 0*step - wholestep, vec[0]-win,vec[0]+win):
					vec[1] -= wholestep;
					if between(vec[2] + 1*step - wholestep, vec[1]-win,vec[1]+win):
						vec[2] += 1*step - wholestep;
						if between(vec[3] + 2*step - wholestep, vec[2]-win,vec[2]+win):
							vec[3] += 2*step - wholestep;
							if between(vec[4] + 3*step - wholestep, vec[3]-win,vec[3]+win):
								vec[4] += 3*step - wholestep;
								return np.mean(vec[:5]);
							return np.mean(vec[:4]);
						return np.mean(vec[:3]);
					return np.mean(vec[:2]);
				return np.mean(vec[:1]);
			else:
				vec = np.roll(vec,1);
				if between(vec[0] -3*step , -4*step, -3*step):
					vec[0] -= 3*step;
					if between(vec[1] -2*step , vec[0]-win,vec[0]+win):
						vec[1] -= 2*step;
						#I think I'm lost here.
						if between(vec[1] -2*step , vec[0]-win,vec[0]+win):
							vec[2] -= wholestep;
							return np.mean(vec[:3]);
						return np.mean(vec[:2]);
					return np.mean(vec[:1]);
				else:
					return 20.
	return 10.;
"""

def timsChoice(avg, nrolls):
	step = 2 * np.pi / nrolls;
	delta = 0.1 * step;

	avgNorm = np.array([val + i * step - 2 * np.pi if i * step > np.pi else val + i * step for i, val in enumerate(avg)]);

	numInBestCluster = 0;
	bestGuess = 20;

	for val in avgNorm:
		similarVals = avgNorm[np.where(abs(avgNorm - val) < delta)];
		if len(similarVals) > numInBestCluster:
			numInBestCluster = len(similarVals);
			bestGuess = np.average(similarVals);

	#print(bestGuess)

	if bestGuess > 0:
		bestGuess -= 2.*np.pi;

	return bestGuess;


dirstr = 'data_sensitivity/'
skipshots = 20;
skipsteps = 1;
num = 0.0;

printsamples = (True,True,True,True,True,False,False); # tend to use this to briefly print a smaple image to discover the vwin needed (see below)
ratio = .1; # how to accumulate a rolling average for referencing
subrefs = (True,True,True,True,True,False,False);
runstrs = ['74','75','76','77','84'];#['15'];#,'13','14','15','9','10','9','10']; # 
vwins = [(475,525),(475,525),(475,525),(475,525),(475,525)];#[(440,450)];#,(440,450),(440,450),(577,587),(577,587),(577,587),(577,587)]; # this is the integration window for the stripe projection
expstrs = [str('amox28216'),str('amox28216'),str('amox28216'),str('amox28216'),str('amox28216')];#str('xcsx29616'),str('xcsx29616')];#str('amox28216');#str('amo11816');
dets = ['OPAL1','OPAL1','OPAL1','OPAL1','OPAL1'];#'opal_usr1','opal_usr1']
delayscales = (1.e3,1.e3,1.e3,1.e3,1.e3);#,1.e12); # converts to picoseconds

nsamples = 1024;
nrolls = 8;
nhist = 256;


weights = np.zeros(nsamples,dtype=float);
w_weights = np.zeros(nsamples,dtype=float);
weights = signal_weights(weights);
w_weights = weiner_weights(w_weights);

for i in range(len(runstrs)):
	runstr = runstrs[i];
	expstr = expstrs[i];
	vwin = vwins[i];
	num = vwin[1]-vwin[0];
	printsample = printsamples[i];
	subref = subrefs[i];
	dsourcestr = 'exp=' + expstr + ':run=' + runstr + ':smd';
	print("running:\t",dsourcestr)
	ds = psana.DataSource(dsourcestr);
	print(psana.DetNames('detectors'));
	det = psana.Detector('OPAL1') # for AMO
	GDdet = psana.Detector('FEEGasDetEnergy'); #This I hope is the FEE Gas Detector readings
	EBdet = psana.Detector('EBeam'); #This I hope is the BLD data
	evr = psana.Detector('NoDetector.0:Evr.0');
	cd = psana.Detector('ControlData');

	y_init = 0;
	y_final = 0;
	R = np.zeros((0,nsamples),dtype=float);
	R_back = np.zeros((0,nsamples),dtype=float);
	F_abs = np.zeros((0,nsamples),dtype=float);
	F_arg = np.zeros((0,nsamples),dtype=float);
	D = np.zeros((0,nrolls+2),dtype=float);
	d_data = np.zeros(nrolls+2,dtype=float);
	P = np.zeros((0,1),dtype=float);
	sumsignal = np.zeros((1,nsamples),dtype=float);

	'''The third edition: take the average of each step and convert both axes to the right units. '''
	for run in ds.runs():
		reference_img = np.zeros(nsamples);
		nrefshots = int(0);
		nsumevents = int(0);
		for nstep,step in enumerate(run.steps()):
			print("checking step ",nstep);
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
					if (printsample and nevent == 20):
						print('printing image');
						img = det.image(evt);
						filename=dirstr + expstr + '_r' + runstr + '_image200.dat';
						np.savetxt(filename,img,fmt='%.6e');
						printsample = False;

					ec = evr.eventCodes(evt)
					if 162 in ec: 
						if subref:
							img = det.image(evt);
							if (img is None):
								continue;
							if nrefshots==0:
								reference_img = np.sum(img[vwin[0]:vwin[1],:],axis=0)/num;
							else:
								reference_img *= (1.-ratio);
								reference_img += (ratio)*np.sum(img[vwin[0]:vwin[1],:],axis=0)/num;
							nrefshots += 1;
						continue;
					if nevent%skipshots == 0:
						lineout = np.zeros(nsamples,dtype=float);
						roller = np.zeros((nrolls,nsamples),dtype=float);
						lineoutFT = np.zeros(nsamples,dtype=complex);
						rollerFT = np.zeros((nrolls,nsamples),dtype=complex);
						dargs = np.zeros((nsamples-1,nrolls),dtype=float);
						darghist = np.zeros((nhist,nrolls),dtype=float);
	
						#print('Fetching event number',nevent);
    						img = det.image(evt);  #img is not areal image, it is a matrix
						ebResults = EBdet.get(evt);
						gdResults = GDdet.get(evt);
						#print(ebResults,gdResults);
 						if (img is None):
							continue;
						if (subref and 162 in ec):
							continue;
						try:
							lineout = (np.sum(img[vwin[0]:vwin[1],:],axis=0)/num) ;
							if subref:
								lineout = lineout - reference_img;
						except:
							continue
						if nsumevents == 0:
							sumsignal = lineout;
							nsumevents += 1;
						else:
							sumsignal *= float(nsumevents)/(nsumevents+1);
							sumsignal += lineout/(nsumevents+1);
							nsumevents + 1;
						R = np.row_stack((R,lineout));#it stacks from top to bottom

						for r in range(nrolls):
							#roller[r,:] = np.roll(np.copy(lineout) , (r*len(lineout))//nrolls);
							roller[r,:] = np.roll(np.copy(lineout), r*len(lineout)//nrolls);

						lineoutFT = FFT(np.roll(lineout,len(lineout)//2) );
						rollerFT = FFT(roller,axis=1);
						"""
						Try dividing by the sum of all signals from the entire scan.
						This might get rid of the etalon
						"""
						#ft_abs = np.copy(np.abs(lineoutFT));
						#ft_arg = np.copy(np.angle(lineoutFT));
						ft_abs = np.copy(np.abs(rollerFT[1,:]));
						ft_arg = np.copy(np.angle(rollerFT[1,:]));
						dargs = np.diff( np.unwrap( np.angle( rollerFT ) , axis = 1 ), axis =1 );

						#lineoutback = np.real( IFFT(nprect( w_weights, np.angle(rollerFT[0,:]) )) );
						#lineoutback = np.real( IFFT(nprect(w_weights,ft_arg)) );
						lineoutback = np.real( IFFT(nprect(ft_abs,ft_arg)) );
						#lineoutback = np.real( IFFT(rollerFT[1,:]) );
						R_back = np.row_stack((R_back,lineoutback));
						
						avg = np.average(dargs,axis=1,weights = ft_abs[1:]);
						avg.shape = (dargs.shape[0],1);
						std = np.power(dargs-avg,int(2));
						#avg = rewrap(avg,-2.*np.pi/nrolls,0.,2.*np.pi/nrolls);
						debug.set_trace();
						d_data[0] = y_final*delayscales[i];
						d_data[1:-1] = avg[:];
						#d_data[-1] = chooseslope(avg,nrolls);
						d_data[-1] = timsChoice(avg,nrolls);
						#HERE HERE HERE HERE print out  variance data v_data

						v_data[0] = y_final*delayscales[i];
						v_data[1:-1] = std[:];
						#print(d_data)

						eb_data = (ebResults.ebeamL3Energy() , ebResults.ebeamCharge(), ebResults.ebeamEnergyBC1(), ebResults.ebeamEnergyBC2(), ebResults.ebeamLTU250(), ebResults.ebeamLTU450(), ebResults.ebeamLTUAngX(), ebResults.ebeamLTUAngY(), ebResults.ebeamLTUPosX(), ebResults.ebeamLTUPosY(), ebResults.ebeamUndAngX(), ebResults.ebeamUndAngY(), ebResults.ebeamUndPosX(), ebResults.ebeamUndPosY(), ebResults.ebeamPkCurrBC1(), ebResults.ebeamEnergyBC1(), ebResults.ebeamPkCurrBC2(), ebResults.ebeamEnergyBC2(), ebResults.ebeamDumpCharge());
						gd_data = ( gdResults.f_11_ENRC(), gdResults.f_12_ENRC(), gdResults.f_21_ENRC(), gdResults.f_22_ENRC(), gdResults.f_63_ENRC(), gdResults.f_64_ENRC() );
						p_data = np.concatenate((eb_data,gd_data));
						if len(P) < len(p_data):
							P = np.zeros((0,len(p_data)),dtype=float);
						D = np.row_stack((D,d_data));
						P = np.row_stack((P,p_data));

			F_abs = np.row_stack((F_abs,ft_abs));
			F_arg = np.row_stack((F_arg,ft_arg));

			if (nstep%10 == 0):
				filename="%s/%s_r%s_%i_%i_matrix.dat" % (dirstr,expstr,runstr,vwin[0],vwin[1]);
				np.savetxt(filename,R.T,fmt='%i');
				filename="%s/%s_r%s_%i_%i_matrix_back.dat" % (dirstr,expstr,runstr,vwin[0],vwin[1]);
				np.savetxt(filename,R_back.T,fmt='%i');
				filename="%s/%s_r%s_%i_%i_steps_ft_abs.dat" % (dirstr,expstr,runstr,vwin[0],vwin[1]);
				np.savetxt(filename,F_abs.T,fmt='%.6e');
				filename=dirstr + expstr + '_r' + runstr + '_delays.dat';
				np.savetxt(filename,D,fmt='%.6e');
				filename=dirstr + expstr + '_r' + runstr + '_sumsignal.dat';
				np.savetxt(filename,sumsignal,fmt='%.6e');
	#for plot
	y_dim = int(np.shape(R)[0]);
	x_dim = int(np.shape(R)[1]);
	lam = i2lam(np.arange(x_dim,dtype=float));

	print('\n\n\t\tWatch out!  Transposing ouput')
	if subref:
		runstr += "_refsub";
	filename="%s/%s_r%s_%i_%i_matrix.dat" % (dirstr,expstr,runstr,vwin[0],vwin[1]);
	np.savetxt(filename,R.T,fmt='%i');
	filename="%s/%s_r%s_%i_%i_matrix_back.dat" % (dirstr,expstr,runstr,vwin[0],vwin[1]);
	np.savetxt(filename,R_back.T,fmt='%i');
	filename="%s/%s_r%s_%i_%i_steps_ft_abs.dat" % (dirstr,expstr,runstr,vwin[0],vwin[1]);
	np.savetxt(filename,F_abs.T,fmt='%.6e');
	filename="%s/%s_r%s_%i_%i_steps_ft_arg.dat" % (dirstr,expstr,runstr,vwin[0],vwin[1]);
	np.savetxt(filename,F_arg.T,fmt='%.6e');
	filename=dirstr + expstr + '_r' + runstr + '_params.dat';
	np.savetxt(filename,P,fmt='%.6e');
	filename=dirstr + expstr + '_r' + runstr + '_delays.dat';
	np.savetxt(filename,D,fmt='%.6e');
	filename=dirstr + expstr + '_r' + runstr + '_wavelegths.dat';
	np.savetxt(filename,lam,fmt='%.6e');
	filename=dirstr + expstr + '_r' + runstr + '_sumsignal.dat';
	np.savetxt(filename,sumsignal,fmt='%.6e');
	print('Done saving for run ',runstr);
	
print('Done.');
