package com.datapersist.datapersist.data.repositories;

import com.datapersist.datapersist.beans.DataSourceBean;
import com.datapersist.datapersist.data.entities.City;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CityRepositoryImpl implements CityRepository {
    private JdbcTemplate template;
    private static final String SEARCH_BY_ID = "select name from city where city_id = ?";
    private static final String SEARCH_FULL_BY_ID = "select name,population from city where city_id = ?";
    private static final String SEARCH_ALL_POP_CAP = "select name,population from city where population < ?";
    private static final String ADD_CITY = "insert into city(name,population) values(?,?)";
    private static class CityRowMapper implements RowMapper<City> {

        @Override
        public City mapRow(ResultSet rs, int rowNum) throws SQLException {
            City result = new City();
            result.setName(rs.getString("name"));
            result.setPopulation(rs.getInt("population"));

            return result;
        }
    }

    public CityRepositoryImpl(DataSource dataSource) {
        template = new JdbcTemplate(dataSource);
    }

    public String getCityById(int id) {
        String cityName = template.queryForObject(SEARCH_BY_ID,new Object[] {id},String.class);
        return cityName;
    }

    @Override
    public City getCityCensusById(int id) {
        City result = template.queryForObject(SEARCH_FULL_BY_ID, new Object[]{id}, new RowMapper<City>() {
            @Override
            public City mapRow(ResultSet rs, int rowNum) throws SQLException {
                String name = rs.getNString("name");
                int population = rs.getInt("population");
                City city = new City();
                city.setName(name);
                city.setPopulation(population);

                return city;
            }
        });

        return result;
    }

    @Override
    public List<City> getCitiesUnder(int populationCap) {
        List<City> cities = template.query(SEARCH_ALL_POP_CAP,new Object[] {populationCap},new CityRowMapper());
        return cities;
    }

    @Override
        public void create(City entity) {

        }

        @Override
        public City read(int id) {
            return null;
        }

        @Override
        public void update(City entity) {

        }

        @Override
        public void delete(City entity) {

        }
    }
