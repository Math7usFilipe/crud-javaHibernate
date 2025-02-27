package com.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.entity.Student;
import com.hibernate.utility.HibernateUtil;

public class StudentUpdate {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		//Method
		Student stud = session.get(Student.class, 111);//SELECT * FROM StudentInfo WHERE sno=111;
		stud.setMarks(550.0);
		session.merge(stud);
		tx.commit();
		session.close();
	}

}
