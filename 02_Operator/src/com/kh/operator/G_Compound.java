package com.kh.operator;

public class G_Compound {

	public void method1() {
		int num = 12;
		
		System.out.println("최초 num : " + num);
		
		num = num + 3;
		System.out.println("3 증가시킨 num : " + num);
		
		num+=3;
		System.out.println("3 증가시킨 num : " + num);
		
		num-=5; // num = num-5;
		System.out.println("5 감소시킨 num : " + num);
		
		num*=6; //num = num * 6
		System.out.println("6배 증가시킨 num : " + num);
		
		num/=2;
		System.out.println("2배 감소시킨 num : " + num);
		
		num%=4;
		System.out.println("최종num의 나머지 :" + num);
		
		// 다른 것들보다도 +=연산자가 많은 비중으로 사용하게 되므로 친숙해지자.
		
		
	}
	
}
