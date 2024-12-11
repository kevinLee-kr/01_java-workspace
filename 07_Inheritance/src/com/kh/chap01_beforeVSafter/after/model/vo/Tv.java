package com.kh.chap01_beforeVSafter.after.model.vo;

public class Tv extends Product {

	private int inch;

	// 기본생성자
	public Tv() {
	}

	// 매개변수 생성자
	public Tv(String brand, String pCode, String PName, int price, int inch) {
		super(brand, pCode, PName, price);
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public String information() {
		return super.information() + ", inch : " + inch;
	}

}
