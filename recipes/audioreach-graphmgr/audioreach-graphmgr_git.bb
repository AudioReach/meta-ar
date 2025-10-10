SUMMARY = "AudioReach Graph Manager"

LICENSE = "BSD-3-Clause-Clear"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=7a434440b651f4a472ca93716d01033a"

SRCREV = "a121c1ac6ef0901e5cc80643b5acdc9061a36819"
PV = "0.0+git"
SRC_URI = "git://github.com/Audioreach/audioreach-graphmgr.git;protocol=https;branch=master"


DEPENDS = "glib-2.0 tinyalsa audioreach-graphservices audioreach-conf"
EXTRA_OECONF += "--with-glib --with-syslog --with-no-ipc"
CFLAGS += "-Wno-incompatible-pointer-types"

SOLIBS = ".so"
FILES_SOLIBSDEV = ""

RM_WORK_EXCLUDE += "${PN}"

PACKAGECONFIG[are_on_apps] = "--with-are-on-apps, --without-are-on-apps, audioreach-engine"
PACKAGECONFIG[use_default_acdb_path] = "--with-use-default-acdb-path, --without-use-default-acdb-path"

inherit autotools pkgconfig
