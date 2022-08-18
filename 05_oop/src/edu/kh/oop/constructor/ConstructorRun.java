package edu.kh.oop.constructor;

import edu.kh.oop.constructor.model.vo.Member;

public class ConstructorRun {
	
	// static
	public static void main(String[] args) {

		Member member1 = new Member();
								// 기본 생성자

		Member member2 = new Member();
		Member member3 = new Member();
		Member member4 = new Member();
								// 기본 생성자
		
		// 기본 생성자가 없어도 Member() 구문에서는 에러가 발생하지 않는다....
		// -> 클래스에 생성자가 하나도 작성되지 않으면
		//	  컴파일러가 자동으로 기본생성자를 추가해준다!!!
		// public Member() { } -> 이 구문이 Member 클래스에 자동추가됨
		
		Member member5 = new Member("member22", "pass22@", "010-2222-3333", 33);
								// 전달인자(Arguments) 
								// member22를 생성자에 전달
		
		Member member6 = new Member("야호", "안알려줌","010-9999-9999", 99);
		Member member7 = new Member("안녕", "알려줌","010-8888-8888", 88);
		
		System.out.println("프로그램 종료");
		
	}

}
