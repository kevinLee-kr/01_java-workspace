package com.kh.chap01_math.run;

public class MathRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//pi는 상수다.
		System.out.println("파이 : " + Math.PI);
		
		
		//절대값을 알고자 할떄abs(앱솔루트)(절대값)
		int num1 = -10;
		System.out.println("절대값 : " + Math.abs(num1));
		
		
		
		//올림: ceil : 크러가 같은 정수값
		double num2 = 4.349;			//얘보다 크거나 같은 정수값 -> 5;
		double num3 = -10.594;			//얘보다 크거나 같은 정수값 -> -10;
		
		System.out.println("올림한 결과 " + Math.ceil(num2));
		System.out.println("올림한 결과 " + Math.ceil(num3));
		
		//반올림 : round
		System.out.println("반올림 : " + Math.round(num2));
		
		//버림 : floor
		System.out.println("버림 : " + Math.floor(num3));
		
		
		//가장 가까운 정수값을 알아낸 후 실수으로 반환 :rint
		System.out.println("가장 가까운 정수값 : " + Math.rint(num2));
		
		//제곱근(루트) : sqrt
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		
		//제곱 : pow
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));
		
		
		/*Math 클래스에 ㄱ대해서
		 - 모드 상수 필드, 모든 메소드 static 메소드다. import등 선언을 통해 메소드를 가져오는 것이 아닌, 그냥 불러올수 있다. 
		 math의 생성자가 private으로 되어 있기 때문에 생성이 불가능하다. 
		 
		 한번만 메모리 영역에 올려놓고 필요할때마다 재 사용하는 느낌.  -> 싱글톤 패턴.(정보처리기사에 나옴)
		 
		 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
