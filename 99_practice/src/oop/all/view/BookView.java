package oop.all.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import oop.all.model.service.BookService;
import oop.all.model.vo.Book;
import oop.all.model.vo.OopPractice;

public class BookView {
	BookService service = new BookService();
	
	private Scanner sc = new Scanner(System.in);
	private int idx = 0;
	private int temp = 0;
	
	
	
	public void displayMenu() {
		int input = 0;
		
		do {
			System.out.println("---- 도서 관리 프로그램 ----");
			System.out.println("1. 통합검색");
			System.out.println("2. 대출반납");
			System.out.println("3. 도서등록");
			System.out.println("4. 도서관리");
			System.out.println("0. 종료");
			System.out.println("-----------------------");
			System.out.print("메뉴 선택 > ");
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1: bookSelect(); break;
			case 2: 
				printBookInfo(); 
				if(temp==0) checkOut();
				break;
			case 3: bookUpdate(); break;
			case 4: 
				printBookInfo(); 
				if(temp==0) statusUpdate(); 
				break;
			case 0: System.out.println("종료합니다"); break;
			default: System.out.println("잘못 입력하셨습니다. ");
			
			}
		} while(input!=0);
	}
	

	/**
	 * 1. 통합검색
	 */
	public void bookSelect() {
		System.out.print("검색어 입력 > ");
		String input = sc.nextLine();
		
		// 서비스 메서드에서 가져온 객체를 저장할 객체배열 선언
		Book[] resultArr = service.bookSelect(input);
		System.out.println("  청구기호  |        제목        |        저자        |        출판사        |  보관장소  |  도서상태  ");
		
			if(resultArr == null) {
				System.out.println("검색 결과가 없습니다. ");
			} else {
				for(int i=0; i<resultArr.length; i++) {
					if(resultArr[i]==null) break;
					System.out.printf("  %s  |%10s       |%10s        |%11s        |    %s   |   %s    \n"
										, resultArr[i].getBookId()
										, resultArr[i].getBookName()
										, resultArr[i].getAuthor()
										, resultArr[i].getPublisher()
										, resultArr[i].getLocation()
										, resultArr[i].getBookStatus());
				}
			
		}
	}

	/**
	 *  책 정보 출력
	 */
	public void printBookInfo() {
		System.out.print("도서 인덱스 번호 입력 : ");
		try{
			
			idx = sc.nextInt();
			sc.nextLine();
			
			Book[] resultArr = service.printBookInfo(idx);
			
			if(resultArr == null) {
				temp = -1;
				System.out.println("해당 도서를 찾을 수 없습니다. ");
			} else {
				System.out.printf("%s / 제목 : %s / 저자 : %s / 출판사 : %s / 위치 : %s / 상태 : %s\n",
						resultArr[idx].getBookId(),
						resultArr[idx].getBookName(),
						resultArr[idx].getAuthor(),
						resultArr[idx].getPublisher(),
						resultArr[idx].getLocation(),
						resultArr[idx].getBookStatus());
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
	 *  2. 대출반납
	 */
	public void checkOut() {
		if(temp == 0) {
			String input ="";
			int result = -2;
			try {
				while(true) {
					System.out.print("대출/반납하시겠습니까?(Y/N) : ");
					input = sc.nextLine().toUpperCase();
					if(input.equals("Y") || input.equals("N")) {
						break;
					}
					System.out.println("Y / N 만 입력해주세요. ");
				}
				if(input.equals("Y")) { 
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

	/**
	 *  3. 도서등록
	 */
	public void bookUpdateOld() {
		System.out.println("[도서 등록]");
		System.out.print("청구기호 : ");
		String bookId = sc.nextLine();
		System.out.print("제목 : ");
		String bookName = sc.nextLine();
		System.out.print("저자 : ");
		String author = sc.nextLine();
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		System.out.print("보관장소 : ");
		String location = sc.nextLine();
		
		int result = service.bookUpdateOld(bookId, bookName, author, publisher, location);
		
		if(result==-1) {
			System.out.println("[System] : 목록 초과");
		}
		
		if(result==0) {
			System.out.println("도서가 추가되었습니다. ");
		}
	}
	
	/**
	 *  3. 도서등록
	 */
	public void bookUpdate() {
		System.out.println("[도서 등록]");
		System.out.print("제목 : ");
		String bookName = sc.nextLine();
		System.out.print("저자 : ");
		String author = sc.nextLine();
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		System.out.print("보관장소 : ");
		String location = sc.nextLine();
		
		int result = service.bookUpdate(bookName, author, publisher, location);
		
		if(result==-1) {
			System.out.println("[System] : 목록 초과");
		}
		
		if(result==0) {
			System.out.println("도서가 추가되었습니다. ");
		}
	}

	/**
	 *  4. 도서관리
	 */
	public void statusUpdate() {
		if(temp == 0) {
			String input ="";
			int result = -1;
			try {
				while(true) {
					System.out.print("도서 상태를 변경하시겠습니까?(Y/N) : ");
					input = sc.nextLine().toUpperCase();
					if(input.equals("Y") || input.equals("N")) {
						break;
					}
					System.out.println("Y / N 만 입력해주세요. ");
				}
				if(input.equals("Y")) { 
					result = service.statusUpdate(idx,input);
				}


				switch(result) {
				case -1: System.out.println("취소되었습니다."); break;
				case 0: System.out.println("대출가능 처리 완료"); break;
				case 1: System.out.println("대출불가 처리 완료"); break;
				case 2: System.out.println("대출 반납 메뉴를 이용해주세요.");break;
				}
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다.");
			} finally {
			}
		}
	}

}
