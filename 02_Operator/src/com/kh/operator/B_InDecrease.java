package com.kh.operator;

public class B_InDecrease {

	public void method2() {
		int num1 = 10;
		System.out.println("전위연산 적용 전 num1의 값 : " + num1);
		
		System.out.println("1회 수행 후 결과 : " + ++num1);
		System.out.println("2회 수행 후 결과 : " + ++num1);
		
		System.out.println("=====================");
		
		int num2 = 10;
		
		System.out.println("후위 연산 적용 전 num2의 값 : " + num2);
		System.out.println("1회 수행 후 결과 : " + num2++);
		System.out.println("2회 수행 후 결과 : " + num2++);
		
		
		int a = 10;
		int b = ++a;
		
		System.out.printf("a : %d, b : %d\n", a,b);
		
		int c = 10;
		int d = c++;
		
		System.out.printf("c : %d, d : %d\n", c,d);
		
		int num3 = 20;
		System.out.println("현재 num3 : " + num3);	//20
		System.out.println("++num은 ? : " + ++num3);	//21
		System.out.println("num++은 ? : " + num3++); //21
		System.out.println("--num은 ? : " + --num3); //21
		System.out.println("num--은 ? : " + num3--); //21(20)
	}
	public void method3() {
		int num1 = 20;
		int result1 = ++num1*3;
		System.out.printf("num1 : %d, result1 : %d\n", num1, result1);
	
		int num2 = 20;
		int result2 = num2++ * 3;
		System.out.printf("num2 : %d, result2 : %d\n", num2, result2);
	}
		public void method4() {
			int a = 10;
			int b = 20;
			int c = 30;
			
			System.out.println(a++);
			System.out.println((++a) + (b++));
			System.out.println((a++) + (--b) + (--c));
			System.out.printf("a : %d, b : %d, c : %d", a,b,c);	
	}
}
