package com.bdiiot.spring.boot.bd.utils;

public class Constant {
    public static final String kerberosUser = "user";
    public static final String kerberosTab = "/user.keytab";
    public static final String kerberosRealm = "REALM.COM";
    public static final String kerberosKDC = "host-kdc";

    public static final String hiveDriverName = "org.apache.hive.jdbc.HiveDriver";
    public static final String hiveJdbcUrl = "jdbc:hive2://host:port/default;principal=hive/host@REALM.COM";
}