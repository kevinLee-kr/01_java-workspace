package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {

//	문자 기반 스트림을 가지고 입출력 해보기.
//	
//	- 문자 스트림 : 데이터를 2바이트 단위로 전송하는 통로다.(넙은 톨로) 
//	- 기반 스트림 : 외부매체와 직접적으로 연결되는 통로
//	
//	
//	XXXXReader : 입력용 스트림
//	XXXXWriter : 출력용 스트림

	public void fileSave() {
		// fileWriter : 파일로 데이터를 2바이트 단위로 출력할 수 있는 스트림

		FileWriter fw = null;

		// 1. FileWriter객체 생성
		try {
			fw = new FileWriter("b_char.txt");// 해당 파일이 없으면 새로 만들고 있으면 출력

			// 2. write 메소드이용해서 데이터 출력
			// 2byte단위로 데이터 전송
			fw.write("아이고 점마좀 봐라"); // 실제로는 해당 문자열이 하나씩 하나씩 출력된다.
			fw.write("아이고 점마좀 봐라\n");
			fw.write("아이고 점마좀 봐라");
			fw.write("아이고 점마좀 봐라\n");
			fw.write("아이고 점마좀 봐라");
			
			char[] arr = {'a','p','c','d'};
			fw.write(arr);
			
			
			
			//fw = new FileWriter("b_char.txt", true); 이어쓰고 싶다면, 조건식 에 ', true' 를 쓴다면 , 작성중인 파일에 덮어씌우기가 아닌 이어쓰기가 된다. 실행할수록 이어쓰기는 계속된다. true 미 작성시, 해당 파일이 존재할 ㄱ우 기존의 데이터 더ㅠ어 씌워짐
//	true 작성시 해당ㅍ 파일이 존재할 경우 기ㅗㅈㄴ의 데이터에 이어서 작성.
			
			
			
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}
	
	
	//프로그램입장에서 봤을때 누가 나에게 들어오는 거다.  <-- 파일 {입력:파일로부터 데이터 가져오기}
	public void fileRead() {
		//FileReader : 파일로부터 데이터를 2바이트 단위로 입력받을 수 있는 스트림
		FileReader fr = null;
		

		try {
			
//			1. FileReader 객체 생성
			fr=new FileReader("b_char.txt)");
			
			//2. read메소드 이용해서 읽어드리자. 파일의 끝을 만나는 순간 -1 반환
			int value = 0;
			while((value = fr.read())!=-1){
				System.out.println((char)value);
			}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
}
