package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.EletronicShop1;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {//실행용 클래스
//
		
		EletronicShop1 es = new EletronicShop1();
		/*
		es에서 마련해놓은 desk;, note, tap 이라는 필드에
		객체를 생성해서 넣어주기 위해서 우선, es라는 객체를 생성한것이다.!
		//es라는 코드를 만든 순간 해당 클래스에 제시된 3가지의 필드가 메모리 상에 할당된다.
		1. desktop 이라는 자료형에 desk가들어가고
		2. notebook 이라는 자료형에 note가 들어가고
		3. tabelt 이라는 자료형에 tap이 들어갔다. 
		메소드를 써서 생성 해보겠음
		추가용 메소드 -> insert
		데스크탑 이라는 객체를 생성해서 용산 전자상가(es)로 보내는 메소드
	
		*/
	//데스크탑 이라는 객체를 생성해서 넘기는 메소드 였는데
		es.insert(new Desktop("samsung", "데땁" , 1200000, "gtx1070"));
		//이번에는 노트북이라는 객체를 생성해서 넘기는 메소드를 생성해보이겠따. 이거야.
		es.insert(new NoteBook("LG", "그램" , 4, 4));
		//이번엔 태블랫
		es.insert(new Tablet("Apple", "아이팻드 " , 80000, true));
		
		//가게에 해당 객체들이 잘 생성 돼있는지 궁금함
		//조회용 메소드 -> select
		
		//es.selectDesktop();
		Desktop d = es.selectDesktop();
		System.out.println(d);
		
		NoteBook n = es.selectNoteBook();
		System.out.println(n);
		
	}

}
