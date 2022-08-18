package edu.kh.oop.constructor.model.vo;

public class Member {
	
	// 추상화 -> 아이디, 비밀번호, 전화번호, 나이
	// 캡슐화 -> 추상화 결과를 묶고, 데이터 직접 접근을 제한(접근제한자 private)
	
	// 필드 (== 멤버변수)
	private String memberId;
	private String memberPw;
	private String memberPhone;
	private int memberAge;
	
	// 생성자(객체를 생성할 때 사용하는 기능)
	
	// 생성자 작성 규칙 1 : 클래스명과 생성자명 일치
	// 생성자 작성 규칙 2 : 반환형 X
	// 반환형 예 : public void Member() 에서 void가 반환형에 해당
	
	// 기본 생성자 : () 내에 아무것도 없는 생성자
	//			  --> 매개변수가 없는 생성자
	public Member() {
		
		// 생성자 사용 목적 1. 필드 초기화
		memberId = "member01";
		memberPw = "pass01!";
		memberPhone = "010-1234-1234";
		memberAge = 25;
		
		// 생성자 사용 목적 2. 객체 생성 시 특정 기능을 수행
		System.out.println("Member 객체가 생성 되었습니다.");
		
		
		// 한 번 만들어둔 생성자를 계속 재사용
		// -> 코드길이 감소, 재사용성 증가
		
		// 기본 생성자가 없어도 Member() 구문에서는 에러가 발생하지 않는다....
		// -> 클래스에 생성자가 하나도 작성되지 않으면
		//	  컴파일러가 자동으로 기본생성자를 추가해준다!!!
		// public Member() { } -> 이 구문이 Member 클래스에 자동추가됨
		
	}
	
	// 매개변수 생성자(기본 생성자와 달리 매개변수를 가지고 있음)
	public Member(String memberId, String memberPw, String memberPhone, int memberAge) {
					// ( )안에 매개변수(parameter) 작성하였음
					// 매개 : 둘 사이에 관계를 형성한다...
					// ...전달받은 member22 전달인자를 같은 자리인 memberId에 저장한다
		
		// 필드와 매개변수의 변수명이 같을 경우... 
		// 변수명 호출 시 가까운 필드 또는 매개변수가 호출된다
		
		// this 참조 변수
		// = 생성된 객체(인스턴스)에 숨겨진 참조 변수로 "현재 객체의 시작 주소"(= 현재 객체)를 참조함
		
		// 생성된 객체의 필드를 매개변수로 초기화함
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberPhone = memberPhone;
		this.memberAge = memberAge;
		
		// this.memberId => public Member 생성자
		// memberId => public Member()의 필드값
		
		System.out.println(memberId);
		System.out.println(memberPw);
		System.out.println(memberPhone);
		System.out.println(memberAge);
		
	}
 	
	// 오버로딩 (OverLoading, 과적)
	// -> 이름 하나로 여러 기능을 수행할 수 있게 하는 기능
	// -> == 동일한 메서드(또는 생성자)명으로 여러 메서드를 작성하는 것.
	
	// 오버로딩의 조건
	// 1. 메서드(생성자) 이름이 같아야 한다.
	// 2. 매개변수의 타입, 개수, 순서 중 하나 이상 달라야 함
	
	// 오버로딩 예시 : 매개변수의 개수가 다르다
	public Member(String memberId, String memberPw) {

	
	// 오버로딩 주의사항
	// public Member(String memberPw, String memberId) {
		// Duplicate method Member(String, String) in type Member
		// 매개변수의 이름이 아니라 자료형을 따짐!
		// 매개변수의 자료형의 타입/개수/순서 중 하나 이상 달라야 함
		// 매개변수명은 사용자가 보기 편하게 의미를 부여한것일 뿐, 오버로딩 검사 시 컴퓨터에게는 인식되지 않음
	}
	
	
	// this() 생성자
	// - 생성자를 이용한 필드 초기화 구문의 중복을 없애고, 재사용성을 늘리기 위한 기능
	// - 주의사항 : 반드시 생성자의 첫 줄에 작성되어야 한다
	// 사용빈도 낮음
	
	public Member(int memberAge, String memberPhone) {
		// 전달 받은 매개변수로 현재 객체 필드 초기화
		this.memberAge = memberAge;
		this.memberPhone = memberPhone;
	}
	
	public Member(String memberId, int memberAge, String memberPhone) {
		this(memberAge, memberPhone); // this() 생성자 호출함

		// 전달 받은 매개변수로 현재 객체 필드 초기화
		this.memberId = memberId;
		
//		this.memberAge = memberAge;
//		this.memberPhone = memberPhone;
	}
	
	
	
	// 메서드(기능)
	
}
