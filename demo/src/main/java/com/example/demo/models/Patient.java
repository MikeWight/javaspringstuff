package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Patient {

    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private int age;

    @JsonProperty("city")
    private String city;

    public Patient() {
        
    }

    public Patient(String name, int age, String city) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
