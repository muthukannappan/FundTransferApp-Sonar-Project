package com.rvz.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private int accno;
       private String password;
       private double balance;
       private String username;
	   public Account(String password, double balance, String username) {
		super();
		this.password = password;
		this.balance = balance;
		this.username = username;
	   }
	   public Account() {
		super();
	   }
	   public int getAccno() {
		   return accno;
	   }
	   public void setAccno(int accno) {
		   this.accno = accno;
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
	   public String getUsername() {
		   return username;
	   }
	   public void setUsername(String username) {
		   this.username = username;
	   }
       
       
       
}
