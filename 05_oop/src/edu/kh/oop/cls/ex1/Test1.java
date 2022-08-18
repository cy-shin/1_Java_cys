package edu.kh.oop.cls.ex1;

public class Test1 {

	/* 접근 제한자(제어자)(4) : 다른 클래스에서 해당 클래스로 접근할 수 있는 범위를 제한하는 키워드
	 *
	 * 
	 * public		: 같은 프로젝트 내 어디서등지 접근이 가능하다
	 * protected	: default 범위 + 상속 관계만 접근 가능
	 * (default)	: 같은 패키지 내에서 접근 가능
	 * 				  (직접 작성하지 않고 생략됨)
	 * private		: 해당 클래스 내부에서만 접근 가능하다. (다른 클래스에서 직접 접근이 불가능)
	 * 
	 * 
	 * */
	
	/*
	 *  클래스 : 객체의 속성, 기능을 정의한 문서(설계도)
	 *
	 *	[작성법]
	 *
	 *	[접근제한자][예약어] class 클래스명 [상속관계]
	 *
	 *	>>> [] 대괄호 안은 생략 가능
	 *
	 *  >>> 클래스에 작성 가능한 접근 제한자
	 *  public, default
	 *
	 *
	 *
	 *
	 *
	 *
	 */
	
	public void ex() {
		Test100 t100 = new Test100();
		System.out.println(t100.a);
	}
}
