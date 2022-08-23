package edu.kh.inheritance.model.vo;

// 자식 클래스 역할
public class Child extends Parent{
// The type Child cannot subclass the final class Parent
	
	@Override
	public void method1() {
		// Cannot override the final method from Parent
		System.out.println("자식클래스의 메서드");
	}
}
