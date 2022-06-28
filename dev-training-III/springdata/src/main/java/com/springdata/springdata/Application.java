package com.springdata.springdata;

import com.springdata.springdata.data.City;
import com.springdata.springdata.repository.CityRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
        CityRepository cityRepository = ctx.getBean(CityRepository.class);

//        City newCity = new City();
//        newCity.setCityName("Atlantis");
//        newCity.setCityPopulation(54067);
//        cityRepository.save(newCity);

        List<City> cities = cityRepository.findCitiesByCityNameLike("%City%");
        for (City city: cities) { System.out.println(city); }
    }
}
