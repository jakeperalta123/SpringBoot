package com.example.demo.Controller;

import com.example.demo.Model.Meal;
import com.example.demo.Model.Order;
import com.example.demo.Service.OrderService;
import com.example.demo.Service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping(value="/order")
public class OrderController {
    @Autowired
    OrderService Orderservice;

    @GetMapping("/{seq}")
    public String gerUserById(@PathVariable int seq, Model model){
        Order order=this.Orderservice.getip(seq);
        model.addAttribute("order",order);
        return "Order";
    }

    @GetMapping("")
    public String getTotalPrice(Model model) {
        ArrayList<Order> orders = new ArrayList();
        orders.add(new Order(0, 1000, "bob", new ArrayList()));
        orders.add(new Order(1, 2000, "bob2", new ArrayList()));
        orders.add(new Order(2, 3000, "bob3", new ArrayList()));

        int total = 0;
        for (int i = 0; i <orders.size(); ++i) {
            total += orders.get(i).getTotalPrice();
        }

        model.addAttribute("total", total);

        return "TotalPrice";
    }
}
