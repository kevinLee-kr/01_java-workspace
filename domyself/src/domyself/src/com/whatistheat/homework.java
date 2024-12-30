package domyself.src.com.whatistheat;

public class homework {

	
	public static void maint(String[] args) {
//		
//		자바로 로또 추첨기 만들기
//		1. 1부터 45무작위 수 뽑아서 6자리 배열에 담기
//		2. 성공하면 배열에 중복값 안들어가게 수정해서 6자리 채우기
//		3. 배열 정렬시키기 단) 정렬 메서드 사용 금지
		
		int[] rot = new int[6];
		int result = 0;
		for(int i = 0 ; i<6;i++) {
			
		}
		
		
		
	}
	
	
}


//public void practice14() { // 로또
//	int[] randomNumber = new int[6];
//	int temp = 0;
//
//	for (int i = 0; i < randomNumber.length; i++) {
//		randomNumber[i] = (int) (Math.random() * 40 + 1);
//
//		for (int j = 0; j < i; j++) {
//			if (randomNumber[i] == randomNumber[j]) {
//				i--;
//				break;
//			}
//		}
//	}
//
//	for (int i = 0; i < randomNumber.length; i++) {
//		for (int j = 1; j < randomNumber.length; j++) {
//			if (randomNumber[j - 1] > randomNumber[j]) {
//				temp = randomNumber[j - 1];
//				randomNumber[j - 1] = randomNumber[j];
//				randomNumber[j] = temp;
//			}
//		}
//	}
//
//	for (int i = 0; i < randomNumber.length; i++) {
//		if (i > 0) {
//			System.out.print(", ");
//		}
//		System.out.print(randomNumber[i]);
//	}
//
//}
