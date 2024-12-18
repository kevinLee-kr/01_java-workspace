package com.kh.chap02_byte.run;

import com.kh.chap02_byte.mode.dao.FileByteDao;

public class FileByteRun {

	public static void main(String[] args) {


		/*
		 "바이트 기반 스트림" 을 활용해서 데이터 입출력 해보기.
		 
		 바이트 스트림이란?  - 데이터를 1byte단위로 전송하는 통로 / 너무 좁기 때문에 한글이 지나갈때 깨져버린다. 
		 기반 스트림이란?>  - 외부 매체와 직접적으로 연결되는 통로.
		 
		 XXXXInputStream -> xxxx매체로 부터 데이터를 입력 받는 통로
		 XXXXOutputStream > xxxx매체로 부터 데이터를 출력 하는 통로
		 */
		FileByteDao fdao = new FileByteDao();
		//fdao.fileSave();
		
		fdao.fileRead();
		
		
	}

}
