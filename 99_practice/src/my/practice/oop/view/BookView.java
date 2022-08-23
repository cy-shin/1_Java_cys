package my.practice.oop.view;

import java.util.Scanner;

import my.practice.oop.service.BookService;
import my.practice.oop.vo.Book;

// 입력 및 출력 작업을 처리하는 클래스
public class BookView {

	BookService service = new BookService(); // 서비스 클래스를 import
	
	private Scanner sc = new Scanner(System.in);
	
	// 화면을 출력할 메서드
	public void displayMenu() {
		int input = 0; // 입력값 0으로 초기화
		
		
		do {
			System.out.println("----------------");
			System.out.println("1. 도서 검색");
			System.out.println("2. 대출/반납");
			System.out.println("3. 도서 관리");
			System.out.println("0. 종료");
			System.out.println("----------------");

			System.out.print("작업 선택 >> ");
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1: bookSelect(); break;
			case 2: break;
			case 3: break;
			case 0: System.out.println("종료합니다."); break;
			default: System.out.println("잘못된 입력입니다.");
			
			}
			
		}while(input!=0);
		
	}
	
	
	/**
	 *  제목이나 저자로 책 검색하기
	 */
	public void bookSelect() {
		System.out.print("제목 또는 저자 입력 > ");
		String select = sc.nextLine();
		
		Book[] resultArr = service.bookSelect(select); // 서비스 메서드를 호출해서 작업을 처리
		
		if(resultArr==null) {
			System.out.println("\n검색한 내용을 찾을 수 없습니다.");
		} else {
			for(int i=0; i<resultArr.length; i++) {
				if(resultArr[i]==null) {
					break;
				} else {
					System.out.println("\n-------------");
					char lentCh = 'X';
					if(resultArr[i].getBookStatus().equals("Y")) {
						lentCh = 'O';
					}
					System.out.printf("제목 : %s\n저자 : %s\n대출가능 : %s\n반납기한 : %s\n",
									resultArr[i].getBookName(),
									resultArr[i].getBookAuthor(),
									lentCh,
									resultArr[i].getBookDueDate());
					System.out.println("-------------\n");
				}
			}
		}
		
		
	}
	
	
}
