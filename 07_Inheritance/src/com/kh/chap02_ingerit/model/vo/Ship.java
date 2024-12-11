package com.kh.chap02_ingerit.model.vo;

public class Ship extends Vehicle{
	private int propeller;
	
	public Ship() {	}
	public Ship(String name, double mileage, String kind, int propeller) {
		super(name, mileage, kind);
		this.propeller=propeller;
	}
	
	
	public int getProPeller() {
		return propeller;
	}
	public void setProPeller(int propeller) {
		this.propeller=propeller;

	}
	
	public String information() {
		return super.information() + ", propeller : " + propeller;
	}
	
	public void howToMove() {
		System.out.println("빅뱅 ");
	}
	
	
}
