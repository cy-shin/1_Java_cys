package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	
	public void ex1() {
		
		// branch 문 : 가장 가까운 반복문을 빠져나가는 구문
		
		for(int i=1 ; i<300000; i++) {
			
			System.out.println(i);
			
			// i가 20일 때 반복을 종료하고 싶다!
			
			if(i==20) {
				break;
			}
		}
		
		
		System.out.println("=======================");
		
		for(int row = 1; row <= 5; row++) {
			
			for(int col = 1; col <= 30; col++) {
				System.out.printf("(%d, %d) ", row, col);
				if(col == 3) {
					break;
				}
			}
			
			System.out.println();
			
			if(row == 3) {
				break;
			}
		}

	}
	
	public void ex2() {
		 // 0이 입력될 때 까지의 입력된 정수의 합 구하기
		
		 Scanner sc = new Scanner(System.in);
		 
		 int sum = 0;
		 while( true ) { // 조건식에 true => 무한반복하겠음
			 System.out.print("정수 입력 : ");
			 int input = sc.nextInt();
			 
			 if(input==0) {
				 break;
			 }
			 
			 sum+= input;
		 }
		 System.out.println("합계 : " + sum); // 반복문 안에 break문을 적지 않을 경우 이 코드가 unreachable code
		 
		 
	}
	
	public void ex3() {
		
		// "exit@" 문자열이 입력될 때 까지 문자열 누적하기
		
		Scanner sc = new Scanner(System.in);
		String str = ""; // 빈 문자열
		
		System.out.println(" --- 문자열 입력 (종료 시 exit@ 입력) --- ");
		while(true) {
			
			String input = sc.nextLine();
			
			// 비교연산자는 보통 기본 자료형의 값 비교만 가능하다
			// 기본 자료형 : byte short int long / char / float double / boolean
			// String은 기본 자료형이 아니라 참조형.
			// -> 값1.equals(값2) 와 같이 .equals()로 비교할 수 있음
			
			if(input.equals("exit@")) { // 문자열
				break;
			}
			
			str += input;
		}
		
		System.out.println(str);
	}
	
	public void ex4() {
		
		// continue : 다음 반복으로 넘어간다...
		
		// 1부터 3까지의 숫자 중 5의 배수를 제외하고 출력함
		
		for(int i=1; i<=30; i++) {
			if(i%5==0) {
				continue; // 다음 반복으로 이동(증감식 부분으로 이동함)
			}
			System.out.println(i);
		}
	}

	public void ex5() {
		
		for(int i=1; i<=100; i++) {
			if(i==40) {
				break;
			}
			if(i%5==0) {
				continue;
			}
			System.out.println(i);
			
		}
		
	}
	
	public void upDownGame() {
		
		// 프로그램 시작 시 1 ~ 50 사이의 난수(임의의 수)를 하나 생성하여,
		// 사용자가 몇 회 만에 맞추는지 세서 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		// 난수 생성 : Math.random() -> Java에서 제공해주는 난수 생성 방법
		// 0.0 <= x < 1.0 :  0.0 이상 1.0 미만의 난수를 생성
		
		int ran = (int)(Math.random()*50)+1;
//		System.out.println(ran); // 정답 출력 부분
		
		// 0.0 <= x 			< 1.0  
		// 0.0 <= x*5 			< 50.0 
		// 1.0 <= x*5+1 		< 51.0
		// 1   <= (int)(x*5+1) 	< 51
		
		// ++ 10번 넘기면 실패하게 만들기
		int count = 0;
		
		while(true) {
			System.out.print((count+1) + "번 입력 : ");
			int input = sc.nextInt();
			if(50>=input && input>=1) {
				count++;
				if(input == ran) {
					System.out.print("정답입니다 ");
					break;
				} else if(count>=10) {
					System.out.println("컴퓨터가 이겼습니다. 정답 :" + ran);
					break;
				} else if(input > ran) {
					System.out.println("DOWN");
				} else {
					System.out.println("UP");
				}
			} else {
				System.out.println("1~50사이의 숫자만 입력해주세요.");
			}
		}
		System.out.println("(총 입력 횟수 : " + count + "회)");
		
		
	}
	
	
	
	
	
	
	
	
}
