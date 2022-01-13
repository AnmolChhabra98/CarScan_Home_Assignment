package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="CarScanUsers")
public class User {
	@Id
	private String mobileNumber;
	private String fname;
	private String lname;
	private String dob;
	private String city;
	
	// Constructors used for initialization of object. 
	public User() {
		//default constructor
	}
	
	//parameterised constructor	
	public User(String fname, String lname, String dob, String city, String mobileNumber) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.city = city;
		this.mobileNumber = mobileNumber;
	}
	
	//Generate getter and setters to access private properties in other classes.
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	//Generate toString() to print object.
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", city=" + city + ", mobileNumber="
				+ mobileNumber + "]";
	}
}
