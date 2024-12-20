package com.kh.chap02_set.model.vo;

public class Student {

	private String name;
	private int age;
	private int score;
	
	public Student() { }

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	} 
	
	@Override
	public int hashCode() { // 모든 필드에 담긴 값이 일치하면 동일한 hashcode 반환하도록
		String str = name + age + score;
		return str.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		//현재 객체와 이것을 전달 받은 객체의 각 필드값들이 모두 일치하면 true. 아니면 false
		//str1 . equals( str2 )
		//현객체           전달 받은 객체     라고 생각해보자. 
		//Student type     Object type
		
		Student other = (Student)obj; // 비교하기 위해 student 타입으로 맞춘거다. 
		//this. 라고 하는건 현 객체를 말하는 것이고
		//other 라고 하는건 전달 받은 객체라고 생각을 해보자는 말이다. 
		//this(현재)		vs 		other(전달받은객체)
		//this.name 			other.name		일치하나?
		//this.age 		 		other.age		일치 이것도?
		//this.score			other.score		일치?
		//3개의 요소를 비교를 해서 다 같으면 동일 인물이라는 것이겠고, 
		//3개의 요소를 비교를 해서 하나라도 다르면 동명이인 이라는 뜻이겠지요. 
		//지금 , set 사용시 주소값이 다르다는 이유로 2개의 값이 출력이 되고 있으니, 중복값이라고 설명해주기 위해 비교를 해보는 거다. 
		
		if(this.name.equals(other.name) && this.age == other.age && this.score == other.score) {
			return true;
		}else { 
			return false;
		}
		//이거이거이거 일치해? 맞아? 그럼 동일인물 맞네, true 반환. 
		// 아 아니야? 다른사람이었어? 그럼 동명이인 이네, false 반환.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
