package co.kh.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Properties;

import co.kh.model.vo.Food;

public class fileRun {

	// 파일에 객체를 저장하기 위한 메소드

	
	public static void main(String[] args) {
		
		
		Food foods = new Food();
		foods.fileSave("test.text");
		
	}

}
