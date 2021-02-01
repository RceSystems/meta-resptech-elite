SUMMARY = "Simple local storage wrapper to save data on the browser side."
HOMEPAGE = "www.jstorage.info"

LICENSE = "PD"
LIC_FILES_CHKSUM = "file://${WORKDIR}/${BPN}/jstorage.js;beginline=1;endline=35;md5=b2c016f73a27b6855ecd0d427c3ce995"

DEPENDS = "jquery"

SRC_URI = "https://files.rce.systems/yocto-elite/jstorage-0.4.12.tar.gz"
SRC_URI[md5sum] = "28ae6e0b99823d52efb72af0ceceb4ae"
SRC_URI[sha256sum] = "6379dd04a595d5f5bc8b70a22d2991425fc215b798c95ad0e2647bd3aeee1cd0"

PROVIDES += " jstorage"
RPROVIDES_${PN} = "jstorage"

do_install() {
  install -d ${D}/src/htmllib/${BPN}/
  cp -r ${WORKDIR}/${BPN} ${D}/src/htmllib/
}

PACKAGES = "${PN}"
FILES_${PN} = "/src /src/htmllib /src/htmllib/${BPN}/*"
