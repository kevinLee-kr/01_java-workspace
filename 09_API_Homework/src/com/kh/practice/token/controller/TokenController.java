package com.kh.practice.token.controller;

public class TokenController {

	// 기본 생성자
	public TokenController() {
	}

	// 매개변수
	public String afterToken(String str) {

		// 매개변수로 받아온 str을 StringTokenizer를 이용하여

		// 띄어쓰기를 없애고 없앤 문자열 반환.
		System.out.println("토큰 처리전 글자: " + str);

		System.out.println("토큰 처리전 개수 : " + str.length());
		String[] str1 = str.split(" ");
		System.out.print("토큰 처리 후 글자 : ");
		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i]);
		}
		System.out.println(" ");
		System.out.println("토큰 처리후 개수 : " + str1.length);

		System.out.print("모두 대문자로 변환 : ");
		// 창고 하나 더 만들어서. 주소값 참조 시키고.
		String[] str5 = str.toUpperCase().split(" ");

		for (int i = 0; i < str5.length; i++) {
			System.out.print(str5[i]);

		}
		System.out.println(" ");
		return str;
	}

	public String firstCap(String input) {

		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
		char capital = input.toUpperCase().charAt(0);
		String str3 = capital + input.substring(1);

		return str3;

	}

	public int findChar(String input, char one) {

		// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환

		int count = 0;
		char[] arr = input.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == one) {
				count++;
			}
		}
		return count;
	}

}
