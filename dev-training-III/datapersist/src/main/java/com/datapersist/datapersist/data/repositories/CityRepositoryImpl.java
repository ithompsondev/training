package com.datapersist.datapersist.data.repositories;

import com.datapersist.datapersist.beans.DataSourceBean;
import com.datapersist.datapersist.data.entities.City;
import com.datapersist.datapersist.data.entities.SideKick;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityRepositoryImpl implements CityRepository {
    private JdbcTemplate template;
    private static final String SEARCH_BY_ID = "select name from city where city_id = ?";
    private static final String SEARCH_FULL_BY_ID = "select name,population from city where city_id = ?";
    private static final String SEARCH_ALL_POP_CAP = "select name,population from city where population < ?";
    private static final String SEARCH_DISC_ASSISTED_PATROLLERS = "select sidekick_id,alias,power,city.name from sidekick " +
                                                                  "inner join city on sidekick.city_id = city.city_id " +
                                                                  "where city.name = ? "+
                                                                  "order by city.name asc";
    private static final String INSERT_NEW_CITY = "insert into city values(null,?,?)";
    private static final String UPDATE_CITY_POP = "update city set population = ? where name = ?";
    private static class CityRowMapper implements RowMapper<City> {

        @Override
        public City mapRow(ResultSet rs, int rowNum) throws SQLException {
            City result = new City();
            result.setName(rs.getString("name"));
            result.setPopulation(rs.getInt("population"));

            return result;
        }
    }

    private static class SideKickPatrolSetExtractor implements ResultSetExtractor<List<SideKick>> {
        @Override
        public List<SideKick> extractData(ResultSet rs) throws SQLException, DataAccessException {
            Map<Integer,SideKick> resultMap = new HashMap<Integer, SideKick>();
            SideKick sideKick;

            while(rs.next()) {
                // extract id for current row
                Integer id = rs.getInt("sidekick_id");
                sideKick = resultMap.get(id);

                if (sideKick == null) {
                    // ensure we reference different objects each time
                    sideKick = new SideKick();
                    sideKick.setSideKickID(id);
                    sideKick.setAlias(rs.getString("alias"));
                    sideKick.setPower(rs.getString("power"));
                    resultMap.put(id,sideKick);
                }
            }

            // Nifty trick for converting map to list
            return new ArrayList<SideKick>(resultMap.values());
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
    public City getUniqueAssistedPatrollers(String cityName) {
        List<SideKick> sideKicks = template.query(SEARCH_DISC_ASSISTED_PATROLLERS,new Object[] {cityName},new SideKickPatrolSetExtractor());
        City city = new City();
        city.setName(cityName);
        city.setUniqueAssistingPatrollers(sideKicks);
        return city;
    }

    @Override
    public void create(City entity) {
        template.update(INSERT_NEW_CITY,new Object[] {
                entity.getName(),
                entity.getPopulation()
        });
    }

        @Override
        public City read(int id) {
            return null;
        }

        @Override
        public void update(City entity) {
            template.update(UPDATE_CITY_POP,new Object[] {entity.getPopulation(),entity.getName()});
        }

        @Override
        public void delete(City entity) {

        }
    }
