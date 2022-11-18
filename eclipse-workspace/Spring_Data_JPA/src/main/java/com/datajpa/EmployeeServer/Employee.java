package com.datajpa.EmployeeServer;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private	String empid;
	private String empname;
	private int empsalary;
	
	
	public Employee(){
	}
	
	public Employee(String empid,String empname,int empsalary){
		super();
		this.empid=empid;
		this.empname=empname;
		this.empsalary=empsalary;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}

	
	
	
}
