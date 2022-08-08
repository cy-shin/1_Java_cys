package edu.kh.op.ex1;

public class OperatorExample2 {
	public static void main(String[] args) {
		// 증감연산자 : ++, --
		// -> 피연산자를 1 증가 또는 감소시키는 연산자
		
		// 전위 연산 : ++a / --a
		// -> a를 먼저 1 증가/감소시키고 다른 연산을 수행함
		
		// 후위 연산 : a++ / a--
		// -> 다른 연산을 먼저 다 수행한 후  마지막에 a를 1 증가/감소
		
		int num1 = 10;
		int num2 = 10;
		
		num1++; //11
		num2--; //9
		
		System.out.println("num1++ : " + num1);
		System.out.println("num2-- : " + num2);
		
		// 전위 연산
		System.out.println("++num1 + 10 : " + (++num1 + 10));
		
		System.out.println("num1 : " + num1); // 12?
		
		// 후위 연산
		System.out.println("num2-- + 10 : " + (num2-- + 10)); 
		// 먼저 num2와 10을 연산해서 19가 나오고, 그 다음 num2의 값이 감소되어 8이 됨
		
		System.out.println("num2 : " + num2);
		
		// 연습문제
		int a = 3;
		int b = 5;
		
		int c = a++ + --b; // 3 + 4 = 7
		
		// 최종결과는?
		// 예상 : b = 4, c = 7, a = 4
		
		System.out.printf("a = %d, b = %d, c = %d\n",a,b,c);
	}
}
