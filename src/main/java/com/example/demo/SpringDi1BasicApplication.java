package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Major;
import com.example.demo.entity.Student;
import com.example.demo.service.MajorService;
import com.example.demo.service.StudentService;

@SpringBootApplication
public class SpringDi1BasicApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext context =
            SpringApplication.run(SpringDi1BasicApplication.class, args);

        StudentService studentService = context.getBean(StudentService.class);
        MajorService majorService = context.getBean(MajorService.class);
        List<Student> list1 = studentService.findAll();
        List<Major> list2 = majorService.findAll();
        
        System.out.println(" 【student】");
        for (Student s : list1) {
            System.out.println(s.getStudentId() + "," +  s.getStudentName()
            + "," + s.getGrade() + "," + s.getHometown() + "," + s.getMajorId()
            + "," + s.getMajorName());
        }
        
        System.out.println(" 【major】");
        for (Major m : list2) {
            System.out.println(m.getMajorId() + "," +  m.getMajorName());
        }
        
        
    }

}
