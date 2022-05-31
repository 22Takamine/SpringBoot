package com.example.controller.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.controller.dao.ProductDao;
import com.example.controller.entity.Product;
import com.example.controller.service.ProductService;



@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductDao productDao;

    public Product findById(Integer productId) {
        return productDao.findById(productId);
    }
}