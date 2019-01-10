#!/usr/bin/python3
import numpy as np
import math
import subprocess
import re as regexp
from scipy import sparse #import coo_matrix

def weinerfilter(cmat):
    #replot(log((1./x**2)*f(1e8,x,0,20)+exp(10)))
    w=20.
    a=1.e8
    (ntiles,sz) = cmat.shape
    #print('(ntiles,sz) = (%i,%i))'%(ntiles,sz))
    noise = np.exp(10)
    f = np.zeros(sz,dtype=complex)
    f.real = np.fft.fftfreq(sz,1./sz)
    f.imag[0] = 1.
    signal = np.power(np.abs(f),int(-2))*1e8*np.exp(-1.*np.power(f/w,int(2)))
    filt = 1.j*f*np.power(signal/(signal+noise),int(2))
    filt.real[0] = 0.
    filttile = np.tile(filt,(ntiles,1))
    return cmat*filttile

def convolve(mat,calibmat):
    #print(calibmat.shape)
    #print(mat.shape)
    return np.matmul(calibmat,mat.T).T

def main():
    calibfilename = '/home/coffee/projects/2dtimetool_simulation_data/extern/ascii_chirp-2000_1650_nfibers61_interference.calibration'
    noetaloncalibfilename = '/home/coffee/projects/2dtimetool_simulation_data/extern/ascii_chirp-2000_1650_nfibers61_noetalon_interference.calibration'
    
    wclist = subprocess.check_output('wc -l ./data_fs/processed/*r136_refsub*.out', shell=True).decode("utf-8").split('\n')
    I = []
    D = []
    C = []
    G = []
    ipG = []
    imax = 0
    dmax = 0
    expname = ''
    runnum = ''
    for line in wclist:
        m = regexp.search('^\s*(\d+)\s+(.*data_fs/processed/(.+)_(r136_refsub)_ipm(\d+)_del(\d+).out)$',line)
        if m:
    	    nshots = int(m.group(1))
    	    fullname = m.group(2)
    	    expname = m.group(3)
    	    runnum = m.group(4)
    	    ipmbin = int(m.group(5))
    	    delbin = int(m.group(6))
    	    imax = max(imax,ipmbin)
    	    dmax = max(dmax,delbin)
    	    if nshots>1: # more than 10 spectra in a given delay and ipm 2D-bin
                I = I + [ipmbin]
                D = D + [delbin]
                C = C + [nshots]
                mat = np.loadtxt(fullname,dtype=float)
                """
                HERE using the matrix multiply rather than the derivative to determine the location and amplitude
                """
                calibmat = np.loadtxt(noetaloncalibfilename)
                result = convolve(mat,calibmat)
                #print(result.shape)
                ip_inds = np.argmax(result,axis=1)
                ip_vals = np.max(result,axis=1).astype(int)
                #ipG = ipG + [100*len([i for i in ip_inds if (i>60 and i<80)])/len(ip_inds)]
                ipG = ipG + [100*len([i for i in ip_inds if (i>12 and i<17)])/len(ip_inds)]
                filename= fullname + '.ip_indsvals_noetalon'
                headerstr = 'maxind\tmax\t\t-- if the index is between 60 and 80 out of 120 delay bins from calibfile, then its a good shot'
                headerstr = 'maxind\tmax\t\t-- if the index is between 16 and 19 out of 24 delay bins from calibfile, then its a good shot'
                np.savetxt(filename,np.column_stack((ip_inds,ip_vals)),fmt='%i',header=headerstr)
                """
    	        filename= fullname + '.fftabs'
    	        np.savetxt(filename,np.abs(matFFT),fmt='%.3f')
                """
                matFFT = np.fft.fft(mat,axis=1)
                matFFT = weinerfilter(matFFT)
                """
                filename= fullname + '.filteredabs'
                np.savetxt(filename,np.abs(matFFT),fmt='%.3f')
                """
                matback = np.real(np.fft.ifft(matFFT,axis=1))
                filename= fullname + '.fftback'
                np.savetxt(filename,matback,fmt='%.3f')
                inds = np.argmax(matback,axis=1)
                vals = np.max(matback,axis=1).astype(int)
                buff = 100
                fallinds = np.argmin(matback[:,buff:-buff],axis=1)+buff
                fallvals = np.min(matback[:,buff:-buff],axis=1).astype(int)
                #m_matback=sparse.coo_matrix((vals,(np.arange(inds.shape[0]),inds)),shape=matback.shape)
                filename= fullname + '.indsvals'
                headerstr = 'maxind\tmax\tminind\tmin'
                np.savetxt(filename,np.column_stack((inds,vals,fallinds,fallvals)),fmt='%i',header=headerstr)
                #filename= fullname + '.m_matback'
                #np.savetxt(filename,m_matback.toarray(),fmt='%i')
                G = G + [100*len([i for i in inds if (i>300 and i<550)])/len(inds)]
    
    CMAT = sparse.coo_matrix((C,(D,I)),shape=(dmax+1,imax+1)).toarray()
    filename='./data_fs/processed/%s_%s_count_mat.hist' % (expname,runnum)
    np.savetxt(filename,CMAT,fmt='%i')
    print(CMAT.T)
    GMAT = sparse.coo_matrix((G,(D,I)),shape=(dmax+1,imax+1)).toarray()
    ipGMAT = sparse.coo_matrix((ipG,(D,I)),shape=(dmax+1,imax+1)).toarray()
    filename='./data_fs/processed/%s_%s_goodpct_mat.hist' % (expname,runnum)
    np.savetxt(filename,GMAT,fmt='%i')
    filename='./data_fs/processed/%s_%s_goodpct_mat_ip.hist' % (expname,runnum)
    np.savetxt(filename,ipGMAT,fmt='%i')
    print(GMAT.T)
    return
    
if __name__ == '__main__':
    main() 
