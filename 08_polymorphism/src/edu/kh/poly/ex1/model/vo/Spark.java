package edu.kh.poly.ex1.model.vo;

// 부모클래스 Car를 상속받음
public class Spark extends Car{
	
	private double discountOffer; // 할인 혜택
	
	// 기본생성자
	public Spark() {}

	
	// 매개변수생성자
	public Spark(int wheel, int seat, String fuel, double discountOffer) {
		super(wheel, seat, fuel);
		this.discountOffer = discountOffer;
	}


	// getter
	public double getDiscountOffer() {
		return discountOffer;
	}

	// setter
	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	
	// Override로 toString 재정의
	@Override
	public String toString() {
		return super.toString() + " / 할인 혜택 : " + discountOffer;
	}
}
