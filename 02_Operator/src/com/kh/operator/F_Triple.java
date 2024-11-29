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
		
		
}
