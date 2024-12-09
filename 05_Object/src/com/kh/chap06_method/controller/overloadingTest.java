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
	 * 
	 * 
	 * 결론 : 
	 * 오버로딩이라 함은, 한 클래스내에 동일한 메소드들, 을 오버로딩 됬다 라고 하는데, 단, 4개의 변수 명, 아니면 접근제한자 가 다르면 어떨까요? 이런거 물어볼수도 있는데 반환형, 이런거 거 다 떠나서 매게변수의 자료형과 개수 순서가 다르게 작성되 있어야 아 오버로딩 된거구나 라고 이해가 되어준다. 누가? 컴퓨터가. 
	 */
	
	
}
