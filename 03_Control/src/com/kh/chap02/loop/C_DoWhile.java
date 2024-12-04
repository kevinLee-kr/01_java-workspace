package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	/*
	 * do - while문 [표현식] do {
	 * 
	 * 반복적으로 실행할 코드 ( 무조건 실행) while 과 차이점으로는 while은 조건이 맞을때 실행이 되는 반면 do while 은 무조건
	 * do 코드는 실행은 한다. 처음에 무조건 실행을 한다. - > 조건식 검사 -> true일 경우 실행 코드 실행 - > 조건식 검사 ->
	 * true 일 경우 실행 코드실행 - > 조건식 검사 -> false일 경우 실행 코드 실행 x -> 반복문 빠져나감
	 * 
	 * }while(조건식); 기존의 for / while 문과의 차이점 for / while 문 같은 경우에는 조건 검사 후에 true 여야만
	 * 수행을 했는데 do \-while 문은 조검 검사 없이도 무조건 한-번 은 수행한다는 것이다.
	 * 
	 */

	public void method1() { // 대놓고 false 조건 do-while 연습1
		int num1 = 0;
		do {
			System.out.println(num1);
		} while (false);
	}

	public void method2() { // 1 2 3 4 5
		int i = 1;
		do {
			System.out.println(i + " ");
			i += 1;
		} while (i <= 5);

	}

	public void method3() { // 1부터 사용자가 입력한 수까지의 총 합계(누적합)!
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num1 = sc.nextInt();
		
		int sum = 0 ;
		 int i = 1;
		 
		 do {
			 sum+= i;
			 i++;
		 }while(i<=num1);
		System.out.println("1부터 " + num1 + "까지의 총 합계 : " +sum );
	}
}
