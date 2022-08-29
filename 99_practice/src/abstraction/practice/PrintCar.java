package abstraction.practice;

public class PrintCar {
	public void ex1() {
		
		Car c = new Car("경차", "경유", 4);
		
		c.carInfo();
		
		Car c2 = new Spark("소형차량", "휘발유", 4, 5);
		
		c2.carInfo();
		
		Car c3 = new Porter("대형차량", "경유", 2, 10);
		
		c3.carInfo();
	}
}
