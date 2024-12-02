package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	public void method1() {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.println("메뉴를 선택해주세요: ");
		int menu = sc.nextInt();

		if (menu == 1) {
			System.out.println("입력 메뉴 접속합니다.");
		} else if (menu == 2) {
			System.out.println("수정 메뉴 접속합니다.");
		} else if (menu == 3) {
			System.out.println("조회 메뉴 접속합니다.");
		} else if (menu == 4) {
			System.out.println("삭제 메뉴 접속합니다.");
		} else if (menu == 7) {
			System.out.println("종료하겠습니다. 고생하셨습니다.");
		} else {
			System.out.println(" 잘못누르셨습니다. 확인부탁드립니다.");
		}
		sc.close();

	}

	public void method2() {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 한 개 입력해주세요 : ");
		int number = sc.nextInt();

		String result = "";

		if (number < 0) {
			System.out.println("양수만 입력 해주십시오.");
		} else if (number % 2 == 1) {
			result = "홀수입니다..";
		} else {
			result = "짝수입니다.";
		}
		System.out.println(result);
		sc.close();
	}

	public void method3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();

		System.out.print("영어점수 : ");
		int eng = sc.nextInt();

		System.out.print("수학점수 : ");
		int math = sc.nextInt();

		int sum = kor + eng + math;
		double avg = sum / 3.0;

		if (kor >= 40) {
			if (eng >= 40) {
				if (math >= 40) {
					if (avg >= 60) {

						System.out.println("국어 : " + kor);
						System.out.println("수학 : " + math);
						System.out.println("영어 : " + eng);
						System.out.println("합계 : " + sum);
						System.out.println("평균 : " + avg);
						System.out.println("축하합니다. 합격입니다.");
					} else {
						System.out.println("불합격");
					}
				} else {
					System.out.println("불합격");
				}
			} else {
				System.out.println("불합격");
			}
		} else {
			System.out.println("불합격");
		}

	}

	public void method4() {

		Scanner sc = new Scanner(System.in);
		System.out.print("1월 부터 12월 까지 하나의 월을 입력해주세요. : ");
		int month = sc.nextInt();
		String season = "";

		switch (month) {

		case 3:
		case 4:
		case 5:
			season = "봄";
			break;

		case 6:
		case 7:
		case 8:
			season = "여름";
			break;

		case 9:
		case 10:
		case 11:
			season = "가을";
			break;

		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;

		default:
			System.out.printf("%d월은 잘못 입력된 달 입니다. 확인 부탁드립니다.", month);
			return;
		}
		System.out.printf("%d월은 %s입니다. 감사합니다. ^^", month, season);
		sc.close();

	}

	public void method5() {

		String id = "abcd123";
		String pw = "1q2w3e4r";

		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String userId = sc.nextLine();

		System.out.print("비밀번호 입력 : ");
		String userPw = sc.nextLine();

		if (id.equals(userId)) {
			if (pw.equals(userPw)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
		sc.close();
	}

	public void method6() {

		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인 하고자 하는 회원님의 등급을 적어주세요(관리자/회원) : ");
		String level = sc.nextLine();

		switch (level) {
		case "관리자":
			System.out.println("가능한 권한 : 회원관리, 게시글 관리, 작성 그리고 조회, 댓글 작성");
			break;

		case "회원":
			System.out.println("가능한 권한 :게시글 작성 및 조회, 댓글 작성");
			break;

		default:
			System.out.println("가능한 권한 :게시글 조회");
		}
		sc.close();

	}

	public void method7() {

		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게를 입력해 주세요 : ");
		double weight = sc.nextDouble();

		double BMI = weight / (height * height);
		String result = "";

		if (BMI >= 30) {
			result = "고도비만";
		} else if (BMI >= 25) {
			result = "비만";
		} else if (BMI >= 23) {
			result = "과체중";
		} else if (BMI >= 18.5) {
			result = "정상체중";
		} else if (BMI < 18.5) {
			result = "저체중";
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}

		System.out.println(height);
		System.out.println(weight);
		System.out.println(BMI);
		System.out.println(result);

	}

	public void method8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("피연사자1 입력(정수) : ");
		double num1 = sc.nextInt();
		System.out.print("피연사자2 입력(정수) : ");
		double num2 = sc.nextInt();

		sc.nextLine();

		System.out.print("연산자를 입력 ex)( +   -   *   /   % ) :  ");
		char num3 = sc.nextLine().charAt(0);

		double result = 0;

		if (num1 > 0) {
			if (num2 > 0) {
				if (num3 == '+') {
					result = num1 + num2;
				} else if (num3 == '-') {
					result = num1 - num2;
				} else if (num3 == '*') {
					result = num1 * num2;
				} else if (num3 == '/') {
					result = num1 / num2;
				} else if (num3 == '%') {
					result = num1 % num2;
				}
			}
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		System.out.printf("%.0f %s %.0f = %f", num1, num3, num2, result);

	}

	public void method9() {

		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		int ms = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int ls = sc.nextInt();
		System.out.print("과제 점수 : ");
		int hs = sc.nextInt();
		System.out.print("출석 회수 : ");
		double as = sc.nextDouble();

		String result= "";
		double mid = ms * 0.2;
		double last = ls * 0.3;
		double home = hs * 0.3;
		double att = as * 0.2;
		double total = mid + last + home + as;
		
		if(as < 7) {
			System.out.printf("Fail [출석 회수 부족 (%.0f/%.0f)]",as,(double)20);
		}else if(total >= 70){
			System.out.println("중간 고사 점수(20) : " + mid);
			System.out.println("기말 고사 점수(30) : " + last);
			System.out.println("과제 점수    (30) : " + home);
			System.out.println("출석 회수    (20) : " + as);
			System.out.println("총점             : " + total);
			System.out.println("합격입니다 축하합니다.");
		}else {
			System.out.println("중간 고사 점수(20) : " + mid);
			System.out.println("기말 고사 점수(30) : " + last);
			System.out.println("과제 점수    (30) : " + home);
			System.out.println("출석 회수    (20) : " + as);
			System.out.println("총점             : " + total);
			System.out.println("Fail [점수 미달]");
		}
		sc.close();
		}

	public void method10() {

		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택해주세요 : ");
		System.out.println("1. 메뉴 출력 : ");
		System.out.println("2. 짝수 / 홀수 : ");
		System.out.println("3. 합격 / 불합격 : ");
		System.out.println("4. 계절 : ");
		System.out.println("5. 로그인  : ");
		System.out.println("6. 권한 확인 : ");
		System.out.println("7. BMI : ");
		System.out.println("8. 계산기 : ");
		System.out.println("9. Pass / Fail : ");
		System.out.println("선택 :  ");

		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			method1();
		case 2:
			method2();
		case 3:
			method3();
		case 4:
			method4();
		case 5:
			method5();
		case 6:
			method6();
		case 7:
			method7();
		case 8:
			method8();
		case 9:
			method9();
		default:
			System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요.");
		}

	}

}
