package com.datapersist.datapersist.data.entities;

import java.util.List;

public class City {
    private Integer cityID;
    private String name;
    private Integer population;

    private List<SideKick> uniqueAssistingPatrollers;

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public List<SideKick> getUniqueAssistingPatrollers() {
        return uniqueAssistingPatrollers;
    }

    public void setUniqueAssistingPatrollers(List<SideKick> uniqueAssistingPatrollers) {
        this.uniqueAssistingPatrollers = uniqueAssistingPatrollers;
    }

    @Override
    public String toString() {
        return name + ", population: " + population;
    }
}
