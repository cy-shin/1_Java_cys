package edu.kh.variable.ex1;

public class VariableExample1 {
	public static void main(String[] args) {
		
		System.out.println("[변수 사용 X]");
		
		System.out.println(2 * 3.141592653589793 * 5);
		System.out.println(3.141592653589793 * 5 * 5);
		System.out.println(3.141592653589793 * 5 * 5 * 20);
		System.out.println(4 * 3.141592653589793 * 5 * 5);
		
		System.out.println("==================================");
		
		System.out.println("[변수 사용 O]");
		
		double pi = 3.141592653589793;
		int r = 5;
		int h = 20;
		
		// System.out.println(3.141592653589793);
		// System.out.println(pi);
		
		System.out.println(2 * pi * r); // 반지름
		System.out.println(pi * r * r); // 넓이
		System.out.println(pi * r * r * h); // 원기둥의 넓이
		System.out.println(4 * pi * r * r); // 구 겉넓이
		
		// 변수(Variable)
		// - 메모리(RAM)에 값을 기록할 수 있는 공간
		// - 값(data)이 변경될 수 있어서 변수라고 함
		// - 값의 형태와 크기에 따라서 
		//   변수의 형태(자료형)이 달라져야 한다
		
		
		
		// 변수의 장점
		// 1. 재사용성의 증가(한 번 만든 변수를 계속 사용함)
		// 2. 가독성 향상(변수의 이름으로 의미있는 단어를 적어 읽기 쉬움)
		// 3. 코드 길이 감소
		// 4. 유지 보수성 향상
				
	}
}
