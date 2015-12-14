package com.quickpayatm.action.atmmodule;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.quickpayatm.service.AccountService;

public class CheckAccountBalanceAction extends ActionSupport implements AuthValidate{
    private AccountService accountService;
    
    public String execute(){
    	ActionContext ctx = ActionContext.getContext();
    	if(!this.auth(ctx))
    		return ERROR;
    	String i = "";
    	if((i=this.self_validate())!=null){
    		ctx.getSession().put("errMsg", i);
    		return "verror";
    	}
    	String account = (String)ctx.getSession().get("account");
    	double balance = this.accountService.checkAccountBalance(account).getBalance();
    	ctx.getSession().put("balance", balance);
    	return SUCCESS;
    }
    
    public boolean auth(ActionContext ctx){
    	return (ctx.getSession().get("account")!=null);
    }
    
    public String self_validate(){
    	return null;
    }
    
	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
    
    
}
