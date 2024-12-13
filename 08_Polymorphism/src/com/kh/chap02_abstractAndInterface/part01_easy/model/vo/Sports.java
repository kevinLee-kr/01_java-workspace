package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public abstract class Sports {

	private int people;
	
	public Sports() {
		
	}
	
	
	public Sports(int people) {
		this.people=people;
	}
	
	//get set
	
	public int getPeople() {
		return people;
	}
	public void setPoepl(int people) {
		this.people=people;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "people = " + people;
	}
	
	//추상메소드(미완성된 메소드)를 만들기 // 머리부만 있음. 몸통부가 없다고 오류남
	public abstract void rule();
	//미완성된 메소드가 있다는 것은 이 클래스도 아직 미완성이라는 이야기
	//이유는 스포츠또한 완성이 된것이 아니기 때문, 또, 이렇게 완성이 안된걸 추상적abs를 표시행줘야 한다. (public abstract class Sports)
	//언제 완성되냐면, 해당 추상 클래스를 상속받는 자식에서 완성시킨다.
	
}
