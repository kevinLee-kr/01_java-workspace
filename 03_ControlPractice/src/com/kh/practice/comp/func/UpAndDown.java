package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {

	public void method1() {

		int random = (int) (Math.random() * 100 + 1);

		System.out.println(random);

		Scanner sc = new Scanner(System.in);
		int j = 0;

		while (true) {
			System.out.print("1~100사이의 임의의 난수를 맞춰보세요 : ");
			int num = sc.nextInt();

			if (num <= 0 || num > 99) {
				System.out.print("1~100 사이의 숫자가 아닙니다. 다시.");
			} else if (num >= 1 && num <= 99) {
				if (num < random) {
					System.out.println("up!");
					j++;
				} else if (num > random) {
					System.out.println("down!");
					j++;
				} else {
					System.out.println("정답!!!");
					break;
				}}
			}
		sc.close();
		System.out.printf("%d회만에 맞추셨습니다... 대단한걸요? ", j);
	}
	
	}
