#!/usr/bin/python
import numpy as np
import sys

def absdose(x,l,a):
    return (x*(1.-np.exp(-l/a))).astype(int)

def absfluence(x,l,a,d):
    return (x*(1.-np.exp(-l/a))/(np.pi*np.power(d/2*1e-4,int(2)))*1e-3).astype(int)


def main():
    if len(sys.argv)<6:
        syntaxstring = './absdose.py <ipm.hist file> <attenlen reffile> <photon energy [eV]> <sample thickness [microns]> <beam diam [microns]'
        print(syntaxstring)
        return

    filename = sys.argv[1]
    ipmdata = np.loadtxt(filename,dtype=int,usecols=1)
    filename = sys.argv[2]
    attendata = np.loadtxt(filename,dtype=float)
    nu = float(sys.argv[3])
    l = float(sys.argv[4])
    a = np.interp(nu,attendata[:,0],attendata[:,1])
    d = float(sys.argv[5])
    out = np.column_stack((ipmdata,absdose(ipmdata,l,a),absfluence(ipmdata,l,a,d)))
    headerstring = 'ipmdata\tabsdose[nJ]\tabsfluence[muJ/cm^2]'
    print(headerstring)
    print(out)
    print((out[:-1,2]+out[1:,2])/2.)
    return

if __name__=='__main__':
    main()
