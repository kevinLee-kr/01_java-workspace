package com.kh.chap02_abstractAndInterface.basic.model.vo;

public interface Basic {//클래스는 퍼블릭 클래스라고 떠있는데 여기는 퍼블릭 인터페이스라고 떠있음. 
	
	//추상클래스(abstrac calss) 일반 필드 + 일반 메소드 + 추상 메소드. 했지? 기억나지? 
	//인터페이스(interface) : 일반필드 절재 못넣음, 무조간 상수필드 + 추상 메소드밖에 못넣음.
	
	//private int a; --> 에러남
	//public void test() {	} <--일반 메서드 생성 못함
	//인터페이스에서 필드는 무조건 상수로 이루어진것만 됨.
	
	//상수 : public static final int NUM =10;  요런식. 값이 안바뀌는 FINAL을 쓴다.
	public static final int NUM = 10;
	public abstract void eat();
	public abstract void sleep();
	/*public abstract*/ void slepp(); //이런식으로 사용해도 기본적으로  public abstract 를 포함하고 있으므로 에러가 나지 않음.
	//인터페이스 는 추상단계에서 중요한 단계이다. 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
			

}
