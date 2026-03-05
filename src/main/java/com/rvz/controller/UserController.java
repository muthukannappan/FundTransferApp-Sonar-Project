package com.rvz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rvz.entity.User;
import com.rvz.service.UserService;

@CrossOrigin(origins="http://localhost:5173")
@RestController
@RequestMapping("/api/user")
public class UserController {
	
	 @Autowired
	 private UserService userService;
	 
	  @GetMapping
	  public List<User> viewAll(){
		  return userService.viewAll();
	  }
      @PostMapping("/add")
      public String addUser(@RequestBody User user) {
    	  return userService.addUser(user);
    	 
      }
      @PostMapping("/verify")
      public String verifyUser(@RequestBody User user) {
    	  return userService.getUser(user);
    	  
      }
}
