from psana import *

ds = DataSource('exp=xppc00117:run=120:smd')
print(psana.DetNames(ds))
det = Detector('opal_1')

for nevent,evt in enumerate(ds.events()):
    if nevent>=2: break
    # includes pedestal subtraction, common-mode correction, bad-pixel
    # suppresion, and uses geometry to position the multiple CSPAD panels
    # into a 2D image
    print 'Fetching event number',nevent
    img = det.image(evt)
    print(img)

print 'Done.'
