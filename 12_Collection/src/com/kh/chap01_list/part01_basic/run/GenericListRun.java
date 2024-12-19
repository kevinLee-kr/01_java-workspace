package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.basic.model.vo.Music;

public class GenericListRun {

	public static void main(String[] args) {
//		<Music> 으로 제네릭 설정해보겠다. 빠밤

		ArrayList<Music> list = new ArrayList<Music>();

		list.add(new Music("Attention", "뉴진스"));
		list.add(new Music("새삥", "지코"));
		// list.add("가보자구"); // -> 에러 , 이유 : 다른 타입 담기 불가.

		// 제네릭 설정하는 것까지 해보자.
		list.add(1, new Music("아기상어", "아빠상어"));
		// list.add(2,"가보자고");
		System.out.print(list);

		List<Music> sub = list.subList(0, 2);
		list.addAll(sub);

		System.out.println(list);
		Music m = list.get(0);
		System.out.println(m);

		System.out.println(list.get(0));// music 값
		System.out.println(list.get(0).getTitle()); // 바로 이렇게 제목을 서칭할 수 있다.

		for (Music h : list) { // h = list.get(0) o에 list 0번이 쏙 들어감 // o = list.get(1)o에 list1번이 쏙 들어감
			System.out.println(h);

			/*
			 * // 제네릭 왜 사용하죠 명시된 타입의 객체만 저장하도록 제한을 둘 수 있음 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형변환 하는
			 * 절차를 없애기 위해서.
			 * 
			 */

		}

	}

}
