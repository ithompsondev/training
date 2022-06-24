package com.datapersist.datapersist.data.entities;

public class Hero {
    private Integer heroID;
    private String name;
    private String alias;
    private String power;
    private Integer cityID;
    private Integer sideKickID;

    public Integer getHeroID() {
        return heroID;
    }

    public void setHeroID(Integer heroID) {
        this.heroID = heroID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public Integer getSideKickID() {
        return sideKickID;
    }

    public void setSideKickID(Integer sideKickID) {
        this.sideKickID = sideKickID;
    }
}
