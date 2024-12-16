package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	// 필드부
	
	// 기본생성자
	public TokenController() {}
	
	// 메소드부
	
	// 공백을 토큰으로 처리한 문자열 반환
	public String afterToken(String str) {
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여
		StringTokenizer stn = new StringTokenizer(str, " ");
		String strStn = "";
		// 띄어쓰기를 없애고 없앤 문자열 반환
		while(stn.hasMoreTokens()) { // 반복이 수행될 조건 : 토큰이 남아있을 때만
			strStn += stn.nextToken();
		}
		return strStn;
	}
	
	// 첫 글자만 대문자로 바꾼 문자열 반환
	public String firstCap(String input) {
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
//		return input.substring(0,1).toUpperCase()+input.substring(1);
		return input.toUpperCase().charAt(0) + input.substring(1);
	}
	
	// 문자열 안에 찾을 문자 개수가 몇 개 들어가있는지 반환
	public int findChar(String input, char one) {
		int count = 0;
		/*
		char[] arr = input.toCharArray();
		for(char ch : arr) {
			if(ch==one) {
				count++;
			}
		}*/
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == one) {
				count++;
			}
		}
		return count;
	}
}
