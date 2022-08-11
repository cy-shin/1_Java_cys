package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {
	/*	while문
	 * 	- 별도의 초기식, 증감식이 존재하지 않고 
	 * 	  반복 조건만을 설정하는 반복문
	 * 
	 *  - 반복 횟수가 명확하게 정해져 있지는 않지만,
	 * 	  언젠간 반복이 종료되어야 하는 경우에 사용함
	 * 
	 * 
	 *  [작성법]
	 *  while(조건식) {
	 *  	조건식이 true인 경우 반복 수행할 구문..
	 *  }
	 *  
	 * */
	
	
	public void ex1() {
		// while 기초 사용법 1
		
		// 1부터 10까지 while/for문을 이용해 출력
		
		//for
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("====================");
		
		//while
		int i = 1;
		while(i <= 10) {
			System.out.printf("%d \n",i++);
		}
		
	}
	
	public void ex2() {
		// while 기초 사용법 2
		
		// 입력되는 모든 정수의 합 구하기
		// 단, 0이 입력되면 반복을 종료!!
		Scanner sc = new Scanner(System.in);
		
		int input = -1; 
		// while문 내에서 입력받은 값을 저장할 변수
		
		// 입력 받은 값이 0인 경우 라는 조건을 판별하기 위해
		// while문 보다 앞에 먼저 선언
		
		// 하지만 input 변수 선언 시 초기화 되어있지 않으면, 조건식을 수행할 수 없음
		// 0이 아닌 임의의 값을 이용해 초기화하였음
		// 왜 0? 0으로 초기화할 경우 아래 while문의 조건식이 충족되지 않아서 while문이 전혀 수행되지 않음
		
		// 조건문이나 반복문 내에서 선언된 변수는, 해당 조건문/반복문을 벗어나면 사라짐
		int sum = 0;
		
		while(input != 0) {
			System.out.println("현재 누적 값 : " + sum);
			System.out.print("정수 입력 (종료=0) : ");
			input = sc.nextInt();
			sum += input;
		}
		System.out.println(sum);
	}
	
	public void ex3() {
		
		// 분식집 주문 프로그램
		
		// ex)
		// --- 메뉴 ---
		// 1. 떡볶이(5000원)
		// 2. 김밥(3000원)
		// 3. 라면(4000원)
		// 4. 돈까스(8000원)
		// 9. 주문 완료
		// 메뉴 선택 >> 1

		// --- 메뉴 ---
		// 1. 떡볶이(5000원)
		// 2. 김밥(3000원)
		// 3. 라면(4000원)
		// 4. 돈까스(8000원)
		// 9. 주문 완료
		// 메뉴 선택 >> 2

//		 --- 메뉴 ---
//		 1. 떡볶이(5000원)
//		 2. 김밥(3000원)
//		 3. 라면(4000원)
//		 4. 돈까스(8000원)
//		 9. 주문 완료
		// 메뉴 선택 >> 9
		
		// 떡볶이, 김밥을 주문하셨습니다.
		// 총 가격은 8000원 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 메뉴 가격 합계
		int input = 0;
		String menu = ""; // "" 내용은 없지만 빈 문자열로 인식함.
		Boolean flag = false;
		
		while(input != 9) {
			
			
			System.out.println(
					"--- 메뉴 ---\n"
				  + "1. 떡볶이(5000원)\n"
				  + "2. 김밥(3000원)\n"
				  + "3. 라면(4000원)\n"
				  + "4. 돈까스(8000원)\n"
				  + "9. 주문 완료");
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			
			System.out.println();
			
//			if(flag && (4 >= input && input >= 1)) { // true인 경우
//				menu += ", ";
//			} else if(!false && (input >= 1 && input <=4)) { // false인 경우
//				flag = true;
//			}
			
			switch(input) {
			case 1:
				if(flag) {
					menu += ", ";
				}
				sum += 5000;
				menu += "떡볶이";
				break;
			case 2:
				if(flag) {
					menu += ", ";
				}
				sum += 3000;
				menu += "김밥"; 
				break;
			case 3:
				if(flag) {
					menu += ", ";
				}
				sum += 4000;
				menu += "라면";
				break;
			case 4:
				if(flag) {
					menu += ", ";
				}
				sum += 8000;
				menu += "돈까스";
				break;
			case 9:
				break;
			default: System.out.println("잘못 입력하셨습니다.\n");
			} // end switch
			
			if(!flag && input >= 1 && input <=4) { // !flag == if flag is false..
				flag = true;
			}
			
		} // end while
		
		System.out.println(menu + "을/를 주문하셨습니다.");
		System.out.println("총 가격은 " + sum + "입니다.");
		
		
	}
	
	public void ex4() {
		
		/* do - while믄
		  
		  [작성법]
		  
		  do {
		  
		  } while(조건식);
		  
		 >> do : {} 내부 코드를 일단 수행해라 
		    while(조건식) : 조건식이 true이면 { } 내부 코드를 반복 수행
		 >>> 일단 {} 내부 코드를 수행하고, 조건식이 true인 동안 반복 수행
		 >>> 최소 1회 실행을 보장함.. "최소 1회" 이상 반복하는 while문
		 
		 
		*/
		
	
		Scanner sc = new Scanner(System.in);
				
		int input; 
				
		int sum = 0;
		
		do { // do-while문 사용 시, 최소 1번 이상 반복문이 실행됨
			// 그래서 먼저 변수 input에 값이 대입된 후 반복문의 조건식을 따지기 때문에... input을 먼저 초기화하지 않아도 괜찮음
			System.out.print("정수 입력 (종료=0) : ");
			input = sc.nextInt();
			sum += input;
			System.out.println("현재 누적 값 : " + sum);
		} while(input != 0);
		
		System.out.println(sum);
		
	}
	
}
