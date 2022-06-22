package com.sandbox.beansandbox.modernbean;

import java.util.Date;

public class Bean {
    private String firstName;
    private String lastName;
    private int age;
    public Bean(String firstName) {
        System.out.println("A modern bean has been created, " + firstName);
        this.firstName = firstName;
    }

    public Bean(int age) {
        System.out.println("A modern bean has been created of " + age + " years");
        this.age = age;
    }

    public Bean(String firsName, String lastName) {
        System.out.println("A modern bean has been created, " + firsName + " " + lastName);
        this.firstName = firsName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
