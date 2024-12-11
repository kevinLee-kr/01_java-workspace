package com.kh.chap02_ingerit.run;

import com.kh.chap02_ingerit.model.vo.AirPlane;
import com.kh.chap02_ingerit.model.vo.Car;
import com.kh.chap02_ingerit.model.vo.Ship;

public class IngeritRun {

	public static void main(String[] args) {

		Car c = new Car("벤틀리", 12.5, "세단", 4);
		Ship s = new Ship("낚시배", 3, "어선", 1);
		AirPlane a = new AirPlane("종이비행기", 0.01, "제트기", 10, 4);
		
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		
		//처음에는 그냥 움직인다' 라고 출력이 3개다 나왔다. 
		// car에서 public void howToMove 란에
		//System.out.print("바퀴를 굴려 움직인다.") 라고 새로이 코드를 입력했다. 
		// 정리하면, 부모와 자식간에 오버라이딩이 걸려 있다면 , 출력으로는 자식 코드를 따른다. 
		c.howToMove();
		s.howToMove();
		a.howToMove();
		
		
		//System.out.println(c ==s));//오류, c,s는 주소값을 갖고 있는 참조값인데, 주소는 다리고 더 비교할 것이 없기 때문에 비교 할 수 없다고 나옴. 
		System.out.println(c.equals(s));
		System.out.println(c.hashCode());
		System.out.println(c);
		System.out.println(c.toString());//어떤 객체의 주소값을 출력해주는 배포해주는 기능을 갖고 있다. toString.
		
		/*
		 * 상속의 장점
		 * 보다 적은 양의 코드로 새로운 클래스르르 작성하는 것이 가능하다. 
		 * 코드를 가지고 공통적으로 관리를 하니까 코드의 추가/생성/업데이트에 용이하다. 너무 쉽다. 
		 * 유지보수 향상 생산성 업.
		 * 상속의 특징
		 * 클래스간의 상속에 있어서는 다중상속이 안된다. 
		 * (단일상속의 원칙! 즉, 부모는 하나다. 최초의 부모는 object이다. )
		 * 부모클래스에 정의돼있는 protected필드는 자식클래스에서 직접 접근 가능하다. 
		 * 자식 객체는 부모클래스에 있는 메소드를 마치 내것처럼 호출가능. (엄마아빠꺼 내꺼, 내꺼도 내꺼)
		 * 만약 부모 클래스에 있는 메서드, 수정 가능하다. 별다른 명령어 선언 필요없이.
		 * 명시되어 있지는 않지만, 모든 클래스 object라는 클래스의 후손이다. 
		 * --> 즉 object 클래스에 있는 메소드를 마음대로 호출 가능하네?
		 * --> 오버라이딩을 통해서도, object의ㅡ 메서드를 수정할 수 있다. 
		 * 
		 */
		
		
	}

}
