package com.rvz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rvz.entity.Account;
import com.rvz.service.AccountService;

@CrossOrigin(origins="http://localhost:5173")
@RestController
@RequestMapping("/api/NEFT")

public class NEFTController {
	@Autowired
	private AccountService accService;
	
     @GetMapping("/all")
     public List<Account> getAll(){
    	 return accService.viewAll();
     }
     @PostMapping("/create")
     public String createAcc(@RequestBody Account acc) {
    	 return accService.createAccount(acc);
     }
     
     @PostMapping("/transfer/{toAcc}")
     public String transferMoney(@RequestBody Account acc,@PathVariable int toAcc,@RequestParam int amount) {
    	 return accService.sendMoney(acc,toAcc,amount);
    	 
     }
     
     @PutMapping("/update/{accno}")
     public String updateAccount(@PathVariable int accno,@RequestParam int amount) {
    	 return accService.updateAcc(accno, amount);
     }
}
