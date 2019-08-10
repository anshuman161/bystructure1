package com.bridgelabz.pojoimplementation;

public class AddressModel 
{
 private int id;
 private String firstname;
 private String lastname;
 private long mobileno;
 private String city;
 private int zip;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public long getMobileno() {
	return mobileno;
}
public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}
@Override
public String toString() {
	return "AddressPojo [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", mobileno=" + mobileno
			+ ", city=" + city + ", zip=" + zip + "]";
}
 public AddressModel() {
	// TODO Auto-generated constructor stub
}


 
}