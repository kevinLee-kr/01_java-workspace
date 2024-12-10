package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayForEach {

	public static void main(String[] args) {


		int[] arr = {10,20,30};
		
		
		//for each문(향상된 for문/개선된 for문)
		//배열 또는 컬렉션과 함께 사용된다. 
		//배열 또는 컬렉션의 0번 인덱스부터 마지막 인덱스까지 순차적으로 모두 접글할 목적일떄 쓰는 것이 좋다. 
		/*
		 * [표현법]
		 * for(순차적으로 접글할 값을 담을 변수 선언: 내가 순차적으로 접근할 배열명 또는 컬렉션명을 적는다. ){
		 * 반복적으로 실행할 내용
		 * }
		 * 
		 * -> for each 문은 얼마나 반복하나요? 배열 또는 ㅋ 컬렉션의 크기 만큼 돕니다...
		 * 
		 */
		
		//바ㅏㅏㅏㅏ로 알아봅시다.
		for(int value :arr) {//value = arr[0] -> value = arr[1] -> value[2] //end
			System.out.print(value + " ");
			
		}
		
		//객체 배열만 생성
		Phone[] phones = new Phone[3];
		
		//이제야 객체 생성
		phones[0] = new Phone("갤럭시", "삼성", 10000, "일등");
		phones[1] = new Phone("아이폰", "애플", 20000, "이등");
		phones[2] = new Phone("벨벳폰", "LG", 30000, "삼등");
		
		
		System.out.println(phones[0].information());
		
		phones[2].setPrice(50000);
		
		System.out.println(phones[2].information());
		int total =0;
		//=============================================for each
		for(Phone p:phones) { //p = phones[0]  --> p = phones[1]  --> p ==phones[2]  끝남..!
			System.out.println(p.information());
			total += p.getPrice();
		}
		System.out.println("총합계: " + total);
		System.out.println("평균가: " + total / phones.length);
		//범위설정이 안된다는 단점이 있다. 
		
		//구매하고자 하는 휴대폰 : 
		//당신이 구매하고자 하는 휴대폰은 xx원 입니다. 
		
		/*
		for(int i = 0; i<phones.length;i++) {
			if(phones[i].getName().equals(name)) {
				System.out.println("사용자님꼐서 입력하신 " + name + "의 가격은 " + phones[i].getPrice() + "입니다. ");
				break;//찾고자 하는 매개체를 찾은 뒤, 다시말해 낭비스런 프로세스를 진행하지 않는다. 메모리 효율 상승?
			*/
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 구매하고 자는 휴대폰 명을 적어주세요 : ");
		String name = sc.nextLine();
		
		for(Phone p:phones) {// p = phones[0],, p=phones[1]
			if(p.getName().equals(name)) {
				System.out.println("구매하고자 하는 핸드폰의 가격은 " + p.getPrice() + "원입니다.");
				break;
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
