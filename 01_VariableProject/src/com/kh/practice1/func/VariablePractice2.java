package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public void inputTest2() {
		Scanner xc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력해주세요 : ");
		int first = xc.nextInt();
		
		System.out.println("두 번쨰 정수를 입력해주세요 : ");
		int second = xc.nextInt();
		
//		System.out.println(" 더하기 결과 : " + (first + second));
//		System.out.println(" 뺴기 결과:  " + (first - second));
//		System.out.println(" 곱하기 결과 : " + (first * second));
//		System.out.println(" 나누기 결과 : " + (first / second));
//		System.out.println("이상입니다. 감사합니다.");
//	
		System.out.printf("더하기 결과 : %d\n 빼기 결과 : %d\n 곱하기결과 : %d\n 나누기결과 : %d\n 이상입니다. 감사합니다.",(first + second), (first - second), (first * second) , (first / second));
		
	}
	
	
	
}
