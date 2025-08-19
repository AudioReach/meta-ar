inherit autotools pkgconfig
SUMMARY = "Pulseaudio pal plugins"

LICENSE = "BSD-3-Clause-Clear"
LIC_FILES_CHKSUM = "file://module-pal-card/inc/pal-card.h;beginline=3;endline=4;md5=1dd4ca71ef61f580a6a5f3d113727dd9"


SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"
SRC_URI = "git://github.com/Audioreach/audioreach-pulseaudio-plugin.git;protocol=https;branch=main"

S = "${UNPACKDIR}/${PN}-${PV}/modules/pa-pal-plugins"

DEPENDS = "audioreach-graphmgr pulseaudio audioreach-pal audioreach-pal-headers"
EXTRA_OECONF = " --with-pa_version=17.0 --without-pa-support-card-status"

PACKAGES =+ "pulseaudio-module-pal-card" 

FILES:pulseaudio-module-pal-card = "${libdir}/pulseaudio/modules/module-pal-card.so ${sysconfdir}/*"

RDEPENDS:pulseaudio-server = " pulseaudio-module-pal-card"

ALLOW_EMPTY:${PN} = "1"
