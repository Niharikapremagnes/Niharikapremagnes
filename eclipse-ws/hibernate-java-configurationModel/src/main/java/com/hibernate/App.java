package com.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.dao.StudentDao;
import com.hibernate.model.Student;


public class App {
	public static void main(String[] args) {
		System.out.println("Project Started");
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory =cfg.buildSessionFactory();
		StudentDao studentDao = new StudentDao();
		Student student = new Student("Bhavya","PremAgnes","bhavyapremagnes@gmail.com");
		studentDao.saveStudent(student);
		
		System.out.println(student.getId());
	}
}