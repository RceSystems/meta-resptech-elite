PACKAGECONFIG = "sqlite3 openssl \
                 ${@bb.utils.filter('DISTRO_FEATURES', 'ipv6 pam', d)} \
"

EXTRA_OECONF = "--disable-all \
                --enable-ctype \
                --enable-mbregex \
                --enable-mbstring \
                --enable-fpm \
                --enable-pdo \
                --enable-json \
                --enable-gd \
                --with-libdir=${baselib} \
                --with-zlib=${STAGING_LIBDIR}/.. \
                --with-curl=${STAGING_LIBDIR}/.. \
                ${@oe.utils.conditional('SITEINFO_ENDIANNESS', 'le', 'ac_cv_c_bigendian_php=no', 'ac_cv_c_bigendian_php=yes', d)} \
                ${@bb.utils.contains('PACKAGECONFIG', 'pam', '', 'ac_cv_lib_pam_pam_start=no', d)} \
                ${COMMON_EXTRA_OECONF} \                
"

DEPENDS_append = " libpng"
DEPENDS_append_class-target = " curl"
