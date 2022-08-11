package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
	
	
	// 실습 문제 1 ~ 13
	// 직접 충분히 고민해보기
	public void practice99 () {
		
		/* 
		 * 2*1= 2 3*1= 3 4*1= 4
		 * 2*2= 4 3*2= 6 4*2= 8
		 * 2*3= 6 3*3= 9 4*3=12
		 * 2*4= 8 3*4=12 4*4=16
		 * 2*5=10 3*5=15 4*5=20
		 * 
		 */
		
		
//		for(int i =1; i <=9; i++) {
//			for(int j =2; j <=9; j++) {
//				System.out.printf("%d*%d=%2d\t", j, i, j*i);
//			}
//			System.out.println();
//		}
		
		/* 
		 * *2345678*   5 -> 9      
		 * **34567**   
		 * ***456***   
		 * ****5****                
		 * *********              
		 * 
		 */
		
		/*
		 * 	input	input*2	i	j	input*2-i	r
		 *  5		10		3	1				*
		 * 						2				*
		 * 						3				*
		 * 						4	7			" "			
		 * 						5				" "
		 * 						6				" "
		 * 						7				*
		 * 						8				*
		 * 						9				*
		 * 						
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j <= input * 2 - 1; j++) {
				if(j <= i || j >= input * 2 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			System.out.print(i);
			sum += i;
			if( i < num) {
				System.out.print(" + ");
			}
		}
		System.out.print(" = " + sum);
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			// 두 변수의 값 교환
			int tmp = num2;
			num2 = num1;
			num1 = tmp;
		}
		
		if(num1 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.printf("===== %d단 =====\n", dan);
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d \n", dan, i, dan*i);
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if(dan > 9 || 2 > dan) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
			for(int i = dan; i <= 9; i++) {
				System.out.printf("===== %d단 =====\n", i);
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %2d \n", i, j, i*j);
				}
				System.out.println();
			}
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = input; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// for문을 이용한 방법
		for(int i = input; i >= 1; i--) {
			
			for(int blank = 1; blank < i; blank++) { // 띄어쓰기를 할 반복문
				System.out.print(" ");
			}
			for(int star = input; star >= i; star--) { // 별을 찍을 반복문
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		// *** if문을 이용한 방법
		for(int row = 1; row <= input; row++) {
			for(int col = 1; col <= input ; col++) {
				if(col <= input - row) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void practice10() {
		// 윗부분과 아랫부분을 나눠서 생각해보자..
	
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		
		// *
		// **
		// ***
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// **
		// *
		for(int i = input-1; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 위아래 안나누고 조건식으로 풀어보기
		
//		for(int i = 1; i < input * 2; i++) {
//			for(int j = 1; j <= i % (input+1); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
			
	}
	
	public void practice11() {
		// 정수 4를 입력했을 때
		// 띄어쓰기가 3 / 2 / 1 / 0
		// 별 개수는 1 / 3 / 5 / 7
		// 별 개수 규칙을 생각해보자...
		
		// 정수 4 -> 1, 3, 5, 7
		// 정수 5 -> 1, 3, 5, 7, 9
		
		/*
		 * 	i	star
		 *  1    1          *
		 *  2    3         ***
		 *  3    5        *****
		 *  4    7       ******* 
		 *  5    9		 1234567
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int blank = input; blank > i; blank--) {
				System.out.print(" ");
			}
			for(int star = 1; star < i*2; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// if문으로도 풀어보기(for문 1개쓰기)
		
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j < input*2; j++) {
				if(j <= input - i || j >= input + i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	
	public void practice12() {
		
		// 뚜껑 몸통 바닥으로 분리?
		
		/* 
		 * 정수 : 7
		 * ******* 1
		 * *     * 2 / 5
		 * *     * 3 / 5
		 * *     * 4 / 5
		 * *     * 5 / 5
		 * *     * 6 / 5
		 * ******* 7
		 */ 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
//		for(int i = 1; i <= input; i++) {
//			if(i == 1 || i == input) {
//				for(int row = 1; row <= input; row++) { // 뚜껑과 바닥
//					System.out.print("*");
//				}
//			} else { // 뚜껑과 바닥이 아니라 몸체 부분에서는?
//				for(int col = 1; col <= input; col++)
//					if(col == 1 || col == input) { // 첫번째 자리랑 마지막 자리에만 *
//						System.out.print("*");
//					} else {
//						System.out.print(" "); // 나머지 자리에는 공백
//					}
//				}
//			System.out.println();
//			}
		
		System.out.println();
		
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j <= input; j++) {
				if((i == 1 || i == input) || (j == 1 || j == input)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}	
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				if(i % 2 == 0 && i % 3 == 0) {
				count++;
			}

			}
//			if(i % 2 == 0 && i % 3 == 0) {
//				count++;
//			}
		}
		System.out.printf("\ncount : %d", count);
	}
	
	
}
