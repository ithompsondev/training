package com.datapersist.datapersist;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class Application {

    private static final String connectionUrl = "jdbc:mysql://localhost:3306/hero_demo";
    private static String connectionUsername;
    private static String connectionPassword;

    public static void main(String[] args) throws IOException, SQLException {
        Properties dbconnProps = new Properties();
        dbconnProps.load(getPropSource());
        connectionUsername = getConnectionUsername(dbconnProps);
        connectionPassword = getConnectionPassword(dbconnProps);

        Connection conn = null;
        PreparedStatement statement = null;

        conn = DriverManager.getConnection(connectionUrl,connectionUsername,connectionPassword);
        addCity(statement,conn,"Metropolis",12000);
    }

    public static FileInputStream getPropSource() throws FileNotFoundException {
        String path = "./src/main/resources/dbconn.properties";
        FileInputStream propIn = new FileInputStream(path);

        return propIn;
    }

    public static String getConnectionUsername(Properties prop) {
        return prop.getProperty("username");
    }

    public static String getConnectionPassword(Properties prop) {
        return prop.getProperty("password");
    }

    public static void addCity(PreparedStatement statement, Connection conn, String name, int popSize) {
        String sql = "insert into city(name,population) values(?,?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1,name); // index starts from 1
            statement.setInt(2,popSize);
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                statement.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
