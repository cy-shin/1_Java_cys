package abstraction.practice;

public class Porter extends Car{
	
	private String name = "Porter";
	private int trunkSize;
	
	public Porter() {}
	
	
	public int getTrunkSize() {
		return trunkSize;
	}

	public Porter(String carType, String fuelType, int seat, int trunkSize) {
		super(carType, fuelType, seat);
		this.trunkSize = trunkSize;
	}
	


	public void setTrunkSize(int trunkSize) {
		this.trunkSize = trunkSize;
	}

	@Override
	public void carInfo() {
		System.out.println(name);
		super.carInfo();
		System.out.println("이 차량은 짐을 싣을 수 있습니다. ");
		System.out.println("최대 적재량 : " + trunkSize);
	}
	
}
