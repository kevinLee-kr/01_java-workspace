package com.kh.chap04_assist.part02_object.run;

import com.kh.chap04_assist.part02_object.model.dao.ObjectDao;

public class ObjectRun {

	public static void main(String[] args) {

		ObjectDao odj=new ObjectDao();
		odj.fileRead();
		
		
//		java.io.NotSerializableException error
//		public class objecRun [implements Serializable] 추가. -> 위 에러 해결.
		
//		내가 만든 phone 프로그램의 내용이 출력을 하러 나갈떄 통로를 통해서 나가는데
//		파일까지 도달하기까지 의 통로가 너무 작다 이거다. 내가 갖고 있는 프로그램의 내용이 더 크다 이거지.
//		
//		그래서 이 프로그램을 '직렬화' 과정
//		객체 자체를 입출력 하고자 한다면 직렬화 과정이 필수인데 . 
//		그것을 하게 해주는 선언문이 implements Serializable 을 클래스 선언문 오른쪽에 붙혀줌으로써 작동 하는것이었다
//		
//		그러면  프로그램이 직렬화, 즉, 한줄로 세워서 출력하게 되는 것이다.
//		출력이 되었고, 저장 되었느지 확인을 하기 위해 파일을 열어보면 , 미관상 다 꺠져 보일 것이다. 
//		이것은 현재 ㅇ사람입장에서 이상해 보일수 있으니, 컴퓨터가 나중에 읽기 좋게 하기 위해서 저렇게 둔것이다. ㅈ name = new ㅈ();
//		저것은 정상이다. type name = new type();
		
		
		
		
		
		
	}

}
