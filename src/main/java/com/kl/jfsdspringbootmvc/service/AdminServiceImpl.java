package com.kl.jfsdspringbootmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kl.jfsdspringbootmvc.model.Admin;
import com.kl.jfsdspringbootmvc.model.User;
import com.kl.jfsdspringbootmvc.repository.AdminRepository;
import com.kl.jfsdspringbootmvc.repository.UserRepository;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private UserRepository userRepository;
    private AdminRepository adminRepository;

    @Override
    public List<User> viewAllUsers() {
    
        return userRepository.findAll();
    }

    @Override
    public Admin findByUsernameAndPassword(String username, String password) {
       return adminRepository.findByUsernameAndPassword(username, password);
    }

    

    
    

}
