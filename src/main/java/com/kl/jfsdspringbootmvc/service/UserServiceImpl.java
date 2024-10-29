package com.kl.jfsdspringbootmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kl.jfsdspringbootmvc.model.User;
import com.kl.jfsdspringbootmvc.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public String userRegistration(User user) {
        userRepository.save(user);
        return "User registered successfully";
    }

    @Override
    public User findByEmailAndPassword(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

}
