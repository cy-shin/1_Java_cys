package edu.kh.inheritance.model.vo;


// final 클래스 : 더 이상 상속할 수 없는 클래스
public /*final*/ class Parent {

	
//	예약어가 없는 일반적인 메서드
	public void method1() {
		System.out.println("부모클래스의 메서드");
	}
	
	
//  final 메서드 : 자식 클래스가 오버라이딩 할 수 없는 메서드
//	public final void method1() {
//		System.out.println("부모클래스의 메서드");
//	}
	
	
// final은 클래스, 메서드, 멤버변수, 변수 등 여러 곳에 사용 가능하며 '변하지 않는다'는 뜻을 가짐
// 클래스에 사용하면 상속 불가를 의미
// 메서드에 사용하면 오버라이딩 불가를 의미
// 멤버변수에 사용하면 상수
// 변수에 사용하면 상수(값을 저장할 수 없는 공간)	
}
