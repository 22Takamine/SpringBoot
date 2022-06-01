package com.example.controller.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.controller.dao.ProductDao;
import com.example.controller.entity.Product;


@Repository
public class PgProductDao implements ProductDao {

	private static final String SELECT_BY_PRODUCT_ALL = "SELECT * FROM products ORDER BY product_id";
    private static final String SELECT_BY_PRODUCT_ID = "SELECT * FROM products WHERE product_id = :id ORDER BY product_id";
    private static final String SELECT_BY_PRODUCT_NAME_AND_PRICE = "SELECT * FROM products WHERE product_name = :name AND price = :price ORDER BY product_id";
    private static final String SELECT_BY_PRODUCT_NAME_OR_PRICE = "SELECT * FROM products WHERE product_name = :name OR price = :price ORDER BY product_id";
    private static final String INSERT = "INSERT INTO products (product_name, price) VALUES (:name, :price)";
    
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
    
    public List<Product> findAll() {
        String sql = SELECT_BY_PRODUCT_ALL;

        MapSqlParameterSource param = new MapSqlParameterSource();

        List<Product> resultList = jdbcTemplate.query(sql, param, new BeanPropertyRowMapper<Product>(Product.class));

        return resultList.isEmpty() ? null : resultList;
    }

    public Product findById(Integer productId) {
        String sql = SELECT_BY_PRODUCT_ID;

        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("id", productId);

        List<Product> resultList = jdbcTemplate.query(sql, param, new BeanPropertyRowMapper<Product>(Product.class));

        return resultList.isEmpty() ? null : resultList.get(0);
    }
    
    public List<Product> findByNameAndPrice(String productName, Integer price) {
        String sql = SELECT_BY_PRODUCT_NAME_AND_PRICE;

        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("name", productName);
        param.addValue("price", price);

        List<Product> resultList = jdbcTemplate.query(sql, param, new BeanPropertyRowMapper<Product>(Product.class));

        return resultList.isEmpty() ? null : resultList;
    }
    
    public List<Product> findByNameOrPrice(String productName, Integer price) {
        String sql = SELECT_BY_PRODUCT_NAME_OR_PRICE;

        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("name", productName);
        param.addValue("price", price);

        List<Product> resultList = jdbcTemplate.query(sql, param, new BeanPropertyRowMapper<Product>(Product.class));

        return resultList.isEmpty() ? null : resultList;
    }
    
    public void insert(String productName, Integer price) {
    	String sql = INSERT;
    	
    	MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("name", productName);
        param.addValue("price", price);
        
        jdbcTemplate.update(sql, param);
        
    	
    }

}