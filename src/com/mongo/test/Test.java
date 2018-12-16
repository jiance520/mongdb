package com.mongo.test;

import java.util.Date;
import java.util.List;

import com.mongodb.BasicDBObject;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BaseDAOImpl baseDAOImpl = new BaseDAOImpl();
		
		//查询方法
		/*List list = baseDAOImpl.find("test");
        System.out.println(list.size());*/
		
        List<BasicDBObject> list = baseDAOImpl.find("person", new BasicDBObject());
        for(BasicDBObject i : list){
            System.out.println(i.get("id"));
        }
        System.out.println("查询完成！");
		
		/*BasicDBObject beanOne = new BasicDBObject();		
		List list = baseDAOImpl.query("person", beanOne, 1, 1);
		for(int i = 0; i < list.size();i++){
			System.out.println(list.get(i));
		}*/
		
		/*Person bean = new Person();
		bean.setAge(25);
		bean.setId("p08");
		bean.setName("辉哥");
		baseDAOImpl.insert("person", bean);
		System.out.println("新增成功！");*/
		
		/*Person bean = new Person();
		bean.setId("p11");
		baseDAOImpl.delete("person", bean);
        System.out.println("删除操作完成！");
		
		Person bean2 = new Person();
		bean2.setName("豪哥");
		List<BasicDBObject> list = baseDAOImpl.find("person", bean2);
		for(BasicDBObject i : list){
	        System.out.println(i.get("name"));
	        System.out.println(i.get("id"));
	        System.out.println(i.get("age"));
		}
		
		BasicDBObject beanOne = new BasicDBObject();*/
        //新增方法
        /*beanOne.put("name", "小喵喵");
        beanOne.put("sex", "女");
        beanOne.put("age", 26);
        baseDAOImpl.insert("test", beanOne);//建立一个集合，和数据库一样，如果没有，会自动建立
        System.out.println("添加成功！");*/
        
		/*      
        
        //修改方法
        BasicDBObject oldBean = (BasicDBObject) baseDAOImpl.find("person", new BasicDBObject("name", "小喵m")).get(0);
        BasicDBObject newBean = (BasicDBObject) oldBean.clone();//这里封装的是对象，先查出源对象，再克隆到新对象，最后修改
        newBean.put("name", "小喵miao");
        newBean.put("age", 26);
        System.out.println(oldBean.get("name"));
        System.out.println(newBean.get("name"));
        baseDAOImpl.update("person", oldBean, newBean);
        System.out.println(newBean.get("age"));
        System.out.println("修改完成！");
        
        //以下是使用findAndModify更新，findAndModify比update效率低
        BasicDBObject oldBean1 = new BasicDBObject ();
        oldBean.put("name", "小喵miao");
        BasicDBObject newBean1 = new BasicDBObject ();
        newBean.put("name", "小喵m");
        //newBean.put("age", 26);
        baseDAOImpl.update("person", oldBean1, newBean1);
        System.out.println("修改完成！");
        
        //删除方法
        baseDAOImpl.delete("person", new BasicDBObject("name","qy"));
        System.out.println("删除操作完成！");
        
        //模糊查询
        String key = "小";
        Pattern pattern = Pattern.compile("^.*" + key + ".*$", Pattern.CASE_INSENSITIVE);
        DB db = MongoDBUtil.getDB();
        List list1 =  db.getCollection("person").find(new BasicDBObject("name", pattern)).toArray();
        for(int i = 0; i < list1.size();i++){
            System.out.println(list1.get(i));
        }*/
		
		//Long num=baseDAOImpl.queryCount("person", beanOne);
		//System.out.println(num);
		//DBObject sort = new BasicDBObject("age", 1);
		//DBObject fields = new BasicDBObject("age",1);
		//DBCursor cur=baseDAOImpl.getCursor("person", beanOne, fields, sort, 1,2);
		/*DBCursor cur=baseDAOImpl.getCursor("person", beanOne, null, sort,1,3);//这里是从第1条开始显示3条
		 while (cur.hasNext()) {
		        DBObject obj = cur.next();
		        System.out.println(obj.get("name"));
		        System.out.println(obj.get("age"));
		 }*/
	}
}
