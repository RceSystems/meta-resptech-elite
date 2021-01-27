SUMMARY = "A highly flexible tool adds advanced features to any HTML tables"
HOMEPAGE = "https://www.datatables.net"

DT_NAME = "DataTables-1.10.19"
DT_LICENSE_LONG = "${WORKDIR}/${DT_NAME}/license.txt"

LICENSE = "DataTables_Custom"
LIC_FILES_CHKSUM = "file://${DT_LICENSE_LONG};md5=0f09bcd3a7ccda673b31aabd84bf8341"
NO_GENERIC_LICENSE[DataTables_Custom] = "${DT_LICENSE_LONG}"

DEPENDS = "jquery"

SRC_URI = "https://files.rce.systems/yocto-elite/datatables_1.10.19.tar.gz"
SRC_URI[md5sum] = "6a4d2da41d364622079e503c1130e2ae"
SRC_URI[sha256sum] = "4a9c689fea655bb28862a390db45d77dc29267126b72c6300bd2ea2c6f1f56b4"

PROVIDES += " datatables"
RPROVIDES_${PN} = "datatables"

do_install() {
  install -d ${D}/src/htmllib/${DT_NAME}/
  cp -r ${WORKDIR}/${DT_NAME} ${D}/src/htmllib/${DT_NAME}/
}

PACKAGES = "${PN}"
FILES_${PN} = "/src /src/htmllib /src/htmllib/${DT_NAME}/*"
