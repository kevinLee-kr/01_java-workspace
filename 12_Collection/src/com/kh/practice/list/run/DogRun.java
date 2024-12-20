package com.kh.practice.list.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.model.vo.Dog;

public class DogRun extends Dog {

	public static void main(String[] args) {

		// 5마리의 강쥐 이름을 입력 받아서 ArrayList에 저장한 후에
		// 이들 중 '구' 라는 이름이 포함된 강쥐를 모두 출력하시오.
		// * 처음에는 4마리의 강쥐 ArrayList 생성 후 (크기 4짜리)
		// 2번 인덱스에 마지막 강쥐를 추후에 추가 할 것!(끼워넣기)
		// + 구 포함한 이름을 가진 강쥐가 몇마리 인지 출력하시오.

		Scanner sc = new Scanner(System.in);
		ArrayList<Dog> list = new ArrayList<Dog>();

		System.out.println("강아지4마리 정보를 입력 받도록 하겠습니다.\n");
		for (int i = 0; i < 4; i++) {

			System.out.print("강아지 이름 : ");
			String name = sc.nextLine();

			System.out.print("강아지 나이 : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("강아지  종 : ");
			String kind = sc.nextLine();
			list.add(new Dog(name, age, kind));
		}
		System.out.println("============== 전체 강아지 리스트 출력 =====이호석=====");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("============== 강아지 한 마리 추가 입력 해주세요======");
		System.out.print("강아지 이름 : ");
		String newname = sc.nextLine();

		System.out.print("강아지 나이 : ");
		int newage = sc.nextInt();
		sc.nextLine();
		System.out.print("강아지  종 : ");
		String newkind = sc.nextLine();
		list.add(new Dog(newname, newage, newkind));
		System.out.println(" ==== 성공적으로 강아지가 추가가 되었습니다. ====");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=======================================");
		System.out.print("===검색할 강아지 이름을 입력해주세요 :  ===");
		String searchDog = sc.nextLine();

		int count = 0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().contains(searchDog)) {
				System.out.println(list.get(i));
				count++;
			}

		}
		System.out.println("이름에 '" + searchDog + "'가 들어간 강아지는 총 " + count + "입니다. ");
		sc.close();
	}
}