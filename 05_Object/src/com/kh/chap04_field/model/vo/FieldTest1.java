package com.kh.chap04_field.model.vo;

public class FieldTest1 {

	private int a;

	private int global;

	public void test(int num) {// test 메소드 영역 시작
		// 매게변수 : 일종의 지역변슈ㅜ, 즉 메소드 영역내에서만 쓸 수 있음

		// 지엮변수(메소드ㅜ 영역내에 선언) -> 지역변수에는 접근제한자 같은 거 붙이는거 아니다.

		int local = 10;
		// 멤버변수 -> 멤버변수는 해당 이 객체 생성시 jvm이 기본값으로 초기화.
		System.out.println(global);// 초기화가 안돼있음, 그런데도 오휴가 안남.. ㅅheap영역에 생성될 떄 초기화 되기 때문에 오류가 안난다.

		// 매게변수 출력-> 매개변수는 해당 이 메소드 호출시 반드시 값이 전달 될 것이기 때문에 초기화 안돼있어도 됨.
		System.out.println(num);// 이 파일만 보면 초기화가 안되어있지만 오류가 안남, 왜/ 사용자가 줄거니까,. 매개변수로 무조건 하는 넘겨야 하니까 값이 들어감.

		// 지역변수 출력
		System.out.println(local);// 초기화가 안되어있음. 이건 오류ㅜ가 발생.

	}// test 메소드 영역 끝

}
