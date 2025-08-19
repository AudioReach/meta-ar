SUMMARY = "Audio Reach Package Group"

LICENSE = "BSD-3-Clause"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PROVIDES = "${PACKAGES}"

PACKAGES = "${PN} \
            ${PN}-kernel-modules \
"

RRECOMMENDS:${PN}-kernel-modules += " \
    kernel-module-q6apm-dai \
    kernel-module-q6apm-lpass-dais \
    kernel-module-q6core \
    kernel-module-q6prm-clocks \
    kernel-module-q6prm \
    kernel-module-q6routing \
    kernel-module-snd-q6apm \
    kernel-module-snd-q6dsp-common \
    kernel-module-snd-soc-qcom-sdw \
    kernel-module-snd-soc-sc8280xp \
    kernel-module-snd-soc-qcm6490 \
    kernel-module-snd-soc-qcs9100 \
    kernel-module-snd-soc-lpass-macro-common \
    kernel-module-snd-soc-lpass-rx-macro \
    kernel-module-snd-soc-lpass-tx-macro \
    kernel-module-snd-soc-lpass-va-macro \
    kernel-module-snd-soc-lpass-wsa-macro \
    kernel-module-snd-soc-wsa883x \
    kernel-module-soundwire-qcom \
    kernel-module-soundwire-bus \
"

PULSEAUDIO_PKGS = " \
    pulseaudio-server \
    pulseaudio-module-loopback \
    pulseaudio-module-null-source \
    pulseaudio-module-combine-sink \
    pulseaudio-module-switch-on-port-available \
    pulseaudio-misc \
    pulseaudio-module-dbus-protocol \
    pulseaudio-module-bluetooth-discover \
    pulseaudio-module-bluetooth-policy \
    pulseaudio-module-bluez5-discover \
    pulseaudio-module-bluez5-device \
"

PULSEAUDIO_PKGS += " \
    pulseaudio-module-pal-card \
"

RDEPENDS:${PN} = ' \
    tinyalsa \
    tinycompress \
    audioreach-audio-utils \
    audioreach-conf \
    audioreach-graphmgr \
    audioreach-graphservices \
    audioreach-pal \
    ${PULSEAUDIO_PKGS} \
'
