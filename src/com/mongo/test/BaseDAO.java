package com.mongo.test;
import java.util.List;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;


public interface BaseDAO {

	//数据库基本操作
	public boolean insert(String collectionName, BasicDBObject bean);
	public boolean insert(String collectionName, Object bean);
    
    public boolean delete(String collectionName, BasicDBObject bean);
    public boolean delete(String collectionName, Object bean);
    
    public List find(String collectionName, BasicDBObject bean);
    public List find(String collectionName, Object bean);
    public List find(String collectionName);
    
    public boolean update(String collectionName, BasicDBObject oldBean, BasicDBObject newBean);
    public boolean update(String collectionName, DBObject oldBean, Object newBean);
    
    public long queryCount(String collectionName, DBObject params);//查询总数
    public List<Map<String, Object>> query(String collectionName, BasicDBObject param, int startRow, int rows);//分页
}
