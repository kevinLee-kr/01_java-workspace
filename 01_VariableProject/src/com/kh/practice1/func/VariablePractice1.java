package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	
	public void inputTest1(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		
		System.out.print("성별을 입력하세요(남/여) : ");
		String gender = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		
		System.out.println("키" + height + "cm인 " + age + "살 " + gender + "자 " + name + " 반갑습니다^^");
	}
	
	public void inputTest2() {
		Scanner xc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력해주세요 : ");
		int first = xc.nextInt();
		
		System.out.println("두 번쨰 정수를 입력해주세요 : ");
		int second = xc.nextInt();
		
		System.out.println(" 더하기 결과 : " + (first + second));
		System.out.println(" 뺴기 결과:  " + (first - second));
		System.out.println(" 곱하기 결과 : " + (first * second));
		System.out.println(" 나누기 결과 : " + (first / second));
		System.out.println("이상입니다. 감사합니다.");
	
		
		
	}
	
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
	
	public void inputTest4() {
		
		
		//영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요
		
		Scanner vs = new Scanner(System.in);
		
		System.out.println(" 문자열을 입력해 주시겠습니까? : " );
		
		String sentence = vs.nextLine();

		System.out.println("첫 번째 알바펫 : " + sentence.charAt(0));
		System.out.println("두 번째 알바펫 : " + sentence.charAt(1));
		System.out.println("세 번째 알바펫 : " + sentence.charAt(2));

	}
		
}
