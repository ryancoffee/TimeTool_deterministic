#!/usr/bin/gnuplot
unset clip points
set clip one
unset clip two
set bar 1.000000 front
set border 31 front linetype -1 linewidth 1.000
set timefmt z "%d/%m/%y,%H:%M"
set zdata 
set timefmt y "%d/%m/%y,%H:%M"
set ydata 
set timefmt x "%d/%m/%y,%H:%M"
set xdata 
set timefmt cb "%d/%m/%y,%H:%M"
set timefmt y2 "%d/%m/%y,%H:%M"
set y2data 
set timefmt x2 "%d/%m/%y,%H:%M"
set x2data 
set boxwidth
set style fill  empty border
set style rectangle back fc  lt -3 fillstyle   solid 1.00 border lt -1
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
set view 60, 30, 1, 1
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
set style data points
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
set cbrange [ * : * ] noreverse nowriteback
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
f(x)=a*x+b
file(x)=sprintf('amox28216_r%i_delays.dat',x)
GNUTERM = "x11"
a = 1
b = 0.003
GPFUN_f = "f(x)=a*x+b"
file = "amox28216_r77_delays.dat"
GPFUN_file = "file(x)=sprintf('amox28216_r%i_delays.dat',x)"
mj2mjpc2(x)=x/(pi*(.05**2))
set term png enhanced size 800,800
set output 'plotting.confidence.narrow.png'
set xrange [1e-1:200]
set log x
set xlabel 'x-ray fluence [mJ/cm^2]'
set ylabel 'rms of phase slope' offset 1,0
set yrange [0:1.8]
set ytics mirror
set cblabel 'delay [ps]'
set multiplot
set size 1,.5
set origin 0,.5
set lmargin screen .1
set rmargin screen .8
set colorbox origin .875,.1 size .05,.8
t0=.5
plot 	file(77) u (mj2mjpc2($6*$7)):4:(abs($1-t0)<0.5?1:.2):1 ps variable palette pt 7 notitle,\
	file(74) u (mj2mjpc2($6*$7)):4:(abs($1-t0)<0.5?1:.2):1 ps variable palette pt 7 notitle,\
	file(75) u (mj2mjpc2($6*$7)):4:(abs($1-t0)<0.5?1:.2):1 ps variable palette pt 7 notitle,\
	file(76) u (mj2mjpc2($6*$7)):4:(abs($1-t0)<0.5?1:.2):1 ps variable palette pt 7 notitle,\
	file(77) u (mj2mjpc2($6*$7)):4:(abs($1-t0)<0.5?1:0.0):1 ps variable palette pt 7 notitle,\
	file(74) u (mj2mjpc2($6*$7)):4:(abs($1-t0)<0.5?1:0.0):1 ps variable palette pt 7 notitle,\
	file(75) u (mj2mjpc2($6*$7)):4:(abs($1-t0)<0.5?1:0.0):1 ps variable palette pt 7 notitle,\
	file(76) u (mj2mjpc2($6*$7)):4:(abs($1-t0)<0.5?1:0.0):1 ps variable palette pt 7 notitle
	#file(76) u (mj2mjpc2($6*$7)):4:(1./(abs($1-t0)+.75)):1 ps variable palette pt 7 notitle
set origin 0,0
set size 1,.5
set yrange [0:110]
set ylabel '% good shots (-0.5 ps,0.5 ps)' offset 1,0
set ytics 0,25,100
set key bottom right
plot 'GiacomoPlot.spatial.dat' w linespoints pt 6 ps 1 title 'spatial',\
	'GiacomoPlot.spectral.dat' w linespoints pt 6 ps 1 title 'spectral',\
	'goodshots.dat' u 1:($2*100) w linespoints pt 7 ps 1 title 'interference'
unset multiplot
								    
#    EOF
