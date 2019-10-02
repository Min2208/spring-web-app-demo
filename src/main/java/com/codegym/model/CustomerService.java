package com.codegym.model;

import java.util.List;

public interface CustomerService {
    List<Customer> fillAll();

    void save(Customer customer);

    Customer fillById(int id);

    void update(int id,String name, String email, String address, int age);

    void delete(int id);

    Customer fillByName(String name);

}
