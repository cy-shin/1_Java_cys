package interfac2.practice;

public interface CalculatorStructure {
	
	// 멤버변수
	public final static double PI = 3.14;
	public final double TAX_RATE = 0.03;
	public double MILE = 1.609344;
	double POUND = 0.45359237;
	
	// 추상메서드
	public abstract double circleArea(int r);
	public double tax(int income);
	double kmToM(double km);
	
	
}
