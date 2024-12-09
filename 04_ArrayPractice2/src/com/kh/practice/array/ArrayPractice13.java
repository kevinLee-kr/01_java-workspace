package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice13 {

	public void method13() {

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void method14() {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
			for (int j = 1; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		int temp = 0;
		// 오름차순 정렬
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length; j++) {
				if (lotto[j - 1] > lotto[j]) {
					temp = lotto[j - 1];
					lotto[j - 1] = lotto[j];
					lotto[j] = temp;
				}
			}
		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}

	}

	public void method16() {

		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를 입력하세요 : ");
		int arrsize = sc.nextInt();

		sc.nextLine();

		String[] arr1 = new String[arrsize];

		for (int i = 0; i < arr1.length; i++) {
			System.out.print((i + 1) + "번쨰 문자열 : ");
			arr1[i] = sc.nextLine();
		}

		while (true) {
			System.out.print("더 입력 하시겠습니까 : ");
			char yn = sc.nextLine().charAt(0);

			if (yn == 'y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int num = sc.nextInt();

				sc.nextLine();

				String[] arr2 = Arrays.copyOf(arr1, arr1.length + num);

				for (int i = arr1.length; i < arr2.length; i++) {
					System.out.print((i+1) + "번쨰 문자열 : 	");
					arr2[i] = sc.nextLine();
				}

				arr1 = arr2;
			} else {
				System.out.print("[");
				for (int i = 0; i < arr1.length; i++) {
					if (i == arr1.length - 1) {
						System.out.print(arr1[i] + "]");
					} else {
						System.out.print(arr1[i] + ",");
					}
				}

				break;
			}
		}

	}


}
