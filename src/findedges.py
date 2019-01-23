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
    #print('calibmat.shape',calibmat.shape)
    #print('mat.shape',mat.shape)
    result = np.matmul(calibmat,mat.T).astype(int)
    #print(result)
    inds=np.argmax(result,axis=0)
    #print('inds',inds)
    #print(np.arange(inds.shape[0]))
    return np.column_stack((inds,result[inds,np.arange(len(inds))]))


def edgeconvolve(mat,calibmat):
    matFFT = np.fft.fft(mat,axis=1)
    matFFT = weinerfilter(matFFT)
    mat_back = np.fft.ifft(matFFT).real
    calibmatFFT = np.fft.fft(calibmat,axis=1)
    (ntiles,sz) = calibmat.shape
    f = np.zeros(sz,dtype=complex)
    f.real = np.fft.fftfreq(sz,1./sz)
    f.imag[0] = 1.
    filt = 1.j*f
    filt.real[0] = 0.
    filttile = np.tile(filt,(ntiles,1))
    calibmat_back = np.fft.ifft(calibmatFFT * filttile).real
    posinds = np.where(calibmat_back.real>0.)
    neginds = np.where(calibmat_back.real<0.)
    calibmat_back_p = np.zeros(calibmat_back.shape,dtype=float)
    calibmat_back_n = np.zeros(calibmat_back.shape,dtype=float)
    calibmat_back_p[posinds] = calibmat_back[posinds]
    calibmat_back_n[neginds] = calibmat_back[neginds]
    result_p = np.matmul(calibmat_back_p,mat_back.T).astype(int)
    result_n = np.matmul(calibmat_back_n,mat_back.T).astype(int)
    (inds_p, inds_n) = (np.argmax(result_p,axis=0) , np.argmax(result_n,axis=0))
    rows=np.arange(len(inds_p))
    (vals_p, vals_n) = (result_p[inds_p,rows].astype(int) , result_n[inds_n,rows].astype(int))
    return np.column_stack((inds_p,vals_p,inds_n,vals_n))

def build_matderivative(npixels,rate=2./3,offset=10):
    """
    Here we are trying to take the time derivative in order to not have the back and forth FFTs of the incoming signal, instead, 
    represent the derivative finding convolution as a matrix multiply
    """
    data = [[np.power(rate,int(i))]*npixels for i in range(1,2*offset+1)]
    offsets_p = [i for i in range(0,2*offset,1)]
    offsets_n = [offset+i for i in range(0,2*offset,1)]
    sp_mat_p = sparse.dia_matrix((data,offsets_p),shape=(npixels,npixels)) 
    sp_mat_n = sparse.dia_matrix((data,offsets_n),shape=(npixels,npixels))
    norm = np.sum(sp_mat_p,axis=0)
    return sparse.csr_matrix((sp_mat_p-sp_mat_n)/norm).T
    """
    meanmat=np.zeros(npixels+1,dtype=float)
    meanmat[:2*offset] = np.power(rate,np.arange(1,2*offset+1))
    meanmat[:2*offset] /= np.sum(meanmat[:2*offset])    # this is not quite right at the edges, but we will not worry about that so much... 
                                                    #also this wraps on the end over to the other side of the vector too.
    meanmat = np.tile(meanmat,npixels)
    newmat=(np.copy(meanmat[:npixels**2]) - np.copy(meanmat[offset:(npixels**2)+offset])).reshape(npixels,npixels)
    return newmat
    """

def execute_matderivative(mat,derivmat):
    return derivmat*mat.T
    

def main():
    matderiv_soft = build_matderivative(1024,.95,40) 
    filename = './data_fs/processed/xppc00117_r136_refsub.derivative_matrix_soft'
    np.savetxt(filename,matderiv_soft.toarray(),fmt='%.4f')
    #np.savetxt(filename,matderiv_soft,fmt='%.4f')

    matderiv_sharp = build_matderivative(1024,.9,20) 
    filename = './data_fs/processed/xppc00117_r136_refsub.derivative_matrix_sharp'
    np.savetxt(filename,matderiv_sharp.toarray(),fmt='%.4f')
    #np.savetxt(filename,matderiv_sharp,fmt='%.4f')

    calibfilename = './data_fs/extern/ascii_chirp-2000_1650_nfibers61_interference.calibration'
    noetaloncalibfilename = './data_fs/extern/ascii_chirp-2000_1650_nfibers61_noetalon_interference.calibration'
    calibmat = np.loadtxt(calibfilename)
    calibmat_deriv = execute_matderivative(calibmat,matderiv_sharp) * np.abs(execute_matderivative(calibmat,matderiv_soft))
    calibmat_deriv_p = np.copy(calibmat_deriv*(calibmat_deriv>0))
    calibmat_deriv_n = np.copy(calibmat_deriv*(calibmat_deriv<0))
    filename = calibfilename + '.derivative_p'
    np.savetxt(filename,calibmat_deriv_p,fmt='%i')
    filename = calibfilename + '.derivative_n'
    np.savetxt(filename,calibmat_deriv_n,fmt='%i')
    
    wclist = subprocess.check_output('wc -l ./data_fs/processed/*r136_refsub*.out', shell=True).decode("utf-8").split('\n')
    I = []
    D = []
    C = []
    G = []
    ipG = []
    ipGderiv = []
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
                indsvals = convolve(mat,calibmat)
                ipG = ipG + [100*len([i for i in indsvals[:,0] if (i>12 and i<17)])/indsvals.shape[0]]
                filename= fullname + '.ip_indsvals_noetalon'
                headerstr = 'maxind\tmax\t\t-- if the index is between 60 and 80 out of 120 delay bins from calibfile, then its a good shot'
                headerstr += '\n#maxind\tmax\t\t-- if the index is between 16 and 19 out of 24 delay bins from calibfile, then its a good shot'
                np.savetxt(filename,indsvals,fmt='%i',header=headerstr)
                
                """
    	        filename= fullname + '.fftabs'
    	        np.savetxt(filename,np.abs(matFFT),fmt='%.3f')
                """
                """
                Now we're cooking with gas!!!
                using the buildderiv to make a derivative matrix but doing so with two different averaging weighting factors... 
                ... like the overly narrowed weiner filter of Justin Burau
                Then taking the abs of the result and multipying by a higher frequency derivative (smaller offset, faster decay)
                """
                signalderivative = execute_matderivative(mat,matderiv_sharp) * np.abs(execute_matderivative(mat,matderiv_soft))
                filename = fullname + '.matderivative'
                np.savetxt(filename,signalderivative,fmt='%i')
                out_p = np.matmul(calibmat_deriv_p.T,signalderivative)
                filename = fullname + '.matderivative.result_p'
                np.savetxt(filename,out_p,fmt='%i')
                out_n = np.matmul(calibmat_deriv_n.T,signalderivative)
                filename = fullname + '.matderivative.result_n'
                np.savetxt(filename,out_n,fmt='%i')
                (inds_p,inds_n) = (np.argmax(out_p,axis=0),np.argmax(out_n,axis=0))
                rows=np.arange(inds_p.shape[0])
                (indsvals_p,indsvals_n) = (out_p[inds_p,rows].astype(int),out_n[inds_n,rows].astype(int))
                filename = fullname + '.matderivative.indsvals'
                np.savetxt(filename,np.column_stack((inds_p,indsvals_p,inds_n,indsvals_n)),fmt='%i')
                #G = G + [100*len([i for i in inds_p if (i>12 and i<17)])/inds_p.shape[0]]
                G = G + [100*np.sum((inds_p>12)*(inds_p<17))/inds_p.shape[0]]
                window=2
                ipGderiv = ipGderiv + [100*np.sum(np.abs(inds_p-inds_n)<window)/inds_p.shape[0]]

                """
                indsvals = edgeconvolve(mat,calibmat)
                edge_p_inds = indsvals[:,0]
                edge_n_inds = indsvals[:,2]
                ipG = ipG + [100*len([i for i in edge_p_inds if (i>12 and i<17)])/len(edge_p_inds)]

                matFFT = np.fft.fft(mat,axis=1)
                matFFT = weinerfilter(matFFT)
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
                """
    
    GMAT = np.column_stack((I,D,G,C))
    filename='./data_fs/processed/%s_%s_goodpct_mat.hist' % (expname,runnum)
    np.savetxt(filename,GMAT,fmt='%i')
    ipGMAT = np.columnstack((I,D,ipG,C))
    filename='./data_fs/processed/%s_%s_goodpct_mat_ip.hist' % (expname,runnum)
    np.savetxt(filename,ipGMAT,fmt='%i')
    ipGderivMAT = np.column_stack((I,D,ipGderiv,C))
    filename='./data_fs/processed/%s_%s_goodpct_mat_ipderiv.hist' % (expname,runnum)
    np.savetxt(filename,ipGderivMAT,fmt='%i')
    return

if __name__ == '__main__':
    main() 
