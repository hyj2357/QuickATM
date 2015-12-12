package com.quickpayatm.service.impl;

import com.quickpayatm.dao.AccountDao;
import com.quickpayatm.dao.BalanceDao;
import com.quickpayatm.domain.Account;
import com.quickpayatm.domain.Balance;
import com.quickpayatm.service.AccountService;

public class AccountServiceImpl implements AccountService{
    private AccountDao accountDao;
    private BalanceDao balanceDao;
    
	public boolean depositToAccount(String account, String amount) {
		int id = this.accountDao.findByAccount(account);
		Balance balance = this.balanceDao.findById(id);
		balance.setBalance(balance.getBalance()+Double.parseDouble(amount));
		this.balanceDao.update(balance);
		return true;
	}

	public boolean drawFromAccount(String account, String amount) {
		int id = this.accountDao.findByAccount(account);
		Balance balance = this.balanceDao.findById(id);
		if(balance.getBalance()<Double.parseDouble(amount))			
		  return false;
		balance.setBalance(balance.getBalance()-Double.parseDouble(amount));
        return true;
	}

	public boolean transferAccount(String account, String targetAccount, String amount) {
		int i = this.accountDao.findByAccount(account);
		int j = this.accountDao.findByAccount(targetAccount);
		if(j==-1)
			return false;
		Balance balance = this.balanceDao.findById(i);
		if(balance.getBalance()<Double.parseDouble(amount))
			return false;
		Balance balance_t = this.balanceDao.findById(j);
		balance.setBalance(balance.getBalance()-Double.parseDouble(amount));
		balance_t.setBalance(balance_t.getBalance()+Double.parseDouble(amount));
		return true;
	}

	public Balance checkAccountBalance(String account) {
		int id = this.accountDao.findByAccount(account);
        Balance balance = this.balanceDao.findById(id);
		return balance;
	}

	public boolean modifyPassword(String account, String password, String newPassword, String confirmPassword) {
		int id = this.accountDao.findByAccount(account);
		String account_f = this.accountDao.findByAccountAndPassword(account, confirmPassword);
		if(account_f==null||(!account_f.equals(account)))
			return false;
		Account ac = new Account();
		ac.setId(id);
		ac.setAccount(account);
		ac.setPassword(confirmPassword);
		this.accountDao.update(ac);			
		return true;
	}

	public boolean login(String account, String password) {
		return this.accountDao.findByAccountAndPassword(account, password)!=null;
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
