package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.C_Printf;
import com.kh.variable.D_Cast;

public class Run {
	
	public static void main(String[] args) {
		
		//클래스 파일들을 불러서 실행하는 방법
		// 클래스명 별칭 = new 클래스명();
		
		//A_Variable what = new A_Variable();
		
		//해당 클래스의 메소드를 실행하는 방법
		//별칭.메소드명()
		//what.decleareVariable();
		B_KeyboardInput b = new B_KeyboardInput();
		//b.inputTest1();
		
		D_Cast d = new D_Cast();
		d.forceCasting();
		
		System.out.println();
	}
}
