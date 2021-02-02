SUMMARY = "Open Sans is a humanist sans serif typeface designed by Steve Matteson, Type Director of Ascender Corp."
HOMEPAGE = "https://fonts.google.com/specimen/Open+Sans"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/${BPN}/LICENSE.txt;md5=d273d63619c9aeaf15cdaf76422c4f87"

SRC_URI = "https://files.rce.systems/yocto-elite/open-sans-1.0.tar.gz"
SRC_URI[md5sum] = "abf69ff9152b1c35ca5937b467c7b5aa"
SRC_URI[sha256sum] = "a279b355c9b85ef38c99a6af2703f426129091a5ec517f181ccf415c7fa57d3e"

PROVIDES += " open-sans"
RPROVIDES_${PN} = "open-sans"

do_install() {
  install -d ${D}/src/htmllib/${BPN}/
  cp -r ${WORKDIR}/${PN} ${D}/src/htmllib/
}

PACKAGES = "${PN}"
FILES_${PN} = "/src /src/htmllib /src/htmllib/${BPN}/*"
