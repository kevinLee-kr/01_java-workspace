package com.kh.chap03_class.model.vo;

public class ProductTestMyself {

	// 필드

	private String pName1;
	private int price1;
	private String brand1;
	
	private String pName2;
	private int price2;
	private String brand2;
	
	private String pName3;
	private int price3;
	private String brand3;

	// 생성자

	// # Setting1
	// 매서드 - setting (끌고오기?)
	
	public void setpName1(String pNAME) {
		this.pName1 = pNAME;
	}

	public void setPrice1(int price) {
		this.price1 = price;
	}

	public void setBrand1(String brand) {
		this.brand1 = brand;
	}

	// getting1
	// getting(가져오기?)
	public String getpName1() {
		return pName1;
	}

	public int getPrice1() {
		return price1;
	}

	public String getBrand1() {
		return brand1;
	}

	// # Setting2=========================================
	// 매서드 - setting (끌고오기?)
	public void setpName2(String pNAME) {
		this.pName2 = pNAME;
	}

	public void setPrice2(int price) {
		this.price2 = price;
	}

	public void setBrand2(String brand) {
		this.brand2 = brand;
	}

	// getting2
	public String getpName2() {
		return pName2;
	}

	public int getPrice2() {
		return price2;
	}

	public String getBrand2() {
		return brand2;
	}

	// # Setting3==============================================
	public void setpName3(String pNAME) {
		this.pName3 = pNAME;
	}

	public void setPrice3(int price) {
		this.price3 = price;
	}

	public void setBrand3(String brand) {
		this.brand3 = brand;
	}

	// getting3
	public String getpName3() {
		return pName3;
	}

	public int getPrice3() {
		return price3;
	}

	public String getBrand3() {
		return brand3;
	}

}
