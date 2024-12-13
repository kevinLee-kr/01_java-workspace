package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

public class ElectronicShop2 {
	//자리마련하자
	//다형성 : 부모타입 레퍼런스 하나로 다양한 자식 객체를 담을수 있음/다룰수 잇음
	//부모 : Electronic
	//자식 : Desktop, NoteBook, Tablet
	
	//무슨 말이냐 , 
	//부모타입 배열로 모든 자식 객체를 다루는 예를 보여주겠다.
	private Electronic[] elec = new Electronic[3];
	private int count=0;
	//다형성을 적용한 insert를 만들어보자
	public void insert(Electronic any) {
		//insert 메서드를 한번만 사용해서 desktop, NoteBook, Tablet 3개의 객체를 
		//전부 넣고 싶다.
		//elec[?] = a
		elec[count++] = any;
	}
	
	//조회용 메소드 - 하나만으로 클리어해버리기
	public Electronic select(int index) {
		// 배열에 잘 넣은 값들을 출력해야한다.
		return elec[index];
		//여기에서는 사용자가 원하는 인덱스를 받아와야함. 
		//때문에, 위에 select의 조건문에 int index을 적음으로 표시해준다. 
		//더 나아가 3개의 객채들을 받아줄 수 있는 부모타입인 electronic 으로 접근제어자를 세팅 해주면서 부모타입으로 반환해준다.
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
