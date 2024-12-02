package com.kh.operator;

import java.util.Scanner;

public class F_Triple {

		public void method1() {
			//입력받은 정수 값이 양수인지 아닌지 판별 후 출력
			Scanner sc = new Scanner(System.in);
			
			System.out.println("정수를 입력해주세요 : " );
			int num = sc.nextInt();
			
			// 123은 abcd.
		}
		public void method2() {
			//입력받은 정수값이 짝수인지 홀수인지 판별 후 출력
			
			Scanner odd = new Scanner(System.in);
			System.out.println("수 입력 해 : " );
			int num = odd.nextInt();
			
			String result = (num % 2 ==0)? "짝" : "홀";
			
			System.out.printf("%d는 %s였습니다. 놀랍게도요", num, result);
		}		
		
		public void method3 () {
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 입력 : " );
			int num = sc.nextInt();
			
			String result = (num >0)? "양수" : (num == 0)? "0입니다." : (num<0)? "음수" : "양수";
			System.out.printf(result);
		}
		public void method4 () {
			//사용자에게 종료여부를 입력 받아 판별해서 출력하는 문장
			
			Scanner sc = new Scanner(System.in);
			System.out.println("종료 하시겠습니까? : (yes/no) ");
			
			char ch = sc.nextLine().charAt(0);
			
			
			
			String quit = (ch == 'y')? "종료하겠습니다." : "계속 해보겠습니다.";
			System.out.println(quit);
			
		}

		public void method5() {
			//입력받은 문자값이 영어 소문자인지 아닌지 판별 출력
			//영문자 입력 : 
			//입력한 문자는 소문자 입니다. || 입력한 문자는 소문자가 아닙니다.
			//int 와 char는 자동형변환 된다. 이것을 한번 더 확인하기 위한 코드를 짜보자.
			
			
			Scanner sc = new Scanner(System.in);
			System.out.print("문자를 입력해 주세요 : ");
			char ch = sc.nextLine().charAt(0);
			String result = (ch >='a' && ch <='z')? "입력한 문자는 소문자 입니다." : "입력한 문자는 소문자가 아닙니다.";
			
			System.out.println(result);
			
			sc.close();
			
		}
		
		public void method6() {
			//사용자에게 두개의 정수 값 입력 받고
			//첫번쨰 정수
			//두번째 정수
			//연산자 입력( + - ) :
			//그에 맞는 연산 결과 출력을 하되, 다른 연산자를 입력했을경우 "잘못 입력하셨습니다."
			Scanner sc = new Scanner(System.in);
			System.out.print("첫 번째 정수 입력 : ");
			int fn = sc.nextInt();
			System.out.print("두 번째 정수 입력 : ");
			int sn = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("연산자 입력 ( + - ) :");
			char Logic = sc.nextLine().charAt(0);
		
			String result = (Logic == '+')? (fn+sn+"") :(Logic == '-')? (fn-sn+"") : "잘못 입력 하셨습니다.";
			System.out.println(result);
			
		}
}
