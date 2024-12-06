package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.Student;


public class EncapsulationRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student cha = new Student();
		
		/*
		 * 7. 캡슐화 과정까지 적용해야 애가 완벽한 클래스를 갖추게 된다. 
		 */
		
		//Student cha = new Student();
		//cha.name = "차은우";
		//cha.age = 20;
		//cha.height = 180.5;
		//cha.korScore = 90;
		//cha.mathScore = 100;
		
		//private 한 설정값에 접근하는 법
		cha.setName("차은우");
		cha.setAge(20);
		cha.setHeight(185.5);
		cha.setKor(90);
		cha.setMath(80);
		
		System.out.println(cha.geName());
		System.out.println(cha.getAge());
		System.out.println(cha.getHeight());
		System.out.println(cha.getKor());
		System.out.println(cha.getMath());
	}

}
