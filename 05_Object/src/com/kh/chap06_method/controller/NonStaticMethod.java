package com.kh.chap06_method.controller;

public class NonStaticMethod {

	/*
	 * 메소드 1209 마지막 단계. //메소드에서는 2가지 유형이 있는데 //1. static 메소드 //2. non-static 메소드 한
	 * 기능을 처리하기 위한 용도.
	 * 
	 * 패키지명 : 모두 소문자로 시작한다. 클래스명 : 모두 대문자로 시작한다. 변수명 : 모두 소문자로 시작한다. 메소드명 : 모두 소문자로
	 * 시작한다. 결론적으로 클래스 빼고는 모두 소문자로 시작한다. 공통 : 낙타 표기법(camel case) 선생님이 4~5번쨰 반복적으로
	 * 강조중이신데 가동성에 많이 중요한가보다. 꼭 지키자.
	 * 
	 * [표현법] 접근제한자 반환형 (반환할 겂의 자료형) 메소드명([매개변수1, 매개변수2...]){ 수행내용; [return 결과값;] }
	 * 
	 * 유형1. 매개변수 없고 반환값도 없는 메소드.
	 */
	public void method1() {
		// void - 반환값, 매개변수둘다 없는 메소드이다. 다른말로, 반환할 값이 없어야 한다.
		System.out.println("반환값, 매개변수 둘다 없는 메소드이다. ");
	}

	// 유형2. 매개변수 없고 반환값은 있는 메소드.
	public String method2() {
		System.out.println("매개변수는 없고, 반환값은 있는 값 입니다.");
		return "아.. 집에가고싶다..";
	}

	// 유형3. 매개변수 있고, 반환값은 없는 메소드.
	public void method3(int num1, int num2) {
		System.out.println("매개변수 있고, 반환변수 없는 메소드입니다. ");

		if (num2 != 0) {
			System.out.println("num1 / num2 : " + (num1 / num2));
		} else {
			System.out.println("0으로는 나눌 수 없습니다.");
		}

		// 유형 4. 매개변수도 있고, 반환값도 있는 메소드.
		// 문자열 하나, 정수값하나 전잘받아 해당 문자열의 해당 정수 인덱스의 문자값을 뽑아서 반환.
		// kiwi라는 문자열이 저장되어 있고,
		// 3이라는 값을 입력 받았을때, 'w'가 나오게 하는 코드

	}

	public char method4(String str, int index) {
		System.out.println("매개변수와 반환값 둘 다 있는 메소드 입니다.");
		if (index >= 0 && index < str.length()) {
			return str.charAt(index);
		} else {
			return ' ';
		}

	}

}
