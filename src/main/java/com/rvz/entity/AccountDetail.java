package com.rvz.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AccountDetail {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private int accNo;
       private String password;
       private double balance;
       private String userName;
	   public AccountDetail(final String password,final double balance, String userName) {
		super();
		this.password = password;
		this.balance = balance;
		this.userName = userName;
	   }
	   public AccountDetail() {
		super();
	   }
	   public int getAccNo() {
		   return accNo;
	   }
	   public void setAccno(int accNo) {
		   this.accNo = accNo;
	   }
	   public String getPassword() {
		   return password;
	   }
	   public void setPassword(String password) {
		   this.password = password;
	   }
	   public double getBalance() {
		   return balance;
	   }
	   public void setBalance(double balance) {
		   this.balance = balance;
	   }
	   public String getUserName() {
		   return userName;
	   }
	   public void setUsername(String userName) {
		   this.userName = userName;
	   }
       
       
       
}
