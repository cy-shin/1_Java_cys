package abstraction.practice;

public class Car {
	
	private String carType;
	private String fuelType;
	private int seat;
	
	public Car() {}

	public Car(String carType, String fuelType, int seat) {
		this.carType = carType;
		this.fuelType = fuelType;
		this.seat = seat;
	}
	
	public void carInfo() {
		System.out.println("종류 : " + carType);
		System.out.println("연료 : " + fuelType);
		System.out.println("좌석 : " + seat);
	}

	
	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	
}
