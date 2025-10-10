inherit autotools pkgconfig

DESCRIPTION = "Common mm-audio headers installation"

LICENSE = "BSD-3-Clause & BSD-3-Clause-Clear"
LIC_FILES_CHKSUM = "file://PalDefs.h;beginline=30;endline=31;md5=e733afaf233fbcbc22769d0a9bda0b3e"

SRCPROJECT = "git://github.com/Audioreach/audioreach-pal.git"
SRCBRANCH  = "qclinux1.0"
SRCREV     = "78a1453984b5478ecef05cfa2648078aa728d6cf"

SRC_URI = "${SRCPROJECT};protocol=https;branch=${SRCBRANCH};"
S = "${UNPACKDIR}/${PN}-${PV}/inc"

do_compile[noexec] = "1"

ALLOW_EMPTY:${PN} = "1"
