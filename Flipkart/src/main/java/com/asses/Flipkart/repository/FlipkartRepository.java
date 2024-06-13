package com.asses.Flipkart.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.asses.Flipkart.entity.ProductEntity;
import com.asses.Flipkart.util.SessionFactoryUtil;

public class FlipkartRepository 
{
	public void saveProductDetails(ProductEntity productEntity)
	{
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(productEntity);
		transaction.commit();
	}

}
