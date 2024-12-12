package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		// 위의 사용 데이터 참고하여 3명의 학생 정보 초기화
		// 위의 학생 정보 모두 출력
		Student s1 = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		Student s2 = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		Student s3 = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("=============================================");

		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
		Employee[] e = new Employee[10];
		// 사원들의 정보를 키보드로 계속 입력 받고 → while(true) 무한 반복문을 통해

		Scanner sc = new Scanner(System.in);
		System.out.println("안녕하세요.반갑습니다.");
		int cancle = 0;
		int count = 0;
		int out = 0;
		while (true) {
			cancle++;
			if (cancle > e.length) {
				System.out.println(" 메모리 용량을 초과 했습니다. 프로그램을 종료합니다. ");
				break;
			}
			for (int i = 0; i < e.length; i++) {
				// 한명씩 추가 될때마다 카운트함
				count++;
				System.out.print("사원님의 이름을 적어주세요 : ");
				String name = sc.nextLine();

				System.out.print("나이를 적어주세요 : ");
				int age = sc.nextInt();

				System.out.print("신장을 적어주세요 : ");
				double height = sc.nextDouble();

				System.out.print("몸무게를 적어주세요 : ");
				double weight = sc.nextDouble();

				System.out.print("급여를 적어주세요 : ");
				int salary = sc.nextInt();
				sc.nextLine();
				System.out.print("부서를 적어주세요 : ");
				String major = sc.nextLine();

				System.out.print("계속 추가 하시겠습니까? : ");
				char userchoice = sc.nextLine().charAt(0);
				// 계속 추가할 것인지 물어보고, 대소문자 상관없이 y이면 계속 객체 추가
				// ‘n’일 경우 더 이상 그만 입력 받도록 ...
				// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체 배열에 객체 생성
				e[i] = new Employee(name, age, height, weight, salary, major);

				if (userchoice == 'n' || userchoice == 'N') {
					System.out.println("프로그램을 종료합니다. 감사합니다. ");
					for (int j = 0; j < count; j++) {
						System.out.println(e[j].toString());

					}
					out++;
					break;
				}

			}

			if (out == 1) {
				break;
			}

		}
	}
}
