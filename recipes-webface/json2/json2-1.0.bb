SUMMARY = "This file creates a global JSON object containing two methods: stringify and parse."
HOMEPAGE = "https://github.com/douglascrockford/JSON-js"

LICENSE = "PD"
LIC_FILES_CHKSUM = "file://${WORKDIR}/${BPN}/json2.js;beginline=3;endline=7;md5=0444a7c6024bcd1722ff86881a8fb3d6"

DEPENDS = "jquery"

SRC_URI = "https://files.rce.systems/yocto-elite/json2-1.0.tar.gz"
SRC_URI[md5sum] = "5f3c57be3846bdfe5397cdcd07039733"
SRC_URI[sha256sum] = "a6771ee4e1b4cd8d61d710af248e590352096c2cd60735fac54f97f6ca09abf4"

PROVIDES += " json2"
RPROVIDES_${PN} = "json2"

do_install() {
  install -d ${D}/src/htmllib/${BPN}/
  cp -r ${WORKDIR}/${BPN} ${D}/src/htmllib/
}

PACKAGES = "${PN}"
FILES_${PN} = "/src /src/htmllib /src/htmllib/${BPN}/*"
