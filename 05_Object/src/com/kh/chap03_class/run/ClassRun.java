package com.kh.chap03_class.run;


import com.kh.chap03_class.model.vo.ProductTestMyself;

public class ClassRun {


//		System.out.println(my.getId());
//		System.out.println(my.getAge());
//		// 객체를 생성한 후에 필드에 담긴 값을 곧바로 알아보면
//		// 초기화 값이 들어있다.
//		// String 같은 경우에는 'null'
//		// int 경우 0
//		// double의 경우 0.0
//
//		p.setId("user01");
//		p.setPwd("9999");
//		p.setName("이호석");
//		p.setAge(30);
//		p.setGender('M');
//		p.setPhone("010-1234-5678");
//		p.setEmail("kking071400@gmail.com");
//
//		System.out.println("===값 대입 후 ======");
//		System.out.println(p.getId());
//		System.out.println(p.getPhone());
//		System.out.println(p.getAge());
//		System.out.println(p.getName());
//		System.out.println(p.getGender());
//		System.out.println(p.getPhone());
//		System.out.println(p.getEmail());
//
//		System.out.println();
//		System.out.println("========================");
//		System.out.println();
//
//		
//		/*
//		//객체 생성하는 첫번쨰 방법 : 기본생성자로 객체 생성한다. 후에 setter메서드 호출해서 값 대입
//		
//		Product p1 = new Product();
//		p1.setName("갤럭시");
//		p1.setPrice(20000);
//		p1.setBrand("삼성");
//		
//		System.out.println("pNum : " + p1.getpName() + ", price : " + p1.getPrice() + ", brand : " + p1.getBrand());
//		
//		*
//		*2. 객체생성하는 두번쨰 방법 : 매개변수 생성자로 생성과 동시에 값을 초기화 한다.
//		
//		*
//		*
//		*
//		*/
//		Product p99 = new Product();//기본생성자로 만든거임 이거
//		Product p2 = new Product("아이폰",1300000,"애플");
//		Product p1 = new Product("갤럭시", 5000000, "삼성");
//
//		
//		System.out.println(p2.getBrand()+ p2.getpName()+ p2.getPrice());
//		
//		System.out.println(p2.getBrand()+ p2.getPrice() +p2.getpName());
//
//	System.out.println("=========메소드를 만들고 난 후===========");
//	System.out.println(p1.infomation());
//	System.out.println(p2.infomation());
	public static void main(String[] args) {

		ProductTestMyself my = new ProductTestMyself();


		my.setBrand1("삼성");
		my.setpName1("태블릿");
		my.setPrice1(1100);
		
		my.setBrand2("LG");
		my.setpName2("노트북");
		my.setPrice2(1200);
		
		my.setBrand3("핸드폰");
		my.setpName3("하웨이");
		my.setPrice3(1300);
		System.out.println("이호석");
		System.out.println("===상품1===");
		System.out.println("상품명 : " + my.getpName1());
		System.out.println("가격 : " + my.getPrice1() + "원");
		System.out.println("브랜드 : " + my.getBrand1());
		System.out.println(" ");
		
		System.out.println("===상품2===");
		System.out.println("상품명 : " + my.getpName2());
		System.out.println("가격 : " + my.getPrice2() + "원");
		System.out.println("브랜드 : " + my.getBrand2());
		System.out.println(" ");
		
		System.out.println("===상품3===");
		System.out.println("상품명 : " + my.getpName3());
		System.out.println("가격 : " + my.getPrice3() + "원");
		System.out.println("브랜드 : " + my.getBrand3());
		System.out.println(" ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
