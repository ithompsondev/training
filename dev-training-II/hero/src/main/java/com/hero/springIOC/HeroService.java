package com.hero.springIOC;

import java.util.ArrayList;
import java.util.List;

public class HeroService {
    private HeroLocatable locator;

    public HeroService(HeroLocatable locator) {
        this.locator = locator;
    }

    public List<Hero> find(String location) {
        List<Hero> database = this.locator.find();
        List<Hero> results = new ArrayList<Hero>();

        for (Hero hero: database) {
            if (hero.getLocation().equals(location)) {
                results.add(hero);
            }
        }

        return results;
    }
}
