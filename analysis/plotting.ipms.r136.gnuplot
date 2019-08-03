#!/usr/bin/gnuplot -persist
#
#    
#    	G N U P L O T
#    	Version 5.0 patchlevel 3    last modified 2016-02-21 
#    
#    	Copyright (C) 1986-1993, 1998, 2004, 2007-2016
#    	Thomas Williams, Colin Kelley and many others
#    
#    	gnuplot home:     http://www.gnuplot.info
#    	faq, bugs, etc:   type "help FAQ"
#    	immediate help:   type "help"  (plot window: hit 'h')
# set terminal qt 0 font "Sans,9"
# set output
unset clip points
set clip one
unset clip two
set bar 1.000000 front
set border 31 front lt black linewidth 1.000 dashtype solid
set zdata 
set ydata 
set xdata 
set y2data 
set x2data 
set boxwidth
set style fill  empty border
set style rectangle back fc  bgnd fillstyle   solid 1.00 border lt -1
set style circle radius graph 0.02, first 0.00000, 0.00000 
set style ellipse size graph 0.05, 0.03, first 0.00000 angle 0 units xy
set dummy x, y
set format x "% h" 
set format y "% h" 
set format x2 "% h" 
set format y2 "% h" 
set format z "% h" 
set format cb "% h" 
set format r "% h" 
set timefmt "%d/%m/%y,%H:%M"
set angles radians
set tics back
unset grid
set raxis
set style parallel front  lt black linewidth 2.000 dashtype solid
set key title "" center
set key inside right top vertical Right noreverse enhanced autotitle nobox
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
set style textbox transparent margins  1.0,  1.0 border
unset logscale
set logscale x 10
set logscale y 10
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
set style data points
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
set mrtics default
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
unset paxis 1 tics
unset paxis 2 tics
unset paxis 3 tics
unset paxis 4 tics
unset paxis 5 tics
unset paxis 6 tics
unset paxis 7 tics
set title "" 
set title  font "" norotate
set timestamp bottom 
set timestamp "" 
set timestamp  font "" norotate
set rrange [ * : * ] noreverse nowriteback
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
set ylabel  font "" textcolor lt -1 rotate by -270
set y2label "" 
set y2label  font "" textcolor lt -1 rotate by -270
set yrange [ * : * ] noreverse nowriteback
set y2range [ * : * ] noreverse nowriteback
set zlabel "" 
set zlabel  font "" textcolor lt -1 norotate
set zrange [ * : * ] noreverse nowriteback
set cblabel "" 
set cblabel  font "" textcolor lt -1 rotate by -270
set cbrange [ * : * ] noreverse nowriteback
set paxis 1 range [ * : * ] noreverse nowriteback
set paxis 2 range [ * : * ] noreverse nowriteback
set paxis 3 range [ * : * ] noreverse nowriteback
set paxis 4 range [ * : * ] noreverse nowriteback
set paxis 5 range [ * : * ] noreverse nowriteback
set paxis 6 range [ * : * ] noreverse nowriteback
set paxis 7 range [ * : * ] noreverse nowriteback
set zero 1e-08
set lmargin  -1
set bmargin  -1
set rmargin  -1
set tmargin  -1
set locale "en_US.UTF-8"
set pm3d explicit at s
set pm3d scansautomatic
set pm3d interpolate 1,1 flush begin noftriangles noborder corners2color mean
set palette positive nops_allcF maxcolors 0 gamma 1.5 color model RGB 
set palette rgbformulae 7, 5, 15
set colorbox default
set colorbox vertical origin screen 0.9, 0.2, 0 size screen 0.05, 0.6, 0 front bdefault
set style boxplot candles range  1.50 outliers pt 7 separation 1 labels auto unsorted
set loadpath 
set fontpath 
set psdir
set fit brief errorvariables nocovariancevariables errorscaling prescale nowrap v5
file(r,i,d)=sprintf('./data_fs/processed/xppc00117_%s_ipm%i_del%i.out.indsvals',r,i,d)
ip_file(r,i,d)=sprintf('./data_fs/processed/xppc00117_%s_ipm%i_del%i.out.ip_indsvals',r,i,d)
noetalon_ip_file(r,i,d)=sprintf('./data_fs/processed/xppc00117_%s_ipm%i_del%i.out.ip_indsvals_noetalon',r,i,d)
pctgoodfile(r) = sprintf('./data_fs/processed/xppc00117_%s_goodpct_mat.hist',r)
ip_pctgoodfile(r) = sprintf('./data_fs/processed/xppc00117_%s_goodpct_mat_ip.hist',r)
GNUTERM = "qt"
x = 0.0
step=log(1e2/1e0)/19
i2ipm(i) = exp(log(1e0) + step*(i))
delay = 3 
## Last datafile plotted: "./xppc00117_r119_ipm20_del10.out.maxinds"
set xlabel 'Deposited energy density [J/cm^3]'
set ylabel 'signal [arb. units]'
set term png size 600,600 
set output sprintf('./figs/plotting.ipms_%s_del%i.r136.energydensity.png','r136_refsub',delay)
set grid
set log x
set style data dots
set yrange [.1:1e4]
aaa=aa=a=4e-3
bbb=bb=b=10.
f(x) = a*exp(x/b)
g(x) = aa*exp(x/bb)
h(x) = aaa*exp(x/bbb)
set label 1 "20 {/Symbol m}m thick YAG\n9.5 keV photon energy" center at .1,2e3
set label 2 "rising edge" center at .03,2e2 textcolor rgb 'blue'
set label 3 "falling edge/10" center at .03,.7 textcolor rgb 'green'
fit f(x) './data_fs/reference/yag.attlen.absdose' u 0:($4*1e-9) via a,b
fit g(x) './data_fs/reference/yag.attlen.absdose' u 0:($3*1e-6) via aa,bb
fit h(x) './data_fs/reference/yag.attlen.absdose' u 0:($1*1e-3) via aaa,bbb

plot for [i=0:80] file('r136_refsub',i,delay) u (f(i+rand(0))):2 lc rgb 'blue' notitle,\
	for [i=0:80] file('r136_refsub',i,delay) u (f(i+rand(0))):(-.10*$4) lc rgb 'green' notitle

set term png size 600,600 
set output sprintf('./figs/plotting.ipms_%s_del%i.r136.absdose.png','r136_refsub',delay)
set label 1 center at .3,2e3
set label 2 center at .07,2e2 textcolor rgb 'blue'
set label 3 center at .07,.7 textcolor rgb 'green'
set xlabel 'Absorbed dose [mJ/cm^2]'
plot for [i=0:80] file('r136_refsub',i,delay) u (g(i+rand(0))):2 lc rgb 'blue' notitle,\
	for [i=0:80] file('r136_refsub',i,delay) u (g(i+rand(0))):(-.10*$4) lc rgb 'green' notitle

set term png size 600,600 
set output sprintf('./figs/plotting.ipms_%s_del%i.r136.incident.png','r136_refsub',delay)
set label 1 center at 3,2e3
set label 2 center at .3,2e2 textcolor rgb 'blue'
set label 3 center at .3,.7 textcolor rgb 'green'
set xlabel 'Incident energy [{/Symbol m}J]'
set auto y
plot for [i=0:80] file('r136_refsub',i,delay) u (h(i+rand(0))):2 lc rgb 'blue' notitle,\
	for [i=0:80] file('r136_refsub',i,delay) u (h(i+rand(0))):(-.10*$4) lc rgb 'green' notitle,\
	for [i=0:80] ip_file('r136_refsub',i,delay) u (h(i+rand(0))):($2) lc rgb 'red' notitle,\
	for [i=0:80] noetalon_ip_file('r136_refsub',i,delay) u (h(i+rand(0))):($2) lc rgb 'black' notitle,\
	pctgoodfile('r136_refsub') mat u (h($1)):($2==3?$3:0./0) w histeps lw 2 title '\% good shots',\
	ip_pctgoodfile('r136_refsub') mat u (h($1)):($2==3?$3:0./0) w histeps lw 2 title '\% good shots, innerprod'

set term png size 600,600 
set output sprintf('./figs/plotting.ipms_%s_del%i.r136.incident.png','r136_refsub',delay)
plot ip_pctgoodfile('r136_refsub') mat u (h($1)):($2==3?$3:0./0) w histeps lw 2 title '% good shots, innerprod'
#Final set of parameters            Asymptotic Standard Error
#=======================            ==========================
#a               = 0.00438095       +/- 1.118e-07    (0.002551%)
#b               = 11.4362          +/- 4.59e-05     (0.0004014%)
#
#correlation matrix of the fit parameters:
#                a      b      
#a               1.000 
#b               0.997  1.000 
#
#    EOF
