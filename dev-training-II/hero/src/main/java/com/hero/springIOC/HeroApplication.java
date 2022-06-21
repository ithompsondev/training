package com.hero.springIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class HeroApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        HeroService heroService = context.getBean("heroService",HeroService.class);
        List<Hero> patrol = heroService.find("Metropolis");

        for(Hero hero: patrol) { System.out.println(hero); }
    }
}
