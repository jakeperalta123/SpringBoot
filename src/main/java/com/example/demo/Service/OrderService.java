package com.example.demo.Service;
import com.example.demo.Model.Meal;
import com.example.demo.Model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    List<Order> userList=new ArrayList<>();

    public OrderService(List<Order> userLis) {
        List<Meal> meals = new ArrayList<>();
        meals.add(new Meal("hotdog", "so hot", 25));
        meals.add(new Meal("colddog", "so so cold", 25));
        meals.add(new Meal("warm dog", "so warm ", 25));
        this.userList.add(new Order(1,1000,"david", meals));
    }   


    public Order getip(int seq) {
        for(int i=0;i<this.userList.size();i++){
            if(this.userList.get(i).getSeq()==seq){
                return this.userList.get(i);
            }
        }
        return null;
    }
}