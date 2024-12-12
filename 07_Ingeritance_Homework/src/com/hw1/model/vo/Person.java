package com.hw1.model.vo;

public class Person {
	//필드 정의
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	//기본 생성자
	public Person() {	}
	//매개변수 생성자
	public Person(int age, double height, double weight) {
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	//age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	//height
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	
	//weight
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	
	@Override
	public String toString() {
		return "name = " + name + ", age = " + age +", height = " + height + ", weight = " + weight;
	}
	
	
	
	
	
}
