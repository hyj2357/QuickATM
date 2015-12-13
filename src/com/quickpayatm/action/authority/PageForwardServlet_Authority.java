package com.quickpayatm.action.authority;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class PageForwardServlet_Authority extends ActionSupport{
    private String pagePath;
    private String p;
    
    private final String PREFIX_PATH = "/WEB-INF/jsp/";
    
    public String execute(){
    	ActionContext ctx = ActionContext.getContext();
    	if(ctx.getSession().get("account")==null)
    		return ERROR;
    	return PREFIX_PATH + p;
    }

	public String getPagePath() {
		return pagePath;
	}

	public void setPagePath(String pagePath) {
		this.pagePath = pagePath;
	}

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}
    
}
