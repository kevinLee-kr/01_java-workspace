package com.kh.chap02_set.run;

import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.plaf.synth.SynthTableUI;

import com.kh.chap02_set.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {
//object equals() -> 두 객체의 "주소값:을 비교해서 일치하면 true / 일치하지 않으면 false.
		//Object hashcode -> 해당 객체의 주소값을 10진수 형태로 만들어서 반환한다. 
// String equals() -> "실제담긴 문자열(값)" 을 가지고 비교해서 일치하면 true / 일치하지 않으면 false.반환.
		//String hashcode -> "실제담긴 문자열"을 가지고 10진수 형태로 만들어서 반환하기 때무네 동일한 객체로 판단을 하는거다. 
		// hashSet!
		HashSet<String> hs1 = new HashSet<>();

		hs1.add("반갑습니다.");
		hs1.add(new String("반갑습니다."));
		hs1.add("하이");
		hs1.add("방가");
		hs1.add(new String("하이"));

		System.out.println(hs1);
		// 저장 순서 유지 안됨(인덱스 개념 없음 , 중복이 되면 값이 겹쳐버림(중복데이터 보관 불가능)

		HashSet<Student>	hs2 = new HashSet<>();
		hs2.add(new Student("공유", 43, 1000));
		hs2.add(new  Student("차은우", 26, 85));	
		hs2.add(new Student("이제훈", 30 , 95));
		hs2.add(new Student("공유", 43, 1000));
		System.out.println(hs2); // 저장순서 저장안됨. 그냥 바구니에 쏟아 넣는것 같이 순서없이 저장됨. 
		// 중복 제거 안됨. 왜? 주소값을 비교해보니 다른 주소를 갖고 있기에 다른 객체라고 생각하기 때문
		// 또한, 동일 객체로 판단하고 있기에.
		
		// hashset 이라는 공간에 객체가 추가가 될 때마다 동일 객체인지 비교..
		//동일 객체 : equals() 비교시 true일 경우 , 각 객체마다 hashcode() 호출 결과가 일치. 해야 한다 .
		
		System.out.println(new Student("공유", 433, 100).hashCode());
		System.out.println(new Student("공유", 433, 100).hashCode());
		
		System.out.println(new Student("공유", 43, 100).equals(new Student("공유", 43, 100)));
		
		
	//2. hs2.get(인덱스);
		//인덱스 개념도 없고, get 메소드 자체가 정의되어있지않음(한객체만 뽑아올 수 없음!)
		
		//HashSet에 담긴 모든 객체들에 순차적으로 접근한다.
		//1. for문사용가능(단, 향상된 for문만 가능!)
		
		for( Student s: hs2) { //s라고 하는 변수값에 hs2 첫번쨰 인덱스 값? 첫번쨰 값? 이 들어가는 거다. 
			System.out.println(s);
		}
		//2. ArrayList에 담아준 다음 ArrayList 반복문 돌려가며 접근
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.addAll(hs2);
		
		//ArrayList 생성과 동시에 통쨰로 추가하기
		ArrayList<Student> list2 = new ArrayList<Student>(hs2);
		for(int i = 0; i< list2.size();i++) {
			System.out.println(list2.get(i));
		}
		//set 은 중복된 데이터가 들어오면 절대 안되는경우. -> 음. 어떤 경우가 있을까? (실무에서는 아예 안쓰는 경우가 허다하다고 함)
		
		System.out.println("_+_+_+_+_+_+__+_+_+_+_+_+_+_+_____+_+_+_");
		//3. Iterator 반복자를 이용해서 순차적으로 접근. 한다. 
//		Iterable<Student> it = hs2.iterator(); 
//		while(it.hasNext()) {
//			Student s = it.next();
//			System.out.println(s);
//		}
//		it.next(); 
	}

}
