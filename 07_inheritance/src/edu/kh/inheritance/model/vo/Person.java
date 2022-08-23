package edu.kh.inheritance.model.vo;

public class Person extends Object { // 자식 클래스가 공통적으로 가지고 있는 멤버변수/메서드를 작성함 ( 추상화 필요 )
	
	// extends object -> 상속 구문이 작성되지 않으면 컴파일러가 자동 추가
	
	
	// 멤버변수
	private String name;
	private int age;
	

	// 기본생성자 자동완성
	// ctrl + space bar + enter
	public Person() {
	
	}


	// 매개변수 생성자 자동완성
	// alt + s -> o 또는 alt + shift + s -> o
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	// getter / setter 자동완성
	// alt + shift + s -> r
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	 
	// 자기 소개 기능
	public void introduce() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
		
	}
	
	
	
	
	
}
