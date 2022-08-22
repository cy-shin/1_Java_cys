package edu.kh.inheritance.model.vo;

public class Person {
	
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
	 
	
	
	
	
	
	
}
