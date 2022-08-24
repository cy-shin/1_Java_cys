package edu.kh.array.practice;

import java.util.Scanner;

public class BingoGame {
	public static void main(String[] args) {
		// 빙고게임 도전
		// 빙고판을 만들고, 숫자를 1부터 빙고판이 가득 찰 때까지 차례대로 저장한 후, 순서를 섞어서 빙고판을 만듦
	
		Scanner sc = new Scanner(System.in);
		
		// 1. 빙고판 크기 지정
		System.out.print("빙고판 크기 지정 : ");
		int size = sc.nextInt();
	
		// 2. 빙고판에 쓸 배열을 생성함
		String[][] bingo = new String[size][size];
	
		int num = 0; // 숫자 입력을 위한 정수
		
		// 3-1. 1 부터 차례대로 빙고판을 채움
		for(int row=0; row<bingo.length; row++) {
			for(int col=0; col<bingo.length; col++) {
				bingo[row][col] = ++num + ""; // Integer.toString(++num);
				// int타입 num + ""
			}
		}
		
		// 3-2. 섞기
		for(int row=0; row<bingo.length; row++) {
			for(int col=0; col<bingo.length; col++) {
				
				int rowRan = (int)(Math.random() * size);
				int colRan = (int)(Math.random() * size);
				
				String temp = bingo[rowRan][colRan];
				bingo[rowRan][colRan] = bingo[row][col];
				bingo[row][col] = temp;
			}
		}

		
		// 4. 빙고판 출력
		for(int i=0; i<bingo.length; i++) {
			for(int j=0; j<bingo[i].length; j++) {
				System.out.printf("%s\t",bingo[i][j]);
			}
			System.out.println();
		}
		
		// 5. 빙고 게임 시작
		System.out.println("=================== 빙고게임 시작 ====================");
		
		int count; // 빙고 개수 변수
		boolean inputCheck; // 정상 입력 확인 변수
		
		do {
			// 5-1 변수 초기화
			count = 0; 
			inputCheck = false;
			
			// 5-2. 정수 입력받아서 해당 위치 ★로 표시
			System.out.print("정수를 입력하시오 : ");
			String input = sc.next();
			
			for(int i=0; i<bingo.length; i++) {
				for(int j=0; j<bingo[i].length; j++) {
					if(bingo[i][j].equals(input)) {
						bingo[i][j] = "★";
						inputCheck = true; // 정상 입력 확인
					}
				}
			}
			
			// 5-3. 잘못 입력 시
			if(!inputCheck) {
				System.out.println("다시 입력해주세요.");
				continue;
			}
			
			// 6. 빙고 개수 검사
			
			// 6-1. 가로줄 검사
			for(int i=0; i<bingo.length; i++) {
				boolean flag = true;
				for(int j=0; j<bingo[i].length; j++) {
					if(!(bingo[i][j].equals("★"))) {
						flag = false;
					}
				}
				if(flag) {
					count++;
				}
			}
			
			// 6-2. 세로줄 검사
			for(int i=0; i<bingo.length; i++) {
				boolean flag = true;
				for(int j=0; j<bingo[i].length; j++) {
					if(!(bingo[j][i].equals("★"))) {
						flag = false;
					}
				}
				if(flag) {
					count++;
				}
			}
			
			// 6-3. 우하향 대각선 검사
			while(true) {
				boolean flag = true;
				for(int i=0; i<bingo[0].length; i++) {
					if(!(bingo[i][i].equals("★"))) {
						flag = false;
					}
				}
				if(flag) {
					count++;
				}
				break;
			}
			
			// 6-4. 우상향 대각선 검사
			while(true) {
				boolean flag = true;
				for(int j=0; j<bingo[0].length; j++) {
					if(!(bingo[j][size-1-j].equals("★"))) {
						flag = false;
					}
				}
				if(flag) {
					count++;
				}
				break;
			}
			
			// 7. 빙고판 출력
			for(int i=0; i<bingo.length; i++) {
				for(int j=0; j<bingo[i].length; j++) {
					System.out.printf("%s\t",bingo[i][j]);
				}
				System.out.println();
			}
			
			// 7-1. 빙고 개수 확인
			System.out.printf("현재 %d빙고\n", count);
			
			// 7-2. 빙고 개수 검사
			if(count>=3) {
				break;
			}
			
		} while(true);
		
		System.out.println("*** BINGO!!! ***");
	}
}

