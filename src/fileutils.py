#!/usr/bin/python3
from numpy import ndarray,zeros
from numpy import sum as npsum

def imgfile(dirstr,e,r,s,i):
    #filehead = 'amox28216_r93_step0_image0.dat'
    return dirstr + '%s_r%i_step%i_image%i.dat' % (e,r,s,i)

def resfile(dirstr,e,r,tailstr):
    return dirstr + '%s_r%i.%s' % (e,r,tailstr)

def outfile(dirstr,e,r,s,i,tailstr):
    return dirstr + '%s_r%i_step%i_image%i.%s' % (e,r,s,i,tailstr)

def sumsamplerows(mat,ncombine):
    (nrows,ncols) = mat.shape
    #print("(nrows,ncols) = (%i,%i)" % (nrows,ncols))
    result = zeros((nrows//ncombine,ncols),dtype=mat.dtype)
    for r in range(nrows//ncombine):
        result[r,:] = npsum(mat[ncombine*r:ncombine*(r+1),:],axis=0)
    return result
