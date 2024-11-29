package com.kh.operator;

import java.util.Scanner;

public class D_Comparison {
		public void method1() {
			
			int a = 10;
			int b = 25;
			
			System.out.println("a == b : " + (a == b)); // false
			System.out.println("a <= b : " + (a <= b)); // true
		
			boolean result = ( a> b );
			System.out.println(result);
		
			// 산술연산 + 비교연산
			System.out.println((a * 20) >  ( b / 5));
			
			System.out.println("a가 짝수인가 : " + (a % 2 == 0));
			System.out.println("a가 홀수인가 : " + (a % 2 != 0));
			System.out.println("a가 홀수인가 : " + !(a % 2 == 0));
			}
		
		public void method2() {
			Scanner tada = new Scanner(System.in);
			
			System.out.println("첫 번쨰 정수 : " );
			int num1 = tada.nextInt();
			
			System.out.println("두 번쨰 정수 : " );
			int num2 = tada.nextInt();
			
			System.out.println("첫 번째 정수가 두번쨰보다 클까? : " + (num1 > num2));
			System.out.println("첫 번쨰 정수가 짝수 일까요? : " + (num1 % 2 ==0));
			System.out.println("두 번쨰 정수가 짝수 일까요? : " + (num2 % 2 ==0));
			
			
			
		}
		
		
}
