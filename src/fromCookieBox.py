def analogprocess(invec,bwd=2.4e9,dt=1):
    f = np.fft.fftfreq(invec.shape[0],dt)/bwd
    s = np.copy(invec)
    S = np.fft.fft(s)
    I = np.zeros(S.shape,dtype = complex)
    DS = np.zeros(S.shape,dtype = complex)
    IDS = np.zeros(S.shape,dtype = complex)
    DS = np.zeros(S.shape,dtype = complex)
    DDS = np.zeros(S.shape,dtype = complex)
    inds = np.where(np.abs(f) < 1.)
    logscale = 5e3
    logf = np.zeros(S.shape,dtype = float)
    logf[1:] = np.log(np.abs(f[1:])*logscale)
    linds = np.where( logf < 0 ) 
    logf[linds] = 0.
    fpowm1p2 = np.zeros(S.shape,dtype = float)
    fpowm0p2 = np.zeros(S.shape,dtype = float)
    fpowm1p2[1:] = np.power(np.abs(f[1:]),-1.2).real
    fpowm0p2[1:] = np.power(np.abs(f[1:]),-0.2).real
    FILT_I = np.zeros(S.shape,dtype = complex)
    FILT_IDS = np.zeros(S.shape,dtype = complex)
    FILT_DS = np.zeros(S.shape,dtype = complex)
    FILT_DDS = np.zeros(S.shape,dtype = complex)
    FILT_I[inds] = np.cos(np.abs(f[inds])*np.pi/2.)*logf[inds]*fpowm1p2[inds] + 0.j
    FILT_IDS[inds] = np.cos(f[inds]*np.pi/2.)*logf[inds]*fpowm0p2[inds] + 0.j# already is leaving the 0th element zero via definition of logf and fpowm0p2
    FILT_DS[inds] = 0. + 1j * np.sin(f[inds]*np.pi) * np.cos(f[inds]*np.pi/2.) * logf[inds] * fpowm0p2[inds]
    FILT_DDS[inds] = -np.sin(f[inds]*np.pi) * np.cos(f[inds]*np.pi/2.) * logf[inds] * fpowm0p2[inds] * f[inds]  + 0.j
    I[inds] = np.copy(S[inds]) * FILT_I[inds] 
    IDS[inds] = np.copy(S[inds]) * FILT_IDS[inds]
    DS[inds] = np.copy(S[inds]) * FILT_DS[inds] 
    DDS[inds] = np.copy(S[inds]) * FILT_DDS[inds]
    dds = np.fft.ifft(DDS).real
    ds = np.fft.ifft(DS).real
    ids = np.fft.ifft(IDS).real
    i = np.fft.ifft(I).real

    filt_i = np.roll(np.fft.ifft(FILT_I),100)
    filt_ids = np.roll(np.fft.ifft(FILT_IDS),100)
    filt_ds = np.roll(np.fft.ifft(FILT_DS),100)
    filt_dds = np.roll(np.fft.ifft(FILT_DDS),100)

    thresh = np.zeros(ids.shape,dtype = float)
    thresh = ids * dds
    deltas = np.zeros(ids.shape,dtype = float)
    inds = np.where(thresh < -.1)
    deltas[inds] = np.abs(1./(ds[inds]))
    return np.column_stack(( np.abs(f) , np.abs(S), np.abs(I), np.abs(IDS), np.abs(DS), np.abs(DDS) , invec, i, ids,ds,dds,thresh,deltas,filt_i.real,filt_ids.real,filt_ds.real,filt_dds.real,filt_i.imag,filt_ids.imag,filt_ds.imag,filt_dds.imag))
