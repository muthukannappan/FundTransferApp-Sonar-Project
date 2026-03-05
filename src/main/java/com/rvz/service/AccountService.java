package com.rvz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rvz.entity.Account;
import com.rvz.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private  AccountRepository accRepo;

	public String createAccount(Account acc) {
		int accno = acc.getAccno();
		String password = acc.getPassword();
		if (accno == 0 || password == null) {
			return "invalid";
		}
		accRepo.save(acc);
		return "Account created";
	}

	public String sendMoney(Account acc, int toAcc, int amount) {
		int accno = acc.getAccno();
		String password = acc.getPassword();

		if(accRepo.findById(accno).isEmpty()) {
			return "Invalid";
		}
         
		Account data=accRepo.findByAccno(accno);
		if (data.getAccno() == accno && data.getPassword().equals(password)) {
			return "Succesful";
		} else {
			return "Sorry something Went Wrong...!";
		}
	}

	public String updateAcc(int accno, double amount) {
		Account acc = accRepo.findByAccno(accno);
		double balance = acc.getBalance() + amount;
		acc.setBalance(balance);
		accRepo.save(acc);
		return "Account updated";

	}

	public List<Account> viewAll() {
		return accRepo.findAll();
	}
}
