package com.kh.chap03_class.model.vo;

public class Person {
	
	//필드선언
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private	String phone;
	private String email; // private으로 했으니 직접 접근이 되지 않는다. 
	
	
	public Person() { }
	public Person(String id, String pwd, String name, int age, char gender, String phone, String email) {
		this.id=id;
		this.pwd=pwd;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.phone=phone;
		this.email=email;
	}
	
	
	//setter 7개
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//getter 7개
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	

}
