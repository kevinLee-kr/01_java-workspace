package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListSortRun {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		{// 초기화 블럭
			list.add("C");
			list.add("A");
			list.add("B");
			list.add("a");
		}
		System.out.println(list);
		//오른차순 정렬 메소드 = Collection.sort(방법)
		list.sort(Comparator.naturalOrder());
		System.out.println("오름차순 : " + list);
		
		//내림차순 정렬 
		list.sort(Comparator.reverseOrder());
		System.out.println("내림차순 : " + list);
		
		//대소문자 구분 없이 오름차순
		list.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println("구분없이 오름차순 : " + list);
		
		//대소문자 구분없이 내림차순
		list.sort(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
		System.out.println("대소문자 구분없이 내림차순 : " + list);
	}

}
