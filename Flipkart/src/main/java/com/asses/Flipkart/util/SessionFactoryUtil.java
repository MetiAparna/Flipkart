package com.asses.Flipkart.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.asses.Flipkart.entity.ProductEntity;

public class SessionFactoryUtil
{
	private static SessionFactory sessionFactory=null;
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory==null)
		{
			Configuration cfg = new Configuration();
			cfg.setProperties(ConnectionPropertiesUtil.getMySqlDbProperties());
			cfg.addAnnotatedClass(ProductEntity.class);
			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}

}
