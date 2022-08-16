package edu.kh.oop.basic;

// 믈래스 : 객체가 되었을 떄 가지고 있을 속성, 기능을 정의(작성)한 문서

public class KCS { // 캡슐화 예시

		 
		// 객체가 가지고 있는 속성
		String name = "김철수";
		int age = 23;
		String birthday = "2000-01-01";
		private String password = "1234";
		// private : 해당 클래스 내부에서만 접근 가능하다
		// public : 같은 프로젝트 내부 누구든, 어디서든 접근 가능하다
		
		// 객체가 가지고 있는 기능
		public void study() {
			System.out.println("자바 공부를 열심히 할 수 있음");
		}

		public void eat() {
			System.out.println("자바 공부를 열심히 할 수 있음");
		}
		
		public void plus(int num1, int num2) {
			System.out.println("합 : " + (num1 + num2));
		}
		
		// private : 해당 클래스 내부에서만 접근 가능하다
		// public : 같은 프로젝트 내부 누구든, 어디서든 접근 가능하다
		public void showPassword() {
			System.out.println("비밀번호 : ***" + password + "***");
		}
		
		
		
// ======== 추상화 예시 =========
//		public class Person{
//		// 객체가 가지고 있는 속성
//		String name;
//		int age;
//		String birthday;
//		
//		// 객체가 가지고 있는 기능
//		public void study() {
//			System.out.println("자바 공부를 열심히 할 수 있음");
//		}
//		
//		public void eat() {
//			System.out.println("자바 공부를 열심히 할 수 있음");
//		}
//		
//		public void plus(int num1, int num2) {
//			System.out.println("합 : " + (num1 + num2));
//		}
//	}
//		Person p1 = new Person();
//		p1.name = 홍길동;
//		Person p2 = new Person();
//		p1.name = 홍길은;
}
