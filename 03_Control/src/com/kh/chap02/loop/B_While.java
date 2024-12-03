package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*
	 * While(조건식){ 반복적으로 실행할 코드; }
	 * 
	 * 조건식이 true 일 경우 해당 코드 실행 합니다. 간단!^^ 조건식 검사 --> true일 경우 코드 실행 조건식 검사 --> true일
	 * 경우 코드 실행 조건식 검사 --> false발생, 코드 실행 x 반복문 탈출
	 * 
	 * for문과 많은 차이는 없지만, 변수값을 while 문 밖에서 확인이 가능하다.
	 */
	public void method1() { // '안녕' 5번 출력

		int i = 1;

		while (i <= 5) {

			System.out.println("안녕하세요" + i);
			i += 1;
		}

	}

	public void method2() { // 1 2 3 4 5

		int i = 1;

		while (i <= 5) {
			System.out.print(i + " ");
			i++;
		}

	}

	public void method3() { // 1에서부터 10사이의 숫자 출력. 홀수만 (if or while)

		int i = 1;

		while (i < 10) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			
			}
			i++;
		}
		/*
		 * while (i < 10) {
		 * 	System.out.print( i + " " );
		 * i+=2;
		 * }
		*/
		
		
		

	}

	public void method4() { // 1부터 랜덤값(1~100) 까지의 합계
		int random = (int)(Math.random() * 100 + 1);
		
		int sum = 0;
		
		int i = 1;
		
		while (i<=random) {
			sum +=i;
			i++;
		}
		System.out.println("1부터 " + random + "까지의 합계 : " + sum);
		
		
		
		
	}

	public void method5() { // 사용값(문자열)을 입력받아 인덱스별로 출력
		
		
		/*System.out.println("문자열의 길이 : " + str.length());
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" 문자를 적어주세요. : ");
		String str = sc.nextLine();
		
		
		System.out.println("문자열의 길이 " + str.length() + "입니다.");
		int i = 0;
		while (i < str.length()) {
			System.out.print(str.charAt(i));
			i++;	
		
		
		}
	}

}
