package domyself.src.com.kh.contorller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import domyself.src.com.kh.model.vo.Book;

public class BookController {
	// private 접근제한자로 크기 5의 Book 객체 배열 생성
	private Book[] list = new Book[6];
	// 각각의 인덱스에 접근하여 샘플 데이터 넣어서 객체 생성
	{
		list[0] = new Book("자바의 정석", "차은우", "나무", new Date(2023 - 1900, 6 - 1, 14), 10000);
		list[1] = new Book("여러분 파이팅", "주지훈", "사과", new Date(2023 - 1900, 5 - 1, 11), 20000);
		list[2] = new Book("API의 모든 것", "문동은", "오렌지", new Date(2020 - 1900, 4 - 1, 25), 35000);
		list[3] = new Book("언어의 천재", "장원영", "키위", new Date(2015 - 1900, 1 - 1, 01), 70000);
		list[4] = new Book("개발 왕국	", "시연쌤", "바나나", new Date(2022 - 1900, 12 - 1, 25), 80000);
	}

	public BookController() {
	}

	// 1. 도서 전체 출력 기능 메소드
	public void printALL() {
		// list에 담긴 전체 Book객체의 정보 출력하는 구문 작성하시오.
		/*
		 * // 1) for loop문 방법 for (int i = 0; i < list.length; i++) { if (i < 5) {
		 * System.out.println(list[i]); } }
		 */
		// 2) for each문 방법 (향상된 for문)
		for (Book k : list) {
			if (k != null) {
				System.out.println(k);
			}
		}

	}

	// 2. 도서 추가 기능 메소드
	public void insertBook(String newTile, String newAuthor, String newPublisher, String newDate, String newPrice) {
		// 1. 매개변수로 전달받은 newPrice값 ==> String --> int로 변환작업 (int price라는 변수에 담으시오)
		int price = Integer.parseInt(newPrice);

		// 2. 매개변수로 전달받은 newDate값 ==> String --> Date로 변환 작업 (Date publishDate에 담으시오)
		// '-'를 구분자로 StringTokenizer를 이용하여 문자열 분리 후 각각 년,월,일 을 Date에 적용
		// 1) StringTokenizer를 이용한 방법
		// 1_1) StringTokenizer를 이용하여 먼저 "2020-07-01" 을 각각 문자열로분리("2020", "07", "01")
		// 1_2) 각 분리된 문자열들을 매번 뽑아서 int 변수들에 담기
		// 1_3) year, month, date 가지고 Date객체 생성하기
		// StringTokenizer str = new StringTokenizer(newDate,"-");
		/*
		 * int year = Integer.parseInt(str.nextToken()); int month =
		 * Integer.parseInt(str.nextToken()); int day =
		 * Integer.parseInt(str.nextToken()); Date publishDate = new Date(year-1900,
		 * month-1, day);
		 */

		// 2) split 메소드를 이용한 방법
		// 2_1) split 메소드를 이용하여 먼저 "2020-07-01" 을 각각 문자열로 분리후 String[] 배열에 담기
		String[] str1 = newDate.split("-");
		// 2_2) 각 분리된 문자열들이 담겨있는 해당 배열에 인덱스에 접근해서int 변수들에 담기
		int year = Integer.parseInt(str1[0]);
		int month = Integer.parseInt(str1[1]);
		int day = Integer.parseInt(str1[2]);
		
		

		// 2_3) year, month, date 가지고 Date객체 생성하기
		Date publishDate = new Date(year - 1900, month - 1, day);
		// 3. 나머지 전달받은 값들과 위에서 변환작업을 해준 price와 date값을가지고
		list[5] = new Book(newTile, newPrice, newPublisher, publishDate, price);
		// Book클래스의 매개변수 생성자를 통해 생성
	}

	// 3. 도서 출간일 출력 기능 메소드
	public void printBookPublishDate() {
		// 새로 입력받은 도서 (5번째 도서)의 출간일 출력

		// "xxxx년 xx월 xx일 출간" 과 같은 패턴으로 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		// SimpleDateFormat을 이용하여 출력
		System.out.println(sdf.format(list[5].getPublishDate()) + "\n출간");
	}

	// 4. 도서 검색 기능 메소드
	public void searchBook(String searchTitle) {
		// 도서 리스트를 전체적으로 조회하면서 (for문 이용)
		// 전달받은 검색명을 포함(HINT : String클래스의 contains메소드 활용)한!! 도서들 전체 출력

		// 1) for loop문 방법
		for (int i = 0; i < 6; i++) {
			if (list[i].getTitle().contains(searchTitle)) {
				System.out.println(list[i]);
			}
		}

		// 2) for each문 방법 (향상된 for문)
	}

}
