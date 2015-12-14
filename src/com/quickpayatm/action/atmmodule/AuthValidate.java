package com.quickpayatm.action.atmmodule;

import com.opensymphony.xwork2.ActionContext;

public interface AuthValidate {
    boolean auth(ActionContext ctx);
    
    String self_validate();
}
