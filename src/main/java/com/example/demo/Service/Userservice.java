package com.example.demo.Service;

import com.example.demo.Model.Meal;
import com.example.demo.Model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Userservice {
    List<Meal> userList=new ArrayList<>();


    public Userservice(List<Meal> userList) {
        this.userList.add(new Meal("ham","david is good",120));
    }
    public Meal getUser(String name) {
        for(int i=0;i<this.userList.size();i++){
            if(this.userList.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                return this.userList.get(i);
            }
        }
        return null;
    }}



