inherit autotools pkgconfig systemd

DESCRIPTION = "AudioReach Platform Adaptation Layer"
SECTION = "multimedia"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://Pal.cpp;beginline=31;endline=32;md5=e733afaf233fbcbc22769d0a9bda0b3e"

SRCPROJECT = "git://github.com/Audioreach/audioreach-pal.git"
SRCBRANCH  = "qclinux1.0"

SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"
SRC_URI  = "${SRCPROJECT};protocol=https;branch=${SRCBRANCH}" 


DEPENDS = "tinyalsa audioreach-graphmgr audioreach-graphservices audioreach-conf audioreach-audio-utils audioreach-pal-headers"

EXTRA_OECONF += " --with-glib --with-syslog --with-disable_compress_stream"

SOLIBS = ".so*"
FILES_SOLIBSDEV = ""
INSANE_SKIP:${PN} = "dev-so"

FILES:${PN} += "${libdir}/*.so ${libdir}/pkgconfig/ ${systemd_unitdir}/system/* ${sysconfdir}/* ${bindir}/*"
FILES:${PN}-dev = "${libdir}/*.la ${includedir}"
