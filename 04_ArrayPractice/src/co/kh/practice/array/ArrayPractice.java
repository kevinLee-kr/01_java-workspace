package co.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() { // 1 2 3 4 5 6 7 8 9 10

		int[] arr = new int[10]; // 생성

		for (int i = 0; i < 10; i++) { // 대입
			arr[i] = (i + 1);
			System.out.print(arr[i] + " ");// 출력

		}

	}

	public void practice2() { // 10 9 8 7 6 5 4 3 2 1

		int[] arr = new int[10]; // 생성
		for (int i = 9; i >= 0; i--) {
			arr[i] = i + 1; // 대입
			System.out.print(arr[i] + " "); // 출력
		}
	}

	public void practice3() { // 1 2 3 4 5
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력해주세요 : ");
		int num1 = sc.nextInt();

		int[] arr = new int[num1];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1);
			System.out.print(arr[i] + " ");
		}

	}

	public void practice4() { // 귤

		String[] fruit = new String[5];
		fruit[0] = "사과";
		fruit[1] = "귤";
		fruit[2] = "포도";
		fruit[3] = "복숭아";
		fruit[4] = "참외";

		System.out.println(fruit[1]);

	}

	public void practice5() { // 찾으신 문자의 개수 :

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력해 주세요 : ");
		String str = sc.nextLine();

		System.out.print("문자를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);

		int count = 0;

		char[] arr = new char[str.length()];
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			if (ch == arr[i]) {
				count++;
				System.out.print(i + " ");
			}

		}
		System.out.println();
		System.out.println("찾으신 문자의 개수 : " + count);

	}

	public void practice6() { // 월요일 ~ 일요일 까지 초기화된 문자열 배열을 만들자.
		// 월요일 ~ 일요일 까지 초기화된 문자열 배열을 만들자
		String[] weekDays = { "월", "화", "수", "목", "금", "토", "일" };

		// 0부터 6까지 숫자를 입력받아
		Scanner sc = new Scanner(System.in);
		System.out.println("0 ~ 6 사이의 숫자를 입력하세요. : ");
		int userNum = sc.nextInt();
		int[] NumArr = new int[userNum];
		// 범위에 없는 숫자를 입력시 "잘못 입력하셨습니다. 출력하세요.
		if (userNum < 0 || userNum > 6) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.println(weekDays[userNum] + "요일");
		}

	}

	public void practice7() {// 사용자 입력값을 받아 인덱스 초기화 하고 저장된 값 합을 구하자.
		// 사용자가 배열의 길이를 직접 입력 하여 그 값만큼 정수형 배열을 선언 및 할당하고.
		Scanner sc = new Scanner(System.in);
		System.out.print(" 정수를 입력해주세요 : ");
		int userNum = sc.nextInt();
		int[] NumArr = new int[userNum];

		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.

		for (int i = 0; i < userNum; i++) {
			NumArr[i] = i;
			System.out.print("배열" + NumArr[i] + "번째 인덱스에 넣을 값 :");
			NumArr[i] = sc.nextInt();
		}

		for (int i = 0; i < userNum; i++) {
			System.out.print(NumArr[i] + " ");
		}

		int sum = 0;
		for (int i = 0; i < userNum; i++) {
			sum = NumArr[i];
		}
		System.out.println(" ");
		System.out.println("총 합 : " + sum);

		// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.

	}

	public void practice8() { // 1 2 3 2 1
		Scanner sc = new Scanner(System.in);

		// 사용자에게 정수 값을 입력 받아야 한다.

		while (true) {// 정수를 다시 받기위해 while문을 썻다.

			System.out.print("정수를 입력해 주세요 : ");
			int userNum = sc.nextInt();

			if (userNum % 2 == 1 && userNum >= 3) { // 입력값은 홀수 이면서 3이상의 값만 남긴채 진행된다.

				int[] userNumArr = new int[userNum];// 알맞는 값이 왔을때 배열 생성

				for (int i = 0; i < userNumArr.length; i++) {
					userNumArr[i] = i + 1; // 배열에 값 대입

					System.out.print(userNumArr[i] + " ");// 출력

				}
				break;
			} else {// 입력값중 짝수, 3미만의 값을 걸러낸다.
				System.out.println("다시 입력해주세요");
			}

		}

	}

	public void practice9() { // 치킨 배달이요

		String[] chickenZip = { "양념", "후라이드" };

		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력해주세요 : ");
		String userChicken = sc.nextLine();

		switch (userChicken) {
		case "양념":
			System.out.println(chickenZip[0] + "배달 가능합니다.");
			break;
		case "후라이드":
			System.out.println(chickenZip[1] + "배달 가능합니다.");
			break;
		default:
			System.out.println(userChicken + "은 없는 메뉴입니다.");
			break;
		}

	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 적어주세요(-포함) : ");
		String userNum = sc.nextLine();
		char[] Pid = { '1', '2', '3', '4', '5', '6', '-', '1', '2', '3', '4', '5', '6', '7' };

		for (int i = 0; i < userNum.length(); i++) {
			if (true) {
				for (int j = 8; j < userNum.length(); j++) {
					Pid[j] = '*';
				}
				System.out.print(Pid[i] + " ");
			}

		}

	}

	public void practice11() { // 난수 10개 발생
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}

	public void practice12() { // 난수 10발생, 최대값, 최소값
		int[] random = new int[10];

		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 10 + 1);
		}
		// 3. 반복문을 활용해서 해당 배열의 0번 인덱스 ~ 마지막 인덱스까지 담겨있는 값 출력

		int temp = 0;

		for (int i = 0; i <= random.length; i++) { // 사이클 끝난거 arr.length만큼 반복.
			for (int j = 1; j < random.length; j++) {// 1사이클
				if (random[j - 1] > random[j]) { // 앞에 숫자가 뒤에 숫자보다 클 경우.
					temp = random[j - 1]; // 임시보관소에 앞에 있는 숫자(더큰숫자)보관
					random[j - 1] = random[j]; // 작은숫자를 앞자리에 넣기
					random[j] = temp; // 임시보관한 숫자를 뒷자리에 넣는 작업.
				}
			}
		}

		for (int i = 0; i < random.length; i++) {
			System.out.print(random[i] + " "); // 1 13 22 30 68 87 90
		}
		System.out.println(" ");
		System.out.println("최대값 : " + random[9]);
		System.out.println("최소값 : " + random[0]);

	}

	public void practice13() { // 난수 10개 발생, 중복 X

		int[] randomNumber = new int[10];

		for (int i = 0; i < randomNumber.length; i++) {
			randomNumber[i] = (int) (Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) {
				if (randomNumber[i] == randomNumber[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < randomNumber.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(randomNumber[i]);
		}

	}

	public void practice14() { // 로또
		int[] randomNumber = new int[6];
		int temp = 0;

		for (int i = 0; i < randomNumber.length; i++) {
			randomNumber[i] = (int) (Math.random() * 40 + 1);

			for (int j = 0; j < i; j++) {
				if (randomNumber[i] == randomNumber[j]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < randomNumber.length; i++) {
			for (int j = 1; j < randomNumber.length; j++) {
				if (randomNumber[j - 1] > randomNumber[j]) {
					temp = randomNumber[j - 1];
					randomNumber[j - 1] = randomNumber[j];
					randomNumber[j] = temp;
				}
			}
		}

		for (int i = 0; i < randomNumber.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(randomNumber[i]);
		}

	}

	public void practice15() { // 사용자에게 문자 받고, 분석하고, 총 몇개의 단어가 있는지 출력.

		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력해주세요 : ");
		String str = sc.nextLine();

		int count = 0;
		// char 배열 생성해두기
		char[] arr = new char[str.length()];

		/*
		 * arr[0] = str.charAt(0);
		 */

		// 반복문을 활용해서 사용자가 입력한 문자들을 배열에 저장한다.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					count--;
					break;
				}
			}
		}

		// 4. 반복문 활용해서 해당 배열의 0 ~ 마지막 인덱스까지 담긴 값 출력
		for (int i = 0; i < arr.length; i++) {
			if (str.charAt(i) == arr[i]) {
				count++;
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		System.out.println("찾으신 문자의 개수 : " + count);

	}

	public void practice16() {
		// 사용자가 입력한 배열의 길이만큼 문자열 배열 선언 및 할당(초기화?)

		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를 입력해주세요 : ");
		int size = sc.nextInt();
		int count = 0;
		sc.nextLine();
		String[] userSize = new String[size];

		for (int i = 0; i < userSize.length; i++) {
			for (int j = 0; j < userSize.length; j++) {
				System.out.print((j + 1) + "번째 문자열 : ");
				userSize[i] = sc.nextLine();
			}

			System.out.println("더 값을 입력하시겠습니까? : ");
			char ans = sc.nextLine().charAt(0);

			if (ans == 'y' || ans == 'Y') {
				// 유저가 원한다고 입력한 개수 만큼 배열을 복사하여, 4번째, 5번째 배열을 생성.
				System.out.print("더 입력하고 싶은 개수 : ");
				int MoreType = sc.nextInt();

				
				
				count++;
			} else if (ans == 'n' || ans == 'N') {
				// 유저가 n이라고 입력했을때, 입력했던 모든 값을 1줄로 출력 및 프로그램 종료.
				System.out.println("프로그램을 종료합니다.");
				for(int j=0;j<count;j++) {
					System.out.println("[" + userSize[j] + "]");
				}
				break;
			} else {
				System.out.println("잘못 입력 하셨습니다.");
			}

		}
	}
}
