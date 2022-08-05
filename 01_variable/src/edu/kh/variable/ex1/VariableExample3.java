package edu.kh.variable.ex1;

public class VariableExample3 {
	
	// main method(메인 메서드) : 자바 애플리케이션을 실행할 때 반드시 필요한 구문
	public static void main(String[] args) {
		
		// **** 변수 명명 규칙 ****
		
		// 1. 대소문자가 구분되며 길이 제한이 없다.
		//		(단, 띄어쓰기는 불가)
		int num1;
		int Num1;
		// int Num1; Duplicate local variable Num1; Num1변수가 중복되어 선언됨
		
		int abcdefghijklmnopqrstuvwxyz1234567890; // 길이 제한이 없음
		// int abcd efgh; 띄어쓰기를 하면 오류
		
		// 2. 예약어를 사용하면 안 된다.
		// int public; 
		// char char; 예약어를 사용한 경우 오류
		
		// 3. 숫자로 시작하면 안 된다.
		int age1;
		// int 1age; Syntax error on token "1", delete this token; 숫자로 시작해서 오류
		// Syntax error : 문법 오류
		
		// 4. 특수문자는 $와 _만 허용
		// $는 내부클래스 사용 시 자동으로 부여되는 기호로 직접 사용하는 경우는 없다
		// _는 상수 단어 구분 외에는 사용하지 않음
		double $dNum;
		double d$num;
		float f_num;
		float _fNum;
		// long longNum!; $, _외의 특수문자 사용 시 오류
		
		// 5. 여러 단어로 이름을 만들 때에는 단어의 첫 글자를 대문자로 적는다(낙타표기법)
		//		단, 첫 시작 글자는 소문자
		
		int userAge;
		// int UserName;
		// int useraddress;
		// 낙타표기법은 지키지 않아도 오류가 발생하지는 않지만, 지켜주는 것이 좋음
		
		// 참고 : 변수명은 언어 제한이 없지만 글자깨짐을 예방하기위해 영어로 적어주는게 좋음
		int 정수1;
		int 실수1;
		boolean 참거짓;
		
		// ** 변수는 한 개의 데이터만 보관 가능함 **
		// 여러 값을 대입하면 마지막에 대입한 값만 보관함
		int iNum = 30;
		System.out.println("iNum="+iNum);
		iNum = 50;
		System.out.println("iNum="+iNum);
		
		// 문자열 자료형 String -> 기본자료형이 아니라 참조형
		// String의 리터럴 : 문자열
		// String의 리터럴 표기법 : "쌍따옴표"
		String str1;
		str1 = "안녕하세요!"; // str1 변수의 초기화(=최초로 값을 대입함)
		
		System.out.println(str1);
		
		str1 = "String도 기본 자료형 변수처럼 값을 변경할 수 있습니다.";
		
		System.out.println(str1);
		
		// 변수 선언과 동시에 초기화
		String name = "이름";
		int age = 27;
		char gender = '남';
		System.out.println("==========================================================");
		
		// name님은 age세 gender입니다. 
		
		System.out.println(age + 10); // 숫자 + 숫자 = 두 숫자의 합
		System.out.println(name + "입니다."); // 문자열 + 문자열 = 문자열 이어쓰기
		System.out.println(name + age); // 문자열 + 숫자 = 문자열과 숫자 이어쓰기
		System.out.println(age + 10 + name); // 숫자 + 숫자 + 문자열 = 숫자끼리 더하고 더한 값을 이어쓰기
		System.out.println(name+ age + 10); // 문자열 + 문자열 + 숫자 = 이어쓰기 하고 이어쓰기
		
		System.out.println(name + "님은 " + age + "세 " + gender + "성입니다.");
		
		System.out.println("========================================================");
		
		// 상수(final) : 항상 같은 수
		// 자바에서는 한번 값을 기록하면 값을 바꿀 수 없는 공간을 의미
		
		// 변수
		int num2 = 200;
		num2 = 300;
		num2 = 450; // 값을 계속해서 새로 대입할 수 있다.
		
		// 상수(전부 대문자로 표기, 낙타표기법 대신 _로 구분)
		final int CONSTANT_NUMBER = 100000000;
		// 마지막으로 값을 대입하는 변수 = 다시는 값을 대입하지 않겠다. = 변하지 않는 수
		// CONSTANT_NUMBER = 200000000; X
		// CONSTANT_NUMBER = 25; X 상수는 값을 변경할 수 없음
		
		final double TAX = 0.03;
		
		// 상수 예시
		final int UP = 10;
		final int DOWN = -10;
		final int INIT = 0;
		
		int num3 = INIT;
		System.out.println(num3);
		
		num3 = num3 + UP;
		System.out.println(num3);
		
		num3 = num3 + 3 * DOWN; // 사칙연산 우선순위에 따라 *가 먼저 처리됨.
		System.out.println(num3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
