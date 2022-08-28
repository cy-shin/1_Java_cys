package oop.all.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import oop.all.model.service.OopPracticeService;
import oop.all.model.vo.OopPractice;

public class OopPracticeView {
	private Scanner sc = new Scanner(System.in);

	OopPracticeService service = new OopPracticeService();
	private int temp = 0;
	private int idx = 0;
	
	public void displayMenu() {
		
		int input = 0;
		
		do {
			System.out.print("---- 도서 관리 프로그램----");
			
			System.out.println();
			System.out.println("-----------------");
			System.out.println("1. 통합 검색");
			System.out.println("2. 대출 반납");
			System.out.println("3. 도서 등록");
			System.out.println("4. 도서 관리");
			System.out.println("0. 종료");
			System.out.println("-----------------\n");
			
			System.out.print("작업 선택 > ");
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1: nameSelect(); break;
			case 2:
				printBookInfo();
				if(temp==0) checkOut();
				break;
			case 3: break;
			case 0: System.out.println("작업을 종료합니다."); break;
			default: System.out.println("잘못된 입력입니다.");
			}
		} while(input!=0);
	}
	
	/**
	 * 도서 통합 검색(제목, 저자, 출판사 입력)
	 */
	public void nameSelect() {
		System.out.print("검색어 입력 > ");
		String input = sc.nextLine();
		
		OopPractice[] resultArr = service.nameSelect(input);
		// service클래스의 nameSelect 메서드를 호출하고 입력값을 인자로 넣음
		if(resultArr == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(int i=0; i<resultArr.length; i++) {
				if(resultArr[i]==null) break;
				System.out.printf("%s / 제목 : %s / 저자 : %s / 출판사 : %s / 위치 : %d층 / 상태 : %s\n",
									resultArr[i].getBookId(),
									resultArr[i].getBookName(),
									resultArr[i].getAuthor(),
									resultArr[i].getPublisher(),
									resultArr[i].getFloor(),
									resultArr[i].getBookstatus());
			}
		}
		System.out.println(); //줄 바꿈
	}
	
	
	/**
	 * 책 정보 출력
	 */
	public void printBookInfo() {
		System.out.print("도서 인덱스 번호 입력 : ");
		try{
			
			idx = sc.nextInt();
			sc.nextLine();
			
			OopPractice[] resultArr = service.printBookInfo(idx);
			
			if(resultArr == null) {
				temp = -1;
				System.out.println("해당 도서를 찾을 수 없습니다. ");
			} else {
				System.out.printf("%s / 제목 : %s / 저자 : %s / 출판사 : %s / 위치 : %d층 / 상태 : %s\n",
						resultArr[idx].getBookId(),
						resultArr[idx].getBookName(),
						resultArr[idx].getAuthor(),
						resultArr[idx].getPublisher(),
						resultArr[idx].getFloor(),
						resultArr[idx].getBookstatus());
				temp = 0;
			}
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력해주세요.");
			sc.nextLine();
			temp = -1;
		} finally {
		}
		
	}
	
	/**
	 * 도서 대출/반납 관리(대출중 <-> 대출가능)
	 */
	public void checkOut() {
		if(temp == 0) {
			String input ="";
			int result = -1;
			try {
				while(true) {
					System.out.print("대출/반납하시겠습니까?(Y/N) : ");
					input = sc.nextLine().toUpperCase();
					if(input.equals("Y") || input.equals("N")) {
						break;
					}
					System.out.println("Y / N 만 입력해주세요. ");
				}
				if(input=="Y") { 
					result = service.checkOut(idx,input);
				}


				switch(result) {
				case -1: System.out.println("취소되었습니다."); break;
				case 0: System.out.println("대출처리 완료"); break;
				case 1: System.out.println("반납처리 완료"); break;
				case 2: System.out.println("도서 관리 메뉴를 이용해주세요.");break;
				}
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다.");
			} finally {
			}
		}
	}
}


