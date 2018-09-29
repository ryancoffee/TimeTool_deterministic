#!/usr/bin/gnuplot -persist
#
#    
#    	G N U P L O T
#    	Version 5.2 patchlevel 2    last modified 2017-11-01 
#    
#    	Copyright (C) 1986-1993, 1998, 2004, 2007-2017
#    	Thomas Williams, Colin Kelley and many others
#    
#    	gnuplot home:     http://www.gnuplot.info
#    	faq, bugs, etc:   type "help FAQ"
#    	immediate help:   type "help"  (plot window: hit 'h')
# set terminal qt 1 font "Sans,9"
# set output
unset clip points
set clip one
unset clip two
set border 31 front lt black linewidth 1.000 dashtype solid
set zdata 
set ydata 
set xdata 
set y2data 
set x2data 
set boxwidth
set style fill  empty border
set style rectangle back fc  bgnd fillstyle   solid 1.00 border lt -1
set style circle radius graph 0.02 
set style ellipse size graph 0.05, 0.03 angle 0 units xy
set dummy x, y
set format x "% h" 
set format y "% h" 
set format x2 "% h" 
set format y2 "% h" 
set format z "% h" 
set format cb "% h" 
set format r "% h" 
set angles radians
set tics back
unset grid
unset raxis
set style parallel front  lt black linewidth 2.000 dashtype solid
set key title "" center
set key right top vertical Right noreverse enhanced autotitle nobox
set key noinvert samplen 4 spacing 1 width 0 height 0 
set key maxcolumns 0 maxrows 0
set key noopaque
unset label
unset arrow
set style increment default
unset style line
unset style arrow
set style histogram clustered gap 2 title textcolor lt -1
unset object
set offsets 0, 0, 0, 0
set pointsize 1
set pointintervalbox 1
set encoding default
unset polar
unset parametric
unset decimalsign
set view map scale 1
set samples 100, 100
set isosamples 10, 10
set surface 
unset contour
set cntrlabel  format '%8.3g' font '' start 5 interval 20
set mapping cartesian
set datafile separator whitespace
unset hidden3d
set cntrparam order 4
set cntrparam linear
set cntrparam levels auto 5
set cntrparam points 5
set size ratio 0 1,1
set origin 0,0
set style data image
set style function lines
unset xzeroaxis
unset yzeroaxis
unset zzeroaxis
unset x2zeroaxis
unset y2zeroaxis
set xyplane relative 0.5
set tics scale  1, 0.5, 1, 1, 1
set mxtics default
set mytics default
set mztics default
set mx2tics default
set my2tics default
set mcbtics default
set xtics border in scale 1,0.5 mirror norotate  autojustify
set xtics  norangelimit autofreq 
set ytics border in scale 1,0.5 mirror norotate  autojustify
set ytics  norangelimit autofreq 
set ztics border in scale 1,0.5 nomirror norotate  autojustify
set ztics  norangelimit autofreq 
unset x2tics
unset y2tics
set cbtics border in scale 1,0.5 mirror norotate  autojustify
set cbtics  norangelimit autofreq 
set rtics axis in scale 1,0.5 nomirror norotate  autojustify
set rtics  norangelimit autofreq 
set title "" 
set title  font "" norotate
set timestamp bottom 
set timestamp "" 
set timestamp  font "" norotate
set trange [ * : * ] noreverse nowriteback
set urange [ * : * ] noreverse nowriteback
set vrange [ * : * ] noreverse nowriteback
set xlabel "" 
set xlabel  font "" textcolor lt -1 norotate
set x2label "" 
set x2label  font "" textcolor lt -1 norotate
set xrange [ * : * ] noreverse nowriteback
set x2range [ * : * ] noreverse nowriteback
set ylabel "" 
set ylabel  font "" textcolor lt -1 rotate
set y2label "" 
set y2label  font "" textcolor lt -1 rotate
set yrange [ * : * ] noreverse nowriteback
set y2range [ * : * ] noreverse nowriteback
set zlabel "" 
set zlabel  font "" textcolor lt -1 norotate
set zrange [ * : * ] noreverse nowriteback
set cblabel "" 
set cblabel  font "" textcolor lt -1 rotate
set cbrange [ * : * ] noreverse nowriteback
unset logscale
set zero 1e-08
set lmargin  -1
set bmargin  -1
set rmargin  -1
set tmargin  -1
set locale "en_US.UTF-8"
set pm3d implicit at s
set pm3d scansautomatic
set pm3d interpolate 1,1 flush begin noftriangles noborder corners2color mean
set palette positive nops_allcF maxcolors 0 gamma 1.5 color model RGB 
set palette rgbformulae 7, 5, 15
set colorbox default
set loadpath 
set fontpath 
set psdir
file(i,d)=sprintf('./data/processed/xppc00117_r136_refsub_ipm%i_del%i.out',i,d)
fileback(i,d)=sprintf('./data/processed/xppc00117_r136_refsub_ipm%i_del%i.out.m_matback',i,d)
fileinds(i,d)=sprintf('./data/processed/xppc00117_r136_refsub_ipm%i_del%i.out.maxinds',i,d)
GNUTERM = "qt"
## Last datafile plotted: "/data/projects/slac/TimeTool/TimeTool_deterministic/data/processed/xppc00117_r136_refsub_ipm49_del5.out.maxinds"
ipmvals = '  268   290   314   340    367   397   429   464   502   543   587   635    687    743    803    868    939   1015  1098   1187   1283   1387   1500   1622   1753  1896   2050  2216  2396  2591   2801  3029   3275   3541   3828  4139  4475  4838  5231  5656  6115  6612   7149   7729  8357  9035  9769  10562  11419  12346  13348 14432  15604  16871 18240 19721  21322  23053 '
ipmvals = '27.     30.5    34.     38.5    43.5    49.     55.     62.     70.    78.5    88.     99.    111.5   125.5   141.    158.5   178.5   200.5       225.5   254.    285.5   321.    361.    405.5   456.    513.    576.5          648.    729.    820.    922.   1036.5  1165.   1309.5  1472.5  1655.5	    1861.   2092.5  2352.5  2644.5  2973.   3342.5  3758.   4225.   4749.5	      5339.5  6003.   6748.5  7587.   8529.5  9589.  10780.  12119.  13624.5	       15317.  17219.5 19358.  21762.5'
ipm_offset=250
ipm_offset=0
#step = log(10*(21762.5-ipm_offset)/(27-ipm_offset))/59.
#step = log(.1*(21762.5-ipm_offset)/(27-ipm_offset))/59.
step = log((21762.5-ipm_offset)/(27-ipm_offset))/59.
i2ipm(i) = exp(log(27-ipm_offset) + step*(i))
set style data points
set pointsize 0.5
unset colorbox
set term png size 1200,1000
set output 'fluencedependence.r136.compare.ipm_asis.png'
#set output 'fluencedependence.r136.compare.ipm_miscalib_0.1.png'
#set output 'fluencedependence.r136.compare.ipm_miscalib_10.png'
set yrange [10:2e3]
set xrange [1e1:1e5]
set log y
set log x
set key top left
set xlabel 'absorbed dose [uJ/cm^2]'
set ylabel 'edge signal [arb. units]'
giacomo(x) = sprintf('data/raw/GiacomoPlot.%s.dat',x)
set multiplot
set origin 0,.5
set size 1,.5
plot for [i=0:60] fileinds(i,5) u (i2ipm(i+.7*rand(0))):2 pt 7 lc -1 notitle,\
	1e-3*x**2 lw 2 lc rgb 'red' title 'x**2',\
	2e-2*x lw 2 lc rgb 'blue' title 'x'
set origin 0,0
set yrange [10:120]
set ylabel 'pct. good shots'
set key bottom right
set pointsize 1
plot giacomo('spatial') u ($1*1e3):2 w linespoints title 'normal spatial',\
	giacomo('spectral') u ($1*1e3):2 w linespoints title 'normal spectral',\
	'data/processed/xppc00117_r136_refsub_goodpct_mat.hist' mat u (i2ipm($1)):(($2>4&$2<6)?$3:0./0) w points pt 7 lc -1 title "interference spectral"
unset multiplot

#    EOF
