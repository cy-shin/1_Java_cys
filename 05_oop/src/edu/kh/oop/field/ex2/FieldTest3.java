package edu.kh.oop.field.ex2;

import edu.kh.oop.field.ex1.FieldTest;
// 다른 패키지에 있는 클래스를 사용하려면 import문을 작성해야 함
// FieldTest3 : ex2
// FieldTest : ex1

//접근제한자 접근범위 확인 예제
//조건 : 패키지도 다르고, 클래스도 다른 경우

public class FieldTest3 extends FieldTest {
// [접근제한자] [예약어] class 클래스명 [상속관계]

	public void ex() {
		
		FieldTest f = new FieldTest();
		
		System.out.println("다른 패키지에 있는 필드에 접근 하기");
		
		System.out.println(f.v1); // public : 패키지가 달라도 프로젝트가 같으면 import만 하면 접근할 수 있음
		
		// System.out.println(f.v2); // protected : 패키지가 다르고, 상속 관계도 아니어서 접근 불가
		
		System.out.println(v2);
		// int edu.kh.oop.field.ex1.FieldTest.v2 >>> FieldTest에서 상속받아옴
		// protected : 상속 관계에서는 protected에 직접 접근이 가능하다
		// f.v2와 같이 간접접근 시도 시에는 오류 발생
		
		// System.out.println(f.v3); // (default) : 패키지가 달라서 접근 불가
		// System.out.println(f.v4); // private : 클래스가 다른 경우 접근 불가
	}
}
