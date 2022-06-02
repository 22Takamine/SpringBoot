package com.example.controller.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.controller.dao.ProductDao;
import com.example.controller.entity.Product;
import com.example.controller.service.ProductService;



@Service

public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductDao productDao;

    public List<Product> findAll() {
        return productDao.findAll();
    }
    
    public Product findById(Integer productId) {
        return productDao.findById(productId);
    }
    
    public List<Product> findByNameAndPrice(String productName, Integer price) {
        return productDao.findByNameAndPrice(productName, price);
    }
    
    public List<Product> findByNameOrPrice(String productName, Integer price) {
        return productDao.findByNameOrPrice(productName, price);
    }
    
    public void insert(String productName, Integer price) {
        productDao.insert(productName, price);
    }
    
    public void delete(Integer id) {
        productDao.delete(id);
    }
    
    @Transactional
    public void update(Integer id, String name, Integer price) {
        productDao.update(id, name, price);
    }
}