package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerDetails {
	private static ArrayList<CustomerDB> customerList = new ArrayList<>();
	
	private void addCustomer(CustomerDB customer) {
		customerList.add(customer);
	}
	private void showCustomerList() {
		for(CustomerDB customer :customerList) {
			System.out.println("Customer_Name: "+customer.getCustName()+" Customer_ID: "+customer.getId()+" Customer_Age: "+customer.getAge()+"\n");}
		}
	
public static void main(String[] args) {
	CustomerDetails Details=new CustomerDetails();
	
	
	CustomerDB customer1= new CustomerDB("Kumar",1,20);
	CustomerDB customer2= new CustomerDB("Niharika",10,21);
	CustomerDB customer3= new CustomerDB("Rajesh",3,23);
	CustomerDB customer4= new CustomerDB("Vinod",2,22);
	CustomerDB customer5= new CustomerDB("Bhavya",5,18);
	CustomerDB customer6= new CustomerDB("Bhavani",4,27);
	CustomerDB customer7= new CustomerDB("Agnes",6,24);
	CustomerDB customer8= new CustomerDB("Pavani",7,31);
	CustomerDB customer9= new CustomerDB("Lavanya",9,26);
	CustomerDB customer10= new CustomerDB("Srinivas",8,28);
	
	Details.addCustomer(customer1);
	Details.addCustomer(customer2);
	Details.addCustomer(customer3);
	Details.addCustomer(customer4);
	Details.addCustomer(customer5);
	Details.addCustomer(customer6);
	Details.addCustomer(customer7);
	Details.addCustomer(customer8);
	Details.addCustomer(customer9);
	Details.addCustomer(customer10);
	
	
    System.out.println();
    Details.showCustomerList();
	try {
		Collections.sort(customerList,new AgeComparator());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println();
	Details.showCustomerList();
	
}}
