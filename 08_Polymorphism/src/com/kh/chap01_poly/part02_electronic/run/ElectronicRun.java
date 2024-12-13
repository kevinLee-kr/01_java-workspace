package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop1;
import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
		
		//납품업체
		ElectronicShop1 es = new ElectronicShop1();
		
				//메소드를 써서 생성하겠음
				//먼저 필요한 메소드를 생각해보자.
				
				//추가용메소드 -> insert
				//데탑이라는 객체를 생성해서 넘기는 메소드.
		es.insert(new Desktop("삼성",  "데탑", 120, "gtx1070"));//아직은 해당 메소드가 정의되지 않아. electronicshop 을 위해 작동이 안된다고 오류가 뜬다. 당연하다. 
		//노트북 이라는 객체를 생성해서 넘기는 메소드
		es.insert(new NoteBook("LG", "그램", 200, 4));
		
		es.insert(new Tablet("apple", "iPad", 80, false));
		
		//이상 위에 3개의 객체를 생성 완료했다. 
		// 객체가 생성이 잘 됬는지, operation 파일에 잘 들어갔는지까지 조회를 해보자.
		//조회용 메소드 -> selet
		
		Desktop d = es.selectDesktop();
		NoteBook n = es.selectNoteBook();
		Tablet t = es.selectTablet();
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		
		
		ElectronicShop2 ese = new ElectronicShop2();
		
		es.insert(new Desktop("samsung", "짱", 120, "jj");
		es.insert(new NoteBook("LG, null, 0, 0"))
		
		/*
		Desktop d = (Desktop)es.select(0);
		NoteBook n = (NoteBook)es.select(1);
		Tablet t = (Tablet)es.select(2);
		//위에 보이는 이것들을 다운캐스팅이라고 한다. 
		*/
		Electronic d = es.select(0);
		Electronic n = es.selcet(1);
		Electronic t = es.select(2);
		
		//toString() 할때 부모에 있는 toString()을 불러오지 않을까?
		//아님! 왜? 동적 바인딩 떄문에
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		
		
		/*
		 * 다형성을 사용하는 이유.
		 * 1.부모타입 계열로 다양한 자식객체를 받을 수 있음.
		 * 2. 메소드 만들떄 매개변수로 다형성을 적용하게 되면.메소드의 개수가 확 줄어든다. 
		 * 3. 필수로 꼭 써야 하는 곳이 있음! 어디지? 
		 * 		- 추상 클래스, 인터페이스 가 있다. 
		 * 			-> 클래스를 추상하는거. 
		 * 				-> 코딩을 하다보면 클래스를 완벽하게 짜면(?)안될 떄가 있는데
		 * 					그때 필요한게 추상 클래스이다. 
		 * 					때문에 추상클래스를 하기위해, 다형성을 배우는 거다. 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
