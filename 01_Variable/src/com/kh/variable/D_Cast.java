package com.kh.variable;

public class D_Cast {
	public void autoCasting() {
		int i1 = 12;
		double d1 = /*(double)*/i1;
		
		System.out.println(d1);
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result = i2+ d2;
		System.out.println(result);
		
		int i3 = 1000;
		long l3 = /*long*/ i3;
		
		float f4 = 1.0f;
		double d4 = /*double*/f4;
		
		long l5 = 10000000L;
		float f5 = /*(float)*/ l5;
		
		int num = 'd';
		System.out.println("num : " + num);
		
		char ch = 100;
		System.out.println("ch : " + ch);
		
		byte b1 = 1;
		byte b2 = 10;
		
		//byte b3 = b1 + b2; byte나 short끼리 연산시 무조건 int형으로 지정해줘야함.
		
	}
	
	public void forceCasting() {
		double d1 = 4.0;
		float f1 = (float)d1;
		
		int iNum = 10;
		double dNum = 5.89;
		
		int iNum1 = 10;
		double dNum1 = 5.89;
		int sum = (int)(iNum1 + dNum1);
		//or
		//int sum = iNum1 + (int)dNum1;
		System.out.println("sum : " + sum);
		
		//데이터 손실 테스트
		int iNum2 = 290;
		byte bNum2 = (byte)iNum2;
		
		System.out.println(bNum2);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
