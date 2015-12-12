package com.quickpayatm.action.atmmodule;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.quickpayatm.service.AccountService;

public class TransferAccountAction extends ActionSupport{
    private AccountService accountService;
    private String targetAccount;
    private String amount;
    
    public String execute(){
		ActionContext ctx = ActionContext.getContext();
        String account = (String)ctx.getSession().get("account");
        if(this.accountService.transferAccount(account, targetAccount, amount))
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
	public String getTargetAccount() {
		return targetAccount;
	}
	public void setTargetAccount(String targetAccount) {
		this.targetAccount = targetAccount;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
    
    
    
}
