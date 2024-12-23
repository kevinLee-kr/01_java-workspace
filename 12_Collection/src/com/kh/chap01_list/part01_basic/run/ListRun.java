package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;

import java.util.List;

import com.kh.chap01_list.part01_basic.basic.model.vo.Music;

public class ListRun {

	/*
	 자자.. 컬렉션 에 대해서 배워보자.
	 컬렉션 
자료구조 개념이 내장되어 있는 클래스로 자바에서는 제공하는 ‘자료구조’를 담당하는 ‘프레임 워크’이다.
- 자료구조 : 방대한 데이터 보다 효율적으로 관리 할 수 있도록 도와주는 개념	 
- 프레임워크: 이미 만들어져 있는 틀(뼈대) (기본제공)
배열의 단점과 컬렉션의 장점.
1.
배열 . 한개의 박스에 여러개의 값을 담을 수 있는 장점이 있는 반면, 크기 지정을 꼭 해야 했었다. 그리고 크기를 변경할 수 없으니 어려움이 있었다. 
또한, 새로운 값을 추가 하고자 한다면 원본을 복사하는 코드를 직접 기술 했어야 했다. 
이것에 대한 컬렉션의 장점!
 크기 지정해줄 필요없음!! 만일 지정했다고 하더라도 더 많은 데이터들이 들어오면 알아서 사이즈 늘려줌. 들어오면 늘어나고 나가면 줄어들고, 자동으로 메모리 절약되고, 크기에 제약이 없으니 편하다. 
2. 
배열 중간에 위치에 추가한다거나 삭제하는 경우 값을 매번 땡겨주는 복잡한 알곡리즘을 직접 기술해야됨..
중간에 값을 추가한다거나 삭제하는 경우 값을 땡겨주는 작업(알고리즘)을 직접 기술 할 필요가 없음
왜냐 이러한 메소드가 이미 있기 때문에, 그저 메소드 호출만으로 알아서 내부적으로 진행이 될거라는것
툴? 이라고생각해도 좋다. 
3.
한 공간에 한 타입의 데이터들만 저장 가능햇던 배열. <- 배열 단점
한 공간에 여러타입의 데이터들 저장 가능, String, int , char 등 다양하게 가능. 

이 컬렉션은 자료구조가 내체되어 있다. 키 포인트는 방대한 데이터를 다루는데에 사용하는게 좋기 때문에, 
적은 숫자를 컨트롤 하기에는 배열이 용이하다. 

결론적으로, 프로그램을 다루기 위해 많은 상황을 직면하게 될텐데, 그 상황에 맞게 적재적소한 방법으로 코딩을 한다면, 최적의 코딩을 하게 되므로, 두가지 방법을 다 아는게 좋다. 

방대한 데이터들을 단지 보관만 해두고 조회만 할 경우 배여를 많이 사용한다. 
방대한 데이터들은 보관, 추가, 삭제 등등 이런 과정들이 빈번할 경우 컬렉션을 많이 사용한다. 



	 */
	
	
	public static void main(String[] args) {

		
		
		ArrayList list = new ArrayList(3);
		//크기 지정 할 수도 있고 안할수도 있음, 안하면 크기 10.
		
		System.out.println(list); // []이 출력되었는데, 이것은 아무것도 없다 라는 뜻.
		
		//컬렉션 파트 코딩 하면서 E라는 것이 등장하면 Element(리스트에 담길 데이터값)이라고 생각하면 된다. ex) 1. add(E e) : 리스트 공간 끝에 전달될 데이터를 추가시켜주는 메소드.
		
		list.add(new Music("Attention", "뉴진스"));
		list.add(new Music("새삥", "지코"));
		list.add(new Music("죽일놈", "다이나믹듀오"));
		list.add("가보자구");
		list.add("음 되나");
		
		System.out.println(list);
		//위에서 했던말.
		//지정된 크기보다 더 많은 값을 할당 했는데 오류 안남 -> 장점 : 크기에 제약이 없다. 
		//다양한 타입의 데이터를 할당해줄 수 있따는 장점
		
		System.out.println(list);//list의 특징 : 순서유지가 되면서 담겨진다.(0번 인덱스 부터 차곡차곡)
		
//		2. add(int index, E e) : 직접ㅇ 인덱스를 지정해서 해당 인덱스 위치에 데이터를 추가시켜주는 메소드. 
		list.add(1,new Music("진심이 담긴노래", "케이시"));
		
		System.out.println(list);
		
		//중간 위치에 데이터 추가시 복잡한 알고리즘 직접 구현 안함 -> 장점2. 
		//3.. remove(int index) 해당 인게스위치의  데이터 삭제\시켜주는 메소드
		
		list.remove(1);
		System.out.println(list);
		
		//4. set(int index,E e) : 해당 인덱스 위치의 데이터를 새로이 전달된 e로 수정 시켜주는 메소드. 
		list. set(0, new Music("nextLevel", "에스파"));
		
		//5. size() : 해당 리스트의 사이즈를 반환시켜주는 메소드(즉, ㅈ몇개의 데이터가 담겨있는지,.
		System.out.println("리스트의 사이즈 : " + list.size());
		
		//6.get(int index) : 해당 인덱스 위치의 객체를 반환해주는 메소드.)
		Music m = (Music)list.get(0); //(자료형 맞게 해줘야 함. )
		String s = (String)list.get(3);
		
		System.out.println(m);
		System.out.println(s);
		System.out.println(list.get(1));
		System.out.println(((Music)list.get(1))); //object 타입으로 반환하기 떄문에 강제형변환 해줘야 한다. 
		
		//7. subList(int index1, int index2) : List -> 추출해서 새로운 List 반환 : substring 같은거. 
		List sub = list.subList(0, 2);
		System.out.println(sub);
		
		//8. allAll(Collection c) :컬렉션을 통재로 뒤에 추가시켜주는 메소드.
		list.addAll(sub);
		System.out.println(list);
		
		//9. isEmpty : boolean 반환형으로써, '형씨 , 거기 비어있습니까?; 를 물어보는 메소드. 
		
		//10. clear() :리스트안에 있는 내용을 초기화 시켜주는 메소드. 내용을 싹 지운다. 
//		list.clear();
//		System.out.println(list);;
//		System.out.println(list.isEmpty());
		
//		반복문을 통해서 순차적으로 출력해보쟈ㅏㅣ. 
		
		System.out.println("=====");
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
//		반복문 level 2
		for(Object o:list){//list의 0번 요소가 o에 들어간다. -> list의 1번요소가 o에 들어간다. 
			System.out.println(o);
		}
		
		
		
		
		
		
		
		
		
	}

}
