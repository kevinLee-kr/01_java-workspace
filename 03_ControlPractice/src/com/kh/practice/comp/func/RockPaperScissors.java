package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {

	public void rps() {

		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		String comChoice = " ";
		int win = 0;
		int loose = 0;
		int draw = 0;
		
		while(true) {
			
			System.out.print("가위 바위 보 : ");
			String userChoice = sc.nextLine();
			
			int random = (int)(Math.random()*3+1);
			
			switch(random) {
			case 1: comChoice="가위";break;
			case 2: comChoice="바위";break;
			case 3: comChoice="보";break;
			}
			if(userChoice.equals("exit")) {
				System.out.println("프로그램을 종료하겠습니다. 고생하셨습니다.");
				System.out.printf("%d전 %d승 %d패 %d무	", (win+loose+draw),win, loose, draw);
				break;
			}else if (userChoice.equals("가위")||userChoice.equals("바위")||userChoice.equals("보")) {
				
				
				System.out.println("컴퓨터 : " + comChoice);
				System.out.println(name +" : " + userChoice);
				
				
				if(userChoice.equals(comChoice)) {
					System.out.println("무승부 입니다.");
					draw++;
				}else if(userChoice.equals("가위")&&(comChoice.equals("바위"))||(userChoice.equals("바위")&&(comChoice.equals("보"))||(userChoice.equals("보")&&(comChoice.equals("가위"))))){
					System.out.println("제가 이겼습니다.");
					loose++;
				}else {
					System.out.println(name + "님께서 승리하셨습니다.");
					win++;
				}
				System.out.println("");
				
			}else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println(" ");

			}
		}
		
		
	}
}
	
	

