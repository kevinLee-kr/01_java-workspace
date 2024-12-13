package com.kh.chap02_abstractAndInterface.part01_easy.run;

import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.Baseball;
import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.Football;
import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.Sports;

public class EasyRun {

	public static void main(String[] args) {

		// 추상클래스는 객체생성 불가능함.(왜? 미완성 클래스이기 때문에)
		// Sports s = new Sports();
		//

		Sports s = new Football();
		// 객체 생성이 안될 뿐이지 레퍼런스로는 사용 가능!
		// 다형성 적용 시켜서 부모타입으로 자식객체 받아주느느 형태 의 기술 가능하다.

		Sports[] arr = new Sports[2];

		// 부모타입인 sports 타입
		arr[0] = new Football();
		arr[1] = new Baseball();

		for (int i = 0; i < arr.length; i++) {
			arr[i].rule();
		}

		//향상된 for문
		for(Sports a:arr) { // a = arr[0], a=arr[1] , 지금 왜 sports a 가 들어갔는지, 다형성이 적용 된건지, 흐름을 잡을 수 있는지. 따라잡자.
			
			a.rule(); //동적바인딩.
		}
		
		/*동적바인딩
		 * 컴파일 시점에서는 정적바인딩으로 현재 레퍼런스의 자료혀ㅑㅇ의 클래스에 있는 메소드를 가리키긴함.
		 * 	런타임시점(실행시점)에서는 동적바인딩으로 각각의 자식 클래스에 오버라이딩 된 메소드가 있을 경우 그거 실행함.
		 * 
		 * 추상메소드
		 * - 미완성된 메소드로 몸통이 없다. 구현이되어 있지 않는 메소드를 추상메소드라고 한다. 
		 * 추상 클래스
		 * - 미완성된 클래스.
		 * - 만약엥 내가 추상 메소드를 하나라도 가진 클래스는 반드시 추상 클래스도 명시를 해야 한다. extract class
		 * 
		 * 
		 * 추상 메소드가 굳이 없어도 추상 클래스를 만들수 있음. 근데 이거 사용할 일이 있나요?
		 * 개념적 : 단지 이 클래스가 아직 미완성된 클래스다 라는걸 알려줄 목적 -> 추상화 단계를 거쳐 아직 전체적인 틀이 완성단계가 아닌경우
		 * 프로그래밍적 : 객체 생성이 불가 하게끔 하고자 할 떄.
		 * 
		 * 추상 메소드가 존재하는 추상 클래스를 사요하는 이유
		 * - 부모 클래스에 추상 메소드가 존재할 경우
		 * 만약에 부모가 완벽한 상태이면 상속받을때 아무 문제없다.
		 * 근데 만약 불안한 상태라면, 자식 입장에서는 강제로 오버라이딩해서 동일한 패턴의 메서드를 가지게 된다. 
		 * 각각의 자식 클래스마다 실행시킬 내용은 다르지만 동일한 형태의 메소드로 구현했으면 할떄. 사용한다.
		 * 이럴떄 어떤 장점이 있냐, 통일성 확보, 표준화된 틀 제공. 
		 * 
		 *  요약 - 부모가 추상 메소드를 만들면 자식이 구상 메소드를 가진다. 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
