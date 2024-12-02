package com.kh.practice.func;

import java.util.Scanner;

public class OperatorP {

	public void Practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나를 입력해주세요:) : ");
		int number = sc.nextInt();
		
		String result = (number >0)? "양수다!" : "양수가 아니다!";		
		System.out.println(result);
		sc.close();
	}
	
	public void Practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나를 입력 해주세요 : ");
		
		int number = sc.nextInt();
		
		String result = (number > 0)? "양수다" : (number==0)? "0이다" : (number <0)? "음수다" : "양수다.";
		
		System.out.println(result);
		
		sc.close();
		
	}
	
	public void Practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력해 주세요. : ");
		
		int number = sc.nextInt();
		
		String result = (number % 2 == 0)? "짝수다" : "홀수다.";
		
		System.out.println(result);
		sc.close();
		}

	public void Practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 인원을 적어주세요 : ");
		
		int people = sc.nextInt();
		
		System.out.println("사탕개수를 적어주세요 : ");
		
		int candy = sc.nextInt();
		
		int Ppeople = (candy / people);
		int Ccandy = (candy % people);
		
		System.out.println("1인당 사탕 개수 : " + Ppeople);
		System.out.println("남는 사탕 개수" + Ccandy);
		sc.close();
	}

	public void Practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 적어주세요 : ");
		String Name = sc.nextLine();
		
		System.out.print("학년이 적어주세요 (숫자만): ");
		int Grade = sc.nextInt();
		
		
		System.out.print("반을 적어주세요 (숫자만): ");
		int ClassNumber = sc.nextInt();
		
		
		System.out.print("번호를 적어주세요 (숫자만) : ");
		int StudentNumber = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별을 적어주세요(M/F) : ");
		
		char Gender = sc.nextLine().charAt(0);
		String StudentGender = (Gender =='M')? "남학생" : "여학생";
		
		System.out.print("성적을 적어주세요(소수점 둘째자리까지) : ");
		double Score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f입니다. 감사합니다. " , Grade, ClassNumber, StudentNumber, Name, StudentGender, Score);
		sc.close();
	}

	public void Practice6() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 적어주세요 : " );
		
		int age = sc.nextInt();
		
		String result = (age > 19)? "성인" : (age < 13)? "어린이" : (age <= 19)? "청소년" : "누구세요";
		
		System.out.println(result);
		
		sc.close();
		
}
	
	public void Practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 영역 점수 : ");
		int Kor = sc.nextInt();
		
		System.out.print("영어 영역 점수 : ");
		int Eng = sc.nextInt();
		
		System.out.print("수학 영역 점수 : ");
		int Math = sc.nextInt();
		
		int sum = Kor + Eng + Math;
		double avg = sum /3.0;
		String result = (Kor <40)? "불합격" : (Eng <40)? "불합격" : (Math<40)?"불합격": (avg<60)?"불합격" :"합격";
		//(Kor >= 40) &&(End >= 40) &&(Math >= 40)&& (avg >=60)? "합격":"불합격" 
		
		System.out.println("총 합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println(result);
		
	}

	public void Practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력해주세요  ( '-' 포합해주세요) :");
		
		char Pnumber = sc.nextLine().charAt(7);
		
		String result = (Pnumber == '1')? "남자" :(Pnumber == '3')? "남자" : (Pnumber == '2')? "여자" : (Pnumber == '4')? "여자" : "누구세요";
		
		System.out.println(result);
		
		sc.close();
	}

	public void Practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 한개를 입력해 주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 한개를 한번더 입력해 주세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("마지막으로 정수 한개를 한번더 입력해 주세요 : ");
		int num3 = sc.nextInt();
		
		String result = (num1 >= num2) ? "num1은 num2보다 작아야함.." : (num3 <= num1 || num3 > num2) ? "true" : "false";
		System.out.println(result);
		
	}

	public void Practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1  : ");
		int num1 = sc.nextInt();
		System.out.print("입력2  : ");
		int num2 = sc.nextInt();
		System.out.print("입력3  : ");
		int num3 = sc.nextInt();

		boolean result= (num1 == num2) && (num2 == num3);
		System.out.println(result);
		
		
	}

	public void Practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉을 입력해 주세요 : ");
		int Asalary = sc.nextInt();
		System.out.print("B사원의 연봉을 입력해 주세요 : ");
		int Bsalary = sc.nextInt();
		System.out.print("C사원의 연봉을 입력해 주세요 : ");
		int Csalary = sc.nextInt();
		
		
		double totalAsalary = Asalary * 1.4;
		String result1 = (totalAsalary > 3000)? "3000이상" : "3000미만";
		double totalBsalary = Bsalary;
		String result2 = (totalBsalary > 3000)? "3000이상" : "3000미만";
		double totalCsalary = Csalary * 1.15;
		String result3 = (totalCsalary > 3000)? "3000이상" : "3000미만";
		
		
		System.out.printf("A사원 연봉/연봉+a : %d / %.1f\n" ,Asalary, totalAsalary);
		System.out.println(result1);
		System.out.printf("B사원 연봉/연봉+a : %d / %.1f\n" ,Bsalary, totalBsalary);
		System.out.println(result2);
		System.out.printf("C사원 연봉/연봉+a : %d / %.13f\n" ,Csalary, totalCsalary);
		System.out.println(result3);		
	}
}