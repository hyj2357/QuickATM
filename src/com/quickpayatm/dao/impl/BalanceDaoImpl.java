package com.quickpayatm.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.quickpayatm.dao.BalanceDao;
import com.quickpayatm.domain.Balance;

public class BalanceDaoImpl   extends HibernateDaoSupport  implements BalanceDao{

	public boolean update(final Balance balance) {
		this.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session) throws HibernateException,
					SQLException {

						session.setFlushMode(FlushMode.AUTO); 

						session.update(balance); 

						session.flush(); 

						return null; 
					}
		});
		return true;
	}

	public Balance findById(int id) {
        int i = -1;
        List ls = null;
        ls = this.getSession().getNamedQuery("findById_query").setInteger(0, id).list();
        if(ls==null||ls.size()==0)
        	return null;
        Balance bl = new Balance();
        Object[] data = (Object[])(ls.get(0));
        bl.setId(((Integer)data[0]));
        bl.setBalance(((Double)data[1]));
		return bl;
	}

}
