package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 방법 1 Book bk = new Book(); // Book이라는 '자료형'을 만들었다. ex) int i = 0;과 같은 개념.
		 * bk.setTile("자바의 정석");//vo의 setter 호출 후 입력값 대입을 한번에 bk.setAuthor("봉준호");
		 * bk.setPrice(10000); bk.setPublisher("kh");
		 */

		// 방법 2. 매개변수 생성자를 통해서 생성과 동시에 값을 초기화하는 방법 알려주지
		// Book bk = new Book("자바의정서", "봉준호", 10000, "kh");

		// 응용편 사용자에게 입력받은 값으로 객체 생성 후 초기화.
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("도서명 : "); String
		 * title = sc.nextLine();
		 * 
		 * System.out.println("저자명 : "); String author = sc.nextLine();
		 * 
		 * System.out.println("가격 : "); int price = sc.nextInt(); sc.nextLine();
		 * System.out.println("출판사 : "); String publisher = sc.nextLine();
		 * 
		 * Book bk = new Book(title, author, price, publisher);
		 * 
		 * System.out.println(bk.information());
		 */

		// 세개의 Book객체를 관리해야 한다면?
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;

		// 세개의 도서에 대한 정보를 반복적으로 사용자에게 입력받기
		// -> 입력받은 후 각 객체 생성과 동시에 초기화

		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + " 번쨰 도서 정보 입력");
			Scanner sc = new Scanner(System.in);
			System.out.print("도서명 : ");
			String title = sc.nextLine();

			System.out.print("저자명 : ");
			String author = sc.nextLine();

			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			if (i == 0) {
				bk1 = new Book(title, author, price, publisher);
			} else if (i == 1) {
				bk2 = new Book(title, author, price, publisher);
			} else {
				bk3 = new Book(title, author, price, publisher);
			}
		}

		// 객체 생성이 끝났다. 이제 전체 도서 정보를 확인해보자.
		// 언뜻 보기에 반복문이 활용 될 것처럼 보인다. 하지만 어떻게 , 어떤 수를 쓰더라도 일일히 각 객체의 출력문 을 작성해야한다.
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());

		// 도서 제목으로 검색하는 서비스.
		Scanner sc = new Scanner(System.in);
		System.out.println(" 찾고 계시는 책 제목 : ");
		String search = sc.nextLine();

		if (bk1.getTitle().equals(search)) {
			System.out.println(bk1.information());
		}
		if (bk2.getTitle().equals(search)) {
			System.out.println(bk2.information());
		}
		if (bk3.getTitle().equals(search)) {
			System.out.println(bk3.information());
		}

	}

}
