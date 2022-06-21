package com.hero.springIOC;

public class Hero {
    private String alias;
    private String location;

    public String getAlias() {
        return alias;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return this.alias + " patrols " + this.location;
    }

    public Hero(String alias, String location) {
        this.alias = alias;
        this.location = location;
    }
}
