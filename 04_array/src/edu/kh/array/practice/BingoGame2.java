package edu.kh.array.practice;

import java.util.Scanner;

public class BingoGame2 {
	public static void main(String[] args) {
		// 빙고게임 도전
		// 난수를 배치하고 중복을 제거하는 방식으로 만들어보기 
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 빙고판 크기를 지정
		System.out.print("빙고판 크기 지정 : ");
		int size = sc.nextInt(); // size : 빙고판의 크기를 저장할 변수
		
		// 2-1. 빙고판에 쓸 배열을 생성함
		String[][] bingoArr = new String[size][size];
		
		// 2-2. 빙고판 초기화
		for(int i=0; i<bingoArr.length; i++) {
			for(int j=0; j<bingoArr[i].length; j++) {
				bingoArr[i][j] = "";
			}
		}
		
		// 3. 빙고판에 난수 입력
		int row = 0;
		int col = 0;
		
		while(!(row==bingoArr.length)) {
			
			// 3-1. 난수 생성
			int ran = (int)(Math.random() * (size * size)) + 1;
			String ranStr = Integer.toString(ran);
			
			// 3-2. 중복을 확인할 flag
			boolean flag = true;
			
			// 3-3. 검사 반복문
			for(int i=0; i<bingoArr.length; i++) {
				for(int j=0; j<bingoArr[0].length; j++) {
					
					// 3-4. 중복값이 있으면 flag = false;
					if(bingoArr[i][j].equals(ranStr)) {
						flag = false;
					}
				}
			}
			
			// 3-5. flag 확인해서 중복이 없으면
			if(flag) {
				bingoArr[row][col] = ranStr;
				col++;
				if(col == bingoArr[0].length) {
					col = 0;
					row++;
				}
			}
		}

		// 4. 빙고판이 잘 작성되었는지 확인 및 출력
		for(int i=0; i<bingoArr.length; i++) {
			for(int j=0; j<bingoArr[i].length; j++) {
				System.out.printf("%s\t",bingoArr[i][j]);
			}
			System.out.println();
		}
		
		int bingo; // 빙고 개수 변수
		boolean inputCheck; // 정상 입력 확인 변수
		
		// 5. 빙고 게임 시작
		System.out.println("============== 빙고 게임 시작 ===============");
		do {
			// 5-1. 변수 초기화
			bingo = 0;
			inputCheck = false;
			
			// 5-2. 정수 입력받아서 해당 위치 ★로 표시
			System.out.print("정수를 입력해주세요 : ");
			String input = sc.next();
			
			for(int i=0; i<bingoArr.length; i++) {
				for(int j=0; j<bingoArr[i].length; j++) {
					if(input.equals(bingoArr[i][j])) {
						bingoArr[i][j] = "★";
						inputCheck = true; // 정상 입력 확인
					}
				}
			}
			
			// 5-3. 잘못 입력 시
			if(!inputCheck) {
				System.out.println("다시 입력해주세요.");
				continue;
			}
			
			// 5-4. 빙고판 출력
			for(int i=0; i<bingoArr.length; i++) {
				for(int j=0; j<bingoArr[i].length; j++) {
					System.out.printf("%s\t",bingoArr[i][j]);
				}
				System.out.println();
			}

			// 6. 빙고 개수 검사
			
			// 6-1. 가로줄 검사
			for(int i=0; i<bingoArr.length; i++) {
				int count = 0;
				for(int j=0; j<bingoArr[i].length; j++) {
					if(bingoArr[i][j].equals("★")) {
						count++;
					}
				}
				if(count==size) {
					bingo++;
				}
			}
			
			// 6-2. 세로줄 검사
			for(int i=0; i<bingoArr.length; i++) {
				int count = 0;
				for(int j=0; j<bingoArr[i].length; j++) {
					if(bingoArr[j][i].equals("★")) {
						count++;
					}
				}
				if(count==size) {
					bingo++;
				}
			}
			
			// 6-3. 우하향 대각선 검사
			while(true) {
				int count = 0;
				for(int i=0; i<bingoArr.length; i++) {
					if(bingoArr[i][i].equals("★")) {
						count++;
					}
				}
				if(count==size) {
					bingo++;
				}
				break;
			}
			
			// 6-4. 우상향 대각선 검사
			while(true) {
				int count = 0;
				for(int i=0; i<bingoArr.length; i++) {
					if(bingoArr[i][bingoArr.length - 1 - i].equals("★")) {
						count++;
					}
				}
				if(count==size) {
					bingo++;
				}
				break;
			}
			
			// 7. 빙고 개수 확인
			System.out.printf("현재 %d빙고\n", bingo);
			
			// 7-1. 3개 이상이면 Bingo 출력
			if(bingo>=3) {
				System.out.println("***** BINGO!!! *****");
			}
			
		  // 7-2. 3개 이상이면 반복문 종료
		} while(bingo<3);
		
	}
}
