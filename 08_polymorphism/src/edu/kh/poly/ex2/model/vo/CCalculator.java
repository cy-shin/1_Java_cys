package edu.kh.poly.ex2.model.vo;

public class CCalculator implements Calculator {

	@Override
	public int plus(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int minus(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public int multiple(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public double divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}

	@Override
	public double areaOfCircle(double r) {
		// TODO Auto-generated method stub
		return Calculator.PI * r * r;
//		return r * r * Calculator.PI;
			// 인터페이스 활용
	}

	@Override
	public double pow(double a, int b) {
		// TODO Auto-generated method stub
//		double temp = a;
//		for(int i=2; i<=b; i++) {
//			a *= temp; 
//		}
//		return a;

		double result = 1;
		for(int i=1; i<=b; i++) {
			result *= a;
		}
		return result;
	}
	
}
