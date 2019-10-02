package com.codegym.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserLogin {
    private static List<Login> user = new ArrayList<>();

    static {
        user.add(new Login("admin", "123456"));
        user.add(new Login("admin1", "123456"));
        user.add(new Login("admin2", "123456"));
        user.add(new Login("admin3", "123456"));
        user.add(new Login("admin4", "123456"));

    }
    public static Login checkUser(String account, String password){
        for (Login user: user){
            if (user.getAccount().equals(account) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
}
