package edu.kh.oop.cls.ex1;

import edu.kh.oop.cls.ex2.Test2;

// import : 다른패키지에 존재하는 클래스를 현재 클래스로 가져오는 것.

public class TestRun {
	public static void main(String[] args) {
		
//		Test1 t1 = new Test1();
		
		// Test1 클래스를 이용해서 객체를 생성함
		// == Test1 클래스에 정의된 내용을 이용해서 heap 영역에 새로운 객체를 생성(할당)
	
		Test1 t1 = new Test1();
		
		
		Test2 t2 = new Test2();

		// import 해야지만 에러가 발생하지 않음
		// -> public은 어디서든지 접근 가능하다 = 어디서든지 import 가능
		
		// 클래스 접근 제한자 사용처
		// public : 언제 어디서든지 사용 가능한 클래스를 만들 때 사용함
				//	(기본적으로 public 사용)
		
		// (default) : 설계적인 이유로 사용함
				// 같은 클래스명이어도 기능 및 사용처가 다를 수 있음 -> 이를 구분하는 용도
		
		// -> 내부 클래스
		// -> 하나의 java 파일에 여러 클래스 작성 시 
		
	}
}
