package com.quickpayatm.action.atmmodule;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.quickpayatm.service.AccountService;

public class LoginAction extends ActionSupport implements AuthValidate{
	private AccountService accountService;
	private String account,password;
	
	public String execute(){
		ActionContext ctx = ActionContext.getContext();
   	    String i = "";
   	    if((i=this.self_validate())!=null){
   		     ctx.getSession().put("errMsg", i);
   		     return "verror";
   	    }	
        if(!this.accountService.login(account, password)){
        	ctx.getSession().put("errMsg", "卡号或密码错误.");
        	return ERROR;
        }
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

	public boolean auth(ActionContext ctx) {
		// TODO Auto-generated method stub
		return false;
	}

	public String self_validate() {
        String regex_account = "^[0-9]{7}$";
        String regex_password= "^[0-9]{6}$";
        if(!Pattern.matches(regex_account, account))
        	return "账号格式有误,账号为7位数字.";
        if(!Pattern.matches(regex_password, password))
        	return "账号密码格式有误,密码为6位数字.";
		return null;
	}
}
