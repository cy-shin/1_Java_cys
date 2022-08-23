package edu.kh.poly.ex1.model.vo;

public class Truck extends Car{
	
	private double weight; // 적재량
	
	// 기본생성자
	public Truck() {
		// super(); // super 생성자 미 작성시 컴파일러가 추가
		
	}
	
	// 매개변수 생성자
	public Truck(int wheel, int seat, String fuel, double weight) {
		
		super(wheel, seat, fuel); // super() 생성자 활용
		
		this.weight = weight;
	}
	
	// getter
	public double getWeight() {
		return weight;
	}
	
	// setter
	public void setWeight() {
		this.weight = weight;
	}
	
	// toString 재정의
	@Override
	public String toString() {
		
		return super.toString() + " / 적재중량 : " + weight;
		//		부모 클래스에서 오버라이딩한 toString의 내용을 super.를 이용해서 가져옴
	}
	
}
