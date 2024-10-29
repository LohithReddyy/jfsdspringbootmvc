package com.kl.jfsdspringbootmvc.service;

import com.kl.jfsdspringbootmvc.model.User;

public interface UserService {
    public String userRegistration(User user);
    public User findByEmailAndPassword(String email, String password);
    

}
