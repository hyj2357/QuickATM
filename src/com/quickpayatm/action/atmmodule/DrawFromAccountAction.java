package com.quickpayatm.action.atmmodule;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.quickpayatm.service.AccountService;

public class DrawFromAccountAction extends ActionSupport{	
	private AccountService accountService;
	private String amount;
	
	public String execute(){
		ActionContext ctx = ActionContext.getContext();
		String account = (String)ctx.getSession().get("account");
		if(this.accountService.drawFromAccount(account, amount))
			return SUCCESS;
		else
			return ERROR;
	}
	
	public AccountService getAccountService() {
		return accountService;
	}
	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
}
