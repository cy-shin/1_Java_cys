package edu.kh.oop.basic;

public class BasicRun {

	public static void main(String[] args) {

		KCS 김철수 = new KCS();
		// HEAP 영역에 KCS 클래스에 정의된 내용을 이용해서
		// KDH 객체를 생성(할당)
		// 변수 김철수는 KDH객체를 참조함
		
		// 객체가 가지고 있는 속성을 출력
		System.out.println("이름 : " + 김철수.name);
		System.out.println("나이 : " + 김철수.age);
		System.out.println("생년월일 : " + 김철수.birthday);
		// System.out.println("비밀번호 : " + 김철수.password);
		
		// 비밀번호를 볼 수 있는 기능을 호출 ( == 간접접근방법)
		김철수.showPassword();
		
		
		// 객체의 기능을 수행
		김철수.eat();
		김철수.study();
		김철수.plus(50, 100);		
		
	}

}
