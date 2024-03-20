package com.example.mysql.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mysql.Repository.UserRepo;
import com.example.mysql.model.User;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;


    @SuppressWarnings("null")
    public User getbyid(Long id){
        System.out.print(userRepo.findById(id).orElse(null));
        return userRepo.findById(id).orElse(null);
    }

    public List<User> getall(){
        return userRepo.findAll();
    }


    @SuppressWarnings("null")
    public User createUser(User newuser){
        return userRepo.save(newuser);
    }

    @SuppressWarnings("null")
    public void deleteuser(Long id){
         userRepo.deleteById(id);
    }

    @SuppressWarnings("null")
    public void updateuser(User user){
        userRepo.save(user);

    }
    
}
