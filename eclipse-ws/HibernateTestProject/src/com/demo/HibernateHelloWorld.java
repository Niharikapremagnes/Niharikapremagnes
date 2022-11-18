package com.demo;

import java.util.List;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.query.Query;

public class HibernateHelloWorld {

	public static void main(String[] args) throws Exception{
		SessionFactory sessfact = HibernateUtil.getSessionFactory();
		Session session= sessfact.getCurrentSession();
		org.hibernate.Transaction tr= session.beginTransaction();
		
		String strSql="from employee o";
		Query query= session.createQuery(strSql);
		List list=query.list();
		for(Iterator<Iterator> it=list.iterator();it.hasNext();) {
			Employee emp=(Employee)it.next();
			System.out.println("Hello : "+emp.getEmpName());
		}
		tr.commit();
		System.out.println("Data Displayed");
		sessfact.close();
			
	}
}
