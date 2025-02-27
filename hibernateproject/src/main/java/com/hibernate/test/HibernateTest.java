package com.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.utility.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		//descobrindo versao do mysql instalada
		String version = (String) session.createNativeQuery("select version()").getSingleResult();
		System.out.println("MySQL Version: " + version);
	}

}
