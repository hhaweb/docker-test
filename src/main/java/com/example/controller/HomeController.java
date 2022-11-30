package com.example.controller;

import com.example.model.User;
import com.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {
    @Autowired
    TestService service;
    @GetMapping("/home")
    public String home(){
        User userOne = new User(1L,"HHA");
        User userTwo = new User(1L,"HHA");
        service.addUser("one",userOne);
        service.addUser("two",userTwo);

        return  "Home";
    }

}
