package com.hw1.model.vo;

public class Employee {

	private int empNo;
	private	String empName;
	private String dept;
	private	String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private	String phone;
	private	String address;
	
	//생성자
	//기본 생성자
	public Employee() { }
	//매개변수 생성자
	
	public Employee(int empNo, String empName, int age, char gender, String phone, String address) {
		this.empNo=empNo;
		this.empName=empName;
		this.age=age;
		this.gender=gender;
		this.phone=phone;
		this.address=address;
	}
	//this(userId, userPwd, userName);
	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary, double bonusPoint, String phone, String address) {
		this(empNo, empName, age, gender, phone, address);
		this.dept=dept;
		this.job=job;
		this.salary=salary;
		this.bonusPoint=bonusPoint;
	}
	

	//getter setter 생성
	//empNo
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo=empNo;
	}
	//empName
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	//dept
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	//job
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job=job;
	}
	//age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	//gender
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	//salary
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	//bonusPoint
	public double  getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint=bonusPoint;
	}
	//phone
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	//address
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	//information
	public String information() {
		return empNo + " , " + empName + " , " + dept + " , " + job + " , " + age + " , " + gender + " , " + salary + " , " + bonusPoint + " , " + phone + " , " + address ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
