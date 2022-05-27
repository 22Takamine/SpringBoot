package com.example.controller.entity;

public class Product{

	private Integer productId;
	private String ProductName;
	private Integer price;
	
	public Product() {
		
	}
	
	public Product(Integer productId, String productName, Integer price) {
	    this.productId = productId;
	    this.ProductName = productName;
	    this.price = price;
	}
	
	public Integer getProductId() {
	    return this.productId;
	}

	public void setProductId(Integer productId) {
	    this.productId = productId;
	}

	public String getProductName() {
	    return this.ProductName;
	}

	public void setProductName(String productName) {
	    this.ProductName = productName;
	}

	public Integer getPrice() {
	    return this.price;
	}

	public void setPrice(Integer price) {
	    this.price = price;
	}

}
