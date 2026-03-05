package com.rvz.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
     private int userId;
     private String userName;
     private String password;
	 public UserDetails() {
		super();
	 }
	 public UserDetails(final String userName,final String password) {
		super();
		this.userName = userName;
		this.password = password;
	 }
	 public int getId() {
		 return userId;
	 }
	 public void setId(int id) {
		 this.userId = id;
	 }
	 public String getUsername() {
		 return userName;
	 }
	 public void setUsername(String userName) {
		 this.userName = userName;
	 }
	 public String getPassword() {
		 return password;
	 }
	 public void setPassword(String password) {
		 this.password = password;
	 }
     
}
