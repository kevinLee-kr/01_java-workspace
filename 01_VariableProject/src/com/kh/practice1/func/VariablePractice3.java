package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	
	public void inputTest3() {
		System.out.println("계산을 도와드리겠습니다.");
		
		
		Scanner cv = new Scanner(System.in);
		System.out.println("가로값을 넣어주세요 : ");
		double width = cv.nextDouble();
		
		System.out.println("세로값을 넣어주세요 : ");
		double length = cv.nextDouble();
		
		System.out.println("면적은 " + (width * length));
		System.out.println("둘레는 " + (width + length)*2 + "입니다. :)");
		
		
	}
	
	
}
