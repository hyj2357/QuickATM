package com.quickpayatm.dao;

import java.sql.Timestamp;
import java.util.List;

import com.quickpayatm.domain.Log;

public interface LogDao {
    public boolean update(Log log);
    
    public List<Log> findById(int id);
    
    public boolean create(Log log);
    
    public List<Log> findByD_time(Timestamp startTime,Timestamp endTime);
}
