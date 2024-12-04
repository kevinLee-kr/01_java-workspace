package com.kh.array;

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

		// 실제 값을 곧바로 담을 수 ㅣㅆ는 변수를 일반 변수라고 얘기하고
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

	public void method4() {
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
		System.out.println(arr.hashCode()); // 조삭ㅄ의 10진수 형태.
		System.out.println("배열의 길이 : " + arr.length);// 전체적으로 코드를 작성할때 동적형을 추구할수록 유연성이 높아진다. 당연하겠지?

		// *******주의 조ㅜ의 주의 *******
		// 배열 크기 변경 요청 -> 5로 생성했고 쓰다보니까 부족해, 10을 늘려야 할것 같애.
		// 안됨. 못바꿈, 새로 만들어야함.

	}
	
	public void method5() {
		//배열을 쓰면서 볼 수 있는 오류들 모음;;
	//	int[] arr;
		
		//System.out.println(arr); 초기화가 안돼있어서 오류발생.!!!
		
		int[] arr = null;	//초기화. int i = 0; 과 같은 느낌이다. null==빈 값.
		
		System.out.println(arr);
		System.out.println(arr.hashCode());
		//null을 가지고 어떤 메소드를 호출한다거나, . 을 찍어서 접근하려고 한다면 
		//항상 오류가 발생한다. NullPointerException 기억하자.
		//해결방법 -> null로 초기화한것을 포기하거나, 호출을 아예 하지 말자. 
		
	}

	public void method6() {
		
		/*arr[0] = 2;
		 * arr[1] = 4;
		 * arr[2] = 6;
		 * arr[3] = 8;
		 * arr[4] = 10;
		*/
		
		int[] arr = new int[5];
		
		/*
		 * for(int i = 0; i<=arr.length;i++) { arr[i]= 2 * (i+1);
		 * 
		 * }
		 */
		int value = 2;
		for(int i=0; i<arr.length;i++) {
			arr[i] = value;
			value +=2;
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("arr의 해쉬코드값 : " + arr.hashCode());
		System.out.println("arr의 길이 : " + arr.length);
		
		/* ArrayIndexOutOfBoundsException
		arr[6] = 12; 배열에 부적절한 인덱스 제시시 발생(범위에서 벗어난 인덱스 제시)
		*/
	}


}
