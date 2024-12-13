package com.kh.chap02_abstractAndInterface.basic.model.vo;

public abstract class Person implements Basic{ //--> Person 이라는 사람은 Basic 을 구현할거야~ 라는 뜻 implements : 구현

	private String name;
	private double weight;
	private int health;

	public Person() {
	}

	public Person(String name, double weight, int health) {
		this.name = name;
		this.weight = weight;
		this.weight = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "name = " + name + ", weight = " + weight + ", health = " + health;
	}

	// 추상메서드
	// public abstract void eat();
	// public abstract void sleep();

}
