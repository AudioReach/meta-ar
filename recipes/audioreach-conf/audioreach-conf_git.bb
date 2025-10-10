DESCRIPTION = "AudioReach configurations"
HOMEPAGE = "https://github.com/Audioreach/audioreach-conf"

LICENSE = "BSD-3-Clause-Clear"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=7a434440b651f4a472ca93716d01033a"

SRCREV = "0128ed85e266caa7e44bb53049cc27d4b441c9da"
PV = "0.0+git"
SRC_URI = "git://github.com/Audioreach/audioreach-conf.git;protocol=https;branch=master"

EXTRA_OECONF += "--with-qcom"

inherit autotools pkgconfig

do_compile[noexec] = "1"

ALLOW_EMPTY:${PN} = "1"
