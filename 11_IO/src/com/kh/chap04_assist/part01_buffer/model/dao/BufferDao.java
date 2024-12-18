package com.kh.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDao {

//	기반 스트림. 직접적으로 사용되었는데 그것만으로 부족했던 성능을 보다 향상 시켜주는 스트림이다. 
//				기반 스트림에서 제공되지 않는 추가적인 메소드 제공한다. / 데이터 전송 속도 향상 시킬 + a
//	기반 스트림과는 다르게 외부 매체와 직접적으로 연결 되는 스트림이 아니다!
//		이 말은 단독으로 사용이 안된다는 것을 의미하며, 반드시 기반 스트림과 함께 사용된다.

//			출력 스트림을 작성해보자.
	public void fileSave() {
// 			FileWriter 기반 스트림을 가지고 해보자.
//			파일과 직접적으로 연결해서 2바이트 단위로 출력할 수 있는 스트림이다.
//			
//			BufferedWriter : 버퍼라는 공간을 제공해주는 보조스트림.? 버퍼를 사용하면 속도 향상이 된다. 
//			기반 스트림이랑 이름을 맞추는 것이 일반적이다. 예) FileWrite, BufferWriter

//			BufferedWriter bw = new BufferedWriter("c_buffered.txt"); -> 에러 발생, 버퍼스트림이 단독으로 사용 되었기 때문.
//			                       1.first way
//			1-1. 기반 스트림 먼저 생성		
//			FileWriter fw = new FileWriter("c_buffer.txt");	//-> 기반 스트림으로 txt파일이 단독으로 생성됨
//			1-2. 보토스트림 생성시 기반 스트림 객체를 전달하면서 생성
//			BufferedWriter bw = new BufferedWriter(fw);
//
//			                       2. second way
//		
//		BufferedWriter bw=null;
//		bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
//				
		/*
		 * BufferedWriter bw = null; try { bw = new BufferedWriter(new
		 * FileWriter("c_buffer.txt"));
		 * 
		 * // write 메소드 활용해서 데이터 출력 해보기 bw.write("하이요\n"); bw.write("반갑소");
		 * bw.newLine(); //\n을 하지 않아도 한칸이 enter쳐짐 bw.write("음"); //버퍼라는 공간에 계속 쌓아놨다가 한번에
		 * 출력 해준다. -> 속도향상에 좋다. 인간이 느낄정도는 아닐정도로 워낙 빠르지만 하고, 하지않고의 차이가 있다고 한다.
		 * 
		 * 
		 * } catch (IOException e) {
		 * 
		 * e.printStackTrace(); } finally { try { bw.close(); } catch (IOException e) {
		 * 
		 * e.printStackTrace(); } }
		 */

		// try ~ with~resource 구문으로 자원 반납까지 더 간단하게 작업할 수 있음
		// jdk 7버전 이상부터 사용 가능하다.
//		
//		[표현법]
//		try (try블럭 내에서 사용ㅎ알 스트림 객체 생성 구문.){알아서 try 문이 끝나면 해당 스트림을 반납해줌(finally)을 적지 않아도 된다는 말임!
//
//		}catch(예외 클래스 e){
//			
//		}finally {
//			
//		}
//	

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {

			bw.write("안녕하세요\n");
			bw.write("반갑습니다.");
			bw.newLine();
			bw.write("저리가세요");

		} catch (IOException e) {
			e.printStackTrace();
		} // try-with-resource 문을 사용했기에 finally문을 적지 않아도 된다. 왜냐면 자동으로 반납 해주기 때문.

	}

	public void fileRead() {
//		FileReader : 파일과 연결해서 2바이트 단위로 데이터를 입력받을 수 있는 기반 스트림이 바로 filereader이다. 
//		bufferedReader: 단독으로 사용하지 못하며, 사용처의 주된 이유는 속도와 관련이 있다
//		
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {
			
			//br.read();  -> 이것은 반환형이 int 임. 그래서 형변환을 해줘야 한다. 
			//br.readLind(); -> 한 문장씩 가져오게 되어있어서 속도도 무척 빠르고, 반환형 스트링이다.
//			
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());//저장값이 아닌 정의되지 않은 값을 달라고 호출했을때는 heap영역에서 전달받은 null(초기화)값이 출력된다. 
			
			String value = null;
			while((value = br.readLine()) !=null) { //null과 비교할때는 equls 안써도 됨.
				System.out.println(value);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
		}catch(IOException e) {
		
		}
			
		
		
		
		
	}

	
	
}
