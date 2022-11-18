package com.example.order.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_info")
public class Order {
	@Id
	@Column(name="order_id")
	private long orderid;
	@Column(name="order_item")
	private String orderitem;
	@Column(name="order_price")
	private long orderprice;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(long orderid, String orderitem, long orderprice) {
		super();
		this.orderid = orderid;
		this.orderitem = orderitem;
		this.orderprice = orderprice;
	}
	public long getOrderid() {
		return orderid;
	}
	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}
	public String getOrderitem() {
		return orderitem;
	}
	public void setOrderitem(String orderitem) {
		this.orderitem = orderitem;
	}
	public long getOrderprice() {
		return orderprice;
	}
	public void setOrderprice(long orderprice) {
		this.orderprice = orderprice;
	}
	
	

}
