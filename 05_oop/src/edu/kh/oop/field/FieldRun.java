package edu.kh.oop.field;

import edu.kh.oop.field.model.vo.Student; // 패키지가 다르면 import문 필요함
import edu.kh.oop.field.model.vo.Trainee; // 자동완성 시에는 import문이 자동으로 추가됨

public class FieldRun {
	
	public static void main(String[] args) {
		
		// Student 객체 생성
		Student std1 = new Student();
		
		// std1은 객체가 아니라 참조변수 : std1이 참조하는 객체에 있는 name 필드에 "홍길동"을 대입
		std1.name = "홍길동";
		
		// Student 객체 또 생성
		Student std2 = new Student();
		std2.name = "이순신";
		// std2가 참조하는 객체에 있는 name 필드에 이순신 대입
		
		System.out.println("[std1]");
		System.out.println("이름 : " + std1.name);
		// std1이 참조하는 객체의 name 필드 값 출력
		
		System.out.println("학교명 : " + std1.schoolName);
		std1.study();
		
		System.out.println("[std2]");
		System.out.println("이름 : " + std2.name);
		// std1이 참조하는 객체의 name 필드 값 출력
		
		System.out.println("학교명 : " + std2.schoolName);
		std2.study();
		
		System.out.println(" =============== 학교명 변경 =================");
//		// 모든 학생 객체의 학교명 변경
		
		// =========== static을 사용하지 않는 경우 ==============
//		std1.schoolName = "KH대학 부속 고등학교";
//		std2.schoolName = "KH부속 고등학교";
//		// static을 사용하지 않는 경우 하나하나 바꾸어야 해서 오류가 생길 수 있음
//	
	
		// ============== static 사용 ================
		// static(== 공유 영역)
//		std1.schoolName = "KH대학 부속 고등학교";
		// The static field Student.schoolName should be accessed in a static way
		// static 방식으로 접근하기 (static way)
		// -> 클래스명.static 필드명/메서드명
		Student.schoolName = "KH 정보교육원";
		
		
		// static을 사용하면...
		
		
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		
		
		System.out.println("============================");
		System.out.println("초기화 블록 확인하기");
		
		// =============== 훈련생 객체 생성 ====================
		Trainee t1 = new Trainee();

		System.out.println(t1.name);
		System.out.println(t1.phone);
		
		// 초기화 블록을 사용한 필드
		System.out.println(t1.email);
		System.out.println(t1.salary);
		
		// 초기화 블록을 사용한 static 필드
		System.out.println(t1.classRoom);

		
		// ========== 훈련생2 객체 생성 =============
		Trainee t2 = new Trainee();
		
		System.out.println(t2.name);
		System.out.println(t2.phone);
		
		// 초기화 블록을 사용한 필드
		System.out.println(t2.email);
		System.out.println(t2.salary);
		
		// 초기화 블록을 사용한 static 필드
		System.out.println(t2.classRoom);
	}
}
