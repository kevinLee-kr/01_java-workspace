package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

public void inputTest4() {
		
		
		//영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요
		
		Scanner vs = new Scanner(System.in);
		
		System.out.println(" 문자열을 입력해 주시겠습니까? : " );
		
		String sentence = vs.nextLine();

		System.out.println("첫 번째 알바펫 : " + sentence.charAt(0));
		System.out.println("두 번째 알바펫 : " + sentence.charAt(1));
		System.out.println("세 번째 알바펫 : " + sentence.charAt(2));
		vs.close();
	}
	
	
	
}
