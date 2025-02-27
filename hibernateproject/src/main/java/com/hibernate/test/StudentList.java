package com.hibernate.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.SelectionQuery;

import com.hibernate.entity.Student;
import com.hibernate.utility.HibernateUtil;

public class StudentList {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		SelectionQuery<Student> query = session.createSelectionQuery("from Student", Student.class);
		List<Student> studList = query.list();
		studList.forEach(System.out::println);//method reference
		session.close();

	}

}
