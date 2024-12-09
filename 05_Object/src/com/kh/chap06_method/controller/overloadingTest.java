package com.kh.chap06_method.controller;

public class overloadingTest {
	//오버로딩 : 한 클래스 내에 같은 메소드 명으로 정의 할 수 있는 것.
	
	public void test() {
		
	}
	
	public void tes() {
		
	}
	public void test(int a) {
		
	}
	
	public void test(int a, String s) {
		
	}
	public void test(String b, int w) {
		
	}
	public void test(int a, int b) {
		
	}
	//오버로딩. 이것이 가능할려면 매개변수 이름이 아니라 매개변수의 개수와 순서가 달라야 한다. 또한 자료형의 유형또한 달라야 한다. 
	public void test(String str) {
		
	}
	/*
	 * public int test(String str) {
	 * 
	 * } 반환형(int)또한 다르다고 해서 되는 것이 아니다. 위에 기술 하였듯이, 매개변수의 개수, 순서, 자료형의 유형 이 달라야 한다. (자료형의 유형이 같았다. )
	 */
	
	
}
