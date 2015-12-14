package com.quickpayatm.action.atmmodule;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.quickpayatm.service.AccountService;

public class ModifyPasswordAction extends ActionSupport implements AuthValidate{
	private AccountService accountService;
	private String password;
	private String newPassword;
	private String confirmPassword;
	
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
        if(this.accountService.modifyPassword(account, password, newPassword, confirmPassword)){
        	ctx.getSession().put("errMsg", "由于原密码错误或其他原因,修改密码失败.");
        	return ERROR;
        }
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

    public boolean auth(ActionContext ctx){
    	return (ctx.getSession().get("account")!=null);
    }

	public String self_validate() {
        String regex_password= "^[0-9]{6}$";
        if(!Pattern.matches(regex_password, password))
        	return "原密码格式有误,密码为6位数字.";
        if(!Pattern.matches(regex_password, newPassword))
        	return "新密码格式有误,密码为6位数字.";
        if(!Pattern.matches(regex_password, confirmPassword))
        	return "确认密码格式有误,密码为6位数字.";
        if(!newPassword.equals(confirmPassword))
        	return "确认密码与新密码不符合.";
		return null;
	}
}
