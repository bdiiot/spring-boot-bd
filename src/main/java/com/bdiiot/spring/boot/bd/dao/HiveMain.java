package com.bdiiot.spring.boot.bd.dao;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.security.UserGroupInformation;

import java.io.IOException;
import java.sql.*;

import static com.bdiiot.spring.boot.bd.utils.Constant.*;

public class HiveMain {
    private static Connection conn = null;
    private static Statement stmt = null;

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        Configuration configuration = new Configuration();
        configuration.set("hadoop.security.authentication", "Kerberos");

        UserGroupInformation.setConfiguration(configuration);
        UserGroupInformation.loginUserFromKeytab(kerberosUser, kerberosTab);

        Class.forName(hiveDriverName);
        conn = DriverManager.getConnection(llapJdbcUrl);
        stmt = conn.createStatement();

        ResultSet set = stmt.executeQuery("show databases");

        while (set.next()) {
            System.out.println(set.getString(1));
        }
    }
}
