## Logarithmic vision  

Try using after the derivative (16 bit int seems to cover the derivative operation, but just barely,   
maybe we split a 32 bit int by dividing by ```2**15```
```python
matsmall = np.mod(derivmat,2**15)
matlarge = derivmat//(2**15)
``` 
and representing both the matsmall and matlarge as half precision in TF and run the analysis as a 2xn kernel, or maybe run seperately and use the (if matlarge>0) to decide to execute only part of the computation graph.



