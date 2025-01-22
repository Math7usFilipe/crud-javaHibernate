package com.hibernate.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.entity.Student;
import com.hibernate.utility.HibernateUtil;

public class StudentInsert {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		//object
		Student stud = new Student();
		stud.setSno(444);
		stud.setName("Luiz");
		stud.setMarks(250.00);
		//insert into StudentInfo values(? ? ?)
		session.persist(stud);
		tx.commit();
		session.close();
	}

}
