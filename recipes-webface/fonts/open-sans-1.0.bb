SUMMARY = "Open Sans is a humanist sans serif typeface designed by Steve Matteson, Type Director of Ascender Corp."
HOMEPAGE = "https://fonts.google.com/specimen/Open+Sans"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/${BPN}/LICENSE.txt;md5=d273d63619c9aeaf15cdaf76422c4f87"

SRC_URI = "https://files.rce.systems/yocto-elite/open-sans-1.0.tar.gz"
SRC_URI[md5sum] = "efc9393d79af3eb57a6574b69b75141a"
SRC_URI[sha256sum] = "f0eb76fd5ce57f89160c64310821e396bba9f1aee1df553eaca7953f739966ba"

PROVIDES += " open-sans"
RPROVIDES_${PN} = "open-sans"

do_install() {
  install -d ${D}/src/htmllib/${BPN}/
  cp -r ${WORKDIR}/${BPN} ${D}/src/htmllib/
}

PACKAGES = "${PN}"
FILES_${PN} = "/src /src/htmllib /src/htmllib/${BPN}/*"
