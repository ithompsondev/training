package com.springdata.springdata.repository;

import com.springdata.springdata.data.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City,Integer> {
    public List<City> findCitiesByCityName(String cityName);
    public List<City> findCitiesByCityNameLike(String citySubstring);
}
