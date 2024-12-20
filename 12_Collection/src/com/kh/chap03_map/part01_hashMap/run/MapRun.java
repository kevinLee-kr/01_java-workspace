package com.kh.chap03_map.part01_hashMap.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {

		HashMap hm = new HashMap();

		// 계층구조를 보면
		// List 계열, Set 계열의 클래스들은 collection 구현한 클래스다.
		// 객체를 추가하고자 할 떄 공통적으로 add 메소드를 이용한다.
		// 객체를 추가하고자 할떄 공통적으로 add 메소드 이용한다.

		// map게열은 컬렉션을 구현한 클래스가 아님.

		// 추가하고자 할때는 put메소드를 이ㅛㅇㅇ한다.
		// (ㅑ이떄 키 | 벨류 세트로 담아야 하마)
		// map에 대한 메소드 5가지를 알아보자.

		// 1. put (K key, V value) --> 컬렉션에 키 벨류 세트로 추가시켜주는 메소드

		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸쵸", new Snack("단맛", 600));
		hm.put("새우깡", new Snack("짠맛", 500));

		System.out.println(hm);

		// 저장 되는 순서 유지가 안됨.
		// key값은 절대 저어얼대 중복이 되면 안됨.

		hm.put("포카칩", new Snack("쫌짠맛", 500));
		// value 의 값이 중복이 되도 키 값이 중복안되면 잘 저장됨.
		// value 중복 o(불가능)
		// key 중복 x(가능)

		hm.put("새우깡", new Snack("매운맛", 700));
		// 동일한 키값으로 다시 추가 하는 경우 value 값으로 덮어 씌워짐!
		// (중복된 키값 공존할 수 없음! 키값이 식별자 같은 개념)

		System.out.println(hm);

		// 2. get(Object Key) : v -> 해당 컬렉션에서 현재 키값을 가지는 value 값읇 반환해주는 메소드
		Snack s = (Snack) hm.get("다이제");
		System.out.println(s);

		// 3. size() : 컬렉션에 담겨있는 객체들의 개수 반환.
		System.out.println("몇개 있을까 ? : " + hm.size() + "걔 있음");
		// 4. replace(K key, V value)
		hm.replace("포카칩", new Snack("겁나 짜", 1000));
		System.out.println(hm);

		// 5. remove(Object key) -> 컬렉션에서 해당 키값을 찾아서 그 키 - 벨류 세트로 삭제 시켜주는 메소드
		hm.remove("포카칩");
		System.out.println(hm); // hm에서 포카칩만 사라짐.

		System.out.println("=========================== ");

		// map공간에 담긴 모든 키 값과 벨류 값 다 출력하고자 할 때
		// for each문 안된다. for문이 아예 안됨.

		// ArrayList 도 안됨.
		// Iterator 반복자.. 이용 해야함.
		// hm.iterator(); //iterator 라는 메소드를 호출할 수가 없음, 정의 되어 있지 않기 때문인데, List 나 Set에서만
		// 지원하는 메소드이기 때문ㅇ.

		// Map을 Set으로 바꿔주는 메소드 제공함(게다가 2개나 존재함!)
		// Map -> Set을 바꿔서 iterator 를 사용해야함!

		// 1. keySet()
		// hm에 있는 키들만 Set 담기 (키들의 집합 형태)
		Set keySet = hm.keySet();

		// 2. 1번과정에서 작업된 keySet 을 Iterator에 담기
		Iterator itKey = keySet.iterator();

		while (itKey.hasNext()) { // 데이터 있냐 나와, 있냐, 나와 , 있냐, 없어, 꺼져
			String key = (String) itKey.next();
			Snack value = (Snack) hm.get(key);
			System.out.println(key + "=" + value);
		}

		// 3. 반복문을 통해서 뽑기.!!!!

		System.out.println("=============");
		// 2. entrySet()
		// 1) hm.entrySet() 은 Set 계열로 변환을 시킨거다.
		Set<Entry<String, Snack>> entrySet = hm.entrySet();

		// 2) entrySet.iterator()
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		while (itEntry.hasNext()) {
			Entry<String, Snack> entry = itEntry.next();
			String key = entry.getKey();
			Snack value = entry.getValue();

			System.out.println(key + "=" + value);
		}
		// 제네릭을 설정하면 좋은ㄴ점은 형변환을 할 필요가 없다는 것이다.

	}

}
