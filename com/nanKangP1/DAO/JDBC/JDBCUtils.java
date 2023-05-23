package com.nanKangP1.DAO.JDBC;

import javax.sql.DataSource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
    private static DataSource ds;
    private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();

    static {
        Properties properties = new Properties();
        InputStream ips = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            properties.load(ips);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() throws SQLException {
        Connection connection = tl.get();
        if(connection == null){
            connection = ds.getConnection();
            tl.set(connection);
        }
        return connection;
    }

    public static void recycleConnection() throws SQLException {
        Connection connection = tl.get();
        if(connection != null){
            tl.remove();
            connection.close();
        }
    }


}
