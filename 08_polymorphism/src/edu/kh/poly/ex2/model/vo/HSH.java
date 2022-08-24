package edu.kh.poly.ex2.model.vo;

// 클래스를 상속할 때 : extends
// 부모가 완성한 기능을 자식이 물려 받아서 사용
// 자식 기능 + 부모 기능 ( = 객체의 기능이 확징되었음)

// 인터페이스 상속할 때 : implements ( 구현 )
// -> 부모가 이름만 있는 미완성 기능을 물려줌
// -> 자식이 이름만 있는 메서드를 구현(오버라이딩)해서 완성시켜야 한다.

public class HSH implements KH{

	
	
	public HSH() {
		super(); // 상속받았다면 부모 클래스로 연결되었을 것.
			     // but Object 클래스로 연결됨
	}
	
	@Override
	public void lesson() {
		System.out.println("A강의장에서 풀스택 웹개발 과정 수강");
		// TODO Auto-generated method stub
		
	} // (A반 학생)

}
