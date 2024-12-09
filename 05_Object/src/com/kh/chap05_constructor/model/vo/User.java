package com.kh.chap05_constructor.model.vo;

public class User {

	//추상화 단계(브레인스토밍)을 거쳐 유저에게 필요로 하는 정보가 뭐가 있을까? 를 진행했다. 
	
			private String userId;
			private String userPwd;
			private String userName;
			private int age;
			private char gender;
			
			//생성자 만드는 법
			//public 클래스명 (ex. public method1{  }) - 기본형
			//public 클래스명 (ex. public method1([매개변수1, 매변2...]) = 만일 값을 넣고 싶다. 
			//이거 왜 써야 할까요?
			//
			//생성자 작성시 주의사항
			// 1. 반드시 생정자명은 클래스명과 동일 해야한다. (대/소문자 구분해서 완전히 똑같이) 그렇지 않게 하면 오류남.
			
			//User 의 기본 생성자 == public User(){   }
			
			// 2. 반환형이 존재하지 않는다. = 만약에 반환형을 쓰게 된다면 메소드로 인식을 해버리기 때문에 반환을 하지 않는다. 왜냐하면 메서드랑 폼이 완벽히 같기 때문에 이것이 메소드인지 생성자인지 구분을 할 수 없기 때문에 따라서 return이 없다면 생성자라고 생각하는것이 옳다. 
			// 3. 기본생성자 (배개변수가 없는 생성자)() <- 이렇게 괄호안에 아무런 값이 대입이 되어 있지 않은 상태.
			public User() {
				//System.out.println("dhdhd?!");
			}
			//객체 생성할떄 괄호안에 아무것도 쓰지 않으면  기본생성자로 생성이 되는구나
			// 얘는 단지 객체 생성만을 목적으로 할 때 사요이 된다. 
			// 만약 개발자가 바빠서 기본생성자를 생갹을 하더라고 jvm 이 자동적으로 기본생성자를 생성해 준다. 그렇기 때문에 항상 객체가 생성이 가능한거다. 
			//결과 값으로 u1.information에서 public User의 값이 출력이 되는데 이것은 information 에서 메소드 영역이 아닌 생성자 영역을 호출해서 출력을 하는 것을 볼 수 있다. 
			

//매개변수 생성자 생성하는 방법
			//객체 생성과 동시에 전달값들을 매개변수로 받아서 해당 각 필드에 초기화할 목적
			//public User() { 
			//이것이 기본생성자.
			//}
			
			public User(String userId, String userPwd, String userName) {//setter메소드 실행시 수행됬던 코드들. 그러면 seteer 메소드를 안만들어도 되지 않나?
				this.userId = userId;
				this.userPwd=userPwd;
				this.userName=userName;
			}
				//그것은 틀렸습니다. 후에, 사용자가 개명을 해서, userName을 업데이트 해야 하는 상황에 는 setter를 호출해서 업데이트 해줄수 있다. 그렇지 않으면 바꿔줄 수 이는 방법이 없다. 
				
				//그러면 선생님 getter는요?
			//아이디를 까먹은 경우, 아이디만 보여줘야 할떄 , 그때, getter가 필요하다. 
				///이 모습이 매개변수 생성자의 폼이다. 기본생성자에서 매개 변수1,2,3을 입력했고, 변수라인에 this 를 써줌으로써 위에 있는 userId, userPwd, userName등 의 필드에 연결을 시켜주는 것이다. 
			
			
			//매개변수 생성자 생성시 주의할점
			//jvm:어? 이놈이 매개변수 생성자를 만들 줄 아네? 그렇다면 지금 없는 기본생성자가 없는건 일부러 그런걸거야. " 하는 식으로 jvm 이 생각을 하기 시작한다. 따라서 기본생성자를 만들지 않았을때 오류가 발생하는것이다.  다시말하면 단 한개의 매개변수 생성자가 존재할시 jvm은 더이상 기본생성자를 자동으로 생성해주지않는다. 
			
			//실전. 매개변수 5개짜리 생성자로 객체 생성 후 출력 해보기.(전체 매개변수 생성자)
			public User(String userId, String userPwd, String userName, int age, char gender) {
//				this.userId=userId;
//				this.userName=userName;
//				this.userPwd=userPwd;
				
				
				this(userId, userPwd, userName);// 이런 폼을 만들어놓고, ctrl + 마우스 좌클릭 this , 하면 위에있는 this 3개 매개변수 있는 생성자로 이동이 된다. 효과또한 같다. 이렇게 하는 것의 장점은 코딩 효율? 중복되는 동일한 생성자가 존재할 경우ㅠ, this생성자로 인해 가독성 상승. 
				// 주의. this 생성자는 항상 상단에 위치해 있어야 한다는 주의점이 있는데, 다른 명령중보다 아래에 있으면 오류가 발생하다나. 알아두자. 
				this.age=age;
				this.gender=gender;
			}
			
			
			//get set get set 을 만들어 주세요.
			public String getUserId(){return userId;}
			public void setUserId(String userId) {this.userId = userId;}
			
			
			public String getUserPwd() {return userPwd;}
			public void setUserPwd(String userPwd) {this.userPwd = userPwd;}
			
			public String getUserName() {return userName;}
			public void setUserName(String userName) {this.userName = userName;}
			
	
			public int getUserAge() {return age;}
			public void setUserAge(int age) {this.age = age;}
			
			public char getUserGender() {return gender;}
			public void setUserGender(char gender) {this.gender = gender;}
			
			
			
			public String information() {
				return "userId : " + userId + ", userPwd : " + userPwd + ", userName : " + userName + ", age : " + age + ", gender: " + gender;
			}
			
}
