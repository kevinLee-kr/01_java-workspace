package com.kh.chap01_list.part02_mvc.run;

import com.kh.chap01_list.part02_mvc.view.MusicMenu;

public class MVCRun {

	public static void main(String[] args) {

		/*
		 MVC 패턴 : 각 클래스 마다 역할(데이터, 화면, 요청처리)을 부여해서 작업
		 
		 유지보수 할때 굉장히 용이하다. 
		 V : View, 화면을 담당. 즉, 사용자에게 보여지는 시각적인 요소(출력문 (print) 입력문(scanner))
		 C : controller, 사용자가 요청한 내용을 처리한 후 그 결과를 돌려주는 역할(출려문 같은거 나오지 않음) 컨트롤러 작성하고 있는데 출력문을 쓰고있다? 그건 잘못 된거다. return 같은거 해주면 된다. 
		 
		 사용자랑 같은 친한건 view 왜냐면 보이니까, 
		 *
		 */
		
		
		MusicMenu mm = new MusicMenu();
		mm.mainMenu();
	}

}
