inherit autotools pkgconfig cmake

DESCRIPTION = "Tinyalsa Library"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://NOTICE;md5=d2918795d9185efcbf430b9ad5cda46d"

SRCREV = "a069dd10b280ff01903b54f7f48028e155094ac6"
SRC_URI = "git://github.com/tinyalsa/tinyalsa.git;branch=master;protocol=https \
    "
EXTRA_OECMAKE += "-DCMAKE_POLICY_VERSION_MINIMUM=3.5"

EXTRA_OECONF += "--with-glib"
CFLAGS += " -fPIC -DPIC"
