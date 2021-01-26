SUMMARY = "A highly flexible tool adds advanced features to any HTML tables"
HOMEPAGE = "https://www.datatables.net"

LICENSE = "CUSTOM"
LIC_FILES_CHKSUM = "file://${WORKDIR}/${BPN}/license.txt;md5=0f09bcd3a7ccda673b31aabd84bf8341"

DEPENDS = "jquery"

SRC_URI = "https://files.rce.systems/yocto-elite/DataTables-1.10.19.tar.gz"
SRC_URI[md5sum] = "6a4d2da41d364622079e503c1130e2ae"
SRC_URI[sha256sum] = "4a9c689fea655bb28862a390db45d77dc29267126b72c6300bd2ea2c6f1f56b4"

PROVIDES += " datatables"
RPROVIDES_${PN} = "datatables"

do_install() {
  install -d ${D}/src/htmllib/$BPN/
  cp -r ${WORKDIR}/${BPN} ${D}/src/htmllib/$BPN/
}

PACKAGES = "${PN}"
FILES_${PN} = "/src /src/htmllib /src/htmllib/$BPN/*"
