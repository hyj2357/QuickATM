package com.quickpayatm.action.atmmodule;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.quickpayatm.service.AccountService;

public class TransferAccountAction extends ActionSupport implements AuthValidate{
    private AccountService accountService;
    private String targetAccount;
    private String amount;
    
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
        if(this.accountService.transferAccount(account, targetAccount, amount))
        	return SUCCESS;
        else{
        	ctx.getSession().put("errMsg", "由于目标账户不存在或者转账金额超出本账户余额,转账失败.");
        	return ERROR;
        }
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

    public boolean auth(ActionContext ctx){
    	return (ctx.getSession().get("account")!=null);
    }

	public String self_validate() {
        String regex_account = "^[0-9]{7}$";
        if(!Pattern.matches(regex_account, this.targetAccount))
        	return "转账账号格式有误,账号为7位数字.";
    	String regex_amount = "^[0-9]*(00){1}0*$";
    	if(!Pattern.matches(regex_amount, amount))
    		return "输入金额有误.";
		return null;
	}  
}
