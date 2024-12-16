package com.kh.chap02_string.controller;

public class A_StringPoolTest {

	public void method1() {
		String s = "안녕"; 	//참조자료형
		int a = 10; 		//기본 자료형
				// 왜 String 은 같은 식으로 해도 참조 자료형인가요?
				// 음. 몰라요 그저 구조가 그렇게 만들어졌어요. 
		
		//1. 생성자를 통한 문자열 생성. 
		String str1 = new String("hello");//매개변수 생성자
		String str2 = new String("hello");//매개변수 생성자		
		
		System.out.println(str1.toString());
		System.out.println(str2);
		//참조 자료형이라매 근데 , 이렇게 출력해도 왜 주소값이 아닌 값이 나올까?
		//내가 알고있는 toString 은 주소값을 출력해주는건데. 
		//
		//
		//컨트롤 누르고 좌클릭으로 String 을 들어가보면. 
		// 부모 : object, 자식 : String  구조인데
		//object에서는 주소값을 리턴 해주는걸 String 이 상속 받은건데
		//String 에서 문자열(값)을 반환하도록 오버라이딩 처리를 해놨다. 
		
		// 동등 비교?
		System.out.println(str1==str2);
		//주소값을 ==로 비교하니까 당연히 false. 
		System.out.println(str1.equals(str2));//주소값, 문장열을 비교할때는 .equals를 사용해야 한다. 
		//object 부모 클래스를 확인해보면 원래는 주소값을 동등비교하는 메소드다. 
		//반환값이 boolean 이기 떄문에true 또는 false 만 나온다. 
		//String 자식 클래스에 equals 메소드가 이미 오버라디잉 돼어있어. 
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//String 자식 클래스에  hashcode 메소드 이미 오버라이딩 돼있음;
		//주소값이 아닌 실제 담겨있는 문자열(hello)을 가지고 해쉬코드를 만듦
		
		//주소값을 출력할 순 없을까?
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
	}

	public void method2() {
		//1. 생성자 생성후 값 대입. 
		String str = new String("hello");
		
		//2. 문자열을 리터럴값으로 생성
		String str1 = "hello";
		String str2 = "hello";
		
		
		System.out.println(str1);	//주소값이 담겨있지만 toString()에 의해서 나오는 것이다. 
		System.out.println(str2);	//주소값이 담겨있지만 toString()에 의해서 나오는 것이다. 
		
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str1 == str2); //값이 hello가 들어있는 것도 알겠고, hashCode의 값이 같은 것(값이 같기 때문)도 알겠어, 근데, str1 = str2가 true가 나온다?
		// 
		
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		String str3 = "hi";
		System.out.println(str1 == str3);
		System.out.println(System.identityHashCode(str3));
		//String 클ㄹ래스 == 불변클래스 라고도 불린다. (변하지 않는 클래스)
		//변경이 가능하긴 하나 그 자리에서 바로 수정되는 개념은 아니다. 
		
		str3="bye";
		System.out.println(System.identityHashCode(str3));
		//변경하는 순간 기존의 문자열 자라ㅣ에서 변경되는 것이 아닌
		//새로운 곳을 참조하도록 됨(새로운 주소값 부여 받음 == 주소값 변경)
		
		str3 = "hello";
		System.out.println(System.identityHashCode(str3));
		
		
		
	}

}
