package com.kh.practice.api.model.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
	//field
	private String title;
	private String author;
	private String publisher;
	private Date publishDate;
	private int price;
	//기본생성자
	public Book() {
	}
	//매개변수 생성자
	public Book(String title, String author, String publisher, Date publishDate, int price) {
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.publishDate=publishDate;
		this.price=price;
	}

	// getter, setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getauthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일");
		return "title = " + title + ", author = " + author + ", publisher = " + publisher + ", publishDate = "
				+ sdf.format(publishDate) + ", price = " + price;
		
		
		// 출판일(Date publishDate) 형식을 SimpleDateFormat을 이용하여 "0000년 00월 00일" 형태의 문자열 형식으로 만들어 하단의 주석에 반영시키시오

		// 포맷을 지정한 SimpleDateFormat 객체 생성
		// publishDate (Date타입) --- 포맷적용한 ---> str (String)
		//return "";
		
	}

}
