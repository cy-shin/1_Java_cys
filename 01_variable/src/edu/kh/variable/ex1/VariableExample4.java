package edu.kh.variable.ex1;

public class VariableExample4 {
	
	public static void main(String[] args) {
		
		/* 형변환(casting) : 값의 자료형을 변환하는 것을 의미함
		 * 형변환을 하는 이유 : 컴퓨터의 값 처리 원칙(같은 자료형끼리만 계산할 수 있음)을
		 * 						어겨서 오류가 발생하는 것을 해결하기 위해서
		 * 
		 * 자동 형변환
		 * - 자료형의 [값의 범위]가 서로 다른 두 값의 연산 시
		 *   [컴파일러(번역기)]가 자동으로
		 *   [값의 범위]가 작은 값의 자료형을 큰 값의 자료형으로 변환
		 *   
		 *   
		 *   
		 */
		
		// 자동 형변환 예시
		int num1 = 10;
		long num2 = 100L;
		System.out.println( "num1 + num2 = " + (num1 + num2) );
		
		int num3 = 300;
		double num4 = 1.1;
		
		// int result = num3 + num4; Type mismatch : cannot convert from double to int
		//	            int  + double
		//				300.0 double + 1.1 double = 301.1 double
		
		double result = num3 + num4;
		System.out.println("result= "+ result);
		
		
		// System.out.println( "num3 + num4 = " + (num3 + num4) );
		
		// char의 자동 형변환 (char -> int)
		
		int num5 = 'a'; // 대입도 연산에 해당
		// 	int	   char
		System.out.println(num5);
		
		char ch = 97; // 형변환 예외 상황 ( 큰 쪽이 작은 쪽으로 자동 형변환?)
		System.out.println("ch : " + ch);
		char ch2 = '0';
		int result2 = ch2;
		System.out.println(ch2 + "의 유니코드 번호는 "+result2);
		
		System.out.println("=====================================================");
		
		// 강제형변환 1. 소수점 버림
		System.out.println(" *** 강제 형변환 *** ");
		
		double temp = 3.14;
		int result3 = (int)temp; // 자동형변환이 안되므로 강제형변환을 해줌
		System.out.println("result3 = "+result3); // 실수를 정수로 강제형변환하여 소수자리가 사라짐
		
		
		// 강제형변환 2. 데이터 손실
		int temp2 = 290;
		byte result4 = (byte)temp2; // int를 byte로 강제형변환 해주었음
		System.out.println("result4 = "+result4);
		// byte는 8bit자리까지만 표현할 수 있어서, 9bit이상의 자리는 전부 손실됨

		
		// 강제형변환의 사용 예시
		
		// ** 강제 형변환은 값의 범위에 관계 없이 원하는 자료형으로 변환 가능 **
		
		int iNum1 = 1;
		int iNum2 = 2;
		
		System.out.println( "iNum1 / iNum2 = " + (iNum1 / iNum2) );
		
		// 강제형변환과 자동형변환을 동시에 이용
		System.out.println( "iNum1 / iNum2 = " + ((double)iNum1 / iNum2) );
		/*											1.0			/	2
		  											1.0			/	2.0	
		 */
		
		System.out.println( (char)65 ); // int타입 65를 char타입으로 강제형변환, 
										// 65의 유니코드에 해당하는 A를 결과로 얻음
		System.out.println( (int)'A');  // char타입 -> int타입
		
		
		byte bbb = 127;
		System.out.println((byte)(bbb+1));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
