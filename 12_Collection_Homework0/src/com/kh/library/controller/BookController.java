package com.kh.library.controller;

import java.util.ArrayList;
import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager {

	ArrayList<Book> list = new ArrayList<Book>();
	
	@Override
	public void addBook(Book nBook) {
		
		boolean flag = false;
		
		if(list.isEmpty()) {
			flag = true;
		}else {
			
			for(int i = 0; i < list.size(); i++) {
				flag = false;
				if(list.get(i).getbNo().equals(nBook.getbNo())) {
					break;
				}else {
					flag = true;
				}
			}
			
		}
		
		if(flag) {
			list.add(nBook);
		}
		
	}

	@Override
	public ArrayList<Book> getAllBook() {
		return list;
	}

	@Override
	public Book searchBookBybNo(String bNo) {
		
		Book book = null;
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getbNo().equals(bNo)) {
				book = list.get(i);
				break;
			}
		}
		
		return book;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		
		ArrayList<Book> searchBookByTitle = new ArrayList<Book>();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().contains(title)) {
				searchBookByTitle.add(list.get(i));
			}
		}
		
		return searchBookByTitle;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		
		ArrayList<Book> onlySearchBook = new ArrayList<Book>();
		
		for (Book book : list) {
	        if (!(book instanceof Magazine) || (((Magazine)book).getYear() == 0 && ((Magazine)book).getMonth() == 0)) {
	            onlySearchBook.add(book);
	        }
	    }
				
		return onlySearchBook;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		
		ArrayList<Book> onlyMagazine = new ArrayList<Book>();
		
		for (Book book : list) {
	        if (book instanceof Magazine && ((Magazine) book).getYear() != 0 && ((Magazine) book).getMonth() != 0) {
	            onlyMagazine.add(book);
	        }
	    }
		
		return onlyMagazine;
	}

	
	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
	    
		ArrayList<Book> magazineOfThisYear = new ArrayList<>();

	    for (Book book : list) {
	        if (book instanceof Magazine && ((Magazine)book).getYear() == year) {
	            magazineOfThisYear.add(book);
	        }
	    }

	    return magazineOfThisYear;
	    
	}
	
	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		
		ArrayList<Book> searchBookByPublisher = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getPublisher().contains(publisher)) {
				searchBookByPublisher.add(list.get(i));
			}
		}
		
		return searchBookByPublisher;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		
		ArrayList<Book> searchBookByPrice = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getPrice() <= price) {
				searchBookByPrice.add(list.get(i));
			}
		}
		
		return searchBookByPrice;
	}

	@Override
	public int getTotalPrice() {
		
		int sum = 0;
		
		for(int i = 0; i < list.size(); i++) {
			sum+=list.get(i).getPrice();
		}
		
		return sum;
	}

	@Override
	public int getAvgPrice() {
		
		int avg = 0;
		
		avg = (getTotalPrice()/list.size());
		
		return avg;
	}

	

}