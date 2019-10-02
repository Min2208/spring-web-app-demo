package com.codegym.controller;

import com.codegym.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ServletController {
    private CustomerService customerService = new CustomerServiceImpl();

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @PostMapping("/check")

    public String checkLogin(@RequestParam String account, @RequestParam String password, Model model) {
        if (UserLogin.checkUser(account, password) != null) {
            model.addAttribute("account", account);
            model.addAttribute("customers", customerService.fillAll());
            model.addAttribute("success", "Login success");
            return "home";
        } else {
            model.addAttribute("message", "Account is not avaible");
            return "login";
        }

    }


    @GetMapping("/customer/{id}/edit")
    public String editForm(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.fillById(id));
        return "edit";
    }

    @GetMapping("/customer/{id}/delete")
    public String deleteForm(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.fillById(id));
        return "delete";
    }

    @GetMapping("/customer/{id}/info")
    public String showInfo(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.fillById(id));
        return "info";
    }


    @GetMapping("/home")
    public String goHome(Model model) {
        model.addAttribute("customers", customerService.fillAll());
        return "home";
    }


    @PostMapping("/delete")
    public String deleteCustomer(@RequestParam int id, Model model) {
        customerService.delete(id);
        model.addAttribute("customers", customerService.fillAll());
        return "redirect:/home";
    }

    @PostMapping("/customer/update")
    public String updateCustomer(Customer customer) {
        customerService.update(customer.getId(),customer);
        System.out.println(customer.getName());
        return "redirect:/home";
    }

    @PostMapping("/customer/delete")
    public String deleteCustomer(Customer customer) {
        customerService.delete(customer.getId());

        return "redirect:/home";
    }

    @GetMapping("/customer/createform")
    public String createForm(Model model){
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping("/customer/create")
    public String createCustomer(Customer customer){
        customerService.save(customer);
        return "redirect:/home";
    }


}
