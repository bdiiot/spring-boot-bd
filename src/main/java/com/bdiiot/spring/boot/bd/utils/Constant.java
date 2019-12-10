package com.bdiiot.spring.boot.bd.utils;

public class Constant {
    public static final String kerberosUser = "bdread";
    public static final String kerberosTab = "/Users/pipe/Documents/kerberos/test/bdread.keytab";

    public static final String hiveDriverName = "org.apache.hive.jdbc.HiveDriver";
    public static final String hiveJdbcUrl = "jdbc:hive2://bigdata.t01.58btc.com:2181,bigdata.t03.58btc.com:2181,bigdata.t02.58btc.com:2181/;serviceDiscoveryMode=zooKeeper;zooKeeperNamespace=hiveserver2";
    public static final String llapJdbcUrl = "jdbc:hive2://bigdata.t01.58btc.com:2181,bigdata.t03.58btc.com:2181,bigdata.t02.58btc.com:2181/;serviceDiscoveryMode=zooKeeper;zooKeeperNamespace=hiveserver2-hive2";

    public static final String phoenixDriverName = "org.apache.phoenix.jdbc.PhoenixDriver";
    public static final String phoenixJdbcUrl = "jdbc:phoenix:bigdata.t01.58btc.com,bigdata.t02.58btc.com,bigdata.t03.58btc.com:2181:/hbase-secure:hbase-bd@58BTC.COM:/etc/security/keytabs/hbase.headless.keytab";
}
