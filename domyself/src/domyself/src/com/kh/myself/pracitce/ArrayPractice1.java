package domyself.src.com.kh.myself.pracitce;

import java.util.Scanner;

public class ArrayPractice1 {

	public void method1() {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1);

			System.out.print(arr[i] + " ");
		}

	}

	public void method2() {
		int[] arr = new int[10];

		for (int i = 9; i >= 0; i--) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}

	}

	public void method3() {

		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수를 입력해 주세요 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}

	}

	public void method4() {
		String[] fruit = new String[5];

		fruit[0] = "사과";
		fruit[1] = "귤";
		fruit[2] = "포도";
		fruit[3] = "복숭아";
		fruit[4] = "참외";

		System.out.println(fruit[1]);
	}

	public void method5() {

		Scanner sc = new Scanner(System.in);
		System.out.print(" 문자열을 입력해주세요 : ");
		String str = sc.nextLine();

		System.out.print("문자를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);

		String[] Sstr = new String[str.length()];

		for (int i = 0; i < Sstr.length; i++) {

			if (Sstr[i].equals(ch)) {

			}
		}

		System.out.println(str + "에" + ch + "가 존재하는 위치(인덱스) : ");
		System.out.println(ch + " 개수:");

	}

	public void method6() {

		String[] days = new String[7];
		days[0] = "월";
		days[1] = "화";
		days[2] = "수";
		days[3] = "목";
		days[4] = "금";
		days[5] = "토";
		days[6] = "일";

		System.out.print("0~6사이의 숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num > 6 || num < 0) {
			System.out.println("잘못입력하셨습니다.");
		} else {
			System.out.println(days[num] + "요일");
		}
	}

	public void method7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		int[] intarr = new int[num];

		for (int i = 0; i < intarr.length; i++) {
			System.out.print(i + "번째 인덱스에 넣을 값 :   ");
			intarr[i] = sc.nextInt();
		}
		for (int i = 0; i < intarr.length; i++) {
			System.out.print(intarr[i] + " ");
			sum = intarr[i] + sum;
		}
		System.out.println(" ");
		System.out.println("총  합 : " + sum);

	}

	public void method8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();

		int[] arrnum = new int[num];

		if (num % 2 == 0 || num < 3) {
			System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요.");

		} else {
			for (int i = 0; i < arrnum.length; i++) {
				if (arrnum[i] > arrnum[i] / 2) {
					i--;
				} else {
					arrnum[i] = i + 1;

				}
				System.out.print(arrnum[i] + " ");
			}

		}

		// 3이상인 자연수를 입력받아 배열의 중간까지 1부터 1씩 증가하여 오름차순값

		// 중간부터는 1씩 감소해서 내림차순

		// 단, 입력한 정수가 홀수가 아니거나, 3미만일 경우 다시 입력하세요

		// 반복.

	}

	public void method9() {
		// 사용자가 입력한 값이 배열에 있는지 검색
		String[] arr = new String[] { "양념", "후라이드" };

		Scanner sc = new Scanner(System.in);
		System.out.println("치킨 이름을 입력해주세요 : ");
		String userorder = sc.nextLine();

		switch (userorder) {
		case "양념":
			System.out.println(userorder + "치킨 쌉가능 바로감 ㄱㄱ");
			break;
		case "후라이드":
			System.out.println(userorder + "치킨 쌉가능 바로감 ㄱㄱ");
			break;
		default:
			System.out.println(userorder + "은 없는 치킨입니다.");
		}

		// 있으면 쌉가능 , 없으면 불가능 을 출력

		// 단, 치킨 메뉴가 들어있는 배열은 본인이 정하세요.
	}

	public void method10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 적어주세요(-포함) : ");
		String userNum = sc.nextLine();
		String[] Pid = { "1", "2", "3", "4", "5", "6", "-", "1", "2", "3", "4", "5", "6", "7" };

		Pid.clone();
		String[] copy = Pid.clone();

		for (int i = 0; i < copy.length; i++) {
			if (true) {
				for (int j = 8; j < userNum.length(); j++) {
					copy[j] = "*";
				}
				System.out.print(copy[i] + " ");
			}

		}

	}

	public void method11() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 10 + 1);
			arr[i] = random;
			System.out.print(arr[i] + " ");
		}

	}

	public void method12() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // 1 13 22 30 68 87 90
		}

		System.out.println(" ");
		System.out.println(arr[0]);
		System.out.println(arr[9]);

	}

	public void method13() {

	}

	public void method14() {
		int[] randomNumber = new int[6];
		int temp = 0;

		for (int i = 0; i < randomNumber.length; i++) {
			randomNumber[i] = (int) (Math.random() * 45 + 1);
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

	public void method15() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String size = sc.nextLine();

		char[] arr = new char[size.length()];

		int count = 0;
		boolean fact;

		System.out.print("문자열에 있는 문자 : ");

		for (int i = 0; i < size.length(); i++) {

			arr[i] = size.charAt(i);

			fact = true;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					fact = false;
				}
			}

			if (fact == true) {
				System.out.print(arr[i] + " ");
				count++;
			}

		}

		System.out.println("\n문자 개수 : " + count);

		sc.close();

	}

}
