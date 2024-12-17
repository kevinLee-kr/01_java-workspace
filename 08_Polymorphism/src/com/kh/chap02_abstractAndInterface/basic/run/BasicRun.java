package com.kh.chap02_abstractAndInterface.basic.run;

import com.kh.chap02_abstractAndInterface.basic.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.basic.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.basic.model.vo.Mother;
import com.kh.chap02_abstractAndInterface.basic.model.vo.Person;

public class BasicRun {

	public static void main(String[] args) {

		// Person p = new Person() {} 추상클래스는 객체 생성 불가! 레퍼런스로는 사용 가지만. 생성하는건 안됨
		/*
		Person mom = new Mother("배고파엄마", 50, 70, "점심"); // <--- 다형성 적용된 거임.
		Person baby = new Baby("돈까스애기", 3.5, 7); // 자식 개체

		// 이것이 동적 바인딩. eat 누르고 . 누르면 person의eat이 실행되는것처럼 보이지만 실제로는 mom의 eat이 실행이 된다.
		mom.eat(); // 몸무게 + 10 건강도 -10
		baby.eat();// 몸무게 3 건강도 +1

		mom.sleep(); // 건강도 +20
		baby.sleep(); // 건강도 + 3

		System.out.println("====다음날 =====");
		System.out.println(mom);
		System.out.println(baby);
	*/
		
		
		
	//	Basic b = new Basic(); 객체생성 불가. 레퍼런스로는 사용 가능. 
		
		Basic mom = new Mother("김엄마", 50, 70, "출산"); //<-- 다형성
		Basic baby = new Baby("김아기", 3.5, 7);
		
		System.out.println(mom);
		System.out.println(baby);
		
		mom.eat();
		baby.eat();
		
		mom.sleep();
		baby.sleep();
		
		System.out.println(mom);
		System.out.println(baby);
		
		/*
		 * 클래스에서 클래스를 상속 받으떄 : 클래스 extends클래스								(단일 상속이 원칙) 	: 화살표 실선..
		 * 클래스에서 인터페이스를 구현할 떄 : 클래스 implements인터페이스 여러개를 구현할 수 있다. 	(다중구현가능) 		: 화살표 점선..
		 * 인터페이스에서 인터페이스를 상속 : 인터페이스 extends 인터페이스1,  인터페이스2			(다중 상속 가능)	: 화살표 실선..
		 * 
		 * 					\			추상 클래스 			/		인터페이스
		 * =================================================================================
		 * 상속개수			\			단일 상속				/		다중 상속
		 * 키워드				\			extends				/		implements
		 * 추상메소드			\			추상메소드 0개 이상		/		
		 * 표현법/개수			\		명시적으로 abstract			/	묵시적으로 abstract(생략가능)
		 * 일반 메소드			\			있다.(o)				/		없다(x)
		 * 필드				\			일반 필드 가능 			/상수 필드만 가질 수 있음(묵시적으로 public static final)
		 * 
		 * extends 일반 클래스 --> extends 추상 클래스 --> implements인터페이스
		 * ------------------------------------------------------------오른쪽으로 갈수록 강제성이 더 짙어진다. -> 규약이 더 쎄졌다. 
		 * 
		 * 
		 * 
		 * 
		 */
		
	}

}
