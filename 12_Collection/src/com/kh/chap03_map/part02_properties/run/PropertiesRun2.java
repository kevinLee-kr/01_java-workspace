package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 {

	public static void main(String[] args) {

		Properties prop = new Properties(); // {}
		try {
			// 5. load (InputStream is)
//			prop.load(new FileInputStream("text.properties"));

			// 6. loadFromXML(InputStream is)
			prop.loadFromXML(new FileInputStream("test.xml"));

		} catch (IOException e) {

			e.printStackTrace();  
		}
		System.out.println(prop);

		/*
		 * .properties 를 사용하는 이유가 있는데 이것은 프로그램상에 필요한 기본 환경설정관련한 문구를 기술하는 경우. -> 모두 문자열로
		 * 이루어져 있기에 개발자가 아닌 일반인 관리자라도 해당 문서를 파악해서 수정하기 쉽다.
		 * 
		 * .xml 파일의 특징. 프로그래밍 언어들 간에 있어서 호환이 잘됨.
		 * 
		 * 컬렉션은 다 배웠따. 중요도 우선순위 리스트. properties. 입력 set 출력 get store ?
		 * 
		 * 
		 * list 의 특징 set 의특징 map특징
		 * 
		 * 메소드 기능 set~ entryset
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
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
