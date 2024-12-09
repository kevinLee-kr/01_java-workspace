package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//==========FieldTest1===========
		FieldTest1 ft = new FieldTest1();
		//ft.test(1);
		
		
		//==========FiledTest2============
		
		FieldTest2 f2= new FieldTest2();
			
		//heap에 new로 인해 생겨나는 공간은 필드에 따라 결정이 된다. 현재 필드 2에서는 4개의 필드가 입력이 됬기 때문에
		//4개의 공간이 생겨날 예정 pub, pro, def, pri
		
		
		
		
		//모두 호출법이 같은데, field.model.vo.FieldTest2를 보면 접근제한자유형이 에 따라 접근이 되느지 안되는지 확인해보기 위함임.
		//public 
		//System.out.println(f2.pub);
		
		//ptotected : 같은 패키지에서만 접근 가능.
		//System.out.println(f2.pro); pro에 오류발생, 원인 -> 접근제한자가 protected이기 때문에 같은 패키지 에서만 접근이 가능한데, pro는 다른 패키지에 위치해 있어 끌어오질 못한다. 
		
		//default:같은 패키지에서만 접근 가능. 다른패키지 일경우 상속시 가능.
		//System.out.println(f2.def);
		
		//private:오직오직오직 해당 클래스에서만 가능.
		//System.out.println(f2.pri);
		
		//FieldTest3 f3 = new FieldTest3();
		System.out.println(FieldTest3.sta);
		//sk
		
		//수정을 하고 싶다면?!?!
		FieldTest3.sta = "zzz";
		System.out.println(FieldTest3.sta);
		
		// 변하게 안되도록 하고 싶다면?
		//상수 필드로 선언해야함
		System.out.println(FieldTest3.STA_FIN);
		
		
		//FieldTest3.STA_FIN = "HHH";
		//System.out.println(FieldTest3.STA_FIN);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
