SUMMARY = "Add the user:group for lighttpd service"
DESCRIPTION = "This creates a user to own the webface that can not log in"
SECTION = "examples"
PR = "r1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit useradd

USERADD_PACKAGES = "${PN}"

GROUPADD_PARAM_${PN} = "-g 1001 centurion"

USERADD_PARAM_${PN} = "-u 1000 -g 1001 -M -N lighttpd"

RPROVIDES_${PN} = "lighttpduser"
