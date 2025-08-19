SUMMARY = "AudioReach Graph Service"

LICENSE = "BSD-3-Clause-Clear"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=7a434440b651f4a472ca93716d01033a"

SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"
SRC_URI = "git://github.com/Audioreach/audioreach-graphservices.git;protocol=https;branch=master"

DEPENDS = "glib-2.0 audioreach-kernel-headers"
EXTRA_OECONF  = "--with-syslog --with-glib --without-cutils --with-dummy_diag --with-qcom --with-audio_dma_support"
EXTRA_OECONF += "--without-ats_transport_tcp_ip --without-ats_data_logging"
CFLAGS += "-Wno-int-conversion"

SOLIBS = ".so"
FILES_SOLIBSDEV = ""
INSANE_SKIP:${PN} = "dev-so"

inherit autotools pkgconfig
RRECOMMENDS:${PN} = " \
   kernel-module-audio-pkt \
   kernel-module-spf-core \
"
