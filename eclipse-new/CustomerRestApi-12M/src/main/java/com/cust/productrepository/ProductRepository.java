package com.cust.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cust.productentity.Product;


public interface ProductRepository extends JpaRepository<Product,Integer> {

}
