package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDao;
import com.example.demo.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
    private ProductDao productDao;

    public List<Product> findAll() {
        return productDao.findAll();
    }

}
