package com.hw1.model.vo;

public class StudentMenu {

	private StudentController ssm = new StudentController();
	private Student st = new Student();

	public StudentMenu() {
		System.out.println("=============================학생 정보 출력 ===================");

		// ===========학생 정보 출력 ==========
		// StudentController 에 printStudent()의 반환 값을 통해 학생 정보 출력

		for (int i = 0; i < 5; i++) {

			System.out.println(ssm.printStudent()[i].information());

		}
		System.out.println("=============================학생 성적 출력 ===================");

		// ===========학생 성적 출력 ==============
		// StudentController 에 avgScore()를 통해 점수 합계와 평균 출력
		System.out.println("학생 점수 합계 : " + ssm.sumScore());
		System.out.println("학생 점수 평균 : " + ssm.avgScore()[1]);

		// ============성적 결과 출력============
		// 학생의 점수가 CUT_LINE 미만이면 재시험 대상, 이상이면 통과 출력
		System.out.println("=============================성적 결과 출력 ===================");
		for (int i = 0; i < 5; i++) {
			if (ssm.printStudent()[i].getScore() < 60) {
				System.out.println(ssm.printStudent()[i].getName() + "학생은 재시험 대상입니다.");
			} else {
				System.out.println(ssm.printStudent()[i].getName() + "학생은 통과입니다..");
			}
		}
	}
}
