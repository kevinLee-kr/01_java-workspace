package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager {
	ArrayList<Book> list = new ArrayList<Book>();

	@Override
	public void addBook(Book nBook) {

		list.add(nBook);

	}

	@Override
	public ArrayList<Book> getAllBook() {

		return list;
	}

	@Override
	public Book searchBookBybNo(String bNo) {

		return null;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {

		return null;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> onlySearchBook = new ArrayList<Book>();
		
		for(Book b : list) {
			if(!(b instanceof Magazine)) {
				onlySearchBook.add(b);
			}
		}
		
		return onlySearchBook;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> onlySearchMagazine = new ArrayList<Book>();

		for(Book b : list) {
			if(b instanceof Magazine) {
				onlySearchMagazine.add(b);
			}
		}
		
		return onlySearchMagazine;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {

		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {

		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {

		return null;
	}

	@Override
	public int getTotalPrice() {

		return 0;
	}

	@Override
	public int getAvgPrice() {

		return 0;
	}

}
