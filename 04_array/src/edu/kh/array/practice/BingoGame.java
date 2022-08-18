package edu.kh.array.practice;

import java.util.Scanner;

public class BingoGame {
	// 빙고게임을 만들어 보기
	// 숫자를 섞지 않고 난수를 입력하고 중복을 제거해서 해보기
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("빙고판 크기 지정 : ");
		int width = sc.nextInt();
	
		String[][] bingo = new String[width][width];
	
		int num = 0; // 난수 입력을 위한 정수
		
		// 1 부터 차례대로 빙고판을 채움
		for(int row=0; row<bingo.length; row++) {
			for(int col=0; col<bingo.length; col++) {
				bingo[row][col] = Integer.toString(++num);
			}
		}
		
//		// 임시 출력
//		for(int i=0; i<bingo.length; i++) {
//			for(int j=0; j<bingo[i].length; j++) {
//				System.out.printf("%3s",bingo[i][j]);
//			}
//			System.out.println();
//		}
		
		// 섞기
		for(int row=0; row<bingo.length; row++) {
			for(int col=0; col<bingo.length; col++) {
				int rowRan = (int)(Math.random() * width);
				int colRan = (int)(Math.random() * width);
				
				// 숫자를 무작위로 섞음..
				String temp = bingo[rowRan][colRan];
				bingo[rowRan][colRan] = bingo[row][col];
				bingo[row][col] = temp;
			}
		}

		//		System.out.println("숫자를 섞었습니다.");
		
		// 빙고판 출력
		for(int i=0; i<bingo.length; i++) {
			for(int j=0; j<bingo[i].length; j++) {
				System.out.printf("%s\t",bingo[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("=================== 빙고게임 시작 ====================");
		
		// boolean game = true; // 빙고 3줄이면 false로 바뀜
		
		while(true) {
			int count = 0; // bingo 줄 카운트...
			boolean flagInput = false;
			
			
			System.out.print("정수를 입력하시오 : ");
			String input = sc.next();
			
			System.out.println("================================================");
			
			for(int i=0; i<bingo.length; i++) {
				for(int j=0; j<bingo[i].length; j++) {
					if(bingo[i][j].equals(input)) {
						bingo[i][j] = "★";
						flagInput = true;
					}
				}
			}
			
			// 잘못 입력 시
			if(!flagInput) {
				System.out.println("다시 입력해주세요.");
				continue;
			}
			
			// 빙고 여부 검사
			
			// 가로줄 검사
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
			
			// 세로줄 검사
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
			
			// 대각선1 검사
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
			
			// 대각선 2 검사
			while(true) {
				boolean flag = true;
				for(int j=0; j<bingo[0].length; j++) {
					if(!(bingo[j][width-1-j].equals("★"))) {
						flag = false;
					}
				}
				if(flag) {
					count++;
				}
				break;
			}
			
			// 빙고판 출력
			for(int i=0; i<bingo.length; i++) {
				for(int j=0; j<bingo[i].length; j++) {
					System.out.printf("%s\t",bingo[i][j]);
				}
				System.out.println();
			}
			
			// 빙고 개수 검사
			if(count>=3) {
				// game = false;
				break;
			}
			
			System.out.println(); // 줄바꿈
			System.out.printf("현재 %d빙고", count);
			System.out.println(); // 줄바꿈
		}
		System.out.println();
		System.out.println("*** BINGO!!! ***");
	
	}
}

