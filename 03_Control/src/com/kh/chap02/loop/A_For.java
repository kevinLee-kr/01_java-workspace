package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	/*
	 * 반복문 어떤 실행 코드를 반복적으로 수행시켜줌. 크게 두 종류로 나뉜다. 'FOR', 'WHILE' 얘네다.
	 * 
	 * [표현법] for(초기식;조건식;증감식){ } //반복횟수를 정해줄 두기 위해 제시된 것들. 반복적으로 실행시키고자 하는 구문; 초기식 :
	 * 반복문이 수행이 될때 초기 단 한번만 실행되는 구문. 변수 선언 및 초기화 하는데 사용된다. 조건식 : 반복문이 수행될 조건 을 작성하는
	 * 구문.조건식이 true일겨우 실행. 조건식 false가 되는 순간 반복을 멈춤.
	 * 
	 * 증감식 : 반복문을 제어하는 변수 값을 증감 시키는 구문.(보통 초기식에 제시된 변수를 가지고 증감 연산자(++ -- )를 사용함)
	 * 
	 */

	public void method1() {// for 문 연슫1

		for (int i = 1; i <= 10; i++) {

			System.out.println("하이" + i);

		}

		for (int i = 0; i <= 4; i++) { // 매번 1씩 증가하는 반복문 수행처리.
		}

		for (int i = 11; i <= 15; i++) {
			System.out.println("예" + i);
		}
		for (int i = 1; i <= 9; i += 2) {// i값이 1에서 9까지 매번 2씩 증가하는 동안 반복문 수행
			System.out.println(" 할로 " + i);
		}

	}

	public void method2() {// for 문 연슫2

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		for (int i = 1; i <= 5; i++) {
			System.out.print(i);
			System.out.print(" ");
		}

	}

	public void method3() { // for 문 연슫3

		for (int i = 5; i >= 1; i--) {
			System.out.println(i + " ");
		}

	}

	public void method4() { // 1부터 10까지 홀수만을 출력
		// 1부터 10까지 홀수만을 출력
		// 1 3 5 7 9

		/*
		 * for(int i =1 ; i<=9 ; i+=2) { System.out.println(i); }
		 */

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " ");
			}
		}

	}

	public void method5() { // 1 2 3 4 5 6 7 8 9 10 for문 고정
		// 1 2 3 4 5 6 7 8 9 10 for문 고정

		for (int i = 0; i <= 9; i++) {
			System.out.print((i + 1) + " ");
		}

	}

	public void method6() { // 누적합이다
		// sum변수에 누적해서 합산하는 과정이 반복적으로 진행됨.
		// 단, 누적해서 더하고자 하는 값이 1에서부터 10까지 1씩 증가하는걸 파악할 수 있음.

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;// 누적합이다. 지금은 좀 이해가 안될지 몰라도. 외우기만 해도 좋음
		}
		System.out.println("1부터 10까지의 합." + sum);
	}

	public void method7() { // 1부터 사용자에게 받은 값까지 합 출력
		// 1부터 사용자에게 받은 값까지 합 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력해주세요 : ");
		int number = sc.nextInt();

		if (number >= 1) {
			int sum = 0;
			for (int i = 1; i <= number; i++) {
				sum += i;
			}
			System.out.println("1부터 " + number + "까지의 합계 : " + sum);
		} else {
			System.out.println("잘못 입력했습니다.");
		}

	}

	public void method8() { // 랜던값
		// 1에서부터 어떤 랜덤값 까지의 총 합계

		/*
		 * java.lang.Math 클래스가 존재 하는데 여기서 제공하는 random 이라는 메소드가 있다. 매번 다른 랜덤값을 얻어낼 수 있다.
		 */

		// int random = Math.random(); random클래스는 더블형이라 int 형을 주면 오류난다.

		int random = (int) (Math.random() * 10 + 1);
		System.out.println("1~10사이의 랜덤값 : " + random);

		int sum = 0;
		for (int i = 1; i <= random; i++) {
			sum += i;
		}

		System.out.println("1부터  " + random + " 까지의 합계 : " + sum);

	}

	public void method9() { // 인덱스별 문자 출력
		String str = "Hello";

		// 각 인덱스 별로 문자를 뽑아서 출력
		/*
		 * 0번 인덱스 부터 4번 인덱스 까지 ( 마지막 덱스) 까지 매번 1씩 증가하면서 반복 숭\수행 하라.
		 * 
		 * 
		 */

		for (int i = 0; i <= 4; i++) {
			System.out.println(str.charAt(i));
		}

	}

	public void method10() { // 사용값(문자열)을 입력받아 인덱스별로 출력{
		// 사용자에게 문자열을 입력 받아서 인덱스 별로 출력

		Scanner sc = new Scanner(System.in);

		System.out.println("문자열 입력 :");
		String str = sc.nextLine();

		// apple의 길이 : 5글자
		// 01234
		// strawberry : 10rmfwk
		// 0123456789
		// kiwi : 4글자
		// 0123

		// 아하 마지막 인덱스는 항상 (문자열의 길이 -1)이구나

		System.out.println("문자열의 길이 : " + str.length());
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public void method11() { // 구구단 2단 출력

		for (int i = 1; i <= 10; i++) {
			// System.out.println("2 x " + i + " = " + 2 * i);
			System.out.printf("%d x %d = %d\n", 2, i, 2 * i);
		}

	}

	public void method12() { // 사용자에게 단을 입력 받아 구구단 출력

		// int dan;, 2~9사이의 정수를 입력 -> 가이드문구
		// 만일, 다른 숫자를 입력했을경우, 메세지 출력.

		Scanner sc = new Scanner(System.in);
		System.out.print(" 정수를 입력해주세요 : ");
		int dan = sc.nextInt();

		System.out.println("입력하신 " + dan + "단을 출력합니다.");
		if (dan >= 2 && dan <= 9) {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			}
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		System.out.println("고생하셨습니다.");

	}

	public void method13() { // 랜덤을 이용한 구구단

		// 2~9사이에 랜덤단 출력하기.
		int dan = (int) (Math.random() * 8 + 2);
		// 0.0 <= *** <1.0 사이의 값으로 정해진다. 기준이 그렇다. * 8 하자
		// 0.0 <= *** <8.0 + 2를 하자
		// 2.0 <= *** 10.0 int 형으로 변환하자
		// 2 <= *** 10
		// math.random 를 쓰고 + 2(시작수를 2로 하고) * 8 ( 8개의 값을 원한다.)

		System.out.println("======= " + dan + " 단  ========");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}

	}

	public void method14() { // 1 2 3 4 5 반복문

		for (int j = 1; j <= 3; j++) {
			for (int i = 1; i <= 5; i++) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}

	}

	public void method15() { // ****

		for (int j = 1; j < 5; j++) {

			for (int i = 1; i <= 4; i++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

	public void method16() { // 별 사이에 숫자 끼워넣기.

		// 1***
		// *2**
		// **3*
		// ***4

		for (int j = 1; j < 5; j++) {

			for (int i = 1; i <= 4; i++) {
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}

	}

	public void method17() { // 2단부터 9단까지 출력

		for (int i = 2; i < 10; i++) {
			System.out.println("v== == " + (i) + "단 == ==v");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
		}

	}

	public void method18() {
		//조건식 자리에 ( ; ; ) 식으로 비워 놓으면 기본적으로 true 이다.무한 반복하게 된다.
	}
}
