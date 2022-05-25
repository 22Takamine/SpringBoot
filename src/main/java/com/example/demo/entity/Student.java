package com.example.demo.entity;

public class Student {

	private Integer studentId;
	private String studentName;
	private Integer grade;
	private String hometown;
	private Integer majorId;
	private String majorName;
	
	public Student() {
		
	}
	
	public Integer getStudentId() {
	    return this.studentId;
	}

	public void setStudentId(Integer studentId) {
	    this.studentId = studentId;
	}

	public String getStudentName() {
	    return this.studentName;
	}

	public void setStudentName(String studentName) {
	    this.studentName = studentName;
	}
	
	public Integer getGrade() {
	    return this.grade;
	}

	public void setGrade(Integer grade) {
	    this.grade = grade;
	}

	public String getHometown() {
	    return this.hometown;
	}

	public void setHometown(String hometown) {
	    this.hometown = hometown;
	}
	
	public Integer getMajorId() {
	    return this.majorId;
	}

	public void setMajorId(Integer majorId) {
	    this.majorId = majorId;
	}
	
	public String getMajorName() {
	    return this.majorName;
	}

	public void setMajorName(String majorName) {
	    this.majorName = majorName;
	}
	

}