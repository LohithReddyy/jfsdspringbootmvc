package com.kl.jfsdspringbootmvc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id

    @Column(name = "username", nullable = false,unique=true)
    private String username;
    @Column(name = "email", nullable = false,unique=true)
    private String email;
    @Column(name = "password", nullable = false,unique=true)
    private String password;
    @Column(name = "phoneNumber", nullable = false,unique=true)
    private String phoneNumber;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    

}
