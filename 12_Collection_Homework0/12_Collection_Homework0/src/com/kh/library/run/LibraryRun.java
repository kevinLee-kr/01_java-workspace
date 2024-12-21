package com.kh.library.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.library.controller.BookController;
import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

public class LibraryRun {

	public static void main(String[] args) {// 소장책 DB
		ArrayList<Book> bList = new ArrayList<>();

		/* 생성 DB
		bList.add(new Book("100", "잃어버린 성훈이를 찾아서", "고영훈 박사", "나무 출판사", 8500, "『시연스』, 『르 몽드』 선정 20세기 최고의 책"));
		bList.add(new Book("101", "준서의 자서전", "김준서가 옮김", "빛나는 현지출판사", 8500, "영화배우 서동진이 추천한 젊음에 바치는 영혼의 자서전"));
		bList.add(new Magazine("102", "손희찬 과학동아", "편집부 신현정 선생", "리얼 사이언스", 8500, "용훈이네 유튜브에 소개된 과학만화 잡지", 2024, 3));
		bList.add(new Book("103", "지은이의 코딩스쿨", "코딩천재 이지은", "코딩하는 동네", 9900, "제 13회 호석이가 주는 문학상 수상작"));
		bList.add(new Magazine("104", "창용이의 여행일기", "창용짱", "시연21", 3800, "영화감독 정회윤이 집필한 영화 전문 잡지", 2024, 4));
		bList.add(new Magazine("105", "현수의 데일리룩", "인플루언서 주현수", "우리네 책방", 12000, "핫가이 한재희의 샤라웃을 받은 잡지", 2024,11));
		bList.add(new Book("106", "차은우의 미라클모닝", "차은우", "존잘 출판사", 6300, "회윤이도 2번 성공한 미라클모닝"));
		bList.add(new Book("107", "현정이의 백만가지 요리레시피", "현정 신 지음", "우리반 출판사", 19900, "학원에서 밥해먹고 사는 일상"));
		 */

		printBooks(bList);

	}

	public static void printBooks(ArrayList<Book> bs) {
		// 여기서 메뉴열고 구현 시작
		BookController bc = new BookController();


		boolean flag = true; // 메뉴 스위치

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
			
			switch (menu) {
			case 1: // 1. 조회하기
				System.out.println("===============================");
				System.out.println("어떤 방법으로 책을 조회하겠습니까?");
				System.out.println("1. 도서관 전체 소장책 조회하기");
				System.out.println("2. 일반도서만 조회하기(잡지 제외)");
				System.out.println("3. 잡지만 조회하기(일반도서 제외)");
				System.out.println("4. 이전으로");
				System.out.println("===============================");

				sc.nextLine();

				System.out.print("메뉴번호를 입력해주세요 : ");
				int search = sc.nextInt();
				
				if (search == 1) {
					//bc.getAllBook
				}
				else if (search == 2) {
					//bc.onlySearchBook()
				}
				else if (search == 3) {
					//onlySearchMagazine
				}
				else if (search == 4) {
					// 이전으로 가야함
				}
				break;
				
			case 2: // 2. 추가하기
				System.out.print("bNo을 입력하세요 : ");
				String bNo = sc.nextLine();
				
				System.out.print("책 제목을 입력하세요 : ");
				sc.nextLine();
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
					//book 객체 생성
					//bc.add()
					
				} else if (bkOrMaga.equals(false)) {
					System.out.print("출간연도를 입력하세요 : ");
					int year = sc.nextInt();
					System.out.print("출간월을 입력하세요 : ");
					int month = sc.nextInt();
					//magazine객체생성
					//bc.add()
					
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
					
					//bc.searchBookBybNo()
				} else if (search == 2) { // 책 제목으로 책 찾기
					System.out.print("책 제목을 입력하세요 : ");
					title = sc.nextLine();
					//bc.searchBookByTitle()
				} else if (search == 3) { // 출간연도로 잡지 찾기
					System.out.print("출간연도를 입력하세요 : (올해 --> 2022) : ");
					int year = sc.nextInt();
					//magazineOfThisYearInfo()
				} else if (search == 4) { // 4. 출판사로 책 찾기
					System.out.print("출판사를 입력하세요 : ");
					publisher = sc.nextLine();
					//bc.searchBookByPublisher()
				} else if (search == 5) { // 5. 특정 가격 밑으로 책 찾기
					System.out.print("가격을 입력하세요 : ");
					price = sc.nextInt();
					sc.nextLine();
					//bc.searchBookByPrice()
				} else if (search == 6)
					flag = true; // 6. 이전으로
				else
					System.out.println("잘못 입력하셨습니다.");
				
				break;
				
			case 4:// 4. 전체책 가격 합계 및 평균 조회
				System.out.println("전체책 가격 합계 : " );
				System.out.println("전체책 가격 평균 : " );
				break;
				
			case 5: 
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				break;
			}
		}
	}
}
