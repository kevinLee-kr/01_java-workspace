package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.StaticMethod;
import com.kh.chap06_method.controller.overloadingTest;

public class MethodRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//-------------------NonStaticMethod ============================
		NonStaticMethod n = new NonStaticMethod();
		n.method1();
		
		//2. 매개변수는 없고 반환값은 있는 메소드 호출. 두두등장
				n.method2();
				//System.out.println(n.method2());
				
				String str=n.method2();
				//System.out.println(str);
		//3. 매개변수 있고, 반환값은 없는 메소드 호출. 두두등장
				//n.method3() -> 매개변수 없으면 못부름. 
				//n.method3(10) -> 매개변수가 있지만 개수가 맞지 않아 오류발생.
				//int result = n.method3(10,20) ->어? 이러면 10,20을 대입해서 method안에 있는 공식에 의해 답이 주어지겠네? result에 담겨지겠네? 틀렸다. 호출을 할때return이 있어야 하는데 좌클릭으로 타고 가면 void 가 보일것이다. 따라서 진행될 수 없다. 
				//n.method3(10,5);
		
		//4. 매개 변수도 있고, 반환값도 있는 메소드 호출 두두등장
				//char ch = n.method4("lemon", 1);
				//System.out.println(ch);
				//사용자에게 매개변수를 입력 받아서 해당 메소드 호출. 
				
		/*Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : " );
		String str1 = sc.nextLine();
		
		System.out.println("인덱스 입력 : ");
		int index = sc.nextInt();
		
		//여기서 유효성 검사 해보기
		//index 가  0 이상이고 문자열 길이보다 잡을때만 method4 수행
		
		if(index >=0 &&index<str.length()){
		System.out.println("결과 : " + n.method4(str, index));
		}else {
		System.out.println("인덱스 값이 부적절 하다. ");
		}
		*/
				
				
			//staticMethod------------------------------------------			
			StaticMethod.method1();	
			System.out.println(	StaticMethod.method2());
			StaticMethod.method4("apple", "kiwi");
			System.out.println(StaticMethod.method4("apple", "apple"));
				
				
				//=-====================overloading test=========
			overloadingTest ot = new overloadingTest();
			ot.test();
			ot.test(10);
			ot.test(10,"zzzz");
			ot.test("훃", 20);
			ot.test(10,20);
				
			/*
			 * // 오버로딩의 대표적인 예)
			 * system.out.print = ctrl+spac 눌러보면 매개변수가 다른 다양한 print 타입이 나온다. 
			 */	
			
	}

}
