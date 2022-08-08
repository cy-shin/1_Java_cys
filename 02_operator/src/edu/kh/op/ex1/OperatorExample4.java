package edu.kh.op.ex1;

public class OperatorExample4 {
	public static void main(String[] args) {
		
		// 논리 연산자 : &&(AND), ||(OR)
		
		// &&(AND) 연산자 : 둘 다 true이면 true, 나머지는 false
		// ~와, 그리고,(~이고), ~이면서(~면서), ~부터 ~까지, ~사이

		int a = 101;
		
		// Q : a는 100이상이면서 짝수인가요?
		
		boolean result1 = a >= 100; // true
		boolean result2 = a % 2 == 0; // false
		
		System.out.println("Q : a는 100이상이면서 짝수인가요? A : " + (result1 && result2));
		// && || 등 연산자를 사용할 때 우선순위에 주의할 것!
		
		int b = 5;
		
		// Q : b는 1부터 10 사이의 정수인가요?
		
		boolean result3 = 1 <= b;
		boolean result4 = b <= 10;
		System.out.println( "Q : b는 1부터 10 사이의 정수인가요? A : " + (result3 && result4) );
		
		
		// ||(OR) 연산자 : 둘 다 false이면 false, 나머지는 true
		// 또는, ~거나, ~이거나
		
		int c = 10;
		
		// Q : c는 홀수이거나 10을 초과하는 숫자인가요?
		
		System.out.print("Q : c는 홀수이거나 10을 초과하는 숫자인가요? A : ");
		System.out.println( (c % 2 != 0) || (c > 10) );
		
		
		int d = 20;
		
		// Q : d는 1부터 100 사이 숫자 또는 음수인가요?
		
		boolean result5 = (1 <= d && d <= 100) || (d < 0);
		// &&의 우선순위가 ||보다 높음
		
		System.out.println("Q : d는 1부터 100 사이 숫자 또는 음수인가요? A : " + result5);
		
		System.out.println("=====================================");
		
		// 논리 부정 연산자 : ! (NOT)
		// 논리 값을 반대로 바꾸는 연산자
		
		
		System.out.println("!result5 : " + !result5); // !true -> false
		
		
		int e = 3;
		
		boolean result6 = e >= 1 && e < 5; // e는 1 이상 이고, 5 미만인가?
		boolean result7 = e < 1 || 5 <= e; // e는 1 미만 또는 5 이상인가?
		
		boolean result8 = !result6;
		
		System.out.println( !result6 == result7);
		// result6의 반대가 result7과 같은가?
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
