#!/usr/bin/python3

import numpy as np
import re as regexp
import subprocess
from scipy import sparse
from fileutils import *


def main():
    datadir = './data_fs/raw/'
    calibdir = './data_fs/extern/'

    calibfile=calibdir + 'tfrecord_chirp-2400_823_interference.calibration'
    print(calibfile)
    calibmat = np.loadtxt(calibfile,dtype=int)
    expstr = 'amox28216'
    runnum = 93
    stepnum = 0
    imgnum = 0
    #print(imgfile(datadir,filehead,imgnum))
    imgmat = np.loadtxt(imgfile(datadir,expstr,runnum,stepnum,imgnum),dtype=int).T
    print(imgfile(datadir,expstr,runnum,stepnum,imgnum))
    (nrows,npixels) = imgmat.shape
    print('nrows = ', nrows)
    #print(np.matmul(calibmat,imgmat[0,:].T))
    procdir = './data_fs/processed/'

    ncombine=8
    out = np.zeros((2*imgmat.shape[0]//ncombine+2),dtype=int)
    OUT = np.zeros((0,2*imgmat.shape[0]//ncombine+2),dtype=int)

    for i in range(0,250,50): #[10,30,40,50]:
        for s in range(0,160,10): #[40,50,60,70]:
            try:
                imgmat = np.loadtxt(imgfile(datadir,expstr,runnum,s,i),dtype=int)
            except:
                print('crap, missing image,\t%s' % (imgfile(datadir,expstr,runnum,s,i)))
                next
            xmat = sumsamplerows(imgmat,ncombine)
            (nrows,npixels) = xmat.shape
            #print("xmat.shape = (%i, %i)" % xmat.shape)
            result = np.matmul(calibmat,xmat.T)
#here here here
#OK, tile the index numbers, then take the max ind and some region around it and compute the weighted sum via matrix multiplication
#it will be a matrix that has nrows = number of reduced nfiber dimension
#then the ncols will be an index running along the rows with i 
#then transpose and do a matmul to get a vector of centroids
#use the mask feature along with the argmax to define the mask function
            np.savetxt(outfile(procdir,expstr,runnum,s,i,'innerprod'),result,fmt='%i')
            inds = np.argmax(result,axis=0).T
            maxs = np.max(result,axis=0).T
            d = -1
            out[:2] = (i,s)
            out[2::2] = inds
            out[3::2] = maxs
            OUT = np.row_stack((OUT,out)) 

    np.savetxt(resfile(procdir,expstr,runnum,'.innerprod_results'),OUT,fmt='%i')
    """
    OK, mask on maxs.  If where maxs > 2e8 then fit 
    OUT[:,2]... ugh too tired
    """


if __name__ == '__main__':
    main()
