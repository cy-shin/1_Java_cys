package my.practice.oop.service;

import my.practice.oop.vo.Book;
import my.practice.oop.vo.Books;

// 입/출력 외 주요 작업을 처리할 메서드
public class BookService {
	
	private Book[] bookArr = new Book[10]; 

	public BookService() { // 기본 생성자
		bookArr[0] = new Book("제목", "저자", "위치", "상태", "반납기한"); // 객체배열을 초기화
		bookArr[1] = new Book("제목2", "저자2", "위치2", "상태2", "반납기한2");
		bookArr[2] = new Book("제목3", "저자3", "위치3", "상태3", "반납기한3");
	}
	
	
	/** 제목이라 저자로 책 검색하기
	 * @param select : 검색 시 입력값
	 */
	public Book[] bookSelect(String select) {
		
		Book[] resultArr = new Book[bookArr.length];
		
		int resultIdx = 0;
		
		for(int i=0; i<bookArr.length; i++) {
			if(bookArr[i] == null ) {
				break;
			}
			if(select.equals(bookArr[i].getBookName())) {
				resultArr[resultIdx] = bookArr[i]; 
				resultIdx++;
			}
		}
		if(resultIdx == 0) {
			return null;
		} else {
			return resultArr;
		}
	}
}