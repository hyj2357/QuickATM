package com.quickpayatm.action.atmmodule;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.quickpayatm.service.AccountService;

public class DepositToAccountAction extends ActionSupport implements AuthValidate{
     private AccountService accountService;
     private String amount;
     
     public String execute(){
    	 ActionContext ctx = ActionContext.getContext();
    	 String account = (String)ctx.getSession().get("account");
     	 if(!this.auth(ctx))
    		return ERROR;
    	 String i = "";
    	 if((i=this.self_validate())!=null){
    		ctx.getSession().put("errMsg", i);
    		return "verror";
    	 }
    	 if(this.accountService.depositToAccount(account, amount))
    	   return SUCCESS;
    	 else{
    	   ctx.getSession().put("errMsg", "存款失败,请重试!");
    	   return ERROR;
    	 }
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

    public boolean auth(ActionContext ctx){
    	return (ctx.getSession().get("account")!=null);
    }
    
    public String self_validate(){
    	String regex_amount = "^[0-9]*(00){1}0*$";
    	if(!Pattern.matches(regex_amount, amount))
    		return "输入金额有误.";
    	if(Double.parseDouble(amount)>2000)
    		return "一次最多存入2000元.";    		
    	return null;
    }
	
}
