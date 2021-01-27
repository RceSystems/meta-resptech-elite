SUMMARY = "This jQuery plugin makes simple clientside form validation easy"
HOMEPAGE = "https://jqueryvalidation.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE.md;md5=f683602956cb1dbd6269076b875f7aba"

DEPENDS = "jquery"

SRC_URI = "https://files.rce.systems/yocto-elite/jquery-validation-1.13.0.tar.gz"
SRC_URI[md5sum] = "b3ee773031a98a6475f825303376e935"
SRC_URI[sha256sum] = "7e2782f7d199aa6c66301c16e8aa948a90bb8596960d33f4c2fa0e50acb35119"

PROVIDES += " jquery-validation"
RPROVIDES_${PN} = "jquery-validation"

do_install() {
  install -d ${D}/src/htmllib/${BPN}/
  cp -r ${WORKDIR}/${BP} ${D}/src/htmllib/
}

PACKAGES = "${PN}"
FILES_${PN} = "/src /src/htmllib /src/htmllib/${BPN}/*"
