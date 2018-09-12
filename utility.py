import numpy as np;
from numpy.fft import fft as FFT;
from numpy.fft import ifft as IFFT;
from numpy.fft import fftfreq as FREQS;

def weighted_rms(vector,weights,avg):
	if len(avg.shape)==1:
		avg.shape = (avg.shape[0],1);
	result = np.sqrt(np.average(np.power(vector-avg,int(2)),axis=1,weights=weights));
	return (result,np.argmin(result));

def i2lam(i):
	#lset = 600nm for amox28216 for lots of the runs.  Chedck the spectrometer wavelength
        lset=500; 
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

def ourChoice(dargs,weights):
	rollstep = np.pi*2./float(dargs.shape[0]);
	avg = np.average(dargs,axis=1,weights = weights);
	rmsvec,mincoord = weighted_rms(dargs,weights,avg);
	#print(avg.shape);
	choice = avg[mincoord];
	choice += mincoord*rollstep
	while choice > rollstep: choice -= 2.*np.pi;
	rms=rmsvec[mincoord];
	return choice,rms;

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

def slope2delay(s):
	# based on run 74 strong lasing. No attenuation
	x0=-6;
	x = s-x0;
	a = 2.35975;#          +/- 0.008853     (0.3752%)
	b=-0.7;#
	c = 0.000786735; #      +/- 0.0001925    (24.47%)
	d = -5.3426e-06; #      +/- 1.655e-07    (3.097%) return a+b*x+c*np.power(x,int(3))+d*np.power(x,int(7));
