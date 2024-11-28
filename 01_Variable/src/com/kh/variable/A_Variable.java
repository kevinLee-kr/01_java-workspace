package com.kh.variable;

public class A_Variable {
	public void printVariable() {
		System.out.println("===== 변수 사용전=====");
		
		System.out.println("시급 : 9450원");
		System.out.println("근무 시간: 6시간");
		System.out.println("근무 일수 : 8일");
		
		System.out.println("차은우 : "+ (9450 * 6 * 8) + "원 입니다.");
		System.out.println("장원영 : "+ (9450 * 6 * 8) + "원 입니다.");
		System.out.println("카리나 : "+ (9450 * 6 * 8) + "원 입니다.");
		
		System.out.println("=====변수 사용 후=====");
		
		int pay = 9450;//자바에서의 equal 기호는 동등하다 기호가 아니다.
		int time = 6;
		int day = 8;
		
		System.out.println("차은우 : "+ (pay * time * day) + "원 입니다.");
		System.out.println("장원영 : "+ (pay * time * day) + "원 입니다.");
		System.out.println("카리나 : "+ (pay * time * day) + "원 입니다.");
		
		/* 변수를 사용하는 이유
		 * 1. 변수는 우선적으로 값에 의미를 부여할 목적으로 쓴다.(가독성을 위해)
		 * 2. 단 한번 값을 기록하고 필요할때마다 가져다 쓰는 목적으로 쓴다.
		 * 3. 유지보수를 보다 쉽게 할 수 있다.
		 */
		
	}
	public void decleareVariable() {
			/*
			 * 변수의 선언 = 변수를 만든다.
			 * 값을 기록하기 위한 변수를 메모리 공간에 확보, 할당한다.
			 * => 즉, 값을 보관하기 위한 상자를 만들겠다.
			 * 
			 * [표현법] 자료형 변수형.
			 * 
			 * 자료형 - 지금내가 갖고자 하는 내용이 숫자냐, 문자냐, 
			 * 	- 변수의 크기 및 모양을 지정해주는 부분.
			 * 변수형 - 변수의 이름을 붙혀준다. 
			 * 
			 * 자료형에 대한 개념
			 * 1. 논리형(논리값 true or false)
			 */
			boolean isTrue;
			boolean isFalse = false;
			System.out.println("isflase 의 값은?" + isFalse);		
			
			isTrue = true;
			System.out.println("isTrue 의 값은? :" + isTrue);
			
			
			 			// 2. 숫자형
			 // 2-1. 정수형(소수점x)
			 byte bNum = 3; //1byte (-128 ~ 127)
			 short sNum = 8; //2byte
			 int iNum = 100; //10000 4byte
			 long lNum= 99999; //100000L 8byte
			 // 2-2. 실수형(소수점o)
			 float fNum= 0.15f; //0.0f 4byte
			 			// float의 경우 double과 값을 구분하기 위해 f를 붙힌다.
			 double dNum = 0.15; // 0.5 8byte
			
			 			// 3. 문자형
			 //3-1 문자(한글자)
			 char ch ='a'; //2byte 홀따음표
			 
			 //3-2 열(여러글자)
			 String str; //참조형
			 str = "ABC";
			 
			 System.out.println(isTrue);
			 System.out.println(dNum);
			 
			 //변수 이름 : 값의 형태로 출력하고 싶다. ㅠㅠ
			 
			 System.out.println("bNum : " + bNum);
			 System.out.println("sNum : " + sNum);
			 System.out.println("iNum : " + iNum);
			 System.out.println("lNum : " + lNum);
			 System.out.println("fNum : " + fNum);
			 System.out.println("dNum : " + dNum);
			 
			 
			 //상수의 선언.
			 //[표현법] final 자료형 변수명 (대문자) 상수는 한번 초기화 되면 값 변동이 불가피하다.
			 final int age = 99999;
			  System.out.println("age : " + age);
			  // 선생님..상수는 언제 쓰이나요? 바뀌지 않는 값이 있을까요? 왜 쓰나요?
			  // 가령 파이 같이 정해져 있는 값들을 위해 사용된단다.
			  
			  //변수의 규칙
			  // 1. 변수는 유니크해야한다. 
			  // 2. 예약어 안된다 true, class, static, public
			  //3. 숫자 사용 가능(단, 숫자로 시작하는거 안됨.)
			  // 4. 특수문자 사용가능 $ _ 이외에는 사용 불가
			  
			  //권장사항.
			  // 카멜표기법
			  // 한글 사용 굳이 하지 말자
			  
			  
	}
}
