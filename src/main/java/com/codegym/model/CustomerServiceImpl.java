package com.codegym.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer,Customer> customers= new HashMap<>();
    public static int count=1;

    static {
        customers.put(count++,new Customer(1,"Ronaldo","ronaldo@gmail.com", "Brazil",36));
        customers.put(count++,new Customer(2,"Cr Ronaldo","cr7@gmail.com", "BDN",34));
        customers.put(count++,new Customer(3,"Ronaldinho","ronaldinho@gmail.com", "Brazil",35));
        customers.put(count++,new Customer(4,"Messi","m10@gmail.com", "Argentina",33));
        customers.put(count++,new Customer(5,"kaka","kaka22@gmail.com", "Brazil",34));

    }



    @Override
    public List<Customer> fillAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customer.setId(count);
        customers.put(count++,customer);


    }

    @Override
    public Customer fillById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, String name, String email, String address, int age) {
        customers.get(id).setName(name);
        customers.get(id).setEmail(email);
        customers.get(id).setAddress(address);
        customers.get(id).setAge(age);
        customers.get(id).setId(id);

    }

    @Override
    public void delete(int id) {
        customers.remove(id);
    }

    @Override
    public Customer fillByName(String name) {
        return null;
    }
}
