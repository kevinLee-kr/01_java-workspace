package com.kh.chap01_beforeVSafter.after.model.vo;

public class Desktop extends Product{
	/*
desktop은 extends상속되었다. product 프로덕트 에 의해.  라고 
	프로덕트에 의해 desktop은 상속이 되었다. 
	[표현법]
	[접근제한자] [class] [상속자식변수] [extends] [상속부모변수] { 
		수행 내용;
	}
	*/
	
	private boolean allInOne; //필드 부분 끝. 
	
	public Desktop() { } //기본 생성자 
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) { 
		//상속받은 자식 파일에서 필요한 변수명만 추가 하고 this.문을 적어주면 된다?
		//아니다. 상속을 받더라도 매개변수 생성자에는 상속 받을 혹 받은 매개변수명까지 전부 나열해서 입력을 해줘야 한다. 
		//brand ~ price : 이 4개의 값들은   부모 클래스 ( Product) 에 대입을 해야한다. 
		//this라는 것은 현 파일의 매개변수를 구분해 주는 기능을 갖고 있기에 상속받은 값에 접근이 불가능하다. 
		//이때, super. 으로 부모에게 접근 가능하다. 
		//해결 방법 1. 부모 클래스에 있는 필드를  protected 접근 제한자로 수정. 
		/*
		super.brand = brand;
		super.pcode = pCode;
		super.pName = pName;
		super.price = price;
		*/

		//해결방법2. 
		
		
		//해결방법3. 부모생성자 호출하기. ==super 생성자. 
		//this랑 같은 단점을 갖고 있다, 위치가 항상 위에 있어야 함. 
		super(brand,pCode, pName, price);
		this.allInOne=allInOne;
		
	}
	public boolean isAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne=allInOne;
	}
	//오버라이딩을 했다~ 
	//부모 클래스에 있는 메서드를 자기 자리로 돌아와서 재정의 한다. 
	public String information() {
		return super.information()+ ", allInOne : " + allInOne;
	}
	
	
}
