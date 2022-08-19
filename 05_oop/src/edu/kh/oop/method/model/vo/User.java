package edu.kh.oop.method.model.vo;

// VO ( Value Object ) : 값 저장용 객체를 만들기 위한 클래스
public class User {
	// 캡슐화 원칙을 위해 private
	private String userId; // 아이디
	private String userPw; // 비밀번호
	private String userName; // 사용자 이름
	private int userAge; // 사용자 나이
	private char userGender; // 사용자 성별 (M / F)
	
	// 기본 생성자
	public User() { }
	
	// 기능(메서드)
	// -> 필드에 간접 접근을 위한 메서드(getter / setter)
	
	// setter : 매개변수로 전달받은 값은 필드에 대입(세팅)
	// 반환형이 없고, 매개변수가 있음
	// 작성법이 항상 비슷함, 오타 안나도록 주의
	
	// public void set필드명(자료형 변수명){
	//     this.필드명 = 변수명;
	// }
	
	// 필드를 하나씩 초기화할 때 사용
	public void setUserId(String userId) {
		this.userId = userId;
		// this.userId : this. 참조변수를 사용해서, 이 userId는 필드에 있는 userId임을 나타냄
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
	
	// getter : 현재 객체의 필드 값을 반환함
	//			(외부에서 필드값을 얻어가게 만든다, 외부 입장에서 get)
	// 매개변수가 없고, 반환형이 있음 !
	
	// public 반환형 get필드명() {
	// 	return 필드명;
	// }
	
	public String getUserId() {
		return userId;
		// 외부에서 getUseId()를 호출하면, 필드값인 userId를 반환함
	}

	public String getUserPw() {
		return userPw;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public int getUserAge() {
		return userAge;
	}
	
	public char getUserGender() {
		return userGender;
	}
	
}


