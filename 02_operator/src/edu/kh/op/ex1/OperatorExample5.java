package edu.kh.op.ex1;

import java.util.Scanner;

public class OperatorExample5 {

	public static void main(String[] args) {
		
		// 복합 대입 연산자 : +=, -+, *=, /=, %=
		
		
		int a = 10;
		System.out.println("a : " + a);
		a++;
		
		System.out.println("a를 1 증가 : " + a);
		
		a += 4; // a = a + 4
		System.out.println("a에 a+4를 대입? X -> a를 4 증가 : " + a);
		
		a -= 10; // a = a - 10
		System.out.println("a를 10 감소 : " + a); // 5

		a *= 3; // a = a * 3
		System.out.println("a를 3배 증가 : " + a); // 15
		
		a /= 6; // a = a / 6
		System.out.println("a를 6으로 나누었을 떄의 몫 : " + a); // 2

		
		a %= 2; // a = a % 2
		System.out.println("a를 2로 나누었을 떄의 나머지 : " + a); // 0
		
		System.out.println("---------------------------------------------");
		
		
		// 삼항 연산자 : 조건식 ? true인 경우 : false인 경우
		// ?와 :에 주의할 것
		// 증감연산자 사용 시 우선순위에 특히 더 신경쓸 것
		
		// * 조건식 : 연산 결과가 true/false인 식
		// 					(비교, 논리, 논리부정 포함)
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		
		// 입력 받은 정수가 짝수인지, 홀수인지 판별하자
		
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		
		String result = input % 2 == 0? "짝수 입니다." : "홀수 입니다.";
		
		System.out.println("입력하신 숫자 " + input + "은(는) " + result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
