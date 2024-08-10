package com.niru.controller;

import com.niru.dto.Customer;
import com.niru.dto.UserResponse;
import com.niru.feignclient.integration.CustomerService;
import com.niru.feignclient.integration.UserDetailsService;
import com.niru.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/user")
public class Controller {

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    CustomerService customerService;

    @GetMapping(value = "/", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public User getUserDetails(){
        return User.builder().id(101).name("Mani").address("Hyderabad").build();
    }

    @GetMapping("/findAllUsers")
    public List<UserResponse> getAllUsers() {
        return userDetailsService.getAllUsers();
    }

    @GetMapping("/findCustomer")
    public Customer getCustomer() {
        return customerService.getCustomer();
    }
}
