package com.datapersist.datapersist;

import com.datapersist.datapersist.beans.DataSourceBean;
import com.datapersist.datapersist.beans.PolledDataSourceBean;
import com.datapersist.datapersist.data.entities.City;
import com.datapersist.datapersist.data.repositories.CityRepositoryImpl;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SpringApplicationB {
    public static void main(String[] args) throws SQLException {
        // New Code
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        DataSource dataSource = ctx.getBean("dataSourceBean", DataSourceBean.class);
        CityRepositoryImpl cityRepository = ctx.getBean("cityRepositoryImplBean",CityRepositoryImpl.class);

        String cityName = cityRepository.getCityById(2);
        City city = cityRepository.getCityCensusById(3);
        List<City> cities = cityRepository.getCitiesUnder(20000);
        System.out.println(cityName);
        System.out.println(city);
        for (City c: cities) { System.out.println(c); }
    }
}

