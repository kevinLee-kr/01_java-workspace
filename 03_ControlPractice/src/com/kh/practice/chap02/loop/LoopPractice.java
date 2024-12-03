package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public void method1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int number = sc.nextInt();

		if (number < 0) {
			System.out.print("1이상의 숫자를 입력해주세요.");
		} else {
			for (int i = 1; i <= number; i++) {
				System.out.print(i + " ");
			}
		}

	}

	public void method3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();

		if (num1 < 1) {
			System.out.println("이상의 숫자를 입력하셔야 합니다.");
		} else {
			for (int i = num1; i > 0; i--) {
				System.out.print(i + " ");
			}

		}

	}

	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 한개를 입력해 주세요 :  ");
		int number = sc.nextInt();

		if (number >= 1) {
			int sum = 0;
			for (int i = 1; i <= number; i++) {
				sum += i;
				if(i == number) {
					System.out.printf(" %d = %d", i, sum);
				}else {
					System.out.printf(" %d +", i);
				}

			}
		} else {
			System.out.println("잘못 입력했습니다.");
		}

	}

	public void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번쨰 정수 한개를 입력해 주세요 :  ");
		int number1 = sc.nextInt();

		System.out.print("두 번쨰 정수 한개를 입력해 주세요 :  ");
		int number2 = sc.nextInt();

		if (number1 <= 0 || number2 <= 0) {// number1 number2 가 0보다 작을떄
			System.out.println("1 이상의 숫자를 입력해주세요.");

		} else if (number1 < number2) { // number1 이 더 큰수 일떄
			for (int i = number1; i <= number2; i++) {
				System.out.print(i + " ");
			}

		} else if (number1 > number2) { // number2 이 더 큰수 일떄
			for (int j = number2; j <= number1; j++) {
				System.out.print(j + " ");
			}
		} else { // 두 수가 같은 수일때
			System.out.println("잘못 입력 하셨습니다.");
		}

	}

	public void method8() {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 ^^ : ");
		int num1 = sc.nextInt();
		System.out.printf("====%d단====", num1);
		System.out.println("");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d", num1, i, num1 * i);
			System.out.println("");
		}

	}

	public void method9() {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int dan = sc.nextInt();

		if (dan <= 0 || dan >= 10) {
			System.out.println("1이상의 숫자 또는 9 이하의 숫자를 입력해주세요");
		} else {

			for (int i = dan; i <= 9; i++) {
				System.out.printf("===== %d단 =====", dan);
				System.out.println("");
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d x %d = %d", dan, j, dan * i);
					System.out.println("");
				}
				dan++;

			}

		}

	}

	public void method11() {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 ^^ : ");
		int num1 = sc.nextInt();
		System.out.print("공차를 입력해 주세요 ^^ : ");
		int num2 = sc.nextInt();

		int i = 0;
		while (i <10) {
			System.out.print(num1 + " ");
			i += 1;
			num1 +=num2;
		}
	}

	public void method13() {

		int star = 1;
		
		for(int j = 1; j <=4 ; j++) {
			for(int i = 1; i <=star; i++) {
				System.out.print('*');
			}
			System.out.println("");	
			star +=1;
		}
		
	}

	public void method14() {

		int star = 5;
		
		for(int j = 1; j <=4 ; j++) {
			for(int i = 2; i <=star; i++) {
				System.out.print('*');
			}
			System.out.println("");	
			star -= 1;
		}
	}

}
