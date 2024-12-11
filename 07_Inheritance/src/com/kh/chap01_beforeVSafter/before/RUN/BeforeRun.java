package com.kh.chap01_beforeVSafter.before.RUN;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {
//Desktop 객체 를 만들어보자
		//brand, pCode, pName, price, allInOne
		
		Desktop d = new Desktop("삼성", "ㅇ=01", "지드래곤", 200000, true);
		
		
		
		//Tv객체 만들기
		//brand, pCode, pName, price, inch
		Tv t = new Tv("LG", "T-1", "얇다!", 350000, 65);
		
		//smartphone 객체
		//brand, pCode, pName, price, mobileAgency
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰 " , 130000, "kt");
		
		
		System.out.println((d.information()));
		System.out.println(t.information());
		System.out.println(s.information());
		
		//만약에 유지보수할 일이 생겼다. pName --> product 로 바꿔주세오ㅛ.라는일. 공통적인 필드와 메서드 들이 존재하는 상황, 인데
		//이러한 중복된 코드들을 따로 " 부모 클래스 " 로 한번만 정의를 해주면 중복된 코드들을 줄일 수 있지 않을까.
		//장점 - > 수정과 같은 유지보수작업이 들어왔을때, 수정을 일일히 찾아서 할 필요가 없고, 
		//부모 클래스만 재정의하면 전체적으로 수정이된다. 반영이 된다. 
		//->brand, pCode, pName, price 필드들, getter / setter 메소드, informaiton
		//-> 이런것들 중복되는 것들 , 일일히 게속 칠것 없는 것들을 모아서 product (상품)  이라고 한다. 
		
		
		
		
	}

}
