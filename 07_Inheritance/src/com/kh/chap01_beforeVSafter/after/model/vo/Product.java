package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product {

	//3 클래스 모두 공통적으로 가지고 있는 요소들(필드, 메소드)만을 기술
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	

	public Product() {
	}

	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		
	}
	//brand
	public void setBrand(String brand) 	{this.brand = brand;}
	public String getBrand() 			{return brand;}
	
	//pCode
	public void setpCode(String pCode) 	{this.pCode = pCode;}
	public String getpCode() 			{return pCode;}
	
	//pName
	public void setpName(String pName) 	{this.pName = pName;}
	public String getpName() 			{return pName;}
	
	//price
	public void setPrice(int price) 	{this.price = price;}
	public int getPrice() 				{return price;}
	
	public String information() {
		return "브랜드 : " + brand + "pCode : " + pCode +  " pName : " + pName +  "금액 : " + price;
	}
	
}
