package com.quickpayatm.service.impl;

import com.quickpayatm.dao.AccountDao;
import com.quickpayatm.dao.BalanceDao;
import com.quickpayatm.domain.Balance;
import com.quickpayatm.service.AccountService;

public class AccountServiceImpl implements AccountService{
    private AccountDao accountDao;
    private BalanceDao balanceDao;
    
	@Override
	public boolean depositToAccount(String account, String amount) {
		int id = this.accountDao.findByAccount(account);
		Balance balance = this.balanceDao.findById(id);
		balance.setBalance(balance.getBalance()+Double.parseDouble(amount));
		this.balanceDao.update(balance);
		return true;
	}

	@Override
	public boolean drawFromAccount(String account, String amount) {
		int id = this.accountDao.findByAccount(account);
		Balance balance = this.balanceDao.findById(id);
		if(balance.getBalance()<Double.parseDouble(amount))			
		  return false;
		balance.setBalance(balance.getBalance()-Double.parseDouble(amount));
        return true;
	}

	@Override
	public boolean transferAccount(String account, String targetAccount, String amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Balance checkAccountBalance(String account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modifyPassword(String account, String password, String newPassword, String confirmPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean login(String account, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public BalanceDao getBalanceDao() {
		return balanceDao;
	}

	public void setBalanceDao(BalanceDao balanceDao) {
		this.balanceDao = balanceDao;
	}
}
