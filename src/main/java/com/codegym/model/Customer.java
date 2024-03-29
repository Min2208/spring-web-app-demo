package com.codegym.model;

public class Customer {
    private int id;
    private String name;
    private String email;
    public Customer(){};

    public Customer(int id, String name, String email, String address, String age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.age = age;
    }

    private String address;

    public Customer( String name, String email, String address, String age) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.age = age;
    }


    private String age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
