package com.example.EmployeeServer;

public class Employee {

	private int eid;
	private String ename;
	private int esalary;
	
	public Employee() {
		
	}
	public Employee(int eid,String ename,int esal) {
		super();
		this.eid=eid;
		this.ename=ename;
		this.esalary=esal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	
}
