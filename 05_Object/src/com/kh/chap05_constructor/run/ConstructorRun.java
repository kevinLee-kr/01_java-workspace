package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//객체 생성 할수 있는 방법이 2가지 있다. 
		// 1. 기본 생성자로 객체 생성
		User u1 = new User();
		System.out.println(u1.information());//infomation은 User 파일에 생성해 둔걸 그냥 끌어온것이다. 
		
		//각 필드에 jvm의 초기값이 담겨있음.-> 아직 값을 넣지 않았기에, null, 0 ,' ' 와 같은 값들이 들어있는걸 확인할 수 있었다. (바로위에 있는 sysout 으로 인해)
		
		//기본으로 만들고나서, set 값을 불러오되, 값 대입을 한거다.
		/*
		User u2 = new User();
		u2.setUserId("user02");
		u2.setUserPwd("user03");
		u2.setUserName("ckdmsdn");
		*/
		
		System.out.println(u1.information());
		User u2 = new User("user02", "user03", "ckdmsdn"); //매개변수 생성자이다. . 
		
		//객체가 생성이 될려먼 기본 생성자가 있어야 한다. 
		
		System.out.println(u2.information());
		
		//만약에 ctrl+space 해서 User를 불러오더라도, 3개의 매개변수가 있는 user를 불러온다면 , 다른 생성자를 불러 올 가능성이 있다. 매개변수가 4개인지 5개인지 정확하게 구분해서 불러오자. 
		User u3 = new User("지디01", "지디02", "지디03", 20, 'm');
		System.out.println(u3.information());
		
		
		
		
		
		
		
		
	}

}
