package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examly.springapp.models.User;
public interface UserDao extends JpaRepository<User,String> {
    
}
