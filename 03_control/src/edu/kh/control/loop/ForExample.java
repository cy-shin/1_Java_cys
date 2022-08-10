package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	
	/* for문
	 * - 끝이 정해져 있는 경우 사용하는 반복문
	 * 	(== 반복 횟수가 지정되어 있는 경우를 뜻함)
	 * 
	 * [작성법]
	 *
	 * for(초기식; 조건식; 증감식) {
	 * 		조건식이 true일 때 반복수행할 코드
	 * }
	 * 
	 * */
	
	public void ex99() { // 3 6 9 만들어보기
		for(int i = 1; i <= 100; i++) {
			
			// 3 6 9 13 16 19 23 26 29 33 36 39 ..
			
			// 끝자리가 3, 6, 9로 끝나는 경우 = 10으로 나눠서 나머지가 3, 6, 9 ?
			
			int flag = 0; // 매번 초기화
			
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.print("짝");
				flag = 1; // 숫자에 3, 6, 9가 들어가면 flag = 1;
			}
			
			// 또는 앞자리가 3, 6, 9로 끝나는 경우 = 10으로 나눠서 몫이 3, 6, 9 ?
			if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
				System.out.print("짝");
				flag = 1;
			}
			
			if(flag == 0) {
				System.out.print(i);
			}
			System.out.println(); // 출력이 다 끝날때마다 줄을 바꿈
		}
		
		
		
	}
	
	public void ex98() { // 오른쪽으로 정렬시켜보기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = input; i >= 1; i--) {
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for(int x = input; x >= i; x--) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
	
	public void ex1() {
		// for문 기초 사용법 1
		// 1~10 까지 반복 출력
		// for문의 해석 순서
		
		
						// 2,5) 조건식에 부합하는지 확인
		for(int i = 1 ;	i <= 10	;	i++) {
			// 1) 초기식	   			// 4,7) 증감식	
		
			// -> 3,6) 반복수행할 코드
			System.out.println(i + " 출력");
			// 1 출력
			
			// 1~4까지 먼저 수행된 후 5~7을 조건식을 충족하지 않을때까지 계속 반복 
		}
		
	}
	
	public void ex2() {
		// for 기초 사용법 2
		
		// 5부터 12까지 1씩 증가하면서 출력되는 반복문을 만들어보자
		
		for( int i = 5 ; i <= 12 ; i++ ) {
			System.out.println(i + " 출력");
		}
		
		System.out.println("============================");
		
		// 1 부터 100 까지의 모든 정수의 합
		
		int sum = 0; // 합계 저장용 변수
		// 왜 변수 sum을 0으로 초기화할까?
		// -> 0이라는 값은 더하거나 뺄 때 아무런 영향이 없어 누적이 필요한 상황에서 기준점으로 사용하기 적합함 
		
		for( int i = 1 ; i <= 100 ; i++ ) {
			
			// i 값이 1 ~ 100까지 1씩 증가
			// -> i값을 sum 변수에 계속 누적
			
			sum += i;
		}

		System.out.println("1 ~ 100까지의 모든 정수의 합 : " + sum);
	}

	public void ex3() {
		// for 기초 사용법 3
		// 두 정수를 입력 받아서 두 정수 사이의 모든 정수의 합을 출력해보자
		// 단, 첫 번째 숫자를 두 번째 숫자보다 작게 입력한다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		
		// 첫 번째 입력한 숫자가 두 번째 입력한 숫자보다 큰 경우
//		if(num1 > num2) {
//			int tmp = num2; // 임시로 tmp변수를 만들어서 num2의 값을 대입
//			num2 = num1; // num2와 num1을 바꾸기 위해서 num2에 num1을 대입
//			num1 = tmp; // num1에 num2를 대입해야 하는데, num2는 앞서 num1을 대입하면서 값이 변했기 때문에 tmp를 대입함
//		}
//		
		int sum = 0; // 합계 저장용 변수
		
		for (int i = num1; i <= num2; i++) {
			sum += i; // 누적
		}
		
		System.out.printf("%d부터 %d까지의 모든 정수의 합 : %d \n", num1, num2, sum);
		
		
	}

	public void ex4() {
		
		// for 기초 사용법 4
		// 증감식에 변화를 주자
		// 1부터 100까지 3씩 증가하면서 출력
		// 결과 1 4 7 10 13 .....................
		
		// i++ i = i + 1
		for(int i = 1; i <= 100; i += 3) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n=====================================");
		
		// 10부터 20까지 0.5씩 증가
		
		for(double i = 10.0; i <= 20.0; i += 0.5) {
			System.out.print(i + " ");
		}
	}

	public void ex5() {
		
		// for문 + char + 자동/강제형변환을 활용한 반복문 응용 예제
		
		// A ~ Z까지 출력하기
		
//		for(int i = 'A'; i <= 'Z'; i++) {
//			System.out.println( (char)i );
//		}
		
		for(char i = 'A'; i <= 'Z'; i++) {
			System.out.println(i);
		}
		
	}

	public void ex6() { // for문 응용
		
		// 10부터 1까지 1씩 감소하면서 출력
		
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}		
	}
	
	public void ex7() { // for문 응용2
		// 입력, sum, for 응용
		
		// 정수 5개를 입력 받아서 합계 구하기
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("입력 "+ i + " : ");
			sum += sc.nextInt();
			// 입력버퍼에서 다음 정수를 얻어와 sum변수에 누적...
		}
		System.out.println("합계 = " + sum);
	}
	
	public void ex8() { // for문 응용3
		// 정수를 입력받을 횟수를 정하고
		// 입력된 정수의 합계를 출력
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 정수의 개수 : ");
		int count = sc.nextInt(); // 입력받을 정수의 개수
		
		int sum = 0; // 합계를 저장할 변수
		
		// 조건식을 i <= count
		for(int i = 1; i <= count; i++) {
			System.out.print("입력 " + i + " : ");
			sum += sc.nextInt();
		}
		
		System.out.println("합계 : " + sum);
	}	

	public void ex9() { // [기초]
		
		// 1부터 20까지 1씩 증가하며 출력
		// 단, 5의 배수에는 ()를 붙어서 출력
		// 예) 1 2 3 4 (5) 6 7 8 9 (10) 11 12 13 14 15 16 ....
		
		for(int i = 1; i <= 20; i++) {
			if(i % 5 == 0) {
				System.out.print("(" + i + ") ");
			} else {
				System.out.print(i + " ");
			}
		}
		
	}

	public void ex10() { // [응용]
		
		// for문, if문, Scanner, 논리연산자, print 메서드(printf, print, println)
		// 구구단 출력
		
		// 2 ~ 9 사이의 숫자 하나를 입력받아서, 해당하는 수의 단을 출력
		// 단, 입력받은 수가 2~9 사이가 아니라면, "잘못 입력하셨습니다."
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단(2~9) 입력 : ");
		int dan = sc.nextInt();
		
		if(!(9 >= dan && dan >=2 )) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d \n", dan, i, dan * i );
			}
			
			System.out.println("==============================");
			
			for(int i = 9; i >= 1; i--) {
				System.out.printf("%d X %d = %d \n", dan, i, dan * i );				
			}
		
		}

	}

	// ================================================
	// ================== 중첩 반복문 ====================
	// ================================================
	
	public void ex11() {
		
		// 12345가 4줄 출력되게 만듦
		
		for(int x = 1; x <= 4; x++) {
			for(int i = 1; i <= 5; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
	}
	
	public void ex12() { // [응용]
		// 구구단 2단부터 9단까지 모두 출력하세요
		
		for(int dan = 2; dan <= 9; dan++) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%dX%d=%2d ", dan, i, dan*i);
			}
			
			// %2d : 정수가 출력될 칸을 2칸 확보하고 오른쪽 정렬하여 출력
			// %-2d : 왼쪽으로 정렬
			// %02d : 빈 칸을 0으로 가득 채움
			
			System.out.println(); // 줄 바꿈
		}
	}
	
	public void ex13() {
		
		// 2중 for문을 이용해서 다음 모양을 출력하세요.
		
		// 1
		// 12
		// 123
		// 1234
		
		for(int x = 1; x <= 4; x++) {
			for(int i = 1; i <= x; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public void ex14() {
		
		// 방법2
		for(int x = 1; x <= 4; x++) {
			for(int i = 4; i > 4-x ; i--) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		// 방법1 (더 좋은 방법)
		for(int x = 4; x >= 1; x--) {
			for(int i = 4; i >= x; i--) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

	public void ex15() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x = 1; x <= input; x++) {
			for(int i = input; i >= x; i--) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		for(int x = input; x >= 1; x--) {
			for(int i = x; i >= 1; i--) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
	
	public void ex16() {
		
		// 2중 for문을 이용하여 다음 모양을 출력하세요
		
		for(int row = 1; row <= 5; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void ex17() {
		
		// 합계 sum
		// 개수 count .. 수를 셀 대는 0부터 1씩 증가시키면서 세는 것이 보통
		
		// 1부터 20 사이의 3의 배수의 개수를 출력하세요............
		
		int sum = 0;
		int count = 0;
		
		for(int i = 1; i <= 20; i++) {
			if(i % 3 ==0) {
				count++;
				sum += i;
			}
		}

		System.out.println("\nsum: " + sum);
		System.out.println("count: " + count);
	}
	
	
	public void ex18() {
		
		// 2중 for문과 count를 이용해서 아래 모양 출력하기
		
		int count = 1;
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.printf("%3d",count++);
				// 후위 증감 연산이기 때문에 먼저 값을 출력 후 count 값이 1 증가함
			
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	