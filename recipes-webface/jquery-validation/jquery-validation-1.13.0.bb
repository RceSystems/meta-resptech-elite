SUMMARY = "This jQuery plugin makes simple clientside form validation easy"
HOMEPAGE = "https://jqueryvalidation.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/${BPN}/LICENSE.md;md5=f683602956cb1dbd6269076b875f7aba"

DEPENDS = "jquery"

SRC_URI = "https://files.rce.systems/yocto-elite/jquery-validation-1.13.0.tar.gz"
SRC_URI[md5sum] = "0d65c0f544a95fcb13e56dc0ca557bcd"
SRC_URI[sha256sum] = "a4215c6bfbed1b1debddababf1c95fefdbca5bff21cb02468112cf8a78e2593d"

PROVIDES += " jquery-validation"
RPROVIDES_${PN} = "jquery-validation"

do_install() {
  install -d ${D}/src/htmllib/${BPN}/
  cp -rp ${WORKDIR}/${BPN} ${D}/src/htmllib/
}

PACKAGES = "${PN}"
FILES_${PN} = "/src /src/htmllib /src/htmllib/${BPN}/*"
