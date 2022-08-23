package edu.kh.inheritance.ex;

import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class Example {

	public void ex1() {
		// 상속 확인
		
		// Student 자식 객체 생성
		Student s1 = new Student();
		// new 연산자 : heap 영역에 객체를 만들겠다
		
		// 자식만의 기능/필드 (grade, classRoom)
		s1.setGrade(0); // setGrade(int grade) : void - Student (Student의 메서드) 자동완성에서 이와 같이 있으면 자기 기능
		s1.setClassRoom(0); // -Student (Student의 메서드)
		
		s1.setName("이름"); // setName(String name) : void - Person (Person의 메서드) 부모 클래스인 Person으로부터 상속받은 메서드라는 뜻
		
		s1.setAge(15);  // setAge(int age) : void - Person (Person의 메서드) 부모 클래스인 Person으로부터 상속받은 메서드라는 뜻
	
		System.out.println(s1.getGrade()); // int edu.kh.inheritance.model.vo.Student.getGrade() : Student의 가지고 있음
		System.out.println(s1.getClassRoom());
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
	
		
		
		
		
		// Object 클래스
		
		Person p1 = new Person();
		// int java.lang.Object.hashCode()
		
		System.out.println(p1.hashCode());
		// object 클래스를 별도로 상속받지 않았는데도 상속받아져 있음
		// ->> object 클래스는 모든 클래스의 최상위 부모
		// == 모든 클래스는 object 클래스의 후손
		
		// int java.lang.Object.hashCode()
		System.out.println(s1.hashCode());
		// -> 상속은 누적된다.
		// Object -> Person -> Student
		
		
		Student s2 = new Student("김학생", 17, 1, 5);
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getGrade());
		System.out.println(s2.getClassRoom());
		
	}


	public void ex2() {
		// 오버라이딩 : 재정의
		
		Person p1 = new Person("홍길동", 15); // Person 객체 p1을 생성
		Student s1 = new Student("김학생", 17, 1, 5); // Student 객체 s1을 생성
		
		p1.introduce();
		System.out.println("-----------------------");
		s1.introduce(); // introduce() 메서드는 Person클래스에서 Student클래스로 상속되었음
		// Student 클래스에서 오버라이딩을 진행했음
		System.out.println("-----------------------");
		p1.introduce();
		System.out.println("-----------------------");
		s1.introduce();
	}
}
