package edu.kh.poly.ex2.model.vo;

// 계산기 인터페이스
// -> 모든 계산기에 대한 공통 멤버변수, 기능명을 제공하는 접점 용도


public interface Calculator {
	public static final double PI = 3.14;
	static final int MAX_NUM = 1000000; // 100만
	final int MIN_NUM = -1000000; // -100만
	int P_NUM = 333;
	// --> 예약어를 어떻게 적든 상관없이, 묵시적으로 public static final이 적용됨
	
	
	public abstract int plus(int num1, int num2); // 덧셈
	abstract int minus(int num1, int num2); // 뺄셈
	abstract int multiple(int num1, int num2); // 곱셈
	abstract double divide(int num1, int num2); // 나눗셈
	abstract double areaOfCircle(double r); // 원 넓이
	double pow(double a, int b); // a^b  
	// --> 예약어를 어떻게 적든 상관없이, 묵시적으로 public abstract가 적용됨
	
	
}
