package com.kl.jfsdspringbootmvc.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kl.jfsdspringbootmvc.model.User;
import com.kl.jfsdspringbootmvc.repository.UserRepository;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @GetMapping("/userRegistration")
    public ModelAndView userRegistration() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userRegistration");
        return modelAndView;
    }

    @GetMapping("/userLogin")
    public ModelAndView userLogin() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userLogin");
        return modelAndView;
    }

    @PostMapping("/registerUser")
    public ModelAndView registerUser(
            @RequestParam("username") String username,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            @RequestParam("phoneNumber") String phoneNumber) {

        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        user.setPhoneNumber(phoneNumber);

        userRepository.save(user);

        ModelAndView modelAndView = new ModelAndView("registrationSuccess");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView login(
            @RequestParam("username") String username,
            @RequestParam("password") String password) {

        // Attempt to find the user by username
        Optional<User> optionalUser = userRepository.findById(username);

        ModelAndView modelAndView = new ModelAndView();
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            // Check if the password matches
            if (user.getPassword().equals(password)) {
                modelAndView.setViewName("home");
                modelAndView.addObject("welcomeMessage", "Welcome, " + user.getUsername() + "!");
                modelAndView.addObject("user", user); // Pass the user object to the view
            } else {
                modelAndView.setViewName("userLogin");
                modelAndView.addObject("error", "Invalid password. Please try again.");
            }
        } else {
            modelAndView.setViewName("userLogin");
            modelAndView.addObject("error", "Username not found. Please register.");
        }

        return modelAndView;
    }
}
