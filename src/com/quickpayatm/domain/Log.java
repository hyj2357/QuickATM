package com.quickpayatm.domain;

import java.sql.Timestamp;

public class Log {
    private int id;
    private int account;
    private String content;
    private Timestamp d_time;
    
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getD_time() {
		return d_time;
	}
	public void setD_time(Timestamp d_time) {
		this.d_time = d_time;
	}  
}
