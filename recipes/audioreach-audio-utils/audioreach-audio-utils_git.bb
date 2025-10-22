inherit autotools pkgconfig

SUMMARY = "Audioroute for AudioReach"
LICENSE = "Apache-2.0 & BSD-3-Clause-Clear"
LIC_FILES_CHKSUM = "file://audio_route.c;beginline=2;endline=20;md5=84ef494e74239b3871a4da47f3702691"

SRCREV = "0f24b9f8788ed5d9919f50eeede904a0ca3863cc"
PV = "0.0+git"
SRC_URI = "git://github.com/Audioreach/audioreach-audio-utils.git;protocol=https;branch=main"

S = "${UNPACKDIR}/${PN}-${PV}/audio-route"

DEPENDS = "glib-2.0 tinyalsa expat"

SOLIBS = ".so*"

FILES_SOLIBSDEV = ""

INSANE_SKIP:${PN} = "dev-so"
