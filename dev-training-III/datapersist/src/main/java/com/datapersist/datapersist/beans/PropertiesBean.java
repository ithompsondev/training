package com.datapersist.datapersist.beans;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesBean {
    private String dbConnUrl;
    private String dbConnUsername;
    private String dbConnPassword;
    private Properties properties;
    private static final String propPath = "./src/main/resources/dbconn.properties";

    public PropertiesBean() throws IOException {
        dbConnUrl = "jdbc:mysql://localhost:3306/hero_demo";

        FileInputStream propIn = new FileInputStream(propPath);
        properties = new Properties();
        properties.load(propIn);

        dbConnUsername = properties.getProperty("username");
        dbConnPassword = properties.getProperty("password");
    }

    public String getDbConnUrl() {
        return dbConnUrl;
    }

    public String getDbConnUsername() {
        return dbConnUsername;
    }

    public String getDbConnPassword() {
        return dbConnPassword;
    }
}
