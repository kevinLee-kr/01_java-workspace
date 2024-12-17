package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {

	private Scanner sc = new Scanner(System.in);

	public void method1() { // ArithmeticException
		// ArithmeticException
		System.out.println("첫번쨰 정수 : ");
		// ex) 10 <- 사용자 입력값
		int num1 = sc.nextInt();

		System.out.println("두번쨰 정수 : ");
		// ex) 0 <-- 사용자 입력값
		int num2 = sc.nextInt();
		/*
		 * //int result = num1 / num2; int result = 0; if(num2 !=0) { result = num1 /
		 * num2; }
		 * 
		 * System.out.println("안녕하세요, 반갑습니다. 계산결과를 알려드릴게요."); System.out.println("결과 : "
		 * + result);
		 */

		try {
			int result = num1 / num2;
			System.out.println("result : " + result);
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌수가 없습니다.");
			e.printStackTrace();
		}

		System.out.println("프로그램을 종료합니다.");

	}

	public void method2() { // NegativeArraySizeException
		// NegativeArraySizeException

		System.out.println("배열의 크기 : ");
		int size = sc.nextInt();
		/*
		 * int[] arr = new int[size];
		 * 
		 * System.out.println("100번 인덱스 값 : " + arr[100]);
		 * 
		 * if(size>=101) { int []arr = new int [size];
		 * System.out.println("100번 인덱스 값 : " + arr[100]); }
		 */

		try {
			int[] arr = new int[size];
			System.out.print("100번 인덱스 값 : " + arr[100]);
		} catch (NegativeArraySizeException e) {
			System.out.println("배열의 크기로 음수를 제시할 수 없습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스로 접근을 해버렸다. ");
		}
		System.out.println("프로그램을 종료합니다.");

	}

	public void method3() {       //RuntimeException e
		System.out.println("배열의 크기 : ");

		/*
		 * try {
		 * 
		 * int []arr = new int [size]; System.out.print("100번 인덱스 값 : " + arr[100]);
		 * }catch(NegativeArraySizeException e){
		 * System.out.println("배열의 크기로 음수를 제시할 수 없습니다.");
		 * }catch(ArrayIndexOutOfBoundsException e) {
		 * System.out.println("부적절한 인덱스로 접근을 해버렸다. "); }catch(InputMismatchException e)
		 * { System.out.println("정수만 입력 해주셔야 합니다."); }
		 */
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.print("100번 인덱스 값 : " + arr[100]);
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력 해주셔야 합니다.");
		} catch (RuntimeException e) {
			System.out.println("에러가 발생되긴 했는데. 정확히 뭔진 모르겠음.");
		}

		System.out.println("프로그램을 종료합니다.");

	}

}
