package com.example.demo.Controller;

import com.example.demo.Model.Meal;
import com.example.demo.Model.Order;
import com.example.demo.Service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/meal")
public class UserContoller {
    @Autowired
    Userservice userservice;

    @GetMapping()
    public String gerUser(@RequestParam String name, Model model) {
        Meal meal = this.userservice.getUser(name);
        model.addAttribute("meal", meal);
        return "Meal";
    }

}
