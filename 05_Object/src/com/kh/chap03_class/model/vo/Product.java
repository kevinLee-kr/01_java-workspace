package com.kh.chap03_class.model.vo;

public class Product {

	
	///필드
	// 필드 == 멤버 변수 \\ 인트턴스 변수
	
	// [표현법]
	//접근법, 
	private String pName;
	private int price;
	private String brand;
	
	/*
	생성자
	객체를 생성하기 위한 일종의 메서드
	
	[표현법]
	접근제한자 클래스명 (){매게변수, 매개변수, .Product.class.]){

	}
	*/
	
	//기본생성자 && 접근제한자) jvm이 자동으로 만들어줌
	public Product() {
		
	}
	//매개변수 생성자를 만들어보자. 
	//[표현법]	
			//접근제한자 클래스면 () {매개변수, 매개변수}
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	//내가 생각할 때 유용할 것 같은 메소드도 자유롭게 생성 가능
	
	//모든 필드값을 다 합친하나의 문자열을 반홚재ㅜ는 메소드
	//
	public String infomation() {
		//return pName, price, brand; return은 하나만됨 그리고 반환형도 하나의 유형만 됨
		return "pName  : " + pName + ", price: " + price + " brand" + brand;
	}
	
	
	
	
	/*
	메소드
	기능을 처리하는 담당
	[표현법]
			접근 제한자 반환형 메소드명 () {
	}
	*/
	
	
	public void setName(String pName) {
		this.pName=pName;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	
	
	
	
	
}
