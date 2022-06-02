package com.example.controller.service;

import java.util.List;

import com.example.controller.entity.Product;

public interface ProductService {
	
	public List<Product> findAll();
    public Product findById(Integer productId);
    public List<Product> findByNameAndPrice(String productName, Integer price);
    public List<Product> findByNameOrPrice(String productName, Integer price);
    public void insert(String productName, Integer price);
    public void delete(Integer id);
    public void update(Integer id, String name, Integer price);

}