package com.clientService;

import java.sql.SQLException;
import java.util.Scanner;
import com.DAOService.EmployeeDAO;
import com.modelService.*;
import com.serverService.EmployeeDaoImpl;

public class ClientJDBC {
	public static void main(String[] args) throws SQLException {
	EmployeeDAO employeedao=new EmployeeDaoImpl();
	Scanner input=new Scanner(System.in);
	System.out.println("--------Welcome Employee App-------- \n Please select your choice: \n"
			+ " 1-Create New Record of an Employee \n 2-Retrive Employee Details \n"
			+ " 3-Update any record \n 4-Delete any record\n 5-Get Employee Names in Descending Order\n 6-Exit !");
	System.out.println("Enter your choice (1-6): ");
	int choice =input.nextInt();
	switch(choice) {
	case 1: 
	/*System.out.println("How many records do you want to enter:");
	int records=input.nextInt();
	Employee e1=new Employee();
	for(int i=0;i<records;i++) {
		System.out.println("Enter Id of the employee: ");
		e1.setId(input.nextInt());
		System.out.println("Enter Name of the employee: ");
		e1.setEmpName(input.next());
		System.out.println("Enter Age of the employee: ");
		e1.setAge(input.nextInt());
		System.out.println("Entered Id: "+e1.getId()+ "\nEntered Employee Name: "+e1.getEmpName()
		+"\nEntered Age: "+ e1.getAge());*/
		System.out.println("Please Enter Employee ID:");
		int id=input.nextInt();
		System.out.println("Please Enter Employee Name:");
		String Name= input.next();
		System.out.println("Please enter Employee Age:");
		int Age=input.nextInt();
		Employee employee=new Employee(id,Name,Age);
		System.out.println( "row/s inserted= "+employeedao.insertEmployee(employee));
		break;
	case 2:
		System.out.println("Please Enter Employee ID to get the details:");
		int age=input.nextInt();
		System.out.println(employeedao.retrieveEmployee(age));
		break;
	case 3:
		System.out.println("Please Enter Employee ID which have to be updated:");
		int id1=input.nextInt();
		System.out.println("Please enter Employee Age:");
		int Age1=input.nextInt();
		System.out.println("row/s updated= " + employeedao.updateEmployee(id1, Age1));
		break;
	case 4:
		System.out.println("Please enter the Employee ID to be deleted:");
		System.out.println("record affected= "+employeedao.deleteEmployee(input.nextInt()));
		break;
	case 5:
		System.out.println("Employees Names:");
		System.out.println(employeedao.getEmployeeNames());
		break;
	case 6:
		System.out.println("Exited !!!");
		break;
	default:
		System.out.println("Enter Correct Choice !!");
		
	}
	}
	}


