do_install_append() {
  sed -i 's/#server.username.*/server.username = "lighttpd"/' ${D}${sysconfdir}/lighttpd/lighttpd.conf
  sed -i 's/#server.groupname.*/server.groupname = "lighttpd"/' ${D}${sysconfdir}/lighttpd/lighttpd.conf
  sed -i 's/www\/logs\/access.log/www\/logs\/lighttpd\/access.log/' ${D}${sysconfdir}/lighttpd/lighttpd.conf
  sed -i 's/www\/logs\/lighttpd.error.log/www\/logs\/lighttpd\/error.log/' ${D}${sysconfdir}/lighttpd/lighttpd.conf
  
  sed -i '/echo -n "Starting.*/a \ \ \ \ \ \ \ \ install -d -o lighttpd -g lighttpd /var/log/lighttpd' ${D}/${sysconfdir}/init.d/lighttpd

  sed -i '/PIDFile=\/run\/lighttpd.*/a ExecStartPre=chown lighttpd:lighttpd \/www\/logs\/lighttpd' ${D}/lib/systemd/system/lighttpd.service
  sed -i '/PIDFile=\/run\/lighttpd.*/a ExecStartPre=mkdir \/www\/logs\/lighttpd' ${D}/lib/systemd/system/lighttpd.service
}  

IMAGE_INSTALL_append = " lighttpd-module-access lighttpd-module-expire lighttpd-module-fastcgi"

inherit useradd

USERADD_PACKAGES = "${PN}"

GROUPADD_PARAM_${PN} = "centurion"

USERADD_PARAM_${PN} = "--user-group -G centurion -M lighttpd"
