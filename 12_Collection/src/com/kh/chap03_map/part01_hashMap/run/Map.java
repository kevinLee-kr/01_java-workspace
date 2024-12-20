package com.kh.chap03_map.part01_hashMap.run;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Map {

	public static void main(String[] args) {

		// hash map을 만들어보자 => dic
		HashMap dic = new HashMap();
		// 데이터를 3개 추가 하자.
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		// baby = 아기
		// love = 사랑
		// apple = 사과.

		// 키 벨류

		// 무한 반복을 돌리면서
		Set<Entry<String, String>> entrySet = dic.entrySet();
		Iterator<Entry<String, String>> itEntry = entrySet.iterator();
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자 : ");
		String user = sc.nextLine();

		while (itEntry.hasNext()) {
			if (user.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				Entry<String, String> entry = itEntry.next();
				String word = entry.getKey();
				String value = entry.getValue();

				//영문명(키)를 통해 조회해 맞는것이 있으면 한글로 출력
				String kor = dic.get(user);
				if(kor == null) {
					System.out.println(user + "해당 단어는 없는 단어입니다.");
				}else {
					System.out.println(user + "의뜻은 " + kor+"입니다.");
				}
			}

		}

		// 사용자에게 물어본다. 찾고 싶은 단어가 뭐냐고
		// 사용자 :
		// 사용자 : love
		// love 의 뜻은 사랑 입니다.
		// 사용자 : kiwi
		// kiwi는 없는 단어입니다.

		// 사용자 : xit
		// ㄱ프로그램을 종료합니다. 끝내는 코딩.

	}

}
