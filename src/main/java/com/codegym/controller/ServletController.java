package com.codegym.controller;

import com.codegym.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ServletController {
     private CustomerService customerService=new CustomerServiceImpl();

    @GetMapping("/")
    public String login(){
        return "login";
    }

    @PostMapping("/check")

    public String checkLogin(@RequestParam String account, @RequestParam String password, Model model){
        if (UserLogin.checkUser(account,password)!=null){
            model.addAttribute("account", account);
            model.addAttribute("customers", customerService.fillAll());
            return "home";
        }else {
            model.addAttribute("message", "Account is not avaible");
            return "login";
        }

    }

    @GetMapping("/customer")
    public String showCustormer(@RequestParam String action, @RequestParam int id,Model model){
        switch (action){
            case "edit":
                    model.addAttribute("customer",customerService.fillById(id));
                return "edit";
            case "delete":
                    model.addAttribute("customer", customerService.fillById(id));
                return "delete";
            case "info":
                model.addAttribute("customer", customerService.fillById(id));
                return "info";
            case "create":
                return "create";

        }
        return "home";


    }
    @GetMapping("/home")
    public String goHome(Model model){
        model.addAttribute("customers", customerService.fillAll());
        return "home";
    }

    @PostMapping("/create")
    public String addCustomer(@RequestParam String name,
                              @RequestParam String email,
                              @RequestParam String address,
                              @RequestParam int age,Model model){
        customerService.save(new Customer(name,email,address,age));
        model.addAttribute("customers",customerService.fillAll());
        return "redirect:/home";

    }

    @PostMapping("/delete")
    public String deleteCustomer(@RequestParam int id,Model model){
        customerService.delete(id);
        model.addAttribute("customers",customerService.fillAll());
        return "redirect:/home";
    }

    @PostMapping("/edit")
    public String updateCustomer(@RequestParam int id,
                                 @RequestParam String name,
                                 @RequestParam String email,
                                 @RequestParam String address,
                                 @RequestParam int age, Model model){

        customerService.update(id,name,email,address,age);
        model.addAttribute("customers",customerService.fillAll());
        return "redirect:/home";

    }




}
