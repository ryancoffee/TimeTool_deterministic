#!/usr/bin/gnuplot -persist
#
#    
#    	G N U P L O T
#    	Version 4.6 patchlevel 2    last modified 2013-03-14 
#    	Build System: Linux x86_64
#    
#    	Copyright (C) 1986-1993, 1998, 2004, 2007-2013
#    	Thomas Williams, Colin Kelley and many others
#    
#    	gnuplot home:     http://www.gnuplot.info
#    	faq, bugs, etc:   type "help FAQ"
#    	immediate help:   type "help"  (plot window: hit 'h')
# set terminal x11 0 nopersist
# set output
unset clip points
set clip one
unset clip two
set bar 1.000000 front
set border 31 front linetype -1 linewidth 1.000
set zdata 
set ydata 
set xdata 
set y2data 
set x2data 
set boxwidth
set style fill  empty border
set style rectangle back fc lt -3 fillstyle   solid 1.00 border lt -1
set style circle radius graph 0.02, first 0, 0 
set style ellipse size graph 0.05, 0.03, first 0 angle 0 units xy
set dummy x,y
set format x "% g"
set format y "% g"
set format x2 "% g"
set format y2 "% g"
set format z "% g"
set format cb "% g"
set format r "% g"
set angles radians
unset grid
set raxis
set key title ""
set key inside right top vertical Right noreverse enhanced autotitles nobox
set key noinvert samplen 4 spacing 1 width 0 height 0 
set key maxcolumns 0 maxrows 0
set key noopaque
unset label
unset arrow
set style increment default
unset style line
unset style arrow
set style histogram clustered gap 2 title  offset character 0, 0, 0
unset logscale
set offsets 0, 0, 0, 0
set pointsize 1
set pointintervalbox 1
set encoding default
unset polar
unset parametric
unset decimalsign
set view map
set samples 100, 100
set isosamples 10, 10
set surface
unset contour
set clabel '%8.3g'
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
set xzeroaxis linetype -2 linewidth 1.000
set yzeroaxis linetype -2 linewidth 1.000
set zzeroaxis linetype -2 linewidth 1.000
set x2zeroaxis linetype -2 linewidth 1.000
set y2zeroaxis linetype -2 linewidth 1.000
set ticslevel 0.5
set mxtics default
set mytics default
set mztics default
set mx2tics default
set my2tics default
set mcbtics default
set xtics border in scale 1,0.5 mirror norotate  offset character 0, 0, 0 autojustify
set xtics autofreq  norangelimit
set ytics border in scale 1,0.5 mirror norotate  offset character 0, 0, 0 autojustify
set ytics autofreq  norangelimit
set ztics border in scale 1,0.5 nomirror norotate  offset character 0, 0, 0 autojustify
set ztics autofreq  norangelimit
set nox2tics
set noy2tics
set cbtics border in scale 1,0.5 mirror norotate  offset character 0, 0, 0 autojustify
set cbtics autofreq  norangelimit
set rtics axis in scale 1,0.5 nomirror norotate  offset character 0, 0, 0 autojustify
set rtics autofreq  norangelimit
set title "" 
set title  offset character 0, 0, 0 font "" norotate
set timestamp bottom 
set timestamp "" 
set timestamp  offset character 0, 0, 0 font "" norotate
set rrange [ * : * ] noreverse nowriteback
set trange [ * : * ] noreverse nowriteback
set urange [ * : * ] noreverse nowriteback
set vrange [ * : * ] noreverse nowriteback
set xlabel "" 
set xlabel  offset character 0, 0, 0 font "" textcolor lt -1 norotate
set x2label "" 
set x2label  offset character 0, 0, 0 font "" textcolor lt -1 norotate
set xrange [ * : * ] noreverse nowriteback
set x2range [ * : * ] noreverse nowriteback
set ylabel "" 
set ylabel  offset character 0, 0, 0 font "" textcolor lt -1 rotate by -270
set y2label "" 
set y2label  offset character 0, 0, 0 font "" textcolor lt -1 rotate by -270
set yrange [ * : * ] noreverse nowriteback
set y2range [ * : * ] noreverse nowriteback
set zlabel "" 
set zlabel  offset character 0, 0, 0 font "" textcolor lt -1 norotate
set zrange [ * : * ] noreverse nowriteback
set cblabel "" 
set cblabel  offset character 0, 0, 0 font "" textcolor lt -1 rotate by -270
set cbrange [ -50.0000 : 50.0000 ] noreverse nowriteback
set zero 1e-08
set lmargin  -1
set bmargin  -1
set rmargin  -1
set tmargin  -1
set locale "en_US.UTF-8"
set pm3d explicit at s
set pm3d scansautomatic
set pm3d interpolate 1,1 flush begin noftriangles nohidden3d corners2color mean
set palette positive nops_allcF maxcolors 0 gamma 1.5 color model RGB 
set palette rgbformulae 7, 5, 15
set colorbox default
set colorbox vertical origin screen 0.9, 0.2, 0 size screen 0.05, 0.6, 0 front bdefault
set style boxplot candles range  1.50 outliers pt 7 separation 1 labels auto unsorted
set loadpath 
set fontpath 
set psdir
set fit noerrorvariables
GNUTERM = "x11"
matfile(i,d)=sprintf('data/processed/xppc00117_r119_ipm%i_del%i.out.fftback',i,d)
set term png size 1200,1000
set output 'figs/derivfiltered.png'
set multiplot 
set origin 0,0
set size .33,1
set xrange [0:1024]
set yrange [0:90]
set cbrange [0:40]
#ipmdata	absdose[nJ]	absfluence[muJ/cm^2]
#[[  999   325    64]
# [ 1274   414    82]
# [ 1623   528   105]
# [ 2069   673   133]
# [ 2636   857   170]
# [ 3359  1093   217]
# [ 4281  1393   277]
# [ 5455  1775   353]
# [ 6951  2262   450]
# [ 8858  2882   573]
#[  73.    93.5  119.   151.5  193.5  247.   315.   401.5  511.5  651.5	830.5 1058.5 1349.  1719.  2190.5 2791.5 3557.5 4533.5]
#set ytics ('600' 2,'765' 15, '975' 35,'1250' 60,'1600' 80) offset -1,0
set ytics ('120' 2,'150' 15, '190' 35,'250' 60,'315' 80) offset -1,0
#set ylabel 'deposited dose [nJ]'
set ylabel 'deposited dose [uJ/cm^2]'
set xlabel 'pixel'
set title '1 ps'
unset colorbox
unset border
splot matfile(2,12) mat notitle,\
	matfile(3,12) mat u 1:(10+$2):3 notitle,\
	matfile(4,12) mat u 1:(25+$2):3 notitle,\
	matfile(5,12) mat u 1:(50+$2):3 notitle,\
	matfile(6,12) mat u 1:(70+$2):3 notitle
set origin .33,0
set title '0 ps'
splot matfile(2,10) mat notitle,\
	matfile(3,10) mat u 1:(10+$2):3 notitle,\
	matfile(4,10) mat u 1:(27+$2):3 notitle,\
	matfile(5,10) mat u 1:(45+$2):3 notitle,\
	matfile(6,10) mat u 1:(70+$2):3 notitle
set origin .66,0
set title '-1 ps'
splot matfile(2,8) mat notitle,\
	matfile(3,8) mat u 1:(10+$2):3 notitle,\
	matfile(4,8) mat u 1:(30+$2):3 notitle,\
	matfile(5,8) mat u 1:(45+$2):3 notitle,\
	matfile(6,8) mat u 1:(70+$2):3 notitle
unset multiplot
#    EOF
