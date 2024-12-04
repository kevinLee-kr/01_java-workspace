package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Branch {

	public void method1() { // 랜덤값(1~100) 발생 시키고 그 랜덤값 출력 ( 이과정을 무한반복)//3의 배수일경우 stop.

		while (true) {
			int random = (int) (Math.random() * 100 + 1);
			System.out.println("randon 값 : " + random);
			if (random % 3 == 0) {
				break;
			}

		}

	}

	public void method2() { // 사용자에게 문자열 입력 받아 해당 그 문자열의 길이 출력 ( 이 과정을 매번 반복 )

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("문자열을 입력해주세요 : ");
			String sen = sc.nextLine();

			if (sen.equals("exit")) {
				System.out.println("프로그램을 종료합니다. ");
				break;
			} else {
				System.out.println("문자열의 길이 : " + sen.length());
			}
		}

	}

	public void method3() { // 사용자에게 단(2~9)을 입력받아 해당 단을 출력
		//혹시라도 잘못된 단을 입력 했을 경우 다시 단을 입력 받도록 유도
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("단(2~9)을 입력해주세요 : " );
			int dan = sc.nextInt();
			
			if(dan >= 2 && dan <= 9) { // 잘 입력 했을 경우 -> 해당 단을 출력 후 반복문 빠져나감.
				//해당 단 출력
				//반복문 빠져나감
				System.out.printf("===== %d단 =====", dan);
				for(int i =1;i<=9;i++) {
				
					System.out.printf("%d x %d = %d\n" , dan , i , dan * i);
				}
				break;
			}else {//잘못 입력했을 경우
				System.out.println("잘못 입력하셨습니다, 다시 입력해주세요 : " );
			}
		}
		
	}
}
