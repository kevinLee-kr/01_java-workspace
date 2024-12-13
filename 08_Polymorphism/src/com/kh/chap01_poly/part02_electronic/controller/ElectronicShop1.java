package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicShop1 {
	//용산 전자상가에 있는 가게.
	private Desktop desk; 
	private NoteBook note;
	private Tablet tap;
	//객체 생성이 되었다 - 라는 말은 각 객체 배열에 주소값이 들어가 있어야 한다. 
			
	//반환값이 제일 중요한데 , 반환값을 모르겠으면 일단 void 로 짜자.
	
	public void insert(Desktop d) {
		desk = d;
	}
	//run파일에서  insert메소드를 통해 객채를 생성하고 입력값을 대입시키려고 한다. 
	// 대입값을 저장해주기 위해, 연결창구를 만든다고 생각하자
	// 
	public void insert(NoteBook n) {
		note = n;
	}
	public void insert(Tablet t) {
		tap=t;
	}
	
	public Desktop selectDesktop() {
		return desk;
	}
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tap;
	}
	//위에 보이는 코드들은 다형성을 적용하기 전이라, insert3, select3 총 6개로 구성됨
	// 이제 다형성을 적용해보겠다. 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
