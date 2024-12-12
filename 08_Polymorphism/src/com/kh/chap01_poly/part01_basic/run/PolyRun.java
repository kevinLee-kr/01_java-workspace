package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {
		
		System.out.println("1. 부모타입 객체(레퍼런스)로 부모객체를 다루는 경우.");
		
		Parent p1 = new Parent();
		p1.printParent();
		//p1 레퍼런스가 Parent 일때만 접근가능.
		
		System.out.println("2. 자식타입 레퍼런스로 자식객체를 다루는 경우");
		Child1 c1 = new Child1();
		c1.printChild1(); //부모는 부모꺼만 자식꺼는 못건듬.
		c1.printParent(); //자동 형변환 된거임(Child1 -> Parent)
		//c1이 가지고 있는 Child1 이라는 레퍼런스로.
		//Child1도 접근가능, Parent 도 접근 가능.
		//Parent 접근시 자동으로 형변환 된채로 진행된거임.
		
		System.out.println("3. 부모타입 레퍼런스로 자식객체를 다루는 경우"); //다형성.
		Parent p2 = new Child1();
		//지금 왼쪽의 자료형과 오른쪽의 자료형이 다른데 근데 에러가 안떠 ㅡ그러면 뭐야 컴퓨터가 자동으로바꿔준거야. 알고보면 자동 형변환이 된걸 알 수 있다.
		p2.printParent();
		
		((Child1)p2).printChild1(); //강제 형변환 하면 호출이 되기는 함. 일단 됨.음.
		
		//원래 p2 레퍼런스로 지금 당장은 parent 로 접근은 가능하지만.
		//child1에 접근하고자 한다면 강제형변환을 하면 접근은 가능!
		
		//지금 계속 말하고 있는 , 다형성, 강제 형변환 들은 상속이 된다는 전제하에 말을 하고 있다. 
		
		//1.  UpCasting - 자식타입이었는ㄷ, 부모 타임으로 형변환 하는 방법
		//	자동형변환 쌉가능 - 자식 이 부모꺼 쓰는거 (2)
		//			  	   부모 = 자식객체(3)
		//2. DownCasting - 부모의 타입이었는데 자식타입으로 형변환 되는 것. 
		//	 부모타입 -- > 자식으로 형변환 하는 방법
		//강제 형변환이 필요하다.
		// EX) ((자식)부모).자식메소드();
		
		//다형성 정의
		//부모타입으로 부터 파생된 여러가지 타입의 자식객체들을 부모 클래스 타입 하나라로도 다룰 수 있따. 
		
		//다형성. 왜 쓸까?
		// 쓰는 목적에 대해 알아보자 및 장점
		//다형성을 배우기 전.
	
		 // child1 이라는 객체 배열을 만든 거임.+ child2 객체또한 만듬
		
		 	Child1[] arr1 = new Child1[2];
		 	arr1[0] = new Child1(1,2,4);
		 	arr1[1] = new Child1(2,3,4);
			
			Child2[] arr2 = new Child2[2];
			arr2[0] = new Child2(2,1,5);
			arr2[1] = new Child2(5,7,2);
		 // ------------------------------------------------
		 //다형성을 적용한 후..
		 //Parent 객체배열 1개만 만듬
		 Parent[] arr = new Parent[4];
		 arr[0] = new Child1(1,2,4);
		 arr[1] = new Child2(2,1,5);
		 arr[2] = new Child2(1,3,5);
		 arr[3] = new Child1(2,3,5);
		 
		 //하나의 부모 타입 만으로 여러 자식 객체들을 받을 수 있다는 장점이 있다. -> 편리하다. 코드길이 감소, 가독성 상승
		 //=============================================
		  
		 //arr[0].printChild1();
		 
		 ((Child1)arr[0]).printChild1();
		 // arr[1].printChild2(); //-> 오류.
		 
		 ((Child2)arr[1]).printChild2(); ///-> 상속개념아래, 다형성 개념 아래에서 실행된다. 
		 ((Child1)arr[2]).printChild1();
		 //	--> ClassCastException : 부적절한 형변환으로 인한 오류. 
		 //		야 너는 arr[2] 는 Child2로 바꿔줬는데 강제형변환으로 Child1 로 지금 바꿀려고 한다. 그리고 
		//		printChild1을 출력을 할려고 하니 오류가 나는거 아니냐
		 ((Child1)arr[3]).printChild1(); //-> 이거지. 이렇게 해야지.
		 
		 System.out.println("====반복문 이용해서 출력 =====");
		 for(int i = 0 ; i < arr.length;i++) {
			
			 if(arr[i] instanceof Child1) { //해당 레퍼런스가 실제 Child1을 참조 하고 있다면 true, false 라는 결과값으로 if 를 작동 시킨다.  솔직히 switch 문하고 똑같이 이해했다. 
				 ((Child1)arr[i]).printChild1();
			 }else { 
				 ((Child2)arr[i]).printChild2();
			 }
			//instanceof 연산자 -> 연산결과 true / false 로 반환
			 //현재 레퍼런스가 실질적으로 어떤 클래스로 만들어졌는지를 확인해주는 연산자
				 if(i==0 || i ==3) {
						 ((Child1)arr[i]).printChild1();
				 }else { 
						 ((Child2)arr[i]).printChild2();
				 }
		 }
		 
						 
		System.out.println("===================");
		 Parent pp = new Child1();
	pp.print();
	//동적바인딩 : 프로그램이 실행되기 전에는 컴파일 정적 바인딩이라는게 일어난다. 
	// 단, 실질적으로 참조하는 자식클래스에 해단 메소드가 오버라이딩이 돼있네?
	//프로그램이 실행할때 동적으로 그 자식클래스의 오버라이딩 된 메소드를 찾아서 실행한다?					 
	
	}

}
