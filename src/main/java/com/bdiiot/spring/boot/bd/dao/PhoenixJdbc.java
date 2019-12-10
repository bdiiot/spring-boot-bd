package com.bdiiot.spring.boot.bd.dao;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.security.UserGroupInformation;

import java.io.IOException;
import java.sql.*;

import static com.bdiiot.spring.boot.bd.utils.Constant.*;

public class PhoenixJdbc {
    private static Connection connection = null;
    private static Statement statement = null;

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        // java.io.FileNotFoundException: HADOOP_HOME and hadoop.home.dir are unset.
        System.setProperty("HADOOP_HOME", "/tmp");
        System.setProperty("hadoop.home.dir", "/tmp");

        Configuration configuration = new Configuration();
        configuration.set("hadoop.security.authentication", "Kerberos");

        UserGroupInformation.setConfiguration(configuration);
        UserGroupInformation.loginUserFromKeytab(kerberosUser, kerberosTab);

        Class.forName(phoenixDriverName);
        connection = DriverManager.getConnection(phoenixJdbcUrl);
        statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from test.test_hbase");

        while (resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}
