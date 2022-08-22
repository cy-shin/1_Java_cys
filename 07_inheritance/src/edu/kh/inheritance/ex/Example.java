package edu.kh.inheritance.ex;

import edu.kh.inheritance.model.vo.Student;

public class Example {

	public void ex1() {
		// 상속 확인
		
		// Student 자식 객체 생성
		Student s1 = new Student();
		
		// 자식만의 기능/필드 (grade, classRoom)
		s1.setGrade(0); // setGrade(int grade) : void - Student (Student의 메서드) 자동완성에서 이와 같이 있으면 자기 기능
		s1.setClassRoom(0); // -Student (Student의 메서드)
		
		s1.setName("이름"); // setName(String name) : void - Person (Person의 메서드) 부모 클래스인 Person으로부터 상속받은 메서드라는 뜻
		
		s1.setAge(15);  // setAge(int age) : void - Person (Person의 메서드) 부모 클래스인 Person으로부터 상속받은 메서드라는 뜻
	
		System.out.println(s1.getGrade()); // int edu.kh.inheritance.model.vo.Student.getGrade() : Student의 가지고 있음
		System.out.println(s1.getClassRoom());
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
	
	}
}
