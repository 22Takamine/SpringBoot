package com.example.controller.dao;

import java.util.List;

import com.example.controller.entity.Product;

public interface ProductDao {

	public List<Product> findAll();
    public Product findById(Integer productId);
    public List<Product> findByNameAndPrice(String productName, Integer price);
    public List<Product> findByNameOrPrice(String productName, Integer price);
    public void insert(String name, Integer price);

}