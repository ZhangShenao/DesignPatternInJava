package proxy.javaproxy;

import java.lang.reflect.*;
import java.util.*;

public class MatchMakingTestDrive {
	/**
	 * 模拟PersonBean的数据库
	 */
	private HashMap<String,PersonBean> datingDB = new HashMap<>();
 	
	public static void main(String[] args) {
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}
 
	public MatchMakingTestDrive() {
		initializeDatabase();
	}
	
	/**
	 * 创建PersonBean的非所有者的代理对象
	 */
	private PersonBean getNonOwnerProxy(PersonBean personBean){
		return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), 
				personBean.getClass().getInterfaces(), 
				new NonOwnerInvocationHandler(personBean));
	}
	
	/**
	 * 创建PersonBean的所有者的代理对象
	 */
	private PersonBean getOwnerProxy(PersonBean personBean){
		return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), 
				personBean.getClass().getInterfaces(), 
				new OwnerInvocationHandler(personBean));
	}
	
	public void drive() {
		//获取被代理对象
		PersonBean joe = getPersonFromDatabase("Joe Javabean"); 
		
		//创建所有者代理
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is " + ownerProxy.getName());
		ownerProxy.setInterest("bowling, Go");
		System.out.println("Interests set from owner proxy");
		try {
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println("所有者代理不能为自己打分");
		}
		System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
		
		//创建非所有者代理
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is " + nonOwnerProxy.getName());
		try {
			nonOwnerProxy.setInterest("bowling, Go");
		} catch (Exception e) {
			System.out.println("非所有者代理不能修改他人的信息");
		}
		nonOwnerProxy.setHotOrNotRating(3);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
	}

	
	/**
	 * 根据姓名,从数据库中获取PersonBean
	 */
	private PersonBean getPersonFromDatabase(String name) {
		return datingDB.get(name);
	}
	
	/**
	 * 初始化数据库,保存PersonBean信息
	 */
	private void initializeDatabase() {
		PersonBean joe = new PersonBeanImpl();
		joe.setName("Joe Javabean");
		joe.setInterest("cars, computers, music");
		joe.setHotOrNotRating(7);
		datingDB.put(joe.getName(), joe);

		PersonBean kelly = new PersonBeanImpl();
		kelly.setName("Kelly Klosure");
		kelly.setInterest("ebay, movies, music");
		kelly.setHotOrNotRating(6);
		datingDB.put(kelly.getName(), kelly);
	}
}
