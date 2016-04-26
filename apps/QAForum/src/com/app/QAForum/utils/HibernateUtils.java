package com.app.QAForum.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory factory;
	public SessionFactory getSessionFactory(){
		if(factory==null){
			Configuration conf=new Configuration();
			conf.configure("com/app/QAForum/config/hibernate.cfg.xml");
			factory=conf.buildSessionFactory();
		}
		return factory;
	}
}
