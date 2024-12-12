package com.hw2.model.vo;

public class Circle extends Point {

	private int radius;

	public Circle() {
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getradius() {
		return radius;
	}

	public void setradius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("면적 : " + (int) (3.14 * radius * radius));
		System.out.println("둘레 : " + (int) (3.14 * radius * 2));
	}

}
