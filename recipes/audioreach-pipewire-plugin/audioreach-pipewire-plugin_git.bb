inherit autotools pkgconfig
SUMMARY = "Pipewire pal plugins"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=91f36d19ef812a054b22d918288de2b5"

SRCREV = "9e48d326768a079a1acfc25002ab5c801d889aff"
PV = "0.0+git"
SRC_URI = "git://github.com/AudioReach/audioreach-pipewire-plugin.git;protocol=https;branch=master"

DEPENDS = "audioreach-graphmgr pipewire audioreach-pal audioreach-pal-headers"

FILES:${PN} += "${libdir}/pipewire-0.3/*.so"
FILES:${PN} += "${datadir}/pipewire/pipewire.conf.d/pw-pal-plugin.conf"
FILES:${PN} += "${datadir}/wireplumber/wireplumber.conf.d/60-disable-alsa.conf"
