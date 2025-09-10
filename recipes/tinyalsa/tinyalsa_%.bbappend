FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-meson-add-option-to-enable-disable-plugin-support.patch \
"
