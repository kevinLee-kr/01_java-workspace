package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {

	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();

	public void mainMenu() {
		/*
		 * 1. 지정 문자열 ➔ tokenMenu() 2. 입력 문자열 ➔ inputMenu() 3. 프로그램 끝내기 ➔ “프로그램을 종료합니다”
		 * 출력 후 종료 // 잘못 입력했을 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
		 */
		System.out.println(" ");
		System.out.println("1. 지정 문자열 "); // -> tokenMenu
		System.out.println("2. 입력 문자열 "); // ->input menu
		System.out.println("3. 프로그램 끝내기"); // -> 출력후 종료.
		System.out.print("메뉴 번호 : ");
		int userChoice = sc.nextInt();

		while (true) {

			if (userChoice > 0 && userChoice < 4) {
				// 각 메소드로 보내줘야 하는데 어캐 보내주지
				switch (userChoice) {
				case 1:tokenMenu();break;
				case 2:inputMain();break;
				case 3:System.out.println("프로그램을 종료합니다.");return;
				}
				break;
			} else {
				System.out.println("잘못 입력하셨습니다, 다시 입력해주세요 : ");
				System.out.println(" ");
				return;
			}
		}

	}

	public void tokenMenu() {

		String str = "J a v a P r o g r a m ";

		tc.afterToken(str);

		mainMenu();
	}

	public void inputMain() {

		// 첫 글자 대문자와 찾을 문자 몇 개 있는지 출력.
		System.out.print("문자열을 입력하세요 : ");
		String input = sc.nextLine();
		String str3 = tc.firstCap(input);
		System.out.println(str3);
		
		// 찾는 문자 개수
		System.out.println("찾는 문자를 하나 입력하세여 : ");
		char one = sc.nextLine().charAt(0);
		int i3 = tc.findChar(input, one); // apple, p
		System.out.println(one + " 문자가 들어간 개수 : " + i3);
		
		mainMenu();
	}

}
