package com.kh.variable;

import java.util.Scanner; //scanner클래스 사용시 메인클래스 밖에서 import 해줘야함.

public class B_KeyboardInput {

	public static String message;

	
	  public void inputTest1() { //scanner명령어는 사용자가 값을 입력했을때, 입력값을 저장 및 활용하는 클래스이다.
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("입력 : "); String message = sc.nextLine(); //입력받는 코드, String(식별도구) message(저장공간) = message 에 담아주세요.
	  
	  System.out.println("입력받은 내용 : " + message);
	  
	  sc.close(); //스캐너 종료 매서드. 안해도 오류는 없고, 알아서 마무리 해준다. 그래도 깔끔하게 닫아주자.
	  }
	 

	
	  public void inputTest2() { Scanner os = new Scanner(System.in);
	  System.out.print("이름 입력하세요 : "); 
	  //String name = os.next(); //next()명령어는 사용자가 입력한 값 중 공백이 있을경우 공백이전값만 가져온다. 
	  //거주지 같은 공백이 있는 데이터는 제대로 된 값을 못 가져올 수 도 있음.
	  String name = os.nextLine(); //반면 nextLine()명령어는 공백을 포함한 모든 입력값을 가져온다.
	  //System.out.println("너의 이름은 : " + name);
	  System.out.print("실례지만 나이가 혹시..?   "); int age = os.nextInt();
	  
	  System.out.print("아하 그럼 키는 어떻게..?    "); double height = os.nextDouble();
	  
	  System.out.println(name + "님의 나이는 " + age + "이고, 키는 " + height +
	  " 입니다. 축하합니다. ^^");
	  
	  }
	 

	/*
	 * public void inputTest3() { //키보드로 값을 입력 받을 때 종종 발견되는 문제 Scanner sc = new
	 * Scanner(System.in); System.out.print("이름 : "); String name = sc.nextLine();
	 * 
	 * System.out.print("나이 : "); int age = sc.nextInt(); sc.nextLine();
	 * System.out.print("주소 : "); String address = sc.nextLine();
	 * 
	 * System.out.print("키 : "); double height = sc.nextDouble();
	 * 
	 * System.out.println(name +"님의 나이는 " + age + "세 이며, 사는 곳은 " + address +
	 * " 입니다. 키는 " + height + " 입니다. 감사합니다. "); }
	 */

	/*
	 * public void inputTest4() { Scanner sc = new Scanner(System.in);
	 * 
	 * System.out.print("이름 : " ); String name = sc.nextLine();
	 * 
	 * System.out.print("성별 : " ); //M,F
	 * 
	 * char gender = sc.nextLine().charAt(0); //침착... // 문자열.charAT(인덱스) : 해당 문자열로부터
	 * 해당 인덱스의 문자를 추출해주는메소드 // 배열 메서드(명령어) 인데, () 안에 수자는 ~번째 자리에 들어가있는 char. 즉, 한개의
	 * 문자를 gender에 넣어라. // 라는 말이다.
	 * 
	 * System.out.print("나이 : ") ; int age = sc.nextInt();
	 * 
	 * System.out.print("키 : "); double height = sc.nextDouble();
	 * 
	 * System.out.println(name + "님의 개인정보"); System.out.println("성별 : " + gender);
	 * System.out.println("나이 : " + age); System.out.print("키 : " + height +
	 * "입니다. 어떠십니까"); }
	 */

	/*
	 * public void charAtTest() { String str = "hello";
	 * 
	 * char ch = str.charAt(0); System.out.println(ch);
	 * 
	 * System.out.println(str.charAt(3)); System.out.println(str.charAt(12)); }
	 */
}
