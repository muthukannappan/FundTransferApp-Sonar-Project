package com.rvz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rvz.entity.AccountDetail;
import com.rvz.service.AccountService;

@CrossOrigin(origins="http://localhost:5173")
@RestController
@RequestMapping("/api/RTGS")
public class RtgsController {
	@Autowired
	private AccountService accService;
	
     @GetMapping("/all")
     public List<AccountDetail> getAll(){
    	 return accService.viewAll();
     }
     @PostMapping("/create")
     public String createAcc(@RequestBody AccountDetail acc) {
    	 return accService.createAccount(acc);
    	
     }
}
