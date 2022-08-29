package interfac2.practice;

public class MyCalculator implements CalculatorStructure{

	@Override
	public double circleArea(int r) {
		return 2 * PI * r * r;
	}

	@Override
	public double tax(int income) {
		return income * TAX_RATE;
	}

	@Override
	public double kmToM(double km) {
		return km * MILE;
	}

}
