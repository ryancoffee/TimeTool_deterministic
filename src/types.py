from numpy import iinfo,finfo 
from numpy import int as int_t
from numpy import uint as uint_t
from numpy import int8 as int8_t
from numpy import int16 as int16_t
from numpy import int32 as int32_t
from numpy import int64 as int64_t
from numpy import uint8 as uint8_t
from numpy import uint16 as uint16_t
from numpy import uint32 as uint32_t
from numpy import uint64 as uint64_t
from numpy import float as float_t
from numpy import float16 as float16_t
from numpy import float32 as float32_t
from numpy import float64 as float64_t

info_int8_t = iinfo(np.int8)
info_uint8_t = iinfo(np.uint8)
info_int16_t = iinfo(np.int16)
info_uint16_t = iinfo(np.uint16)
info_int32_t = iinfo(np.int32)
info_uint32_t = iinfo(np.uint32)
info_int64_t = iinfo(np.int64)
info_uint64_t = iinfo(np.uint64)
info_int_t = iinfo(int)
info_uint_t = iinfo(np.uint)

info_float_t = finfo(float)
info_float16_t = finfo(np.float16)
info_float32_t = finfo(np.float32)
info_float64_t = finfo(np.float64)

