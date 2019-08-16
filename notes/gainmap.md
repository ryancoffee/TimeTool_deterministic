# Illumination and rowscales  

The gain map is really the Illumination run 104.  Here is where we shined an even brightness over the whole of the fiber bundle entrance.  
This caused each of the fibers to be illuminated evenly, and so the measured amplitde accounts for fiber breakage, and imaging losses into the entrance slit.  
Really the rowscales give the **signal level that can be expected** from the white light knife edge, but maybe this also needs adjusted by 1/illumination.  
But maybe that is actually already baked into the rowscales.

# Applying gain correction  
OK, this will be challenging.  
Read in both the horzontal and the vertical knifeedges centroids files.  
Use the rowscales vaues averaged horiz+vert to then apply the gain correction for the x-ray signal.  
Evaluate for the x-ray spot shape changes and see if we are sensative to that.  
Use the amplitude of the edge signals as the x-ray fluence surrogate.  
We are looking for two side-by-side figures, one with the fluence map, the other with the delay map.  
*One other thing to try may be to only use rows where the illumination vector has a negative second derivative.
