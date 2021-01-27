SUMMARY = "A curated set of user interface interactions, effects, widgets, and themes"
HOMEPAGE = "https://jqueryui.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/${BPN}/LICENSE.txt;md5=e0c0d3d883e83f19efa64feb54d5f63d"

DEPENDS = "jquery"

SRC_URI = "https://files.rce.systems/yocto-elite/jquery-ui-1.12.1.tar.gz"
SRC_URI[md5sum] = "674ba7f6406571446085eac3fd4c5e27"
SRC_URI[sha256sum] = "70eccab479e9a44cee312d966591c02c714c242f743cd5308461305ac4e7b342"

PROVIDES += " jquery-ui"
RPROVIDES_${PN} = "jquery-ui"

do_install() {
  install -d ${D}/src/htmllib/${BPN}/
  cp -rp ${WORKDIR}/${BPN} ${D}/src/htmllib/
}

PACKAGES = "${PN}"
FILES_${PN} = "/src /src/htmllib /src/htmllib/${BPN}/*"
