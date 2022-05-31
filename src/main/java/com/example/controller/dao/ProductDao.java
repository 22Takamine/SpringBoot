package com.example.controller.dao;

import com.example.controller.entity.Product;

public interface ProductDao {

    public Product findById(Integer productId);

}