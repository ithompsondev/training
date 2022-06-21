package com.hero.springIOC;

import java.util.ArrayList;
import java.util.List;

public class HeroLocator implements HeroLocatable {
    // Polymorphism
    private static List<Hero> locations = new ArrayList<Hero>();

    static {
        locations.add(new Hero("Superman","Metropolis"));
        locations.add(new Hero("Batman","Gotham City"));
        locations.add(new Hero("Flash","Star City"));
    }

    public List<Hero> find() {
        return locations;
    }
}