package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class EletronicShop1 {

	
	

	
	//용산 전자상가에 있는 가게.
	//3개 제품을 전시할 / 마련할 자리부터 만들어보자. 
		
	//same with  - privat int price
			private Desktop desk;//내가 만든 자료형
			private NoteBook note;
			private Tablet tab;
			
			public void insert(Desktop d) { // Desktop d = new Desktop("samsung", "데땁", 1200000, "gtx-1070"));
				desk = d;
			}
			public void insert(NoteBook n) {
				note=n;
			}
			
			public void insert(Tablet t) {
				tab=t;
			}
			//동일한 클래스에 동일한 메소드명으로 여러개 만들어져 있는것 - 오버로딩이라고 배웠다.
			//단, 매개의 변수 종류가 달라야 한다. 
			//위에는 desktop, notebook, tablet, 3개의 자료형이 다르기때문에 
			//안전하게 오버로딩 이 이루어져 있다. 
			
			//조회 메소드
			public Desktop selectDesktop() {
				return desk;
			}
			
			public NoteBook selectNoteBook() {
				return note;
			}
			public Tablet selectTablet() {
				return tab;
			}
			
			
			
			
}
