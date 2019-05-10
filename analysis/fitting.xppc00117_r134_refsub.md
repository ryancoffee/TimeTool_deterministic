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
From here we gat the first initial fit curve for the (rise-fall) pixel difference versus the rise pixel.
This gives a nice functional dependence when we look at strong shots (top 50\% of ipm bins) 
