package com.example.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="Age")
	private int age;
	@Column(name="Gender")
	private String gender;
	@Column(name="Marks")
	private int marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(long id, String name, int age, String gender, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
