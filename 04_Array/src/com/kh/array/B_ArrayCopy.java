package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {

	public void method1() { // 얕은 복사..원본 메모리를 참조하는 두 개의 배열변수.
		int[] origin = { 1, 2, 3, 4, 5 };

		System.out.println("=== 원본 === 배열 === 출력 ===");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");

		}
		System.out.println();
		// 단순하게 origin을 다시 대입시켜서 copy배열 생성.
		int[] copy = origin;
		System.out.println("=== 복사본 === 배열 === 출력 ===");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();

		copy[2] = 99;

		System.out.println("=== 원본 === 배열 === 출력 ===");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");

		}
		System.out.println();
		// 단순하게 origin을 다시 대입시켜서 copy배열 생성.

		System.out.println("=== 복사본 === 배열 === 출력 ===");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		// copy만을 가지고 수정을 해보 원본까지 변경이 되어버렸다ㅣ.
		// 왜일까? origin과 copy가 같은 주소값을 가진 메모리를 참조하고 있기 때문이다.
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + origin.hashCode());
		// 위에서 출력되는 것처럼 주소가 같은게 증며잉 되었다. -> 얕은 복사 : 주소값을 복사.
		// 얕은 복사가 있으니 깊은 복사또한 있다.

	}

	public void method2() { // 깊은 복사..
		// for문을 활용한 방법
		// 새로운 배열을 생성한 후 반복문 활용해서
		// 원본배열의 값들을 새로 만든 배열에 대입하는 방법.

		int[] origin = { 1, 2, 3, 4, 5 };
		// int[] copy = origin ( 얕은 복사)
		int[] copy = new int[5];
		/*
		 * copy[0] = origin[0]; copy[1] = origin[1]; copy[2] = origin[2]; copy[3] =
		 * origin[3]; copy[4] = origin[4]; copy[5] = origin[5];
		 */

		for (int i = 0; i < copy.length; i++) {
			copy[i] = origin[i];
//아 카피에 오리진 i값이 copy i값에 들어가겠구나.
		}
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
	}


	public void method3() { // 2. 새로운 배열 생성 후 system.이라는 클래스에서 arraycopy()메소드를 이용한 복사.
		// 2. 새로운 배열 생성 후 system.이라는 클래스에서 arraycopy()메소드를 이용한 복사.
		int[] origin = { 1, 2, 3, 4, 5 };
		int[] copy = new int[10];

		// system클래서에서 제공하는 메서드
		// System.arraycopy(원본배열명, 복사시작할 인덱스, 복사할 배열명, 복사본 배열의 복사될 시작 인덱스, 복사할 개수);

		// System.arraycopy(origin, 0, copy, 0, 5);
		// System.arraycopy((origin, 0, copy, 2, 5);
		System.arraycopy(origin, 1, copy, 3, 3);
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
	}

	public void method4() {// 3. Arrays 클래스에서 제공하는 copyof() 메소드 이용
	
		//3.
		int[] origin  = {1,2,3,4,5};
		//Array.copyof(원본배열명, 복사할 길이);
		
		int[] copy = Arrays.copyOf(origin,15);
		
		for(int i = 0 ; i<copy.length;i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println("origin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
		
	}

	public void method5 () { // 4. clone() 메소드 이용한 복사. 원본배열.clone
		//인덱스 지정 불가, 크기 지정 별도 못함. 쌍둥이 마냥 같은 복사본을 만들어준다.
		int[] origin  = {1,2,3,4,5};
		//원본배열.clone 이면 . 끝난다.
		origin.clone();
		int[] copy = origin.clone();
		for(int i = 0 ; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println(" ");
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
		//hashCode 가 주소값을 10진수로 찍어주는 선언문이다. 기억하자. 주소값을 찍어달라? hashCode를 print에 쓰자. 
	}

//[참고] (클래스는 앞글자가 대문자이다.)
	//java.lang.Math
	//java.lang.String
	//java.lang.System
	//
	//java.lang 패키지에 있는 클래스들을 쓸 때는 import 선언을 안해도 된다.
	// 반면
	//java.util.Scanner
	//java.util.Arrays
	//-> 자바 lang 이외의 패키지를 쓸때 무조건 import를 해주어야 한다. 
}
