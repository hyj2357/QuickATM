package com.quickpayatm.action.atmmodule;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.quickpayatm.service.AccountService;

public class LoginAction extends ActionSupport{
	private AccountService accountService;
	private String account,password;
	
	public String execute(){
		ActionContext ctx = ActionContext.getContext();
        if(this.accountService.login(account, password))
        	return ERROR;
        else{
        	ctx.getSession().put("account",account);
            return SUCCESS;
        }       	
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
