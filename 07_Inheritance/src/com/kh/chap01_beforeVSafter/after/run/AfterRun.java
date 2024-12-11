package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.Smartphone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {
	
	public static void main (String[]args) {
		//상속의 장점.
		/*
		 * 상속을 받는 입장에서 적은양의 코드로 새로운 클래스 작성이 가능하다. 
		 * 중복된 코드를 별도로 가능하기 때문에 코드 수정/추가 시 부모 클래스만 건들면 되기 때문에 프로그램의 생산성과 유지보수성이 좋아진다. 
		 * 
		 */
	//객체 생성 해보라
		Desktop d = new Desktop("삼성", "d=01", "짱짱데스크탐", 200, true);
		
		//tv객체도 생성해보자.
		//brand pCode, PName, price, inch
		
		Tv t = new Tv("엘지", "T-01", "얇티얇아", 350000, 65);
		
		//스마프톤 객체 생성
		//brand pCode, PName, price, inch
		Smartphone s = new Smartphone("애플", "s-01", "아이폰", 30000, "ky");
		

		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		s.setPrice((1200000));
		s.setMobileAgency("skt");
		System.out.println(s.information());//오버라이딩
		
		/*
		 * 상속의 특징
		 * - 자식 객체를 가지고 부모 클래스에 있는 메소드를 치 내것으로 호훌 가능.
		 * - 부모클래스에 있는 메소드를 오버라이딩을 통해 자식 클래스에서 재정의 가능하다 라는 특징이 있다. 
		 * - 오버라이딩을 하는 순간 자식 클래스에 있는 메솓드가 우선권을 가짐. 
		 * - 클래스간의 상속은 다중 상속이 불가능하다. (단일 상속만 가능) 하늘아래 2명의 부모는 없다. 
		 *
		 *		 */
		
		
	}
	
			
			
			
			
}
