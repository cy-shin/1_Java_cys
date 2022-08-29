package abstraction.practice;

public class Spark extends Car{
	
	private String name = "Spark";
	private int discountRate;
	
	public Spark() {}
	
	
	
	public Spark(String carType, String fuelType, int seat, int discountRate) {
		super(carType, fuelType, seat);
		this.discountRate = discountRate;
	}



	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public void carInfo() {
		System.out.println(name);
		super.carInfo();
		System.out.println("이 차는 할인을 받을 수 있습니다.");
		System.out.println("할인율 : " + discountRate);
	}
	
	
	
	
}
