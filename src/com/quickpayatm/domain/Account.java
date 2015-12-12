package com.quickpayatm.domain;

import java.util.Set;

public class Account {
     private int id;
     private String account;
     private String password;
     
     private Set<Log> log;
     private Balance balance;
     
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Set<Log> getLog() {
		return log;
	}
	public void setLog(Set<Log> log) {
		this.log = log;
	}
	public Balance getBalance() {
		return balance;
	}
	public void setBalance(Balance balance) {
		this.balance = balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
     
}
