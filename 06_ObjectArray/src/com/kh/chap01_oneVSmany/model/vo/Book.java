package com.kh.chap01_oneVSmany.model.vo;

public class Book {

	// 도서명 , 저자, 가격, 출판사
	private String title;
	private String author;
	private int price;
	private String publisher;

	// 기본 생성자
	public Book() {
	}

	// 매개변수 생성자(전체)
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	// getter - setter
	public String getTitle() {
		return title;
	}

	public void setTile(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	// information 함수.
	// 우리의 변수는 4개이다. 이 4개를 전부 한번에 출력해버리는 자.
	public String information() {
		return title + ", " + author + ", " + price + ", " + publisher;
	}

	// 내가 final프로젝트 할떄까지도 이 위에 틀이 고정적으로 사용하게 될 것이다. 필요한 경우 외워버리는 것도 방법이라고 생각한다.
	//

}
