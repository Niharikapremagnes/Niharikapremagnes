package com.la.empapp.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class Department {
    int deptid;
    String deptname;
    
    
    private List<Employee> employees;
    
    

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int deptid, String deptname, List<Employee> employees) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
		this.employees = employees;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", employees=" + employees + "]";
	}

	
    
}
