package edu.kh.array.ex;

import java.util.Scanner;

public class ArrayExample2 {
	
	// 변수
		// 메모리 상에 값을 저장할 수 있는 공간을 할당
		// (1개 자료형, 1개 데이터)
	
	// 1차원 배열
		// 자료형이 같은 변수를 묶음으로 다루는 것
		// (1개 자료형, n개 데이터)
	
	// 2차원 배열
		// 자료형이 같은 1차원 배열을 묶음으로 다루는 것
		// 2차원 배열 == 1차원 배열 참조 변수의 묶음
		// (1개 자료형, n개 데이터)
	
	// 가변 배열
	
	
	
//	public void ex99() {
//		// 빙고
//		Scanner sc = new Scanner(System.in);
//		System.out.println("몇 칸? : ");
//		int a = sc.nextInt();
//		
//		String[][] bingo = new String[a][a];
//		
//		for(int i=0; i<bingo.length; i++) {
//			for(int j=0; j<bingo[i].length; j++) {
//				
//				int ran = (int)(Math.random() * (a*a))+1;
//				bingo[i][j] = Integer.toString(ran); 
//			}
//		}
//		
//			// 중복값 제거할 수 있게 만들기
//		
//	}

	public void ex1() {
		// 2차원 배열의 선언 및 할당
		int[][] arr = new int[2][3];
		
		// 인덱스를 이용한 초기화 
		arr[0][0] = 7;
		arr[0][1] = 15;
		arr[0][2] = 20;
		
		arr[1][0] = 30;
		arr[1][1] = 41;
		arr[1][2] = 45;
		
		// *** 2차원 배열 행의 길이
		System.out.println("행 : " + arr.length);
		
		// *** 2차원 배열 열의 길이
		System.out.println("열 : " + arr[0].length); // arr[0] 인덱스가 참조하고 있는 1차원 배열의 길이~
		
		// for문을 이용한 순차 접근
		for(int row = 0; row <arr.length; row++) {
			
			for(int col = 0; col <arr[row].length; col++) {
				System.out.printf("%d행 %d열 == %d \n", row, col, arr[row][col]);
			}
			System.out.println();
		}
		
	
	
	}
	
	public void ex2() {
		// 2차원 배열 선언과 동시에 초기화
		
		char[][] arr = { 
						 {'a','b','c'},
						 {'d','e','f'},
						 {'g','h','i'}
					   };
		
		// 1. char 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 알파벳을 입력해주세요 : ");
		
		char input = sc.next().charAt(0);
		
		// Scanner는 char 자료형 입력을 지원하지 않는다...
		// 문자열.charAt(i) : 문자열의 i번째 인덱스에 위치한 문자 하나를 얻어옴
		
		boolean flag = true; // 검색 결과 없음 = true / 검색 결과 있음 = false
		
		// 2. 2차원 배열 안에서 검색하기
		for(int row = 0; row<arr.length; row++) {
			for(int col = 0; col<arr[row].length; col++) {
				if(arr[row][col] == input) {
					System.out.printf("%c는 %d행 %d열에 존재합니다...\n", input, row, col);
					flag = false; // 값 발견 시 false
					
				}
			}
		}
		
		if(flag) {
			System.out.println("일치하는 알파벳이 없습니다.");
			
		}
		
	}
	
	public void ex3() {
		
		// 3행 3열짜리 int 2차원 배열에 난수(0~9)를 대입
		// 단, 마지막 행/열은 각 행/열의 합
		// 마지막 행, 마지막 열은 전체 난수의 합
		
		// 1  5  7 13
		// 1  9  8 18
		// 2 14 15 31
		
		int[][] arr = new int[3][3];
		
		for(int row = 0; row<arr.length-1; row++) {
			for(int col=0; col<arr[row].length-1; col++) {
				int ran = (int)(Math.random() * 10);
				arr[row][col] = ran;
				
				// 각 행의 마지막 열
				arr[row][arr[row].length-1] += ran; // 생성된 난수 누적
				
				// 각 열의 마지막 행
				arr[arr.length-1][col] += ran; // 생성된 난수 누적
				
				// 마지막 행, 마지막 열
				arr[arr.length-1][arr[row].length-1] += ran;
			}
		}

		
		for(int row = 0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				System.out.printf("%3d", arr[row][col]);
			}
			System.out.println();
		}
		
		
		
	}

	public void ex4() {
		// 가변 배열
		// - 2차원 배열 할당 시
		//   마지막 배열 차수(열)의 크기를 지정하지 않고 할당
		
		
		// - 할당 이후 각 행에 각각의 1차원 배열을 참조하게 만듦
		
		
		int[][] arr = new int[5][]; // 행의 크기는 5로 지정하고 열의 크기는 지정하지 않았음
		
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[5];
		arr[3] = new int[2];
		arr[4] = new int[1];
		
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				System.out.print(arr[row][col] +" ");
			}
			System.out.println(); // 줄바꿈
		}
	}





}
