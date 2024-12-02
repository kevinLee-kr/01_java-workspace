package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	/*
	 * switch문도 if문과 동일하게 조건문임
	 * 
	 * 다만 if문과의 차이점 이라면. if 문은 조건식을 자유롭게 기술 가능 switch문은 동등 비교 밖에 수행 되지 않음. switch
	 * 매서드는 자기가 혼자 못 빠져나와. 손수break 라는 기능으로 빼와야한다. 아니면 break가 없는 case가 전부 실행된다.
	 * 
	 * [표현법] switch(동등비교할 대상) { 
	 * case 값1 : 
	 * 	실행코드 ; 
	 * 	break;
	 * 
	 * case 값2 : 
	 * 	실행코드 ; 
	 * 
	 * ... 
	 * default : 위의 값들과 모두 일치하지 않을 경우 실행할 콛.; ㅣ-> if문에서 else 문과
	 * 같은 기능. }
	 */
	public void method1() {

		

		/*
		 * 정수를 입력받아 1일 경우 빨간색입니다. 2일 경우 파란색입니다. 3일 경우 초록색입니다.
		 * 
		 * 잘못 입력했을때 "잘못 입력하셨습니다."
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		int number1 = sc.nextInt();

		switch (number1) {
		case 1:
			System.out.print("빨간핑");
			break;
		case 2:
			System.out.print("파란핑");
			break;
		case 3:
			System.out.print("초록핑");
			break;
		default:
			System.out.print("너 실수핑");
		}

	}

	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("구매하고자 하는 과일(사과, 바나나, 복숭아) 입력 : ");
		String fruit = sc.nextLine();

		int price = 0;
		
		switch(fruit) {
		case "사과":
			price = 1000;
			
			break;
			
		case "바나나":
			price=2000;
			break;
			
		case "복숭아":
			price=3000;
			break;
			
		default :
			System.out.print("품절핑");
			return;
		}
		
		System.out.printf("입력해주신 %s의 가격은 %d원 입니다. 감사합니다.", fruit, price);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

	public void method3() {
		//등급별 권한
		//등급 (정수)
		
		//1. 관리권한, 글쓰기 권한, 읽기권한
		//2. 글쓰기권한, 읽기권한
		//3. 읽기권한.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("등급입력을 해주십시오.(숫자) : ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			 System.out.println("관리권한"); ;
			break;
		case 2:
			 System.out.println("글쓰기권한"); ;
			break;
		case 3:
			 System.out.println("읽기권한"); ;
			break;
		default:
			 System.out.println("회원가입을 해주십시오."); ;
			return;
		}
	
		
		
		
		
		
	}
		
	public void method4() {
		//월을 입력받아 월의 마지막 날짜 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1월부터 12월까지 하나의 달을 고르시오. : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 :
		case 3 : 
		case 5 :
		case 7 :
		case 8 :
		case 10: 
		case 12: 
			System.out.printf("%s은 31일 까지 입니다.", month);break;
		
		case 4 :
		case 6 :
		case 9 :
		case 11:
			System.out.printf("%s월은 30일 까지 입니다.", month);break;
		default:
			System.out.println("반드시 1월부터 12월까지 입력 해주셔야 합니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	}

