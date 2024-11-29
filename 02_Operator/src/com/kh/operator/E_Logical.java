package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	public void method1() {
		
		//사용자가 입력한 정수값이 1부터 100사이의 값인지 확인. 
		
		Scanner pago = new Scanner(System.in);
				
		System.out.println("정수 하나 입력 해주세요 : " );
		int num1 = pago.nextInt();
		
		boolean result = (num1 >= 1) && (num1 <=100);
		//num1의 값이 1 이상이고 동시에 num1값이 100 이하인 경우. 
		
		System.out.println("사용자가 입력한 값이 1이상 100 이하입니까?: " + result);
		}
	
	public void method2() {
		//사용자가 입력한 문자 하나값이 영어 대문자인지 확인.
		// A ~ Z : 65 ~ 90
		
		Scanner papago = new Scanner(System.in);
		System.out.print("알파벳 하나만 적어주세요 : ");
		char num2 = papago.nextLine().charAt(0);
		
		boolean result = (num2 >= 65) && (num2 <= 90);
		
		System.out.println("입력하신 문자는 대문자 입니까? : " + result);
		papago.close();
	}

	public void method3() {
		//사용자에게 성별을 입력 받은 후 여자인지 확인하는 코드
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 골라주세요 : (M/F)");
		char gender = sc.nextLine().charAt(0);
		
		boolean result = (gender == 'F')||(gender == 'f');
		
		System.out.println("사용자가 여자 입니까? : " + result);
	}
	
	public void method4() {
		
		Scanner qq = new Scanner(System.in);
		System.out.println("계속 하시겠습니까? (Y/Y):");
		char request = qq.nextLine().charAt(0);
		
		boolean result = (request =='y') ||(request=='Y');
		
		System.out.println("계속 하시겠습니까? 당신의 의지 : " + result);
		}
	
	public void method5() {
		int num = 10;
		//boolean result1 = (num < 5) && (++num > 0);
		boolean result1 = (num > 5) && (++num > 0);
		
		
		System.out.println("result1 : " + result1);
		System.out.println("&& 연산 후의 num값 : " + num);
		
		int num2 = 10 ; 
		//boolean result2 = (num2 < 20) || (++num2 >0);
		boolean result2 = (num2 > 20) || (++num2 >0);

		System.out.println("result2 : " + result2);
		System.out.println("&& 연산 후의 num값 : " + num2);		
	}
	
	
	
}
