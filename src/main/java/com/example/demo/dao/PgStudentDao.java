package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
public class PgStudentDao implements StudentDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> findAll() {
        return jdbcTemplate.query("SELECT * FROM student s INNER JOIN major m ON s.major_id = m.major_id ORDER BY student_id ",
            new BeanPropertyRowMapper<Student>(Student.class));
    }
    
}