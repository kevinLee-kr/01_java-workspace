package com.kh.chap02_encapsulation.model; //value object

public class Student { //나만의 자료형을 만드는 것으로 생각하면 된다. 
	
	//필드부를 적어야 한다고 했는데 다시 한번 정리하자면
	// 접근 제한자		자료형 		 변수명
	//을 적어야 한다. 아래를 참고해보자.
	
	private String name;
	private int age;
	private double height;
	private int korScore;
	private int mathScore;  //-> 추상화를 거쳐서 이런 변수들을 가져왔따.

	
	/*
	 메서드 부
	 [표현법]
	 접근제한자 [예약어] 반환형  메소드명 (){             ex) public(접근제한자) static(예약어) void(반환형) main(메소드명)(String[] args)
	 	실행 코드.
	 }
	 
	 
	 
	 */
	
	
	/*
	 * public void method1(int a){ // 매개변수 : 전달되는 변수. int kkkk = 10; //일반 변수이다. }
	 */
	
	//- setter 메소드
	//해당 필드에 대입시키고자 하는 값 ㄷ전달 받아 해당 필드에 대입 시켜주는 기능의 메소드.
	
	
	/*
	 * public void setName(String newName) { //System.out.println(newName);
	 * 
	 * name = newName; }
	 */
	
	public void setName(String name) {
		//name = name; 둘이 색이 똑같음 우리는 파란색 에다가 갈색을 넣어줘야하는데 일반적으로
		// 필드명과 매개변수명이 동일한 시점에서는 해당 메소드 영역에서 만들어진 변수가 우선순위가 더 높다. 
		//만들어진 변수> ?? (String name) 이거.
		
		//내가 원하는 것. 필드 name = 매배변수 name; 을 하길 원함! 어캐 하지?
	
		this.name = name;
		//this. 선억하면 저 위에있는 필드를 가리킨다. 
		//this -> 해당 객체의 주소값이 담겨있따.  ( 필드부 네임을 콕 집어서 쓰길 원한다. this를 쓰면 된다.)
	}
	public   void setAge(int age) {//사용자가 사용하고자 하는 age가 담겨있다?
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}	
	public void setKor(int korScore) {
		this.korScore = korScore;
	}
	public void setMath(int mathScore) {
		this.mathScore = mathScore;
	}
	
	
	// - getter 메소드
	// 해당 필드에 담긴 값을 반환해주는 역할을 수행
	
	public String	geName() 		{return name;}
	public int		getAge() 		{return age;}
	public double 	getHeight() 	{return height;}
	public int		getKor() 		{return korScore;}
	public int		getMath() 		{return mathScore;}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
