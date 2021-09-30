package com.examly.springapp;

// import javax.presistence.Entity;
// import javax.presistence.Id;

// @Entity
public class User {
    
    //@Id
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
}
