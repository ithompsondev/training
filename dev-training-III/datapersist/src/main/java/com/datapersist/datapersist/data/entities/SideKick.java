package com.datapersist.datapersist.data.entities;

public class SideKick {
    private Integer sideKickID;
    private String name;
    private String alias;
    private String power;

    public Integer getSideKickID() {
        return sideKickID;
    }

    public void setSideKickID(Integer sideKickID) {
        this.sideKickID = sideKickID;
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

    private Integer cityID;
}
