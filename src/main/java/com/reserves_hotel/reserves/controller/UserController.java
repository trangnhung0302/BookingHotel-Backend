package com.reserves_hotel.reserves.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reserves_hotel.reserves.model.User;
import com.reserves_hotel.reserves.repository.UserRepository;
import com.google.gson.Gson;

@RestController
public class UserController {
    @Autowired
    private UserRepository repo;
     
    @GetMapping("/users")
    public String listAll(Model model) {
        List<User> listUsers = repo.findAll();
        model.addAttribute("listUsers", listUsers);
        String[] array = new String[listUsers.size()]; 
        for(int i=0;i<listUsers.size();i++){
        	array[i] = listUsers.get(i).getName();
        }
        Gson gson = new Gson();
        String daysJson = gson.toJson(array);
        System.out.println("daysJson = " + daysJson);
        return daysJson;
    }
}
