package com.kl.jfsdspringbootmvc.service;

import java.util.List;

import com.kl.jfsdspringbootmvc.model.Admin;
import com.kl.jfsdspringbootmvc.model.User;


public interface AdminService {


    public List<User> viewAllUsers();
    public Admin findByUsernameAndPassword(String username, String password);
}
