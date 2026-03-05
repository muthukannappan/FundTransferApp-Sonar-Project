package com.rvz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rvz.entity.User;
import com.rvz.repository.UserRepository;
@Service
public class UserService {
	 @Autowired
     private UserRepository userRepo;
     private static final String  WRONG_RESULT="Invalid Credentails";
	 public List<User> viewAll() {
		 return userRepo.findAll();
	 }
     
     public String getUser(User user) {
    	 String username=user.getUsername();
    	 String password=user.getPassword();
    	 if(username==null || password==null) {
    		 return WRONG_RESULT;
    	 }
    	 
    	 User data=userRepo.findByUsername(username);
    	 if (data.getUsername().equals(username) && data.getPassword().equals(password)) {
    		 return "Login Successful";
    	 }
    	 else {
    		 return WRONG_RESULT;
    	 }
     }
     
     public String addUser(User user) {
    	 String username=user.getUsername();
    	 String password=user.getPassword();
    	 if(username ==null || password ==null) {
    		 return WRONG_RESULT;
    	 }
    	 userRepo.save(user);
    	 return "Registered Successfully";
     }
}
