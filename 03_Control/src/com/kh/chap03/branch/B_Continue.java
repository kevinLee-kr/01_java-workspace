package com.kh.chap03.branch;

import java.util.Scanner;

public class B_Continue {
	/*
	 * 
	 * continue 반복문 안에 기술되는 구문 , 구문 실행시 그 아래 구문을 실행하지 않고, 곧바로 현재 속해잇는 반복문 위로 올라감.
	 * 
	 * 
	 */
	public void method1() { // for문으로1부터 10까지 홀수 출력 1 3 5 7 9

//		for(int i = 1 ; i<=9 ; i++) {
//			System.out.print(i + " ");
//			i+=1;
//		}

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i + " ");
		} // continue 를 씀으로써, 짝수필터if문에 해당이 되는 i가 되었을떄, contunue를 씀으로써, 코드를 그대로 진행시켜
			// for문 1싸이클단계인 ++증감을 시키고 스킵한다. 라고 이해했다. 맞나?

	}

	public void method2() { // 1부터 100까지의 누접합 단, 6의 배수값은 빼고 덧셈 연산을 하고싶다.
		// 1. 1부터 100까지의 총합계 먼저 for문 짜자

		int sum = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 6 == 0) {
				continue; // i가 6이 됬을때, 원래 아래에 있는 sum+1 을 할려고 했는데, continue 되서 그냥 위로 올라간다. (i++)된다.
			}
			sum += i;
		}

		System.out.println("1부터 100까지의 총합계 : " + sum);
	}

	public void method3() { // 2~9단 까지 출력 , 단, 3의 배수단은 뺴고 출력

		for (int j = 1; j <= 9; j++) {
			if (j % 3 == 0) {
				continue;
			} else {
				System.out.printf("==== %d단 ====\n", j);

				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d x %d = %d\n", j, i, j * i);
				}
			}

		}

	}

	public void method88(){
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		int starNum = sc.nextInt();
		
		for (int i = 1; i<=starNum;i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print('*');
			}
			System.out.println(" ");
		}
		
		
		
		
	}


}
