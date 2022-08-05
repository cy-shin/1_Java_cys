package edu.kh.variable.ex1;

public class VariableExample2 {
	
	public static void main(String[] args) {
		
		// 변수 선언 : 메모리에 값을 저장할 수 있는 공간을 할당
		
		boolean booleanData; 
		// 논리형 변수 booleanData를 선언
		// = 논리 값(true/false)을 저장할 공간 1byte를 메모리에 할당했으며
		//   그 공간을 booleanData라고 부르겠음
		
		int iNum;
		// 정수 값을 저장할 공간 4byte를 메모리에 할당, 그 공간의 이름은 iNum

		long longNum;
		// 정수 값을 저장할 공간 8byte를 메모리에 할당, 그 공간을 longNum이라고 부르겠음
		
		byte bNum;
		bNum = 127; 

		short sNum;
		sNum = 30000;
		// byte/short는 이전 프로그램과의 호환성을 위해 추가된 것으로, 거의 사용되지 않는 자료형
		// 별도의 리터럴 표기법이 없고, int 표기법을 같이 사용
		
		float fNum; // 실수형 변수 4byte 할당
				
		double dNum; // 실수형 변수 8byte 할당
		
		char ch1; // 문자형 변수 2byte 할당
		char ch2; // 문자형 변수 2byte 할당
		
		
		
		
		
		
		
		
		
		
		
		
		// 값 대입 : 선언된 변수에 값(리터럴)을 대입(저장)
		
		booleanData = false;
		// boolean 자료형은 true, false만 저장할 수 있다.
		// 리터럴 표기법은 true / false (=그 외의 값을 입력하면 오류)

		iNum = 1000000;
		// int의 리터럴 표기법은 기본적인 정수 표기법
		// iNum = 10000000000; 이 경우는 대입한 값이 int타입의 범위를 넘어서서 오류가 발생함
		
		longNum = 10000000000L;
		// longNum = 10000000000; 이 경우 100억은 int표기법으로 적힌것이므로, int타입 자료형의 범위를 넘어설 수 없음
		// long의 리터럴 표기법은 정수 뒤에 접미사 L(l)을 붙인다
		
		fNum = 3.14f;
		// float의 리터럴 표기법은 소수 뒤에 접미사 f(F)
		
		dNum = 1.23;
		// double의 리터럴 표기법은 기본 실수 표기법(d를 적어도 됨)
		
		ch1 = 'A';
		// char의 리터럴 표기법은 작은 따옴표 ''
		
		ch2 = 66; // 'B'
		// char 자료형은 숫자-문자 형태의 문자표(유니코드)에서 일치하는 문자나 숫자의 문자부분만 출력		
		
		System.out.println(booleanData);
		System.out.println(iNum);
		System.out.println(longNum);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch1);
		System.out.println(ch2);
		
		// 출력시 리터럴 표기법은 생략됨 (예 : 10.0L -> 10.0)
		
		// 리터럴 : 값 그 자체... 수학의 상수에 해당
		
		// 자료형에 맞지 않는 값을 대입하면 Type mismatch.... 오류가 발생함
		
	}
}
