package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentDao {
	
	public List<Student> findAll();

}