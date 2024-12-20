package com.kh.chap03_map.part02_properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun1 {

	public static void main(String[] args) {
		/*
		 우리가 properties : Map 게열의 컬렉션 -> 키 + 벨류를 세트로 저장하고 있다. 
		 hash map과으 ㅣ차이는? hash map 도 키 +벨류를 갖고 있는데 원하는 타입으로 사용 할 수 있었다. 
		 
		 근데 얘는 properties는 key 값도 string 을 넣어야 하고 value 값도 string 을 넣어야 한다. 
		 차이는 크게는 없는데 string 을 넣냐 안넣냐 차이가 있다고 생각 하면 될듯
		 
		 
		 */
		
		Properties prop = new Properties();
		/*
		prop.put("다이제", new Snack("초코", 1500));
		prop.put("새우깡", new Snack("짠맛", 500));
		
		System.out.println(prop);
		System.out.println(prop.get("다이제"));
		
		//하지만 properties 사요하는 경우는 properties에 담긴 것들을 파일로 출력 또는 입력받아 올때 사용한다. 
		//properties 에서 제공하는 store(), load() 메소드를 사용하기 위해서 properties 를 사용한다고 생각해야된다. 
		
		//
		try {
			prop.store(new FileOutputStream("test.properties"), "properties Test");
			//내부적으로 sotre메소드를 실행하면 properties에 담겨있는 키 + 벨류  세트를 String 으로 형변환 해서 출력함. 
			//put으로 넣는건 문제가 안되는데 근데 이걸 파일로 넣는 싲머에 문제가 생기는 것이다. 왜냐하면 properties 는 두개의 값을 필요로 하는데 모두 STRING 을 해야한다. 
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} // store 은 출력을 하기위해 사용하는 메소드
		//기반 스트림을 베이스로 만들어야 한다. 
		*/
		//파일 입출력 을 할려고 한다. 하고 싶으면 다른 메소드를 사용해야함 
		//1. setProperty(String key, String value)를 써보자. 
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		System.out.println(prop); // 저장 순서가 유지 안되는 것은 set, map의 종특이다. key 값 중복시 덮어씌여진다. 
		// 2. getProperty(String key) //이건 출력할떄. 입력할떄는 set, 출력할때, get
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("Listtt")); // 존재하지 않는 key 값을 제시하면 null 값 나옴. 위에 리스트에 보면 listttt는 없으니 존재하지 않는거임. 
		
		try {//3. store(OutputStream os, String comment) : Properties 에 담겨있는 key - value값들을 파일로 출력해주는 메소드이다.   
			prop.store(new FileOutputStream("test.properties"), "제발 한번에");
			//4. store(OutputStream os, String commnet) :  Properties 에 담겨있는 key - xml value값들을 파일로 출력해주는 메소드이다.   
			prop.storeToXML(new FileOutputStream("test.xml"), "properties");
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//prop 이라는 객체를 만들고 properties 방법을 통해 파일을 만들고 값을 입력 시켰다. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
