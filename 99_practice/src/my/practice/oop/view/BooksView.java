package my.practice.oop.view;

import java.util.Scanner;

import my.practice.oop.service.BooksService;
import my.practice.oop.vo.Books;

// view 클래스는 입력, 출력과 관련된 작업을 처리하는 용도
public class BooksView {
	
	private Scanner sc = new Scanner(System.in);
	
	private BooksService service = new BooksService();
	
	
	
	public void displayMenu() {
		
		int input = 0; // 입력
		
		do {
			
			System.out.println("===========");
			System.out.println("1. 도서 검색");
			System.out.println("2. 도서 관리");
			System.out.println("3. 도서 추가");
			System.out.println("0. 종료");
			System.out.println("===========");
			
			System.out.print("메뉴 선택 > ");
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1: this.selectBooks(); break;
			case 2: this.manageBooks(); break;
			case 3: break;
			case 0: System.out.println("종료합니다."); break;
			default : 
				System.out.println("잘못된 입력입니다.");
			}
			
			
		} while(input !=0);
		
	}
	
	
	public void selectBooks() {
		System.out.print("도서 제목 입력 > ");
		String bookName = sc.nextLine();
		
		// 서비스 메서드를 호출
		Books[] resultArr = service.selectBooks(bookName);
		
		if(resultArr==null) {
			System.out.println("\n검색한 내용을 찾을 수 없습니다.");
		} else {
			for(int i=0; i<resultArr.length; i++) {
				if(resultArr[i]==null) {
					break;
				} else {
					System.out.println("\n-------------");
					char lentCh = 'X';
					if(resultArr[i].getLent().equals("Y")) {
						lentCh = 'O';
					}
					System.out.printf("제목 : %s\n저자 : %s\n대출가능 : %s\n반납기한 : %s\n",
									resultArr[i].getBookName(),
									resultArr[i].getAuthor(),
									lentCh,
									resultArr[i].getDueDate());
					System.out.println("-------------\n");
				}
			}
		}
	}
	
	public void manageBooks() {
		System.out.print("도서 제목 입력 > ");
		String bookName = sc.nextLine();
		
		System.out.print("대출/반납 처리(Y/N) > ");
		String lent = sc.next();
		
		int result = service.manageBooks(bookName,lent);
		switch(result) {
		case 1: System.out.println("대출처리되었습니다. ");break;
		case 0: System.out.println("반납처리되었습니다. ");break;
		case -1: System.out.println("책 제목을 확인해주세요. ");break;
		case -2: System.out.println("취소.");break;
		}
	}
}
