package com.datapersist.datapersist;

import com.datapersist.datapersist.beans.DataSourceBean;
import com.datapersist.datapersist.beans.PolledDataSourceBean;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SpringApplicationA {
    public static void main(String[] args) throws SQLException {
        // New Code
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        BasicDataSource dataSource = ctx.getBean("polledDataSourceBean", PolledDataSourceBean.class);

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = dataSource.getConnection();
            // Old code
            addCity(statement,connection,"Star City", 18456);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
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
