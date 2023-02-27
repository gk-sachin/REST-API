package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ChildModel {
@Id
private int babyid;
private String babyFname;
private String babyLname;
private String FatherName;
private String MotherName;
private String Address;
public int getBabyid() {
	return babyid;
}
public void setBabyid(int babyid) {
	this.babyid = babyid;
}
public String getBabyFname() {
	return babyFname;
}
public void setBabyFname(String babyFname) {
	this.babyFname = babyFname;
}
public String getBabyLname() {
	return babyLname;
}
public void setBabyLname(String babyLname) {
	this.babyLname = babyLname;
}
public String getFatherName() {
	return FatherName;
}
public void setFatherName(String fatherName) {
	FatherName = fatherName;
}
public String getMotherName() {
	return MotherName;
}
public void setMotherName(String motherName) {
	MotherName = motherName;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}


}
