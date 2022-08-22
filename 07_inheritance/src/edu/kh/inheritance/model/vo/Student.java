package edu.kh.inheritance.model.vo;

import java.awt.PrintGraphics;

public class Student extends Person{
	
	// 자식 클래스 student에
	// 부모 Person 클래스의 멤버, 메소드를 상속
	
	
	// extends :  확장하다
	// -> 자식이 자기의 메머 + 부모의 멤머를 가지고 되어 몸집이 커짐
//	private String name;
//	private int age;
	
	private int classRoom;
	private int grade;
	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Student() {
		
		
		
	}
}
