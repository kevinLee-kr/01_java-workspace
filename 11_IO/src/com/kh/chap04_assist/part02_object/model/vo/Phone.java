package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable {

	private String name;
	private int price;
	
	public Phone() {}

	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
	
	
	//alt + shift + s -> 기본 단축키
	
	
	
}
