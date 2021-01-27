SUMMARY = "This jQuery plugin makes simple clientside form validation easy"
HOMEPAGE = "https://jqueryvalidation.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE.md;md5=f683602956cb1dbd6269076b875f7aba"

DEPENDS = "jquery"

SRC_URI = "https://files.rce.systems/yocto-elite/jquery-validation-1.13.0.tar.gz"
SRC_URI[md5sum] = "aae6f5311a7c031ef8929ae7ac5df429"
SRC_URI[sha256sum] = "c9e87c28b34bdc51250dcf1bf7b60a778c4ef24229feb4f816f3b4afe01b85e9"

PROVIDES += " jquery-validation"
RPROVIDES_${PN} = "jquery-validation"

do_install() {
  install -d ${D}/src/$BPN/
  cp -r ${WORKDIR}/${BPN} ${D}/src/$BPN/
}

PACKAGES = "${PN}"
FILES_${PN} = "/src /src/$BPN/*"
