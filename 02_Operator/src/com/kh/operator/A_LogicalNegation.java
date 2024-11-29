package com.kh.operator;

public class A_LogicalNegation {

	public void method1() {
		System.out.println("ture의 부정 : " + !true);
		System.out.println("false의 부정 : " + !false);
		
		System.out.println("ture의 부정 : " + !true);
		System.out.println("false의 부정 : " + !false);

		boolean b1 = true;
		System.out.println("b1의 부정 : " + !b1); 
				
		boolean b2 = !b1; 

		boolean b3 = !(5>3); 
	}
	
}
