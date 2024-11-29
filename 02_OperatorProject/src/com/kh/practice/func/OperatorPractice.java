package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	public void Practice1() {
		
		Scanner sv = new Scanner(System.in);
		System.out.println("정수 하나를 입력해주세요:) : ");
		int number = sv.nextInt();
		
		String result = (number >0)? "양수다!" : "양수가 아니다!";		
	}
}
