package com.example.mysql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysql.model.User;

public interface UserRepo extends JpaRepository<User,Long>{
    
}
