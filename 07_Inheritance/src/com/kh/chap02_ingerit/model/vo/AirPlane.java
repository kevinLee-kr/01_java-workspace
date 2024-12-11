package com.kh.chap02_ingerit.model.vo;

public class AirPlane extends Vehicle {

	private int tire;
	private int wing;
	
	
	public AirPlane() {}
	public AirPlane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire=tire;
		this.wing =wing;
	}
	
	
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire=tire;
	}
	
	public int getWing() {
		return wing;
		
	}
	public void setWing(int wing) {
		this.wing=wing;
	}
	
	public String information() {
		return super.information() + ", tire = " + tire + ", wing = " + wing;
		
	}
	
	public void howToMove() {
		System.out.println("지드래곤 태양 대성 예 ");
	}
	
	
}
