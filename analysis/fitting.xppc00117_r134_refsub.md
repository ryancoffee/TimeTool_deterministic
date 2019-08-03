Analysis chain
==============
# Preprocessing  
First get into psana.  
Then preprcess by editing the preprocess.py file to work on the desired file (this case `xppc00117` run `134` or `136_refsub`)  
```bash  
source runpre.bash  
python src/preprocess.py  
```  

# Slicing  

Slice the matrix files.  
Here we use a logarithmic slice on ipm values, comfortably between [1000..30000].
The actual values are integers, from 0 up to 100k, but the center of the distribution is around 15k or so and looks Gaussian distributed on a log scale.  
```bash  
python3.5 src/slice_ipms.py 10  
python3.5 src/fourieredges.py ./data_fs/processed/xppc00117_r136_ipm8.out  
```
The `fourieredges.py` uses this over+ideal filtering, but this was set some time back.
Still it seems to work OK.  

# Plotting  
Use `xppc00117` run `134_refsub` to get the chirp since that was a scan.  
`.analysis/plotting.fitting.xppc00117_r134_refsub.gnuplot`  
From here we get the first initial fit curve for the (rise-fall) pixel difference versus the rise pixel.
This gives a nice functional dependence when we look at strong shots (top 50\% of ipm bins) 

```python
def edgesagree(rise,fall):
	y = float(rise-fall)
	x = float(rise)
	win = 100.
	a = -245.
	b = -0.37
	x0 = 425 
	c = -0.0002
	yhigh=win/2+a+b*(x-x0)+c*math.pow(float(x)-x0,int(2))
	ylow=-win/2+a+b*(x-x0)+c*math.pow(float(x)-x0,int(2))
	return (ylow <= y <= yhigh)
```

# Fitting  
Onde we use the gnereal trend, then we can update the portion of the fourieredges.py params to handle the higher order fittin, in order to write out the `./data_fs/processed/xppc00117_r136_ipm8.out.goodinds` file out.  
This allows for a better fit to the functional relationship.  

```python
def delta(x):
    x0 = 425.
    a = -241.821 #        +/- 0.1389       (0.05745%)
    b = -0.331548 #       +/- 0.001348     (0.4066%)
    c = -0.000341439 #    +/- 4.462e-06    (1.307%)
    d = -5.70297e-07 #    +/- 2.197e-08    (3.852%)
    return a+b*(x-x0)+c*math.pow(x-x0,int(2))+d*math.pow(x-x0,int(3))
    
def edgesagree3(rise,fall):
    y = float(rise-fall)
    x = float(rise)
    win = 100.
    ylow = -win/2+delta(rise)
    yhigh = ylow + win
    return (ylow <= y <= yhigh)
```

# Resolution  

Next left to do is to convert these pixel units into time units by comparing the goodinds to the respective delays and getting the calibrations.  
So I added delay output for the `src/slice_ipms.py` file and used that to plot delay versus rise index.
This needed to be hand fit since the bi-modal timing made for two stripes.
Doesn't hurt anyway since really we only need the derivative.
The hand fit values for `xppc00117_r134` give the following:
```python
def delaycalib(x):
    a=-1.2
    b=-8.5e-3
    c=8e-6
    x0=425
    ps = a+b*(x-x0)+c*math.pow(x-x0,int(2))
    dps = b+2.*c
    return (ps,dps)
```
where `x = rise`.

since `delta` gives the difference `rise - fall` we can use this to get two delays from the traces, `delaycalib(rise)` and `delaycalib(fall+delta(rise))`.  


