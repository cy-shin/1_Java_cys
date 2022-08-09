package edu.kh.control.condition;

import java.util.Scanner;

// 명령받은 코드를 수행
public class ConditionExample {
	
	public void test1() {
		System.out.println("1번 기능을 수행합니다.");
	}
	
	public void test2() {
		System.out.println("2번 기능을 수행합니다.");
	}
	
	public void ex1() {
		System.out.println("[if문 예시 1]");
		// if(만약) : 조건식이 true 일때만 내부에 작성된 코드를 수행하는 구문
		
		/*	(작성법)
		 * 	if(조건식) {
		 * 		// 조건식이 true일 때 수행되는 코드
		 * 	}
		 *
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 입력된 정수가 짝수인지 검사 (0도 짝수로 취급해서 처리)
		if( input % 2 == 0 ) {
			System.out.println("짝수 입니다.");
		} 

		
		// 입력된 정수가 홀수인지 검사 (0도 홀수로 취급해서 처리)
		if( input % 2 != 0 ) {
			System.out.println("홀수 입니다.");
		}
		
		System.out.println("[if문 예시 1 종료]");
	}

	public void ex2() {
		System.out.println("[if문 예시 2]");
		
		// if - else문
		// if문 조건식의 결과가 true이면, if문
		// if문 조건식의 결과가 false이면 else문을 수행하는 구문
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if( input % 2 == 1 ) {
			System.out.println("홀수 입니다.");
		} else {
			/* 중첩 if문 */
			if( input == 0 ) {
				System.out.println("0 입니다.");
			} else {
				System.out.println("짝수 입니다.");
			}
			
		}
		
		System.out.println("[if문 예시 2 종료]");
	}
	
	public void ex3() {
		System.out.println("[if문 예시 3]");
		
		// if ~ else if ~ else
		// else if 부분은 얼마든지 더 추가할 수 있음
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12사이의 정수를 입력해주세요 : ");
		int input = sc.nextInt();
		String season;
		
		if( 5 >= input &&  input >= 3) {
			season = "봄";
		} else if ( 8 >= input && input >= 6) {
			season = "여름";
		} else if ( 11 >= input && input >= 9) {
			season = "가을";
		} else if ( input == 12 || input == 1 || input == 2) {
			season = "겨울";
		} else {
			season = "해당하는 계절이 없습니다.";
		} 
		// else문에서 나머지 경우의 수에 대한 값을 season에 대입해주지 않으면...
		//season에 값이 대입되지 않는 경우가 발생할 수 있음
		
		System.out.println(season);
		
		System.out.println("[if문 예시 3 종료]");
	}
		
	public void ex4() {
		System.out.println("[if문 연습 1]");
		// 나이를 입력받아 13세 이하면 "어린이"
		// 13세 초과 19세 이하면 "청소년"
		// 19세 초과 시 "성인"
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		
		String sort;
		
		if( age > 19 ) {
			sort = "성인";
		} else if( age > 13 ) {
			sort = "청소년";
		} else if( age > 0 ) {
			sort = "어린이";
		} else {
			sort = "잘못된 나이";
		}
		// if ~ else if문을 작성할 때, 조건식을 효율적으로 작성할 수 있도록 하자
		
		System.out.println(sort + " 입니다.");
	}
	
	public void ex5() {
		  // 놀이기구 탑승 제한 검사
	      
	      // 나이가 12세 이상, 키 140.0cm 이상 일 경우에만 "탑승 가능"
	      // 나이가 12미만인 경우 : "적정 연령이 아닙니다."
	      // 키가 140.0cm 미만 : "적정 키가 아닙니다."
	      // 나이를 0세 미만, 100세 초과 시 : "잘못 입력 하셨습니다."
		
		
		String result;
		
		Scanner sc = new Scanner(System.in);
		
//// else - if문으로 확인하기
//		
//		System.out.print("나이를 입력해주세요 : ");
//		int age = sc.nextInt();
//		
//		
//		System.out.print("키를 입력해주세요 : ");
//		double height = sc.nextDouble();
//		
//		
//		
//		if(age < 0 || age > 100) { // 0세 미만 100세 초과 걸러내기
//			result = "잘못 입력 하셨습니다.";
//		} else if(age < 12 ) { // 12세 미만
//			result = "적정 연령이 아닙니다.";
//		} else if(height < 140.0) { // 140.0cm 미만
//			result = "적정 키가 아닙니다.";
//		} else { // 조건 전부 미충족 == 12세 이상 && 140cm 이상
//			result = "탑승 가능";
//		}
//		

//		나이 먼저 검사해서 나이가 안맞으면 먼저 걸러내고, 나이가 맞을때만 키를 검사하는 방식으로 만들어보기
		
		
		System.out.print("나이를 입력해주세요 : ");
		
		int age = sc.nextInt();
		
		
		if(100 > age && age > 0) {
			if(age >=12) {
				System.out.print("키를 입력해주세요 : ");
				double height = sc.nextDouble();
				
				if(height >= 140.0) {
					result = "탑승 가능";
				} else {
					result = "적정 키가 아닙니다.";
				}
			} else {
				result = "적정 연령이 아닙니다.";
			}
		} else {
			result = "잘못 입력하셨습니다.";
		}
		

		System.out.println(result);
	}
	
}
