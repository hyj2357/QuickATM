package com.quickpayatm.service;

import com.quickpayatm.domain.Balance;

public interface AccountService {
    public boolean depositToAccount(String account,String amount);
    
    public boolean drawFromAccount(String account,String amount);
    
    public boolean transferAccount(String account,String targetAccount,String amount);
    
    public Balance checkAccountBalance(String account);
    
    public boolean modifyPassword(String account,String password,String newPassword,String confirmPassword);
    
    public boolean login(String account,String password);
}
