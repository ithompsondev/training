package com.datapersist.datapersist;

import com.datapersist.datapersist.beans.DataSourceBean;
import com.datapersist.datapersist.beans.PolledDataSourceBean;
import com.datapersist.datapersist.data.entities.City;
import com.datapersist.datapersist.data.entities.SideKick;
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
        System.out.println(cityName);
        System.out.println(city);

        List<City> cities = cityRepository.getCitiesUnder(20000);
        for (City c: cities) { System.out.println(c); }

        City starCityPatrollers = cityRepository.getUniqueAssistedPatrollers("Star City");
        System.out.println("Star City Patrollers");
        for (SideKick sideKick: starCityPatrollers.getUniqueAssistingPatrollers()) { System.out.println("\t" + sideKick); }

//        City goldCity = new City();
//        goldCity.setName("Gold City");
//        goldCity.setPopulation(23421);
//        cityRepository.create(goldCity);

        City starCityUpdate = new City();
        starCityUpdate.setName("Star City");
        starCityUpdate.setPopulation(19200);
        cityRepository.update(starCityUpdate);

        City goldCityDelete = new City();
        goldCityDelete.setCityID(6);
        cityRepository.delete(goldCityDelete);
    }
}

