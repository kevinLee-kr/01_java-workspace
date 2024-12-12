package com.hw2.model.vo;

public class Point {

	private int x;
	private int y;

	// 기본생성자
	public Point() {}

	// 매개변수 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// x getter setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	// y getter setter
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


	public void draw() {
		System.out.println("x : " + x + "\ny : " + y);
		
	}

}
