package edu.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {
	/* switch문
	 * - 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문
	 * >>> 식의 결과로 얻은 값과 같은 case 구문이 수행된다.
	 * >>> 일반적인 조건문의 조건식은 결과가 true/false로 발생해야 하지만,
	 * >>> switch문의 조건식의 결과는 true/false가 아니라 정수, 문자 등의 형태로 발생해야 함
	 * 
	 * switch(일반식) {
	 * 
	 * case 1:
	 * 		수행 코드1; 
	 * 		break;
	 * 
	 * case 2:
	 * 		수행 코드2; 
	 * 		break;
	 * 
	 * case 3:
	 * 		수행 코드3; 
	 * 		break;
	 *     
	 *     .
	 *     .
	 *     .
	 *     .
	 *     .
	 *     .
	 *      
	 * default:
	 * 		모든 케이스를 만족하지 않는 경우에 수행할 코드; 
	 * 
	 * */
	
	
	public void ex1() {
		// 키보드로 정수를 입력받아서 1이면 빨간색, 2면 주황색, 3이면 노란색, 4면 초록색, 전부 아니면 흰색을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		String result;
		
//		if(input ==1) {
//			result = "빨간색";
//		} else if(input == 2) {
//			result = "주황색";
//		} else if(input == 3) {
//			result = "노란색";
//		} else if(input == 4) {
//			result = "초록색";
//		} else {
//			result = "흰색";
//		}
		
		
		switch(input) {
		case 1:
			result = "빨간색";
			break;
		case 2:
			result = "주황색";
			break;
		case 3:
			result = "노란색";
			break;
		case 4:
			result = "초록색";
			break;
		default:
			result = "흰색";
		}
		
		
		System.out.println(result);
		
				
	}

	public void ex2() {
		
		// 정수를 입력 받아서 나머지가 1이면 "백팀"
		// 나머지가 2이면 "청팀"
		// 나머지가 3이면 "홍팀"
		// 그 외에는 "깍두기"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		
		String result;
		
		switch(input % 4) {
		case 1 :
			result = "백팀";
			break;
		case 2 :
			result = "청팀";
			break;
		case 3 :
			result = "홍팀";
			break;
		default:
			result = "깍두기";
		}
		
		System.out.printf("%s 입니다.\n",result);
	}

	public void ex3() {
		// switch문의 식이 double형인 경우 -> X
		// switch문의 식이 String인 경우
		// switch문의 식으로는 int, String, (열거형)을 넣을 수 있음
		Scanner sc = new Scanner(System.in);
		
		int result;
		
		System.out.println("김밥(3000) / 라면(4000) / 샌드위치(5000) / 짬뽕(10000)");
		
		System.out.print("메뉴를 입력하세요 : ");
		String input = sc.next();
		
		switch(input) {
		case "김밥":
			result = 3000;
			break;
		case "라면":
			result = 4000;
			break;
		case "샌드위치":
			result = 5000;
			break;
		case "짬뽕":
			result = 10000;
			break;
		default:
			result = -1; // 잘못 입력했으면 -1
		}
		
		if(result == -1) {
			System.out.println("잘못 입력하셨습니당");
		} else {
			System.out.printf("주문하신 메뉴 \"%s\"의 가격은 \"%d원\"입니다.", input, result);
		}
	}

	public void ex4() {
		// 산술 연산 계산기 만들기
		// 두 정수와 사칙연산 중 1개의 연산자(+-*/)를 입력 받아서 연산 결과를 출력하세요
		// 단, 나누기(/) 시 0으로는 나누지 못하게 한다.
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 1 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("연산자를 입력하세요(+ - * / %) : ");
		String op = sc.next();
		
		System.out.print("정수 2 입력 : ");
		int num2 = sc.nextInt();
		
		double result = 0;
		int tmp = 0;
		
		switch(op) {
		case "+":
			result = num1 + num2; break;
		case "-":
			result = num1 - num2; break;
		case "*":
			result = num1 * num2; break;
		case "%":
			result = num1 % num2; break;
			
		case "/":
			if(num2 == 0) {
				tmp = -1; // 0으로 나누기를 시도한 경우
				System.out.println("0으로 나눌 수 없습니다.");
			} else {
				tmp = 1;
				result = (double)num1 / num2;
			}
			break;
		
		default:
			tmp = -1; // 연산자를 잘못 입력한 경우
			System.out.println("존재하지 않는 연산자입니다.");
		}
		
		
		if(tmp == 0) { // 결과값이 정수인 경우
			System.out.printf("%d %s %d = %.0f\n",num1,op,num2,result);
		}
		if(tmp == 1) { // 결과값이 실수인 경우 -> 소수점 첫째자리까지 출력하고 싶음
			System.out.printf("%d %s %d = %.1f\n",num1,op,num2,result);
		}
		
	}
	
	public void ex5() {
		
		// switch문의 break 역할 = "해당 case를 수행한 후 멈춰라"
		// break가 없는 경우, 다음 case가 연달아서 수행된다 언제까지? break문을 만날 때까지
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 달을 입력해주세요 : ");
		int input = sc.nextInt();

		String season;
		
		switch(input) {
		case 3: case 4: case 5:
			season = "봄"; break;
		case 6: case 7: case 8:
			season = "여름"; break;
		case 9: case 10: case 11:
			season = "가을"; break;
		case 12: case 1: case 2:
			season = "겨울"; break;
		default:
			season = "잘못 입력하셨습니다.";
		}
		
		System.out.println(season);
	}
}
