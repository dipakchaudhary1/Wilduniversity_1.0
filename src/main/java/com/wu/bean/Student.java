package com.wu.bean;

public class Student {
	
	private int id;
	private String name;
	private String email;
	private String address;
	private String telephone;
	private String faculty;
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, String email, String address, String telephone, String faculty) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.telephone = telephone;
		this.faculty = faculty;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
}
