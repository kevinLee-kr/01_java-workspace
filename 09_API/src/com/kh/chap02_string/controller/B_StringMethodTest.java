package com.kh.chap02_string.controller;

public class B_StringMethodTest {

	public void method1() {
		String str1 = "Hello World";

	//[표현법]
		//메소드면 (매개변수) : 반환형
	//1. 문자열. charAt(int index) : char
		char ch = str1.charAt(3);
	
		System.out.println("ch : " + ch);
		
	//2. 문자열.concat(String str) : String
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
	
		String str3 = str1 + "!!!";
		System.out.println("str3  : " + str3);
		
		System.out.println("str2 와str3가 일치합니까:" + (str2+str3));
		//원래는 같은 값을 가지면 같은 주소값을 가지는 것이 맞습니다. 
		//concat안에 new 가 있다는 것을 우리는 확인을 했고, 
		//이 말 뜻은, 새로운 주소값이 heap에 생긴다는 것을 의미하고
		//str3만 StringPool에 있다고 생각하면 된다. 
	
	//3. 문자열.equals(object obj) : boolean
		//equals 메소드는 boolean 결과값을 반환해주는 메소드입니다. 
		//문자열과 전달된 또 다들 문자열 가지고 주소값 비교가 아닌 실제 문자열값을 가지고 동등비교 한다. 
		System.out.println("str2와 str3이 일치합니까: " + str2.equals(str3));
	
	//4. 문자열.contains(CharSequence s) : boolean
		System.out.println("str1에 Hello 문자열이 포함되어 있나요? : " + str1.contains("Hello"));
		System.out.println("str1에 bye 문자열이 포함돼 있나요? : " + str1.contains("Bye"));
	
	//5. 문자열.length() : int
		System.out.println("str1의 길이가 궁금해 : " + str1.length());
	
	//6. 문자열.substring(int beginIndex) : String
		//문자열의beginIndex 위치에서부터 끝까지의 문자열을 추출해서 리턴한다. 
		System.out.println(str1.substring(3));
		//hello world
		//문자열.substring(int beginIndex,int endIndex) : String ,여기서부터 여기까지 짜르겠다.   
		//문자열의 beginIndex 위치에서부터 endIndex-1위치까지의 문자열 추출해서 리턴한다. 
		
		System.out.println(str1.substring(3,7));
	
		//hello 만 추출해 보자. 
		System.out.println(str1.substring(0, 5));
	
		//quiz. 1. worl 만 추출, + concat함수로 ! 엮어서 str0 만들기 -> Worl!
		
		//quiz. contains 함수 이용, !가 포함돼 있는지 여부 추출 -> str0에 !가포함?
		
		String str0 = ("quiz1 : " + str1.substring(6,10)).concat("!");
		System.out.println(str0);
		
		System.out.println("str0에 !이 포함돼있나요? : " + str0.contains("!"));
		
	//7. 문자열.toUpperCase() : String -> 문자열을 다 대문자로 변경한 새 문자열 리턴. 
	//	 문자열.toLowerCase() : String -> 문자열을 다 소문자로 변경한 새 문자열 리턴.
		String str5 = str1.toUpperCase();
		System.out.println(str5);
		
		String str6 = str1.toLowerCase();
		System.out.println(str6);
		
		/*
		 * System.out.print("계속하시겠습니까? : (y/n)" : ");
		 * char ch = sc.nextLine().toUpperCase().charAt(0); -> 메소드 체이닝이라고 한다. 
		 * if(ch == 'Y')
		 */
		
	//8. 문자열.trim() : String 
	//   문자열의 앞 뒤 공백을 제거시킨 새 문자열 리턴
		String str7 = " 8.je   ha ha ha   ha                  ";
		System.out.println(str7.trim());
		
	//9. 문자열.toCharArray() : char[]
		char[] arr = str1.toCharArray();
		System.out.println("9. " + arr[1]);
	//10. String.valueOf(char[] data) : String
		System.out.println("11번 : " + String.valueOf(arr));
	
	
	}
}
