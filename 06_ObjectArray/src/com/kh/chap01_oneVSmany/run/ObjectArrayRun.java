package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//객체 배열 활용해서 해보기!!
		//세권의 Book 객체를 관리한다면?
		//int []arr = new int [4]
		//Book[] books = new Book[4];
		
		Book[] books = new Book[3];
		
		//3개의 도서에 대한 정보를 반복적으로 입력 받아 각 인덱스에 객체 생성
		for(int i = 0 ; i<books.length;i++) {
			System.out.print((i + 1) + " 번쨰 도서 정보 입력");
			
			System.out.print("도서명 : ");
			String title = sc.nextLine();

			System.out.print("저자명 : ");
			String author = sc.nextLine();

			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("출판사 : ");
			
			/*
			books[0] = new Book(title, author, price, publisher);
			books[1] = new Book(title, author, price, publisher);
			books[2] = new Book(title, author, price, publisher);
			*/
			
			//각각의 인덱스에 차곡차곡 객체 생성한거다. for문으로 반복적으로 i값 출력 가능.
			books[i] = new Book(title, author, price, publisher);
			
		
			
		}
		//객체 생성 끝난거다. (stack, heap, static 에 공간이 생겼고, 값들이 다 들어가니 주소값이 생기고, 참조값공간에 주소가 들어가고, 그것이 참조주소를 바라본다. 가 객체 생성 끝이란 뜻)
		for(int i =0;i<books.length;i++) {
			System.out.println(books[i].information());
		}
		
		//도서 제목으로 검색하는 서비스  
		System.out.println("검색할 책 제목");
		String search = sc.nextLine();
		
		for(int i = 0; i<books.length;i++) {
			if(books[i].getTitle().equals(search)) {
				System.out.println(books[i].information());
			}
		}
	}
}
