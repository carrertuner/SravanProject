package com.ct.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmpDetails {
	@Id
private String firstName;
private String middleName;
private String lastName;
private String email;
private long mobileNo;
private String Address;
private String Address1;
private String city;
private String state;
private String country;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getAddress1() {
	return Address1;
}
public void setAddress1(String address1) {
	Address1 = address1;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public EmpDetails(String firstName, String middleName, String lastName, String email, long mobileNo, String address,
		String address1, String city, String state, String country) {
	super();
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.email = email;
	this.mobileNo = mobileNo;
	Address = address;
	Address1 = address1;
	this.city = city;
	this.state = state;
	this.country = country;
}
@Override
public String toString() {
	return "EmpDetails [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", email="
			+ email + ", mobileNo=" + mobileNo + ", Address=" + Address + ", Address1=" + Address1 + ", city=" + city
			+ ", state=" + state + ", country=" + country + "]";
}

public EmpDetails() {
	// TODO Auto-generated constructor stub
}
}
