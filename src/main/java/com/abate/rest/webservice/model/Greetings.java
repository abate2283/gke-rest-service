package com.abate.rest.webservice.model;

public class Greetings {
    private String greet;
    private String name;
    private String location;


    public Greetings(String greet, String name, String location) {
        this.greet = greet;
        this.name = name;
        this.location = location;
    }

    public Greetings() {
    }



    public String getGreet() {
        return greet;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setGreet(String greet) {
        this.greet = greet;
    }

    @Override
    public String toString() {
        return "Greetings{" +
                "greet='" + greet + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
