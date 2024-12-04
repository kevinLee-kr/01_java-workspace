package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {

	public void practice1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 ^^ : ");
		int num1 = sc.nextInt();
		String a = "수";
		String b = "박";

		if (num1 <= 0) {
			System.out.println("양수가 아닙니다. 다시.");
		} else {
			for (int i = 1; i <= num1; i++) {
				if (i % 2 == 0) {
					System.out.print(a);
				} else {
					System.out.print(b + " ");

				}

			}
		}

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		String a = "수";
		String b = "박";

		while (true) {
			System.out.print("정수를 입력해주세요 ^^ : ");
			int num1 = sc.nextInt();
			if (num1 <= 0) {
				System.out.println("양수가 아닙니다. 다시.");
			} else {
				for (int i = 1; i <= num1; i++) {
					if (i % 2 == 0) {
						System.out.print(a);
					} else {
						System.out.print(b + " ");

					}

				}
			}
			System.out.println(" ");
			sc.close();
		}
		
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("좋아하시는 과일이 무엇 입니까? : ");
		String fruit = sc.nextLine();

		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);

		int count = 0;

		for (int i = 0; i < fruit.length(); i++) {
			if (fruit.charAt(i) == ch) {
				count++;
			}

		}
		System.out.printf("%s 안에 포함된 %c 개수 : %d", fruit, ch, count);

	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("좋아하시는 과일이 무엇 입니까? : "); // 문자열 질문 및 정보수집
			String fruit = sc.nextLine();

			System.out.print("문자 : ");
			char ch = sc.nextLine().charAt(0);

			int count = 0; // 문자열 길이 측정용

			for (int i = 0; i < fruit.length(); i++) {
				if (fruit.charAt(i) == ch) { // 문자열, 문자가 같을때 count 변수 +1
					count++;
				}
			}
			System.out.printf("%s 안에 포함된 %c 개수 : %d", fruit, ch, count);
			System.out.println(" ");
			System.out.println("더 하시겠습니까? (y/n)");
			char answer = sc.nextLine().charAt(0); // 더 하시겠습니까? 정보 수집 answer
			if (answer == 'n' || answer == 'N') {
				System.out.println("프로그램을 종료합니다. 감사합니다.");
				break;
			} else if (answer == 'y' || answer == 'Y') {
				System.out.println(" ");
			} else {
				System.out.println("잘못입력하셨습니다.");
				System.out.println(" ");
			}

		}

	}

}
