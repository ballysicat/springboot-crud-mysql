package com.example.mysql.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mysql.model.User;
import com.example.mysql.services.UserService;

@RestController
public class Api {
    // Inject the service class
    @Autowired
    private UserService userservice;

    // Default endpoint (Index)
    @GetMapping("/")
    public List<User> getuser(){
        return userservice.getall();
    }

    // Endpoint with ID path variable
    @GetMapping("/{id}")
    @ResponseBody
    public User getbyid(@PathVariable("id") Long id){
        return userservice.getbyid(id);
    }

    // Endpoint with create function or method
    @PostMapping("/create")
    public User create(@RequestBody User newuser){
         return userservice.createUser(newuser); 
    }

     // Endpoint with delete function or method and ID
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
         userservice.deleteuser(id);
         return "Deleted";
    }

    // Endpoint with update function or method and ID
    @PostMapping("/update/{id}")
    public String update(@PathVariable("id") Long entity) {        
        userservice.updateuser(null);
        return "updated";
    }
    
}
