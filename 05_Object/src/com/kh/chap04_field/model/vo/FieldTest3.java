package com.kh.chap04_field.model.vo;

public class FieldTest3 {
	//
	// static은 공유의 개념
	//static이 붙은 애들은 프로그램 실행과 동시에 메모리의 static영역에 올라감
	//프로그램 실행과 동시에 메모리에 한번 올려놓고 여기저기서 가져다 쓰는 개념
	// 그래서 얘는 공유가 되야하기 때문에 접근제한자를 public 으로 열어야 함.
	// 공유를 하려고 했는데 private 으로 막아놓으면 말짱 도루묵 임.
	//
	public static String sta = "statidcd_FiledTest3";
	
	//static 공유의 개념.
	
	//상수필드라는걸 만들수 있다. 
	public static final String STA_FIN = "static final";
	//static 은 공유의 개념인데 final 이라는건 상수의 개념이라 한번 지정된 값은 변경이 안된다. 
	//상수 : 변하지 않는 값.
	//프로그램 시작시 값이 저장되면 더 이상 변경되지 않고 공유하면서 사용할 목적.
	//이러한 값을 사용하고 싶은데 이 값은 변하지 않았으면 좋겠어. 싶을떄 사용한다. 
	// 선언만 하면 안되고 값을 줘야 사용할 수 있다. 
	
	
	
}
