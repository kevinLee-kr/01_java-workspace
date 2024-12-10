package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {

		// 객체 배열을 크기 3으로 할당 한 뒤
		Employee[] e = new Employee[3];
		// 0번 인덱스에는 기본생성자를 통해서 객체 생성
		e[0] = new Employee();
		// 1번 인덱스에는 매개변수 6개짜리 생성자를 이용해서 객체 생성
		e[1] = new Employee(1, "홍길동", 19, 'm', "01022223333", "서울 잠실");
		// 2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력
		e[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 10000000, 0.01, "01011112222", "서울 마곡");

		for (int i = 0; i < e.length; i++) {
			System.out.println("emp[" + i + "] : " + e[i].information());
		}

		System.out.println("============================================================================");
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 다시 출력(임의로)
		e[0].setEmpName("김말똥");
		e[0].setDept("영업부");
		e[0].setJob("팀장");
		e[0].setAge(30);
		e[0].setGender('M');
		e[0].setSalary(30000000);
		e[0].setBonusPoint(0.2);
		e[0].setPhone("010-5555-9999");
		e[0].setAddress("전라도 광주");

		e[1].setDept("기획부");
		e[1].setJob("부장");
		e[1].setSalary(40000000);
		e[1].setBonusPoint(0.3);
		for (int i = 0; i < e.length - 1; i++) {
			System.out.println("emp[" + i + "] : " + e[i].information());
		}
		System.out.println("============================================================================");
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		// 보너스가 적용된 연봉 = (급여 +(급여 *보너스 포인트)) * 12

		int annualSalary = 0;

		for (int i = 0; i < e.length; i++) {
			if (e[i].getEmpName().equals("김말똥")) {
				System.out.println(
						"김말똥의 연봉 : " + (int) (e[i].getSalary() + (e[i].getSalary() * e[i].getBonusPoint())) * 12);
			} else if (e[i].getEmpName().equals("홍길동")) {
				System.out.println(
						"홍길동 연봉 : " + (int) (e[i].getSalary() + (e[i].getSalary() * e[i].getBonusPoint())) * 12);
			} else {
				System.out.println(
						"강말순 연봉 : " + (int) (e[i].getSalary() + (e[i].getSalary() * e[i].getBonusPoint())) * 12);
			}
			annualSalary += (e[i].getSalary() + (e[i].getSalary() * e[i].getBonusPoint()) * 12);
		}
		System.out.println("============================================================================");
		// 3명 직원의 연봉 평균을 구하여 출력

		System.out.println("직원들의 연봉의 편균 : " + annualSalary / e.length);

	}

}
