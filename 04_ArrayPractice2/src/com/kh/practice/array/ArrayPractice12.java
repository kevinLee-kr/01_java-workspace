package com.kh.practice.array;

public class ArrayPractice12 {

	public void method12() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 15 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}
		// 정렬 = 버블 정렬이 좋다.
		int temp = 0; // 임시 공간을 만들어준다.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					j++;
				}
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

		System.out.println(" ");
		System.out.println(arr[0]);
		System.out.println(arr[9]);
	}
}
