package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class FileRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File f1 = new File("test.txt");
			f1.createNewFile(); // 메소드까지 실행해야만 실제 파일이 만들어짐.

			// 2. 존재하는 폴더에 파일 생성해보기.
			File f2 = new File("D:\\test.txt");
			f2.createNewFile();

			// 3. 폴더 먼저 만들고 파일까지 한꺼번에 만들어보기.
			File tempFolder = new File("D:\\temp");
			tempFolder.mkdir(); // mkdir = make direct -> 폴더가 만들어지게 하는 메소드

			File f3 = new File("D:\\temp\\test.txt");
			f3.createNewFile();

			// 실행할때 마다 파일이 계속 같은게 만ㄷ르어지는건가요?
			// 해당 파일 존재하면 그냥 덮어쓰기 된다. 수정사항 없으면 그대로 덮어씌우기 됨.

			System.out.println(f1.exists());
			System.out.println(new File("ttt.txt").exists()); // false 왜냐면 저런 파일이 없으니까.

			System.out.println(f1.isFile()); // 이거 파일이야? 맞아? (boolean)
			System.out.println(tempFolder.isFile());// false 왜냐면 이건 폴더다. 파일이 아니고.(boolean)

			// 폴더 생성해보기.
			File folder = new File("parent");
			folder.mkdir();

			// 생성된 폴더에 파일 생성.
			File file = new File("Parent\\person.txt");
			file.createNewFile();

			//
			System.out.println("파일명 : " + file.getName());
			// 최상단 드라이브부터 시작해, 주소를 나열하는 절대경로
			System.out.println("절대경로 : " + file.getAbsolutePath());
			// 아무것도 안 써있으면 0 출력
			System.out.println("파일용량 : " + file.length());//
			// 파일 호출 하는 법
			System.out.println("상위 폴더 : " + file.getParent());

			// 프로그램상에 데이터를 외부매개체로 출력을 한다거나 외부 매개체를 통해 입력을 받아올거임
			// 반드신 그 외부매체와 통하는 통로를 만들어야 하는데 그 통로 이름이 스트림 이라고 한다.

//			스트림 통로 특징
//			1. 스트림 : 개울과 비슷하다. 한방향으로 흐른다. 
//			2. 단방향 : 입력이면 입ㅂ력, 출력이면 출력
//				두 기능을 한번에 하고 싶다? 두개 전부 각각 따로 만들어야함(열어야함)

//			외부매체에 직접 연결하는 유무
//			- 기반 스트림 : 외부매체와 직접적으로 연결되는 통로(필수)
//			- 보조 스트림 : 말 그대로 보조 역할만 하는 통로(속도를 빠르게 한다거나 , 그 외에 유용한 기능)
//							보조 스트림 단독으로는 사용 불가! 기반 스트림은 반드시 기본적으로 있어야 한다.
//							
//			우리는 외부매체를 파일로 해보자.
//			첨부파일 기능 구현할 떄 필요한 개념.

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
