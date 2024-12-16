package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
/*
 * java.util.Date
 * 
 *기본 생성자를 통해서 생성을 해보자구.  
 */
		Date date1 = new Date();//현재 시간을 담고 있음. 
		System.out.println(date1);
		
		//내가 원하는 날짜로 세팅을 하고 싶을떄?
		
		Date date2 = new Date(2024-1900, 11-1, 27);
		System.out.println(date2);
		//매개변수 생성자를 통해서 생성을 해야한다. 
		//옛날에 만든거라 좀. 이상함. 계산해서 값을 넘겨줘야한다. 
		
		//기본생성자로 생성한 후 setter 메소드로 값 변경 하는 바업도 있따. 
		
		date1.setMonth(11-1);
		date1.setDate(27); // 이렇게 손수 작업이 가능 하긴 하다. 
		
		//2024년 11월 27일 12시 42분 57초
		//내맘대로 포맷을 적용해서 출력 가능하다. 자바에서는. 특정 클래스를 사용해서. 
		//java.text.SimpleDateFormat 클래스
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일 hh시 mm분 ss초");
		String formatDate = sdf.format(date1);
		//System.out.println(formatDate);
		
		//오늘날짜로 하고 싶다.  -- 기본 생성자
		// 특정 날짜로 하고 싶다.  -- 매개변수 생성자.
		//format 형으로 하고 싶다.  -- format 문을 활용한다. 
		
		
		
		
		
		
		
	}

}
