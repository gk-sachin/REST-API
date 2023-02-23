package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

@Id

private int id;
private String Student_Name;
private String department_name;
private String mailid;


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getStudent_Name() {
	return Student_Name;
}


public void setStudent_Name(String student_Name) {
	Student_Name = student_Name;
}


public String getDepartment_name() {
	return department_name;
}


public void setDepartment_name(String department_name) {
	this.department_name = department_name;
}


public String getMailid() {
	return mailid;
}


public void setMailid(String mailid) {
	this.mailid = mailid;
}


@Override

public String toString() {
	return "Student Details : \n" + "Id = " + id  + "Name = " + Student_Name + "Department_Name = " + department_name + "Mail_Id = " + mailid;
}
}
