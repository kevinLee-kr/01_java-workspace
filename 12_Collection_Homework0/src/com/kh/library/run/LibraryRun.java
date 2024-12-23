package com.kh.library.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.library.controller.BookController;
import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

public class LibraryRun {

	public static void main(String[] args) {// 소장책 DB
		ArrayList<Book> bList = new ArrayList<>();

		// 생성 DB
		bList.add(new Book("100", "잃어버린 도현이를 찾아서", "김재영 박사", "초롱 출판사", 8500, "『화종스』, 『르 몽드』 선정 20세기 최고의 책"));
		bList.add(new Book("101", "지혜의 자서전", "정민이가 옮김", "빛나는 은송출판사", 8500, "영화배우 박민규가 추천한 젊음에 바치는 영혼의 자서전"));
		bList.add(new Magazine("102", "박지민 과학동아", "편집부 송현석 선생", "나리 사이언스", 8500, "동재 유튜브에 소개된 과학만화 잡지", 2022, 3));
		bList.add(new Book("103", "동건이의 코딩스쿨", "코딩천재 어수지", "상연이네 동네", 9900, "제 13회 석화가 주는 문학상 수상작"));
		bList.add(new Magazine("104", "상용이의 여행일기", "이상용", "시연21", 3800, "영화감독 이종민이 집필한 영화 전문 잡지", 2021, 4));
		bList.add(new Magazine("105", "한기의 데일리룩", "인플루언서 이혜민", "정현이네 책방", 12000, "핫가이 정동석의 샤라웃을 받은 잡지", 2022, 11));
		bList.add(new Book("106", "조연정의 미라클모닝", "연정찡", "지야코 출판사", 6300, "주지훈도 2번 성공한 미라클모닝"));
		bList.add(new Book("107", "차은우의 백만가지 요리레시피", "제주도에서 온 은우", "우리반 출판사", 6300, "제주에서 밥해먹고 사는 일상"));

		printBooks(bList);

	}

	public static void printBooks(ArrayList<Book> bs) {
		// 여기서 메뉴열고 구현 시작
		BookController bc = new BookController();

		for (Book ibook : bs) {
			bc.addBook(ibook);
		} // book 객체 ibook을 만들었고, addBook로 모든 db값 보내기.

		boolean flag = true;

		while (flag == true) { // 메뉴 스위치가 켜져있는 동안 무한반복
			System.out.println("===============================");
			System.out.println("KH 우리반전용 도서관 관리 페이지입니다.");
			System.out.println("1. 조회하기");
			System.out.println("2. 추가하기");
			System.out.println("3. 책 찾기");
			System.out.println("4. 전체책 가격 합계 및 평균 조회");
			System.out.println("5. 프로그램 종료");
			System.out.println("===============================");

			Scanner sc = new Scanner(System.in);
			System.out.print("메뉴번호를 입력해주세요 : ");
			int menu = sc.nextInt(); // 메뉴 번호 입력

			sc.nextLine();

			switch (menu) {
			case 1: // 1. 조회하기
				System.out.println("===============================");
				System.out.println("어떤 방법으로 책을 조회하겠습니까?");
				System.out.println("1. 도서관 전체 소장책 조회하기");
				System.out.println("2. 일반도서만 조회하기(잡지 제외)");
				System.out.println("3. 잡지만 조회하기(일반도서 제외)");
				System.out.println("4. 이전으로");
				System.out.println("===============================");

				System.out.print("메뉴번호를 입력해주세요 : ");
				int search = sc.nextInt();

				sc.nextLine();

				if (search == 1) {
					for (int i = 0; i < bc.getAllBook().size(); i++) {
						System.out.println(bc.getAllBook().get(i));
					} // get을 통해 getAllBook 호출, for문으로 이쁘게 출력
				} else if (search == 2) {

					for (int i = 0; i < bc.onlySearchBook().size(); i++) {
						System.out.println(bc.onlySearchBook().get(i));
					} // get을 통해 onlySearchBook 호출, for문으로 이쁘게 출력

				} else if (search == 3) {

					for (int i = 0; i < bc.onlySearchMagazine().size(); i++) {
						System.out.println(bc.onlySearchMagazine().get(i));
					} // get을 통해 onlySearchMagazine 호출, for문으로 이쁘게 출력

				} else if (search == 4) {// 빠져나가기
				}
				break;

			case 2: // 2. 추가하기
				System.out.print("북 넘버를 입력하세요 : ");
				String bNo = sc.nextLine();

				System.out.print("제목을 입력하세요 : ");
				String title = sc.nextLine();

				System.out.print("작가를 입력하세요 : ");
				String author = sc.nextLine();

				System.out.print("출판사를 입력하세요 : ");
				String publisher = sc.nextLine();

				System.out.print("가격을 입력하세요 : ");
				int price = sc.nextInt();

				sc.nextLine();

				System.out.print("간단한 설명을 입력하세요 : ");
				String description = sc.nextLine();

				System.out.print("일반도서이면 true, 잡지이면 false를 입력하세요 : ");
				Boolean bkOrMaga = sc.nextBoolean();

				if (bkOrMaga.equals(true)) {
					boolean fact = true;

					for (int i = 0; i < bc.getAllBook().size(); i++) {
						if (bc.getAllBook().get(i).getbNo().equals(bNo)) {
							System.out.println("도서명 : 입력하신 " + title + " 도서는 이미 소장하고 있는 책입니다.");
							fact = false;
							break;
						}
					}
					if (fact) {
						bc.addBook(new Book(bNo, title, author, publisher, price, description));
						System.out.println("도서명 : " + "넘버 " + bNo + " '" + title + "' 도서가 추가되었습니다.");
					}
				} else if (bkOrMaga.equals(false)) {
					System.out.print("출간연도를 입력해주세요 : ");
					int year = sc.nextInt();
					System.out.print("출간월을 입력해주세요 : ");
					int month = sc.nextInt();

					boolean fact = true;

					for (int i = 0; i < bc.getAllBook().size(); i++) {
						if (bc.getAllBook().get(i).getbNo().equals(bNo)) {
							System.out.println("도서명 : '" + title + "' 도서는 이미 소장하고 있는 책입니다.");
							fact = false;
							break;
						}
					}
					if (fact) {
						bc.addBook(new Magazine(bNo, title, author, publisher, price, description, year, month));
						System.out.println("도서(잡지)명 : 입력하신 '" + title + "' 도서가 추가되었습니다.");
					}
				}
				break;

			case 3:// 3. 책 찾기
				System.out.println("===============================");
				System.out.println("어떤 방법으로 책을 찾겠습니까?");
				System.out.println("1. bNo으로 책 찾기");
				System.out.println("2. 책 제목으로 책 찾기");
				System.out.println("3. 출간연도로 잡지 찾기");
				System.out.println("4. 출판사로 책 찾기");
				System.out.println("5. 특정 가격 밑으로 책 찾기");
				System.out.println("6. 이전으로");
				System.out.println("===============================");
				System.out.print("메뉴번호를 입력해주세요 : ");
				search = sc.nextInt();
				sc.nextLine();

				if (search == 1) { // bNo으로 책 찾기
					System.out.print("bNo을 입력하세요 : ");
					bNo = sc.nextLine();

					System.out.println(bc.searchBookBybNo(bNo));
				} else if (search == 2) { // 책 제목으로 책 찾기
					System.out.print("책 제목을 입력하세요 : ");
					title = sc.nextLine();
					for (int i = 0; i < bc.searchBookByTitle(title).size(); i++) {
						System.out.println(bc.searchBookByTitle(title).get(i));
					}
				} else if (search == 3) { // 출간연도로 잡지 찾기
					System.out.print("출간연도를 입력하세요 : (올해 --> 2022) : ");
					int year = sc.nextInt();

					ArrayList<Book> yb = bc.magazineOfThisYearInfo(year);

					if (yb != null && !yb.isEmpty()) {
						for (Book book : yb) {
							if (book instanceof Magazine) {
								Magazine magazine = (Magazine) book;
								System.out.println(magazine.toString());
							}
						}
					} else {
						System.out.println("해당 연도에 출간된 잡지가 없습니다.");
					}
				} else if (search == 4) { // 4. 출판사로 책 찾기
					System.out.print("출판사를 입력하세요 : ");
					publisher = sc.nextLine();
					for (int i = 0; i < bc.searchBookByPublisher(publisher).size(); i++) {
						System.out.println(bc.searchBookByPublisher(publisher).get(i));
					}

				} else if (search == 5) { // 5. 특정 가격 밑으로 책 찾기
					System.out.print("가격을 입력하세요 : ");
					price = sc.nextInt();
					for (int i = 0; i < bc.searchBookByPrice(price).size(); i++) {
						System.out.println(bc.searchBookByPrice(price).get(i));
					}
//					System.out.println(bc.searchBookByPrice(price));
				} else if (search == 6)
					flag = true; // 6. 이전으로
				else
					System.out.println("잘못 입력하셨습니다.");

				break;

			case 4:// 4. 전체책 가격 합계 및 평균 조회
				System.out.println("모든 책의 가격 합계 : " + bc.getTotalPrice() + "원");
				for (int i = 0; i < (bs.size()); i++) {
					System.out.print(bc.getAllBook().get(i).getPrice() + "원");
					if (i == (bs.size()-1)) {
						break;
					} else {

						System.out.print(" + ");

					}
				}
				System.out.println("");
				System.out.println("모든 책의 가격 평균 : " + bc.getAvgPrice() + "원");
				System.out.println("(" + bc.getTotalPrice() + "원) / (" + bs.size() + "권) = " + bc.getAvgPrice() + "원");
				break;

			case 5:
				System.out.println("프로그램을 종료합니다. 수고하셨습니다. ");
				return;
			default:
				break;
			}
		}
	}
}