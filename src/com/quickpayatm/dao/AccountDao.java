package com.quickpayatm.dao;

import com.quickpayatm.domain.Account;

public interface AccountDao {
    public boolean update(Account account);
    
    public int findByAccount(String account);
    
    public String findByAccountAndPassword(String account,String password);    
}
