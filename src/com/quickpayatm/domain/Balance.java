package com.quickpayatm.domain;

public class Balance {
     private int id;
     private int account;
     private double balance;
     private Account maccount;
     
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account getMaccount() {
		return maccount;
	}
	public void setMaccount(Account maccount) {
		this.maccount = maccount;
	}
	
}
