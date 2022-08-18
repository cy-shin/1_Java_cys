package edu.kh.oop.field.ex1;

// 접근제한자 접근범위 확인 예제
// 조건 : 패키지는 같고, 클래스는 다른 경우

// FieldTest와 같은 패키지이므로 별도의 import문은 필요하지 않음

public class FieldTest2 {
	
	public void ex() {
		
		FieldTest f = new FieldTest(); // FieldTest 클래스를 FieldTest2 클래스에 실제 객체로 만듦
		
		System.out.println("같은 패키지, 다른 클래스 내부에서 접근하기");
		
		System.out.println( f.v1 ); // public : 어디서든 접근 가능함
		System.out.println( f.v2 ); // protected : 같은 패키지(+상속 관계 포함)이므로 접근 가능함
		System.out.println( f.v3 ); // (default) : 같은 패키지이므로 접근 가능함
		
		// System.out.println( f.v4 ); // 에러
		// -> private 권한을 부여한 경우, 패키지가 같아도 클래스가 다르면 접근할 수 없음(오류)
	}
}
