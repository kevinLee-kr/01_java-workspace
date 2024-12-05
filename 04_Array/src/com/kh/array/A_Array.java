package com.kh.array;

import java.util.Scanner;

public class A_Array {

	// 하나의 공간에 하나의 값을 담을 수 있음.
	// 배열 : 하나의 공간에 여러개의 값을 담는 개념.
	// "같은 자료형의 값" 으로만 담을 수 있ㅇㅇ
	// 배결의 각 인덱스 자리에 실제 값이 담김.
	public void method1() {
		// 만약 변수 5개의 값을 입력을 받아 보관을 해야한다.
		// 지금까지는 각 하나씩 int 형 변수로 보관을 했었다.

		// 이런식이면 매우 불편한점이 많았는데 예로 들면 총합구할때이다.
		// int sum = num1 + num2 + num3 ...
//1.배열 선언[표현법]
		// 자료형 배열명[];
		// 자료형[] 배열명; => 선호한다 많은 사람들이

		int[] acc; // 자료형이 int 형이므로 무조건 int 값만 담긴다.

//2.배열 할당하는 법  (크기를 정해주는 단계)
		// 배열명 = new 자료형[배열크기];
		acc = new int[5];

		// 배열을 생성과 동시에 할당
		int[] arr = new int[5];

//3.값 대입
		// 배열명 [인덱스] = 값;
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;

		// 딱 보았을때, 반복되는거 같은데..?
//4. 반복문 도입
		for (int i = 0; i <= 4; i++) { // 0 1 2 3 4
			System.out.println(arr[i]);
		}
		System.out.println(arr); // 실제 arr이라는 박스를 열어보니 " 주소값 " 이라는게 담겨 있음.
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);

	}

	public void method2() {
		// 배열형은 주로 참조 자료형이라고도 부른다.
		// 배열과 선언을 동시에 할당 해보자!! 아자!
		int[] iArr = new int[5];

		double[] dArr = new double[3];

		System.out.println(dArr[1]);

		// 실제 값을 곧바로 담을 수 있는 변수를 일반 변수라고 얘기하고
		// 주소값을 담고 있는 변수는 참조변수(레퍼런스 변수)리고 하는다.

		// 기본자료형(boolean, char, byte, short, int, long, float, double);으로 선언된 변수(기본자료)
		// => 실제 리터럴 값을 바로 담는 변수 -> 그냥 변수
		// 위에 자료형들을 제외하고는 모두 참조자료형으로 정의한다.
		// ex) int[] double[] char[] short] String[] 등 많다.
		// 특징>주소값을 담은 변수, 참조 변수.(레퍼런스 변수)
	}

	public void method3() {

		int[] iArr = new int[3]; // 0번 인덱스 ~ 2번 인덱스
		double[] dArr = new double[4];// 0번 인덱스 ~ 3번 인덱스
		// 위에것들은 배열 선언을 하고 크기지정(할당 까지만) 한 상태이다.
		// 그럼 각각의 인덱스에 초기화가 되어있을까? 답은 yes!

		// 각각의 인덱스에 값을 아직 담지 않았고 , 일단 출력해보자.
		// iArr 배열 출력 ㄱㄱ
		for (int i = 0; i < 3; i++) {
			System.out.println(iArr[i]);
		}
		System.out.println("===========");
		// dArr 배열 출격 ㄱㄱ
		for (int i = 0; i < 4; i++) {
			System.out.println(dArr[i]);
			// 배열에 값을 넣지 않았음에도 0이 들어가 있다. 이것을 초기화' 라고 한다.
			// (heap이라는 공간에 빈공간은 조재할 수 없다. ) -> 따라서 jvm 이 기본적으로 초기화(대입)을 진햏한다.
		}

	}

	public void method4() {// for문을 활용해 배열 i값 증가 시키기.
		int[] arr = new int[5];
		/*
		 * arr[0] = 0; arr[1] = 1; arr[2] = 2; arr[3] = 3; arr[4] = 4; arr[5] = 5;
		 */
		for (int i = 0; i < 5; i++) {
			arr[i] = (i + 1);
		}
		for (int i = 0; i <= 4; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr); // 배열의 자료형 + @ + 주소값의 16진수 형태 -> 주소 뜻 풀이
		System.out.println(arr.hashCode()); // 주소값의 10진수 형태.
		System.out.println("배열의 길이 : " + arr.length);// 전체적으로 코드를 작성할때 동적형을 추구할수록 유연성이 높아진다. 당연하겠지?

		// *******주의 조ㅜ의 주의 *******
		// 배열 크기 변경 요청 -> 5로 생성했고 쓰다보니까 부족해, 10을 늘려야 할것 같애.
		// 안됨. 못바꿈, 새로 만들어야함.

	}

	public void method5() { // 배열을 쓰면서 볼 수 있는 오류들 모음;;

		// 배열을 쓰면서 볼 수 있는 오류들 모음;;
		// int[] arr;

		// System.out.println(arr); 초기화가 안돼있어서 오류발생.!!!

		int[] arr = null; // 초기화. int i = 0; 과 같은 느낌이다. null==빈 값.

		System.out.println(arr);
		System.out.println(arr.hashCode());
		// null을 가지고 어떤 메소드를 호출한다거나, . 을 찍어서 접근하려고 한다면
		// 항상 오류가 발생한다. NullPointerException 기억하자.
		// 해결방법 -> null로 초기화한것을 포기하거나, 호출을 아예 하지 말자.

	}

	public void method6() { // arr[0] = 2; arr[1] = 4; arr[2] = 6; arr[3] = 8; arr[4] = 10;

		/*
		 * arr[0] = 2; arr[1] = 4; arr[2] = 6; arr[3] = 8; arr[4] = 10;
		 */

		int[] arr = new int[5];

		/*
		 * for(int i = 0; i<=arr.length;i++) { arr[i]= 2 * (i+1);
		 * 
		 * }
		 */
		int value = 2;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = value;
			value += 2;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("arr의 해쉬코드값 : " + arr.hashCode());
		System.out.println("arr의 길이 : " + arr.length);

		/*
		 * ArrayIndexOutOfBoundsException arr[6] = 12; 배열에 부적절한 인덱스 제시시 발생(범위에서 벗어난 인덱스
		 * 제시)
		 */
	}

//20241205
	public void method7() { // 배열 선언, 할당, 초기화, 다 동시에 하기

		// 표현법1
		int[] arr1 = new int[] { 1, 2, 3, 4 };

		// 표현법2
		int[] arr2 = { 1, 2, 3, 4 };

		System.out.println(arr1 == arr2); // flase
		// arr1 , arr2 가 같지 않은 이유는 int[]은 참조형변수인데 각각의 주소값이 다르기 때문.

	}

	public void method8() { // 2. 반복문 활용해서 0번 인덱스 ~랜덤값 출력하기
		// 1.크기 10짜리 정수 배열 생성
		int[] arr = new int[10];

		// 2. 반복문 활용해서 0번 인덱스 ~
		// 마지막 인덱스까지 순차적으로 접근 하면서 값을 대입.
		// 매번 1~100 사이에 발생되는 랜덤값 생성하기.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}
		// 3. 반복문을 활용해서 해당 배열의 0번 인덱스 ~ 마지막 인덱스까지 담겨있는 값 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]  : " + arr[i]);

		}

	}

	public void method9() { // 사용자에게 입력값받고, 그 크기만큼 문자열 배열 생성하기.

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int size = sc.nextInt();
		sc.nextLine(); // nextInt 다음에 nextLine 이 나올떄, 무조건적으로 이렇게 버퍼에 남아있는 \n을 털어줘야하는것 기억하기.
		String[] arr = new String[size];
		// 2. 반복문 활용해서 매번 사용자에게 과일명 입력 받아
		// 그 값을 매 인덱스 자리에 대입(0번 ~ 마지막 인덱스)

		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = sc.nextLine();
		}
		// 3. 반복문을 활용해서 0~ 마지막 인덱스까지 담긴 값 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}

	}

	public void method10() { // 사용자에게 문자열 받고, 각각의 문자들을 char배열에 옮기기 // 찾고자하는 문자.

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을  입력해주세요 : ");
		String str = sc.nextLine();

		System.out.println("찾고자 하는 문자 : ");
		char ch = sc.nextLine().charAt(0);
		int count = 0;
		// char 배열 생성해두기
		char[] arr = new char[str.length()];

		/*
		 * arr[0] = str.charAt(0);
		 */

		// 반복문을 활용해서 해당 문자열에서 각 인덱스별 문자를 쪼개서 char배열의 각 인덱스에 대입하기.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		// 4. 반복문 활용해서 해당 배열의 0 ~ 마지막 인덱스까지 담긴 값 출력
		for (int i = 0; i < arr.length; i++) {
			if (ch == arr[i]) {
				count++;
			}
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		System.out.println("찾으신 문자의 개수 : " + count);

	}

	public void method11() {// 정수값받고, 배열생성, 랜덤값생성, 인덱스에 담긴 짝수총합 구하기.
		// 사용자에게 입력값받고, 그 크기만큼 정수 배열 생성.
		// 반복문 활용해서 0~ 마지막 인덱스까지 넣어라. 매번 1~100사이 랜덤값 대입.
		// 반복문을 또 확용해서 0~마지막 인덱스까지 출력과 동시에
		// 해당 그 인덱스에 담긴 값이 짝수인 값들의 총합도 같이 구하기.

		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 입력해 주세요 :");
		int size = sc.nextInt();
		int sum = 0;
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
			System.out.println("arr[" + i + "]  : " + arr[i]);
		}

		System.out.println("모든 짝수들의 총합 : " + sum);

	}
}
