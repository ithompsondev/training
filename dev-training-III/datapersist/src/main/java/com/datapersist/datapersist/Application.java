package com.datapersist.datapersist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Application {

    private static final String connectionUrl = "jdbc:mysql//localhost:3306/hero_db";
    private static final String connectionUsername = ;
    private static final String connectionPassword = ;

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement statement = null;

        conn = DriverManager.getConnection("");
    }
}
