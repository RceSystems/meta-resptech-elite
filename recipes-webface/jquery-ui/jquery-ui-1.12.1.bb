SUMMARY = "A curated set of user interface interactions, effects, widgets, and themes"
HOMEPAGE = "https://jqueryui.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/${BPN}/LICENSE.txt;md5=e0c0d3d883e83f19efa64feb54d5f63d"

DEPENDS = "jquery"

SRC_URI = "https://files.rce.systems/yocto-elite/jquery-ui-1.12.1.tar.gz"
SRC_URI[md5sum] = "0190ff7c5f2e4fb26dc533684eeb6cdc"
SRC_URI[sha256sum] = "44a6041297fb0e2d9878fbbea0498de8ff7268295e3e55e5c56494e239f5b142"

PROVIDES += " jquery-ui"
RPROVIDES_${PN} = "jquery-ui"

do_install() {
  install -d ${D}/src/$BPN/
  cp -r ${WORKDIR}/${BPN} ${D}/src/$BPN/
}

PACKAGES = "${PN}"
FILES_${PN} = "/src /src/$BPN/*"
