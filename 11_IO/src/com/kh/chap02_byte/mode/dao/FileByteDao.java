package com.kh.chap02_byte.mode.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteDao {

	public void fileSave() {
		// 프로그램 (자바 또는 메모리 ) --> 외부매체(파일)(출력 : 프로그램 상의 데이터를 파일로 내보내기, 즉

		// FileOutputStream : 파일과 직접적으로 연결해서 1바이트 단위로 출력하는 스트림

//		1. 스트림 생성(통로 만들기)
//		2. 스트림으로 데이터를 출력.(메소드 같은것들이 있어서 그것들을 활용하면 쉽게 출력 가능)
//		3. 출력 등 다 사용한 후 스트림 반남. (scanner 같으 것들은 활용후 반납 안해도 ㄱㅊ은데 스트림은 무조건 필수적으로 반납 해야함)
//		
		FileOutputStream fout = null;
		try {// 출력되는걸 해보자.
//		1. FileOutputStream 객체 생성 -> 해당 파일과의 연결 통로가 만들어짐
//			FileOutputStream fout = new FileOutputStream("a_byte.txt");
			fout = new FileOutputStream("a_byte.txt");
			// 생성은 여기서만, 선언은 밖에서.

//			해당파일이 없으면 새로 만들어주고 통로(txt파일) 연결
//			있으면~ 그냥 통로 연결
//			

			fout.write(97);
			fout.write('b');

			byte[] arr = { 99, 100, 101, 102};
			fout.write(arr); // cde 문자 저장. cde = 알파벳.
			                                   // write(byte[] b, int off, int len): byte 배열의
			fout.write(arr, 1, 2); // de문자가 저장됨.
		
			
			
//			3. 스트림 다 이용했으면 반드시 반납하기
//			fount.close();
//			위에서 write()메소드 실행시 io 오류 발생시 -> catch 블럭 실행 후 빠져나갈꺼임(반납하는 코드 실행 안됨)
//			반드시 실행해야만 하는 구문이기 때문에 finally{} 에 기술을 해주는 것이 ㅗㅈㅎ다. 			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
//				3. 스트림 이용 완료 헀으면 반납해야된다.(반드시);
				fout.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

			// 이 안에 작성된 코드는 예외가 발생 하던 말던 마지막에 무조건 실행ㅇ한다.
		}

	}

	// 읽어오는거 해보자. input
	public void fileRead() {

//		FileInputStream - 파일로부터 에이터를 1바이트 단ㅇ뉘로 입력받는 스트림
//		
//		2. 스트림 생성(통로 만드리)
//		4. 스티림을 통해 입력 받아옴 ( 메소드 활용)(회원가입?);
//		3. 사용이 끝난 스트림 반납
//		
		FileInputStream fin = null;
		try {
			// 1.FileInputStream 객체를 생성해보자.이;러면 나와 a_byte.txt간의 입력용 통로가 생긴거다.
			fin = new FileInputStream("a_byte.txt");

//			2. 파일로부터 데이터 읽어들이고자 할 떄 read메소드 사용
//		1byte단위로 하나씩 읽어옴 / 반환형이 int 여서 숫자로 읽어드림.
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());// 파일의 끝을 만나는 순간 -1을 받아오는거 확인

//			반복문 수행시 매번 read()가 두번씩 실행되기 떄문에 퐁당퐁당 읽여들여짐 -> 잘못됨
//			while(fin.read() != -1) {
//				System.out.println(fin.read());  
//			}
//			
//			read () 호출 반복문 수행시 에만 실행되도록
//			방법1. 무한반복 돌리면서 매번 조건 검사
//			
//			while(true) {
//				int value = fin.read();
//				if(value == -1) {
//					break;
//				}
//				System.out.println(value);
//			}

//			방법2. 권장
			int value = 0;
			while ((value = fin.read()) != -1) {
				System.out.println(value);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {

//			3. 사용마친 스트림 반남하기.
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
