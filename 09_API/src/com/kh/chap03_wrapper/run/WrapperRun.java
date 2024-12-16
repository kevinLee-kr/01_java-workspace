package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {

		/*
		 * wrapper 클래스 -> 기본자료형을 객체로 포장해 줄수 있는 클래스가 wrapper이다.
		 * 
		 * 기본 자료형<---->Wrapper class boolean Boolean char Character byte Byte short
		 * Short int Integer long Long float Float double Double
		 * 
		 * -> 기본 자료형을 주소값을 가지는 객체로 취급을 해야 할 상황이 온다. -> 메소드를 호출 해야될떄가 그럴떄가 될수 있고 -> 메소드의
		 * 매개변수로 기본 자료형이 아닌 객체 타입만을 요구할떄 -> 가형성을 적용 시키고 싶을떄
		 * 
		 * Boxing : 기본 자료형을 wrapper 클래스 자료형으로 감싸는것
		 * 
		 * 
		 * Unboxing : 잘 포장되어있는 wrapper클래스를 -> 기본자료형으로 전환..
		 */

		int num1 = 10;
		int num2 = 15;
//		System.out.println(num1.equals(num2));

		// 1. 객체 생성 구문을 통한 방법
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);

		System.out.println(i1);// 자동으로 .toString 이 붙게 되니까 주소값이 나와야 하는데 값이 10이 나온다는 건 뭐다?
		System.out.println(i2);

		System.out.println(i1 == i2);
		// 객체화 시키면 메소드 호출이 가능하다.
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2));
		// 만약 두 값을 비교해서 앞쪽이 크면 1을, 뒤쪽이 크면 -1을, 같으면 0을 출력한다.

		// 2. 객체 생성하지 않고 곧바로 대입해보자.
		// auto boxing
		Integer i3 = num1;
		System.out.println(i3);
		// 객체 생성을 통해서 반드시 변환해야 하는 경우 = 문자열을 Integer타입으로 반드시 변환을 해야 하는 경우
		// Integer i4 = "123"; -> 에러 발생.
		Integer i4 = new Integer("123"); // -> 문자값을 대입했는데 오류 x, 오로지 숫자를 주어야 함.
		// 방법이 1,2가 있는데 값이 문자열이었을 경우, 첫번째 방법만으로 밖에 실행이 안된다.
		System.out.println(i4);

		// Unboxing 에 대해서. -> wrapper클래스 -> 기본 자료형
		// 1. 해당 그 wrapper ㅋ르래스에서 제공하는 xxxxValue()메소드를 통해
		int num3 = i3.intValue();
		int num4 = i4.intValue();

//		2. 메소드 따위 사용하지 않고 대입 바로 하는 방법(Auto UnBoxing)
		int num5 = i1;

		// 이거 왜 배우는 건가요?
		// 왜냐면, 웹 개발할떄, 사용자가 입력한 값은 무조건적으로 문자열 타입으로 넘어 들어오기 때문에, 숫자입력값을 저장할때, 받은 문자 타입을
		// 형변환하여 숫자타입으로 저장해야 한다.
		// 웹개발할떄 값 일벽하면 무조건 문자로 날아옴

		// 기본 자료형 <--> String
		String str1 = "10";
		String str2 = "15.3";

		System.out.println(str1 + str2);// 문자열 + 문자열 = 문자열로 이어진다.
		// 1.String --> 기본 자료형..?형?
		// "10" --> 10
		// "20" --> 20

		// 문자열을 int 형으로 저장 해야 될 상황이 왔다고 치자.
		// wrapper.parseXXX() 를 사용하면 해결된다.

		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		System.out.println(i);
		System.out.println(d);

		System.out.println(i + d);

		// 2. 기본자료형을 String 으로 변환 해보자
		// 10 --> "10";
		// 20.5 --> "20.5";

		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		int a = 10;
		String strA = a + " "; // -> 10 --> "10"으로 변한다.

	}

}
