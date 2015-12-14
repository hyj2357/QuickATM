package com.quickpayatm.action.atmmodule;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.quickpayatm.service.AccountService;

public class CheckAccountBalanceAction extends ActionSupport{
    private AccountService accountService;
    
    public String execute(){
    	ActionContext ctx = ActionContext.getContext();
    	String account = (String)ctx.getSession().get("account");
    	double balance = this.accountService.checkAccountBalance(account).getBalance();
    	ctx.getSession().put("balance", balance);
    	return SUCCESS;
    }

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
    
    
}
