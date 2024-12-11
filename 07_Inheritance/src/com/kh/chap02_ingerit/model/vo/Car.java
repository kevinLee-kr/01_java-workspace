package com.kh.chap02_ingerit.model.vo;

public class Car extends Vehicle{

	private int tire;
	
	public Car() {
		
	}
	
	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		this.tire=tire;
	}
	
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire=tire;
	}
	
	public String information() {
		return super.information() +", tire : " + tire;
	}
	@Override
	public void howToMove() {
		System.out.println("홈스윗홈");
	}
	//이 딱지를 붙혀주면 아. 이 구문은 오버라이드가 붙어있구나 라고 알수 있다. 
	// override 라는 딱지를 붙혀주지 않으면, 변수 이름 입력시 오타가 나도 오류가 나지 않는다. 
	// 하지만 딱지가 붙어 있으면, 부모 클래스와 비교를 해서 만약 부모 클래스에 없는 출력기가 있다면, 오류로 개발자에게 알려주기 위한 용도로 쓰인다. 
	
}
