SUMMARY = "Audio Reach Package Group"

LICENSE = "BSD-3-Clause"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PROVIDES = "${PACKAGES}"

PACKAGES = "${PN}"

RDEPENDS:${PN} = ' \
    tinyalsa \
    tinycompress \
    audioreach-audio-utils \
    audioreach-conf \
    audioreach-graphmgr \
    audioreach-graphservices \
    audioreach-pal \
    audioreach-pipewire-plugin \
    audioreach-dlkm \
    audioreach-kernel-headers \
'
