package com.kh.variable;

public class C_Printf {

	public void printfTest() {
//		//System.out.print();
//		//System.out.println();
//		
////		System.out.println("안녕");
////		System.out.println("잘가");
//		
//		
//		int inum1=10;
//		int inum2=20;
//		
//		System.out.println(inum1 + " " + inum2);
//		System.out.printf("%d %d", inum1,inum2);
//		System.out.println("haha");
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f %f\n", dNum1, dNum2); //소수점 6째 자리까지 표현 가능
		System.out.printf("%.2f %f\n", dNum1, dNum2);
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s %s\n", ch, str, ch);
		System.out.printf("%C %S %S\n", ch, str, ch);
		
		
		
	}
	
}
