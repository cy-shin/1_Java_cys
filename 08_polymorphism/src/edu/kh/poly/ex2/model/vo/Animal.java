package edu.kh.poly.ex2.model.vo;

public abstract class Animal {
	// abstract 메서드를 포함하는 클래스는
	// 반드시 abstract 클래스여야 함
	// (역은 상관 없음)
	
	
	// 멤버변수
	private String type; // 동물의 종 분루
	private String eatType; // 동물의 식성
	
	// 생성자
	public Animal() {}
	// -> 추상 클래스는 직접적인 객체 생성이 불가능해서
	//	  생성자가 필요 없을 것 같지만,
	//    자식 객체 생성 시 내부 부모 객체를 생성할 때 필요함
	// = 추상 메서드 부분은 자식이 오버라이딩하여 동적바인딩으로 처리한다.
	
	// 완성된 메서드
	// getter와 setter(간접 접근)
	public void setType(String type) { // setter : 인자를 받아서 멤버변수를 초기화
		this.type = type;
	}
	public String getType() { // getter : 멤버변수를 외부에 반환
		return type;
	}
	
	public void setEatType(String eatType) {
		this.eatType = eatType;
	}
	public String getEatType() {
		return eatType;
	}
	
	// 미완성된 기능( == 추상 메서드 )
	public abstract void breath(); // 블럭 부분, 몸통 부분이 없음
	
	// 추상 메서드의 역할
	// -> 추상 메서드의 이름을 자식 클래스들에 공통적으로 제공
	// -> 자식 클래스는 상속받은 추상 메서드가 있는 경우, 해당 메서드를 ***강제*** 오버라이딩 해야 함
	
	
	
}
