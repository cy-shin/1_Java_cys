package edu.kh.poly.ex2.model.vo;

public class Person extends Animal{

	
	// 멤버변수
	private String name;
	private int age;
	
	
	// 기본생성자
	public Person() {
		super(); // 부모 클래스의 생성자를 의미. 작성하지 않아도 컴파일러가 자동완성
	}
	
	
	// getter & setter
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


	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("코와 입으로 숨을 쉰다. ");
		
	}
	
}
