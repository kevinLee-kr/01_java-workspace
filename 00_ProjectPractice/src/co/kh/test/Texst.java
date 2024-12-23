package co.kh.test;

import co.kh.test.person.model.vo.Person;

public class Texst {

	public static void main(String[] args) {
		
		Person[] pArr = new Person[3];
		
		pArr[0] = new Person("일강준");
		pArr[1] = new Person("이강준");
		pArr[2] = new Person("삼강준");
		
		
		for(int i = 0 ; i<pArr.length;i++) {
			System.out.println(pArr[i].getName());
		}
	}
	
}
