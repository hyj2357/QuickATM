package com.quickpayatm.dao;

import com.quickpayatm.domain.Balance;

public interface BalanceDao {
    public boolean update(Balance balance);
    
    public Balance findById(int id);
}
