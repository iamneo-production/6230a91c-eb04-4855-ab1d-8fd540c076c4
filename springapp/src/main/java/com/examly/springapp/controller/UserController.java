package com.examly.springapp.controller;

import com.examly.springapp.repository.UserDao;

import java.util.List;

import com.examly.springapp.models.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class UserController {
    
    @Autowired
    private UserDao userdao;

    @GetMapping("/admin")
    public List<User> getUser()
    {
        return userdao.findAll();
    }

    @PutMapping("/admin/userEdit/{id}")
    public void userEditSave(@PathVariable("id") String id,@RequestBody User user)
    {
        User u=userdao.findById(id).get();
        u.setUsername(user.getUsername());
        u.setMobileNumber(user.getMobileNumber());
        u.setRole(user.getRole());
        userdao.save(u);
    }

    @GetMapping("/admin/userEdit/{id}")
    public User userEditSave(@PathVariable("id") String id)
    {
        return userdao.findById(id).get();
    }
    
    @DeleteMapping("/admin/delete/{id}")
    public void userDelete(@PathVariable("id") String id)
    {
        userdao.deleteById(id);
    }
}
