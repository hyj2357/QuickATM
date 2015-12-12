package com.quickpayatm.dao.impl;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.quickpayatm.dao.LogDao;
import com.quickpayatm.domain.Log;

public class LogDaoImpl extends HibernateDaoSupport implements LogDao{

	@Override
	public boolean update(Log log) {
		this.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session) throws HibernateException,
					SQLException {

						session.setFlushMode(FlushMode.AUTO); 

						session.update(log); 

						session.flush(); 

						return null; 
					}
		});
		return true;
	}

	@Override
	public List<Log> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(Log log) {
        this.getHibernateTemplate().save(log);
		return true;
	}

	@Override
	public List<Log> findByD_time(Timestamp startTime, Timestamp endTime) {
		// TODO Auto-generated method stub
		return null;
	}
}
