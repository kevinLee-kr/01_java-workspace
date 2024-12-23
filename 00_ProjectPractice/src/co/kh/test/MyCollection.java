package co.kh.test;

import java.util.ArrayList;

import co.kh.test.person.model.vo.Fruit;

public class MyCollection {
	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(new Fruit("사과", "빨강"));
		list.add(new Fruit("메론", "초록"));
		list.add(new Fruit("포도", "보라"));
		list.add("맛있는 과일");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}


}
