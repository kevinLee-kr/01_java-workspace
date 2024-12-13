package com.kh.chap02_abstractAndInterface.basic.model.vo;

public class Mother extends Person {

	private String babyBirth;

	public Mother() {
	}

	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}

	public String getbabyBirth() {
		return babyBirth;
	}

	public void setbabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	public String toString() {
		return super.toString() + ", babyBirth = " + babyBirth;
	}

	@Override
	public void eat() {
//밥먹으면 몸무게 증가. 
		super.setWeight(super.getWeight() + 10);
		// 건강도 10 감소
		super.setHealth(super.getHealth() - 10);
	}

	@Override
	public void sleep() {

		// 잠자면 건강도 20 증가.
		super.setHealth(super.getHealth() + 20);

	}

}
