package com.rvz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rvz.entity.AccountDetail;
import com.rvz.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private  AccountRepository accRepo;

	public String createAccount(final AccountDetail acc) {
		int accNo = acc.getAccNo();
		String password = acc.getPassword();
		if (accNo == 0 || password == null) {
			return "invalid";
		}
		accRepo.save(acc);
		return "Account created";
	}

	public String sendMoney(final AccountDetail acc,final int toAcc,final int amount) {
		int accno = acc.getAccNo();
		String password = acc.getPassword();

		if(accRepo.findById(accno).isEmpty()) {
			return "Invalid";
		}
         
		AccountDetail data=accRepo.findByAccno(accno);
		if (data.getAccNo() == accno && data.getPassword().equals(password)) {
			return "Succesful";
		} else {
			return "Sorry something Went Wrong...!";
		}
	}

	public String updateAcc(final int accNo,final  double amount) {
		AccountDetail acc = accRepo.findByAccno(accNo);
		double balance = acc.getBalance() + amount;
		acc.setBalance(balance);
		accRepo.save(acc);
		return "Account updated";

	}

	public List<AccountDetail> viewAll() {
		return accRepo.findAll();
	}
}
