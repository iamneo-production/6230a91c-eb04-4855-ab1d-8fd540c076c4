package com.examly.springapp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    
    @Id
    private String email;
    private String password;
    private String mobileNumber;
    private String role;
    public User(String email,String password,String mobileNumber,String role)
    {
        super();
        this.email=email;
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
    public String getRole()
    {
        return role;
    }
    public String getPassword()
    {
        return password;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setMobileNumber(String mobileNumber)
    {
        this.mobileNumber=mobileNumber;
    }
    
    
}
