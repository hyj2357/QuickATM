package com.quickpayatm.action.atmmodule;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.quickpayatm.service.AccountService;

public class LoginOutAction extends ActionSupport{
	private AccountService accountService;
	
    public String execute(){
    	ActionContext ctx = ActionContext.getContext();
    	ctx.getSession().remove("account");
    	return SUCCESS;
    }

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
    
    
}
