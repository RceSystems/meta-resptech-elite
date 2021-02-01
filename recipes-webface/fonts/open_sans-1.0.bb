SUMMARY = "Open Sans is a humanist sans serif typeface designed by Steve Matteson, Type Director of Ascender Corp."
HOMEPAGE = "https://fonts.google.com/specimen/Open+Sans"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/${BPN}/LICENSE.txt;md5=d273d63619c9aeaf15cdaf76422c4f87"

SRC_URI = "https://files.rce.systems/yocto-elite/open_sans-1.0.tar.gz"
SRC_URI[md5sum] = "9794b2b62e9ec53b5f5a6cbc1338916a"
SRC_URI[sha256sum] = "0b1e7f8fa1e04c87a028e674a58df902de07614521dea6227cdb79c8a986ccb4"

PROVIDES += " open_sans"
RPROVIDES_${PN} = "open_sans"

do_install() {
  install -d ${D}/src/htmllib/${BPN}/
  cp -r ${WORKDIR}/${BPN} ${D}/src/htmllib/
}

PACKAGES = "${PN}"
FILES_${PN} = "/src /src/htmllib /src/htmllib/${BPN}/*"
