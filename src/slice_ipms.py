#!/usr/bin/python3.6

import numpy as np
import sys
import re
import math


def load_matdata(datadir,expstr,runstr,vwin0,vwin1):
    fname = '{}{}_r{}_{}_{}_matrix.dat'.format(datadir,expstr,runstr,vwin0,vwin1)
    return np.loadtxt(fname,dtype=float)

def load_ipmdata(datadir,expstr,runstr):
    fname ='{}{}_r{}_ipm.dat'.format(datadir,expstr,runstr)
    return np.loadtxt(fname,dtype=float)

def load_delaydata(datadir,expstr,runstr):
    fname = '{}{}_r{}_delays.dat'.format(datadir,expstr,runstr)
    return np.loadtxt(fname,usecols=(0,),dtype=float)

def main():
    ipmlims = (1e3,3e4)

    datadir = './data_fs/raw/'
    outputdir = './data_fs/processed/'

    vwin = (575,585) #(610,640)
    runstr = '136_refsub'
    expstr = str('xppc00117')

    nbins_ipm = 6
    if len(sys.argv) > 1:
        nbins_ipm = sys.argv[1]
    ipmbins = np.exp(np.linspace(math.log(5e2),math.log(5e4),nbins_ipm)).astype(int)
    ipmdata = load_ipmdata(datadir,expstr,runstr)
    ipmhist,ipmedges = np.histogram(ipmdata[:,1],bins=ipmbins)
    ipmindices = np.digitize(ipmdata[:,1],ipmbins)
    delaydata = load_delaydata(datadir,expstr,runstr)
    matdata = load_matdata(datadir,expstr,runstr,vwin[0],vwin[1])
    print('matdata = {}\tipmdata.shape = {}'.format(matdata.shape,ipmdata.shape))
    for thisipm in range(len(ipmbins)+1):
        sliceinds = [i for i,ipm in enumerate(ipmindices) if ipm==thisipm]
        ipmbinsstr = np.array2string(ipmbins,max_line_width=2000)
        ipmhiststr = np.array2string(ipmhist,max_line_width=2000) 
        if thisipm ==0:
            headstr = '{}\n{}\n{}\t{} .. {}'.format(ipmbinsstr,ipmhiststr,'not counted','zero',ipmbins[thisipm])
        else:
            if thisipm == len(ipmbins):
                headstr = '{}\n{}\n{}\t{} .. {}'.format(ipmbinsstr,ipmhiststr,'not counted',ipmbins[thisipm-1],'inf')
            else:
                headstr = '{}\n{}\n{}\t{} .. {}'.format(ipmbinsstr,ipmhiststr,ipmhist[thisipm-1],ipmbins[thisipm-1],ipmbins[thisipm])
        ofile = '{}{}_r{}_ipm{}.out'.format(outputdir,expstr,runstr,thisipm)
        np.savetxt(ofile,matdata[sliceinds[:-1],:],fmt='%.3e',header=headstr)
        ofile = '{}{}_r{}_ipm{}.del'.format(outputdir,expstr,runstr,thisipm)
        np.savetxt(ofile,delaydata[sliceinds[:-1]],fmt='%.3e',header=headstr)
    

if __name__ == '__main__':
    main()
