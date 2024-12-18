package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {

	// 프로그램 --> 파일(출력) 출력하는 스트림을 짜보자.
	public void fileSave() {

		// 출력할 데이터
		Phone p1 = new Phone("아이폰", 1300000);
		Phone p2 = new Phone("갤럭시", 1200000);
		Phone p3 = new Phone("플릭", 1500000);

//		객체단위로 출력해줄 수 있는 보조스트림이 필요하다.

//		ObjectXXXX 이 아이는 Writer, Reader 가 없다. 
//		얘는 가장 좁은 통로은 바이트 머시기랑 가티 써야 합니다.
//		
//		FileOutputStream 기반 스트림을 쓸거고, 파일과 연결해서 1바이트 단위로 출력할수 있는 기반 스트림
//		보조스트림으로는 ObjectOuputStream, 객체 단위로 출력할 수 있도록 도움을 주는 보조스트림
//		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))) {

			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);

		}

		catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	//프로그램 < ---파일  (입력 스트림)	
	public void fileRead() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))) {
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
			System.out.println(ois.readObject());//파일의 끝을 출력 해봤다. 에러 발생(EOFException -> end of file (널값이 나올줄 알았는데 아니었따.)
			*/
			
			while(true) {
				System.out.println(ois.readObject());
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) {
			System.out.println("기록된 내용이 모두 소진되었습니다.");
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
		System.out.println("프로그램을 종료합니다.");
	
		
	
		
	}
}
