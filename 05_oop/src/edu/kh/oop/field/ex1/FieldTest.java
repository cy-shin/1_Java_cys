package edu.kh.oop.field.ex1;

public class FieldTest {
	
	
	// 필드(field) : 클래스에 작성되는 내용 중 객체의 속성을 작성하는 부분(영역)
	// == 멤버 변수(필드와 멤버변수는 사실상 같은 의미)
	
	/*
	 * [작성법]
	 * 
	 * 접근제한자 [예약어] 자료형 변수명 [ = 초기화 ]
	 * >>>[]대괄호 안은 생략할 수 있음
	 * 
	 * >>> 필드에 작성 가능한 접근 제한자
	 * public, protected, default, private
	 * 
	 * >>> 필드에 작성 가능한 예약어
	 * final, static
	 * 
	 * 
	 * 
	 * */
	
	// 접근 제한자 확인 예제

	// 필드 4종류 선언
	
	public    int v1 = 10; // public : 어디서든 접근 가능
	protected int v2 = 10; // protected : default 범위 + 상속 관계만 접근 가능
			  int v3 = 10; // (default) : 어디서든 접근 가능
	private	  int v4 = 10; // private : 클래스 내에서만 접근 가능
	// 캡슐화 원칙에 따라서 대부분 private 권한을 사용하게 됨
	
	
	// final 예약어
	public final double TAX_RATE = 0.1; // 필드명을 전부 대문자로 작성, 낙타법 대신 _로 구별

	
	
	public void ex() {
		System.out.println("같은 클래스 내부에서 직접 접근하기");
		
		System.out.println( v1 ); // 같은 패키지 내부이므로 가능
		System.out.println( v2 ); // 같은 패키지 내부이므로 가능
		System.out.println( v3 ); // 같은 패키지 내부이므로 가능
		System.out.println( v4 ); // 같은 클래스 내부이므로 가능
	}
	
	
}
