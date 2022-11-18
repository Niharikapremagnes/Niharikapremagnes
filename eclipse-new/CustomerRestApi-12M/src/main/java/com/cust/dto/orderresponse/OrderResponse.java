package com.cust.dto.orderresponse;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


public class OrderResponse {
	@GeneratedValue(strategy=GenerationType.AUTO)
    private String name;
	@GeneratedValue(strategy=GenerationType.AUTO)
    private String productName;
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int price;
	

    public OrderResponse() {
		super();
		// TODO Auto-generated constructor stub
	}


	public OrderResponse(String name, String productName) {
        this.name = name;
        this.productName = productName;
    }
    

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "OrderResponse [name=" + name + ", productName=" + productName + ", price=" + price + "]";
	}
    
    
	
}
