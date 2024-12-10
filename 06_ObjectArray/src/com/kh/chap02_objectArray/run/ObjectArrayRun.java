package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {

		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		Phone[] phones = new Phone[3];
		/*
		 * System.out.println(phones); System.out.println(phones[0]);
		 * phones[0].setName("아이폰"); <--- 오류남.
		 */

		phones[0] = new Phone();
		phones[1] = new Phone("아이폰", "애플", 1300000, "아이폰16");
		phones[2] = new Phone("갤럭시", "삼성", 1100000, "갤럭시S24");

		phones[0].setName("벨벳폰");
		phones[0].setBrand("엘지");
		phones[0].setPrice(1000000);
		phones[0].setSeries("series1");

		int total = 0;
		for (int i = 0; i < phones.length; i++) {
			System.out.println(phones[i].information());
			total += phones[i].getPrice();
		}

		System.out.println("총가격 : " + total);
		System.out.println("평균가격 : " + total / phones.length);

		// 사용자에게 구매하고자 하는 핸드폰 명을 입력 받아주세요

		Scanner sc = new Scanner(System.in);

		// 해당 휴대폰을 찾은 후에 그 가격이 얼마인지를 알려주도록
		// 구매하고자 하는 휴대폰 입력 :

		// 당신이 구매하고자 하는 휴대폰은 가격이 xx입니다.

		System.out.print(" 구매하고자 하는 핸드폰 명을 입력해주세요 : ");
		String name = sc.nextLine();

		/*
		 * switch(name) { case "아이폰": price = phones[1].getPrice(); break; case "갤럭시":
		 * price = phones[1].getPrice(); break; case "벨벳폰": price =
		 * phones[1].getPrice(); break; } System.out.println("사용자님꼐서 입력하신 " + name +
		 * "의 가격은 " + price + "입니다. ");// 이럴경우, 저장된 핸드폰 명 또는 사용자가 실수로 타이핑을 했을경우 에는 // 값이
		 * 나오지 않기 때문에, for문 그리고 if 문을 추천한다.
		 */
		for (int i = 0; i < phones.length; i++) {
			if (phones[i].getName().equals(name)) {
				System.out.println("사용자님꼐서 입력하신 " + name + "의 가격은 " + phones[i].getPrice() + "입니다. ");
				break;// 찾고자 하는 매개체를 찾은 뒤, 다시말해 낭비스런 프로세스를 진행하지 않는다. 메모리 효율 상승?
			}
		}

	}

}
