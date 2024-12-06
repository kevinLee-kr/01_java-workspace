package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {

		
		// 매개변수 생성자를 이용하여 3개의 객체 생성 (위의 사용 데이터 참고)
//		Product p2 = new Product("아이폰",1300000,"애플");
//		Product p1 = new Product("갤럭시", 5000000, "삼성");
		
		Product p1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product p2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product p3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		System.out.println(p1.infomation());
		System.out.println(p2.infomation());
		System.out.println(p3.infomation());
		System.out.println("================================================================");
		Product t1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 1200000, 0.05);
		Product t2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 1200000, 0.05);
		Product t3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 1200000, 0.05);
		System.out.println(t1.infomation());
		System.out.println(t2.infomation());
		System.out.println(t3.infomation());
		System.out.println("================================================================");
		System.out.println("상품명 : " + t1.getProducId());
		System.out.println("부가세 포함 가격 : " + (int)(t1.getPrice()+(t1.getPrice()*t1.getTax())));
		System.out.println("상품명 : " + t2.getProducId());
		System.out.println("부가세 포함 가격 : " + (int)(t2.getPrice()+(t2.getPrice()*t2.getTax())));
		System.out.println("상품명 : " + t3.getProducId());
		System.out.println("부가세 포함 가격 : " + (int)(t3.getPrice()+(t3.getPrice()*t3.getTax())));
		
		
		// 객체가 가진 필드 값 출력 확인

		// 각 객체의 가격을 모두 120만원으로 변경 / 부가세율도 모두 0.05로 변경
		
		// 객체가 가진 필드 값 출력 확인

		// 각 객체의 가격에 부가세율을 적용한 실제 가격을 계산해서 출력함
		// ** 실제가격 = 가격 + (가격 * 부가세율)
		
		
		
		
	}

}
