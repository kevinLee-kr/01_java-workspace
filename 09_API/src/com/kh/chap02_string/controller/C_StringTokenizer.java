package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizer {

	public void method1() {
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		// 구분자를 기준으로 해서 문자열을 분리하고 싶다.
		// 다양한 방법이 있는데 이중에 원하는 거 하면 된다.

		// 1. 분리된 문자열을 스트링 배열에 넣는 경우.
		// String 클래스에서 제공하는 split 메소드 이용.
		// 문자열.split(구분자) : String[] 에 차곡차곡 담아준다.
		String[] str1 = str.split(",");
		System.out.println(str1.length);

		for (int i = 0; i < str1.length; i++) {
			System.out.println(i + "번쨰 인덱스 : " + str1[i]);
		}
		// for(돌리고자 하는 것의 자료형:내가 반복적으로 돌리고 싶은 거)

		int count = 0;
		for (String a : str1) {
			System.out.println((count + 1) + "번쨰 인덱스 " + a);
			count++;
		}

		// 2. 분리된 문자열들을 각각토큰으로써 관리하고자 할 떄.
		// java.util.StringTokenizer 클래스를 이용하는 방법
		// StringTokenizer stn = new String Tokenizer(분리하고자 하는 문자열, 구분자);

		StringTokenizer stk = new StringTokenizer(str, ",");
		System.out.println("분리된 문자열의 개수 : " + stk.countTokens());

		System.out.println(stk.nextToken());// 토큰을 하나씩 뽑는거다.
		// 현재 첫 토큰값을 하나 가져왔다.

		System.out.println(stk.nextToken());// 토큰을 하나씩 뽑는거다.
		System.out.println(stk.nextToken());// 토큰을 하나씩 뽑는거다.
		System.out.println(stk.nextToken());// 토큰을 하나씩 뽑는거다.
		// 다 뽑으면 현자타임옴. 일회성이다.
		// System.out.println(stk.nextToken());//다 뽑았는데도, 뽑기 시도하면 에러뜸..
		// NoSuchElementException 에러가 뜨는데 더이상 뽑을 토큰이 소진이 다 되었다.

		/*
		 * for(int i = 0 ; i < stk.countTokens();i++) { System.out.println(stk.
		 * nextToken()); } // 잘못된 방법. ( 반복문 3번 돌고 끝남)
		 * 
		 * int = 0 i<6 true 출력("java")
		 * 
		 * 
		 * 
		 * int count1 = stk.countTokens(); for(int i=0;i<count1;i++) {
		 * System.out.println(stk.nextToken()); }
		 */

		while (stk.hasMoreTokens()) {
			System.out.println();
		}

		// 3.

	}

}
