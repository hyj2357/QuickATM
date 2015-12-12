package com.quickpayatm.domain;

public class Balance {
     private int id;
     private double balance;
     private Account maccount;
     
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
