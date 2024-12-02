package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {

	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력해주세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다..!");
		}
		if(num <= 0) {
			System.out.println("양수가 아니다..!");
		}
		
		
		
		
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력해주세요 : ");
		int num = sc.nextInt();
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력해주세요 : ");
		int num = sc.nextInt();
		
		
		if(num>0) {
			System.out.println("양수다.");
		}else if(num==0) {
			System.out.println("0이다.");
		}else if(num<0) {
			System.out.println("음수다");
		}else {
			System.out.println("흠");
		}
		
		
	}
	
	public void method4() {
		//사용자에게 나이를 입력 받아 어린이 청소년 성인
		//13세 이하 : 어린이
		//13세 초과 19세 이하 : 청소년
		//19세 초과 : 성인
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 적어주세요 : ");	
		int age = sc.nextInt();
		
		String result = "";
		
		
		if (age <=13) {
			System.out.println("어린이 입니다.");
		}else if(age<=19) {
			System.out.println("청소년입니다.");
		}else {
			System.out.println("성인입니다.");
		}
		
		
	}

	public void method5() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 적어주세요 : ");	
		String name = sc.nextLine();
		
		System.out.println(" 성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		String result = "";//변수 설정시 초기화를 꼭 해두자!
		
		if(gender=='M'|| gender=='m') {
			result = "님은 남학생이다.";
		}else if(gender =='f' || gender =='F'){
			result = "님은 여학생입니다.";
		}else {
			System.out.println("성별을 잘못 입력하셨습니다.");
			return; //나를 호출했던 곳으로 돌아감.
		}
		
		System.out.println(name + "님은 " + result + "입니다.");
		
		
		
		
		
	}

	public void method6() {
		//특이 케이스
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력 : ");
		String name = sc.nextLine();
		
		/*
		if (name =="차은우") {
			System.out.println("차은우님 반갑습니다.");			
		}else {
			System.out.println("아");
		}
		*/
		/*
		 * 기본자료형 : boolean, byte, short, int, long
		 * 참조기료형 : String
		 * 
		 *  기본자료형들 끼리 동등 비교시 == 혹은 != 을 사용하는게 일반적인데, 왜냐면 정상적으로 비교가 걍 되어비리니까. 
		 *  단, 참조 자료형 이놈은 동등 비교를 할때 ==, != 를 쓸수가 없다. 정상비교가 안되버린다 이말이야. 
		 * 그럼 어떻게 비교 하느냐, 특이한 메서드를 제공을 한다 그래서, equals () 라는건데 이 것을 통해서 비교를 해야한다. 
		 * 변수가 있을거 아니냐, 문자열 이겠지? 거기에 .equals 를 사용할 수 있다. 
		 * 
		 */
		if(name.equals("차은우")) {
			System.out.println("차은우님..");
		}else {
			System.out.println("아");
		}
		
		
		
		
		
	}

	public void method7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 (양수만) : ");
		int number1 = sc.nextInt();
		
		if ( number1 > 0) { 
			if(number1 % 2 ==0) {
				System.out.println("짝수 입니다.");
			}else {
				System.out.println("홀수 입니다.");
			}
		}else {
			System.out.println("양수가 아닙니다. 잘못 입력 하셨습니다.");
			
		}
		
		
		
	}



}
