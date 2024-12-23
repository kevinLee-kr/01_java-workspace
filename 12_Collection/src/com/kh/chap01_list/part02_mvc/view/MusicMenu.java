package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicMenu {
	// 메인 화면, 프로그램 실행 시 처음 보여주는 화면을 정의해보자.

	// 전역변수는 필드부이므로, 그러면 무조건 접근제한자를 써야 한다.
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	public void mainMenu() {

		while (true) {
			// 기억하자, 여기는view 파일이니까 , sysout 같은 출력문이 나오는것이 당연한데, 그 외에 파일에서는 sysout 이 나오는것은
									// 불가능하다.

			System.out.println("\n====Welcom 별밥 ====");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정곡 삭제");
			System.out.println("4. 특정곡 검색 ");
			System.out.println("5. 특정곡 수정");
			System.out.println("0.프로그램 종료");

			System.out.print(">> 메뉴 선택 해주세요 : ");
			int menu = sc.nextInt(); 
			sc.nextLine();// in t 형 입력값 받으면 그냥 이거 적어라. 

			switch(menu) {//해당 메서드로 전송 및 호출.
			case 1: insertMusic(); break;
			case 2: selectMusic(); break;
			case 3: deletMusic(); break;
			case 4: searchMusic(); break;
			case 5: updateMusic(); break;
			case 0: System.out.println("프로그램을 종료합니다.");return;//view단 인 것을 확인 하고 sysout 사용하자. 
			//return은 나를 부른곳으로 돌아간다. 여기선 MVCRun의 mm.MusicMenu(); 로 돌아가고 이어서 다음코드 수행한다. 
			default : System.out.println("잘못 입력하셨습니다. ");break;
			}
		}
	}

	// 곡을 추가 하는 화면을 만들어보자.
	// alt + shift + j을 누르면 퍼런 별이 나오는데
	// 화면을 만든다? 라고 선생님이 표현 하셨다.
	/**
	 * 1. 새로운 곡 추가하는 서브 화면.
	 */
	public void insertMusic() {
		System.out.println("\n======새로운 곡 추가해봅시다 ======");
		//타이틀, 가수 값을 입력 받아야함.
		System.out.print("제목 입력 : " );
		String title = sc.nextLine();
		
		System.out.print("가수 입력 :");
		String artist = sc.nextLine();
		
		//이것좀 처리좀 해줘.
		mc.insertMusic(title,artist);
	}

	/**
	 * 2. 전체 곡 조회용 서브화면
	 */
	public void selectMusic() {
		System.out.println("\n==== 전체 곡 리스트 ====");
		ArrayList<Music> list = mc.selectMusic();
//		for(int i = 0 ; i<list.size();i++) {     // 만약에 리스트가 비어있을때, 전부 삭제 되었을떄 이 for문은 돌지 않는다. 
//			System.out.println(list.get(i));
//		}
		if(list.isEmpty()) {
			System.out.println("현재 존재하는 곡이 없습니다.");
		}else {
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i));
			}
		}
	}

	/**
	 * 3. 특정곡 삭제 시켜주는 서브 화면.
	 */
	public void deletMusic() {
		System.out.println("\n======== 특정 곡 삭제========");
		System.out.println("삭제 하고자 하는 곡을 입력해 주세요: ");
		String title = sc.nextLine();
		
		int result = mc.deletMusic(title);
		
		if(result == 1) {
			System.out.println(title + "은 성공적으로 삭제 되었습니다.");
		}else {
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}
		
	}

	/**
	 * 4. 특정곡 검색 해주는 서브화면.
	 */
	public void searchMusic() {
		System.out.println("\n======================특정 곡 검색 ====================");
		
		//1. 간단 버전.
//		System.out.println("검색할 곡 명(키워드만도 가능함)");
//		String keyword = sc.nextLine();
//		
//		ArrayList<Music> searchList =  mc.searchMusic(keyword);
		
		//2. 심화 버전.
		
		System.out.println("1) 제목으로 검색");
		System.out.println("2) 가수명으로 검색");
		int menu = sc.nextInt();
		sc.nextLine();
		
		System.out.println("검색 키워드 : " );
		String keyword = sc.nextLine();
		
		ArrayList<Music> searchList =  mc.searchMusic(menu, keyword);
		
		if(searchList.isEmpty()) {
			System.out.println("검색된 결과가 없습니다.. 다시 입력해 주세요..");
		}else { 
			for(int i = 0 ; i < searchList.size();i++) { 
				System.out.println(searchList.get(i));
			}
					
		}
		
	}

	/**
	 * 5. 특정곡 수정해주는 서브화면.
	 */
	public void updateMusic() {

	System.out.println("\n========특정 곡 수정화면========");
	
	System.out.print("수정 할 곡을 적어주세요 :");
	String title = sc.nextLine();
	
	System.out.print("수정 내용(가수) : ");
	String upArtist = sc.nextLine();
		
	System.out.print("수정 내용(곡명) ");
	String upTitle = sc.nextLine();
	
	int result = mc.updateMusic(title, upArtist, upTitle);
		
		if(result>0) {
			System.out.println("성공적으로 수정이 되었습니다. ");
		}else {
			System.out.println("수정할 곡을 찾지 못했습니다. ");
		}
		
		
		
		
		
		
		
		
		
	}
	// 과제 할떄 무슨무슨무슨 화면 만들라 하면 여기서 이렇게 만들어야 한다.
	
}
