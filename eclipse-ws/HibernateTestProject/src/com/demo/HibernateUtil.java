package com.demo;

import java.util.Properties;

import javax.persistence.PersistenceException;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	 static {
			try {
				Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

				StandardServiceRegistryBuilder serviceRegistry = new StandardServiceRegistryBuilder();
				serviceRegistry.applySettings(configuration.getProperties());
				
				StandardServiceRegistry standardServiceRegistry = serviceRegistry.build();
				sessionFactory = configuration.buildSessionFactory(standardServiceRegistry);
				
				} catch (Throwable th) {
				System.err.println("Enitial Session creation failed"+th);
				throw new ExceptionInInitializerError(th);
				} 
			}
	 
	 	public static SessionFactory getSessionFactory() {
		return sessionFactory;
		}
	}