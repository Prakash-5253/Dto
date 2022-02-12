package com.example.demoForDto.entity;

public class Dto {
    private String name;
    private Integer age;
    private String street;
    private String city;



    public Dto() {
        this.name = name;
        this.age = age;
        this.street = street;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
