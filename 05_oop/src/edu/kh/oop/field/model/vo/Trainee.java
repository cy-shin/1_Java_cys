package edu.kh.oop.field.model.vo;

public class Trainee { // 훈련생 관리
	
	
//	public String name; // 이름
//	public String phone; // 번호
//	
//	// 필드를 선언하면서 동시에 초기화 == 명시적 초기화
//	public String email = "없음"; // 이메일(선택)
//	public int salary = 116000; // 수당
//	
//	
//	public static char classRoom = 'A'; // 강의장
	
	// 명시적 초기화 : 필드 선언 시 바로 값 초기화
	//				>>> 이 필드에는 ~ 값이 있어야 한다.
	// 장점 : 편함
	// 단점 : 복잡해보임 >>> 초기화 블록 사용이 선호됨
	// ex) public String email = "없음";
	
	public String name; // 이름
	public String phone; // 번호
	public String email; // 이메일(선택)
	public int salary; // 수당
	public static char classRoom; // 강의장
	
	// 초기화 블록 : 객체(instance) 필드를 초기화 하는 블록
	// 1) instance block : static이 없는 일반 필드 값을 초기화 (생성 시 마다)
	// 2) static block : static이 있는 일반 필드 값을 초기화 (프로그램 실행 시 1회만)
	
	
	{ // Instance block : 생성될 떄 마다 계속 초기화됨
		email = "없음";
		salary = 116000;
	}
	
	
	static { // Static block : 프로그램 실행 시 1회만 초기화됨
		classRoom = 'A';
	}
	
}
