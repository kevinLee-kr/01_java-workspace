package com.hw1.model.vo;

public class Student extends Person{
//필드 정의
	private int grade;
	private String major;
	
	//기본생성자
	public Student() { }
	//매개변수 생성자
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		super.name=name;
		this.grade=grade;
		this.major=major;
	}
	
	//grade
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	//major
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major=major;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+ ", grade = " + grade + ", major = " + major;
	}
	
	
	
}
