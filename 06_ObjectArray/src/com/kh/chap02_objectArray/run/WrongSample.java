package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class WrongSample {

	public static void main(String[] args) {

		Phone[] arr = new Phone[3];
		arr[0] = new Phone();
		arr[1] = new Phone();
		arr[2] = new Phone();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName());
		}
		// 잘못된 부분
		// 1. NullPointerException - 초기화 이슈. 널 값이 들어 있는데, i와 비교를 하자니 아무것도 없는 null 그리고
		// 정수형인 int 형은 비교가 되지 않으므로 비교불가
		// ㄱ객체의 각 인덱스에 담긴 값이 null 인 상태에서 메소드를 호출하려고 했기 때문에. <--- 선생님
		// 조치내용 -> 객체배열 만든 후 각 인덱스 별로 객체 생성을 진행 해야됨.

		// 2. ArrayIndexOutOfBoundsException - 배열의 인덱스 범위를 벗어낫기 때문에. 발생하는 오류. for문에서 i가
		// 3이 되었고 <= 비교식에 의해 arr.length는 3번 인덱스를 호출 해야하는데
		// 2번 인덱스까지밖에 없던 phone 은 그만 오류를 범하고 만다.
		// 조치내용 -> (i<배열의 길이)

	}

}
