package com.quickpayatm.action.atmmodule;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.quickpayatm.service.AccountService;

public class ModifyPasswordAction extends ActionSupport{
	private AccountService accountService;
	private String password;
	private String newPassword;
	private String confirmPassword;
	
    public String execute(){
		ActionContext ctx = ActionContext.getContext();
        String account = (String)ctx.getSession().get("account");
        if(!newPassword.equals(confirmPassword))
        	return ERROR;
        if(this.accountService.modifyPassword(account, password, newPassword, confirmPassword))
        	return ERROR;
        else
        	return SUCCESS;
    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	} 
}
