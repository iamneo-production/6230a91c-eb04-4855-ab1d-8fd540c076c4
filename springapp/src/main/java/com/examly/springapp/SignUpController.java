package com.examly.springapp;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class SignUpController {
    
    @Autowired
    private UserDao userdao;
    
    @PostMapping("/signup")
    public User saveUser(@RequestBody User user){
        userdao.save(user);
        return user;
    }
}
