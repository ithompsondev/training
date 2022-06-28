package com.datapersist.datapersist.data.repositories;

import com.datapersist.datapersist.data.entities.City;
import com.datapersist.datapersist.data.entities.SideKick;

import java.util.List;

public interface CityRepository extends DefaultRepo<City> {
    public String getCityById(int id);
    public City getCityCensusById(int id);
    public List<City> getCitiesUnder(int populationCap);
    public City getUniqueAssistedPatrollers(String cityName);
}
