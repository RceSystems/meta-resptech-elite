SUMMARY = "A highly flexible tool adds advanced features to any HTML tables"
HOMEPAGE = "https://www.datatables.net"

DT_NAME = "DataTables-1.10.19"
DT_LICENSE_LONG = "${WORKDIR}/${DT_NAME}/license.txt"

LICENSE = "DataTables_Custom"
LIC_FILES_CHKSUM = "file://${DT_LICENSE_LONG};md5=0f09bcd3a7ccda673b31aabd84bf8341"
NO_GENERIC_LICENSE[DataTables_Custom] = "${DT_LICENSE_LONG}"

DEPENDS = "jquery"

SRC_URI = "https://files.rce.systems/yocto-elite/datatables_1.10.19.tar.gz"
SRC_URI[md5sum] = "f36622229228d1ac0e4b0d145e118075"
SRC_URI[sha256sum] = "2421f7203b8b4b0cae8454d1fc59e97de864766d38093fbb3d55f92e5ee32cd1"

PROVIDES += " datatables"
RPROVIDES_${PN} = "datatables"

do_install() {
  install -d ${D}/src/htmllib/${DT_NAME}/
  cp -r ${WORKDIR}/${DT_NAME} ${D}/src/htmllib/
}

PACKAGES = "${PN}"
FILES_${PN} = "/src /src/htmllib /src/htmllib/${DT_NAME}/*"
