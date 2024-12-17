package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {

	public void method1() {
		try {
			method2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void method2() throws IOException {
		// Scanner와 같이 키보드 값을 입력받을 수 있는 개ㄱ체(단, 문자열로 받아들임)
		// 스캐너 이전의 방식 -> 정수, 실수 입력을 못받아. 무조건 문자만 받을수 있었음

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("아무거나 입력해보세요 : ");
		/*
		try {
			String str = br.readLine();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/String str = br.readLine();
		//throws : 지금 이 자리에서 예외를 처리하는 것이 아닌, 현재 이 메소드를 호출하는 곳으로 예외처리 떠넘기겠다. (좋게말해 위임)
		System.out.println("ㄴ");
	}

}
