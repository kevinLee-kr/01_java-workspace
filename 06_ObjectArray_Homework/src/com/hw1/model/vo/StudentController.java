package com.hw1.model.vo;

public class StudentController {

	// 필드, student sArr 5칸짜리 배열 생성
	private Student[] sArr = new Student[5];
	// cut_line 반환형 절대값 생성
	public static final int CUT_LINE = 60;

	// 기본생성자
	public StudentController() {
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}

	
	public Student[] printStudent() {
		
		return sArr;
		
	}

	int sum = 0;

	public int sumScore() {
		for (int i = 0; i < sArr.length; i++) {
			sum += sArr[i].getScore();
		}
		return sum;
	}

	double[] avg = new double[sArr.length];

	public double[] avgScore() {
		avg[0] = sum;
		avg[1] = sum / sArr.length;

		return avg;
	}
	
	
	
	

}
