package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {

		Book bk1 = new Book("수학의정석", "이호석", 21);
		Book bk2 = new Book("감정은 내맘을 지나가는 나그네일뿐이다.", "석가모니", 15000);

		System.out.println(bk1.toString());//붙히나 안붙히나 똑같은 결과인데 이말은 언제나 붙어있는거라고 생각해도 된다. 
		/*
		//출력문에 레퍼런스(주소값을 담고있는 객체)(bk1,bk2)를 출력하고자 할떄
		//jvm이 자동으로 해당 레퍼런스 이름.toString 메서드를 호출을 한다. 어디서? object에서. 
		//
		 * 오버라이딩 전 : object 클래스의 toString() 실행 -> 풀 클래스명 @ + 객체의 해쉬코드의 16진수 값 리턴
		 * 오버라이딩 후 : book클래스의 toString()실행 -> 해당 객체가 가지고 있는 모든 필드값을 한 무장으로 리턴.
		 * 그래서 앞으로 information은 만들지 않을것이고 override 을 이용한 toString 을 만들것이다. 왜? run파일에서 그냥
		 * information처럼 직접 치는것이 아닌 그냥 객체 이름만 치면 되니까. 편하자나.
	*/
	
	
	
	
	
	
	
	
	}


}
