package com.kh.chap01_abstraction.run;

import com.kh.chap01_abstraction.model.vo.Student;

public class AbstractionRun {

	
	/*
	 * 객체를 지행하는 언어로 객체 중심으롣 돌아간다고 생각하면 됨
	*/
	public static void main(String[] args) {

		public String name;
		public int age;
		public int height;
		
		
		
		Student jang = new Student();
		
		jang.name = "장원영";
		jang.age = 21;
		jang.height = 106.5;
		
		System.out.println(jang.name + "님의 나이는 " + jang.age + "살이고 " + jang.height+ " cm입니다.");
		
		
		
	}

}
