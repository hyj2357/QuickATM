package com.quickpayatm.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.quickpayatm.dao.AccountDao;
import com.quickpayatm.domain.Account;

public class AccountDaoImpl  extends HibernateDaoSupport  implements AccountDao{

	public boolean update(final Account account) {
		this.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session) throws HibernateException,
					SQLException {

						session.setFlushMode(FlushMode.AUTO); 

						session.update(account); 

						session.flush(); 

						return null; 
					}
		});
		return true;
	}

	public int findByAccount(String account) {
	    List ls = null;
	    ls = this.getSession().getNamedQuery("findByAccount_query").setString(0, account).list();
		return (ls.size()!=0)?((Integer)ls.get(0)).intValue():-1;
	}

	public String findByAccountAndPassword(String account,String password) {
	    List ls = null;
	    ls = this.getSession().getNamedQuery("findByAccountAndPassword_query").setString(0,account).setString(1, password).list();
		return (ls.size()!=0)?account:null;
	}
    
}
