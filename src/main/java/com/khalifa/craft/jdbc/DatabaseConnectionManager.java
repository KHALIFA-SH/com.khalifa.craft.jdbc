package com.khalifa.craft.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager {
    private final String url;
    private final Properties properties;

    public DatabaseConnectionManager(String host, String databaseName,
                                     String userName, String password) {
        this.url = "jdbc:MySql://"+host+"/"+databaseName;
        this.properties = new Properties();
        this.properties.setProperty("user", userName);
        /*Properties is a java class which extends Hashtable<Object,Object>
        serProperty is a java synchronized object contained in Properties
        class and works with key:value pair
        DriverManager is a java.sql Class
        getConnection connects to the url and throws SQLException
        if a database access error occurs or the url is null
        getConnection returns a connection to the URL
        Connection is a Java.sql interface
        */
        this.properties.setProperty("password", password);
    }
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url, this.properties);
    }
}
