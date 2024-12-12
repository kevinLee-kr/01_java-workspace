package com.kh.chap03_override.model.vo;

public class Book {

	private String title;
	private String author;
	private int price ;

	public Book(){	}
	public Book (String title, String author, int price) {
		this.title = title;
		this.author=author;
		this.price=price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	
	/*
	 * 오버라이딩
	 * 자식 클래스가 상속받고 있는 부모클래스의 메소드를 재정의 하는것.
	 * 부모가 제공하는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미
	 * 자식 객체를 통해 메소드 실행시 자식 메소드가 우선권 가짐.
	 * 오버라이딩의 성립 조건
	 * -- 메소드명이 부모 클래스와 동일 해야한다. 왜? 그렇지 않으면 어떻게 무엇이 무엇인줄 알고 상속을 줄것이란 말인가. ?님아 생각좀.
	 * 조건식에 들어있는 매개변수 의 개수,자료형타입, 순서가 동일 해야한다. 
	 * 부모 메소드의 반환형 동일
	 * 부모 메소드의 접근제한자가 범위가 같거나 커야한다. 
	 * 	ex) 부모메소드의 접근제한자가 protected일경우, 오버라이딩 하는 메소드의 접근제한자는 protected, public 
	 * 		같거나 더 좁은 건 안된다.  -> 규약의 개념이 들어가있다. 
	 * override 어노테이션
	 * = 생략 가능함, 생략이 되어도 크게 상관 없음(명시하지 않아도 오버라이딩 된 상태이기 떄문)
	 *  - 어노테이션 왜 붙임? 
	 *  	- 부모 메소드명이나 매개변수가 수정됫을 경우, 알아봅기 쉽기 때문. (자바가 업데이트 되어 toString의 내용이 변경이 되었을떄, 빨간줄이 나오니까 개발자 입장에서 알아보기 쉽다. 라는 뜻. 또한, 이 메소드는 오버라이딩 한 메소드다~ 라고 알려주기 위함이다. 
	 *  
	 *   부모클래스가 뭔지, 자식이 누군지, 상속을 이어줄떄는 extends를 쓰고, 어떻게 사용을 해야하는지. 정리를 해보도록 합시다. 
	 *   
	 */
	@Override
	public String toString() {
		return "title = " + title + ", author = " + author + ", price = " + price;
	}

	
	
}
