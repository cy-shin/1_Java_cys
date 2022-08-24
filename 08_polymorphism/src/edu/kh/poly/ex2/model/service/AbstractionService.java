package edu.kh.poly.ex2.model.service;

import java.util.Scanner;

import edu.kh.poly.ex2.model.vo.Animal;
import edu.kh.poly.ex2.model.vo.CCalculator;
import edu.kh.poly.ex2.model.vo.Calculator;
import edu.kh.poly.ex2.model.vo.Fish;
import edu.kh.poly.ex2.model.vo.HGD;
import edu.kh.poly.ex2.model.vo.HSH;
import edu.kh.poly.ex2.model.vo.KH;
import edu.kh.poly.ex2.model.vo.Person;

public class AbstractionService {
	
	public void ex1() {
		
		// 1. 추상 클래스는 정말 객체 생성이 안될까?
		// Animal a = new Animal(); // Cannot instantiate the type Animal
		// 추상 클래스로 객체를 만들려고 했으나 안됨
		
		// Animal을 상속받은 자식클래스를 이용해서 객체를 생성할 수 있음
		
		
		
		Fish f1 = new Fish();
		f1.setType("어류"); // 자식 객체 내부에 부모 부분이 있음을 확인
//		f1.breath();
		
		
		Person p1 = new Person();
		p1.setType("포유류"); // 자식 객체 내부에 부모 부분이 있음을 확인
		
		// 추상 클래스는 부모 타입의 참조변수로 사용할 수 있다! (== 다형성, 업캐스팅)
		
		Animal a1 = new Fish();
		Animal a2 = new Person(); // 업캐스팅 (부모 타입 참조변수 = 자식 객체) 확인
		
		
		
		// 추상 메서드였던 breath() 호출 가능 여부 확인 (== 동적 바인딩 여부 확인)
		a1.breath();
		a2.breath();
		// void edu.kh.poly.ex2.model.vo.Animal.breath()
		// 실행 전에는 Animal의 breath()와 연결된 것으로 나옴 (=정적바인딩)
		// 실행 중 오버라이딩한 자식의 breath()로 연결(=동적바인딩)되기 때문에, 추상 메서드지만 오류가 발생하지 않음
		// -> 동적 바인딩에 의해 정상 수행될 것을 알기 때문에 에러 X
		
		
		// 객체 배열 + 추상 클래스
		Animal[] arr = new Animal[3]; // Animal[] 타입의 참조변수 arr 생성
		
		arr[0] = new Fish();
		arr[1] = new Person();
		arr[2] = new Person();
		
		System.out.println("----------------------------------");
		
		// arr[i] 위치에 어떤 Animal 자식 객체가 있는지는 모르지만,
		// 각 자식 객체들이, 강제 오버라이딩한 'breath()' 메서드를 공통적으로 가지고 있으므로
		// arr[i].breath()를 작성할 수 있다
		for(int i=0; i<arr.length; i++) {
			arr[i].breath();
		}
		
		// 익명클래스
		Animal aaa = new Animal() {
			@Override // 추상클래스지만 오버라이딩하면 일시적이지만 사용할 수 있음
			public void breath() {
				// TODO Auto-generated method stub
			}
		};
		
	}
	
	public void ex2() {
		
		// 인터페이스는 미완성 메서드로만 이루어져있어서, 직접 개체 생성이 불가능하다
		// KH k1 = new KH(); Cannot instantiate the type KH
		
		// 상속 받은 자식 클래스를 이용해서 생성
		
		HSH sh1 = new HSH();
		HGD gd1 = new HGD();
		
		sh1.lesson(); // HSH 타입의 참조변수 sh1가 lesson() 메서드를 참조함
					  
		gd1.lesson();
		
		// 클래스 또는 추상클래스를 상속한 자식 객체는
		// 내부에 부모 객체를 포함하고 있으나
		
		// 인터페이스를 상속한 자식 객체는
		// 내부에 부모 객체를 포함하지 않는다
		
		
		// 인터페이스 + 다형성 + 동적바인딩
		KH[] arr = new KH[2];
		
		arr[0] = new HSH(); // 업캐스팅
		arr[1] = new HGD(); // 업캐스팅
		// 부모 타입 참조 = 자식 객체;
		// 부모 타입 = KH 인터페이스 == 인터페이스도 부모 참조 변수로 사용할 수 있음
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i].lesson();
			// void edu.kh.poly.ex2.model.vo.KH.lesson()
			// 정적 바인딩 : KH.lesson() (추상메서드)
			// 동적 바인딩 : arr[0] -> HSH.lesson();
			//			 arr[1] -> HGD.lesson();
		}
		
	}

	public void ex3() {// 인더페이스 예시
		
		Calculator cal = new CCalculator(); // 다형성 적용됨(업캐스팅)
		// 부모 타입 Calculator로 SC... 참조
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[사칙연산]");
		
		System.out.print("정수 1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println(cal.plus(num1, num2));
		System.out.println(cal.minus(num1, num2));
		System.out.println(cal.multiple(num1, num2));
		
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			System.out.println(cal.divide(num1, num2));
			
			
		}
		System.out.println("----------------------------");
		
		System.out.print("반지름 입력 : ");
		double r = sc.nextDouble();
		
		System.out.println("원의 넓이 : " + cal.areaOfCircle(r));

		System.out.println("----------------------------");
		
		System.out.print("숫자 입력 : ");
		double a = sc.nextDouble();
		
		System.out.print("제곱수 입력 : ");
		int b = sc.nextInt();
		
		System.out.println("결과 : " + cal.pow(a, b));
	
	}

	

}
