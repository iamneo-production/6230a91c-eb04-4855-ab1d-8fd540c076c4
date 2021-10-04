package com.examly.springapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    
    @Id
    private String email;
    private String password;
    private String username;
    private String mobileNumber;
    private String role;
    private Boolean active;
    public User(String email,String password,String username,String mobileNumber,String role)
    {
        super();
        this.email=email;
        this.username=username;
        this.active=false;
        this.password=password;
        this.mobileNumber=mobileNumber;
        this.role=role;
    }
    public User()
    {
        super();
    }
    public String getEmail()
    {
        return email;
    }
    public String getMobileNumber()
    {
        return mobileNumber;
    }
    public String getUsername(){
        return username;
    } 
    public String getRole()
    {
        return role;
    }
    public Boolean getActive()
    {
        return active;
    }
    public void setActive(Boolean active)
    {
        this.active=active;
    }
    public String getPassword()
    {
        return password;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setUsername(String username)
    {
        this.username=username;
    }
    public void setMobileNumber(String mobileNumber)
    {
        this.mobileNumber=mobileNumber;
    }
    public void setRole(String role)
    {
        this.role=role;
    }
}
