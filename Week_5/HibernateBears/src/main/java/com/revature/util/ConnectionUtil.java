package com.revature.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class ConnectionUtil {
	
	private static SessionFactory sessionFactory;
	
	static {
		
		Configuration config = new Configuration();
		config.configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(config.getProperties());
		sessionFactory = config.buildSessionFactory(ssrb.build());
	}
	
	public static Session getSession(){
		
		return sessionFactory.openSession();
		
	}
	
	public static void closeFactory(){
		
		sessionFactory.close();
		
	}

}
