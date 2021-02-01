SUMMARY = "This file creates a global JSON object containing two methods: stringify and parse."
HOMEPAGE = "https://github.com/douglascrockford/JSON-js"

LICENSE = "PD"

DEPENDS = "jquery"

SRC_URI = "https://files.rce.systems/yocto-elite/json2-1.0.tar.gz"
SRC_URI[md5sum] = "abeb0752651f76cf83de277e128e66f1"
SRC_URI[sha256sum] = "f976437e34f2e6d94fc47e16295cbdd562053e5a4c660ee3b0899da55d6a6ee5"

PROVIDES += " json2"
RPROVIDES_${PN} = "json2"

do_install() {
  install -d ${D}/src/htmllib/${BPN}/
  cp -r ${WORKDIR}/${BPN} ${D}/src/htmllib/
}

PACKAGES = "${PN}"
FILES_${PN} = "/src /src/htmllib /src/htmllib/${BPN}/*"
