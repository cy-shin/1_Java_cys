package my.practice.oop.service;

import my.practice.oop.vo.Books;

public class BooksService {
	
	private Books[] booksArr = new Books[10];
	
	public BooksService() {
		booksArr[0] = new Books("숫타니파타", "작자 미상", "Y", "000000");
		booksArr[1] = new Books("목민심서", "정약용", "Y", "000000");
		booksArr[2] = new Books("어린 왕자", "생텍쥐페리", "Y", "000000");
		booksArr[3] = new Books("구운몽", "김만중", "N", "220901");
	}
	
	// 책 검색
	public Books[] selectBooks(String bookName) {
		Books[] resultArr = new Books[booksArr.length];
		
		int resultIdx = 0;
		
		for(int i=0; i<booksArr.length; i++) {
			if(booksArr[i] == null ) {
				break;
			}
			if(bookName.equals(booksArr[i].getBookName())) {
				resultArr[resultIdx] = booksArr[i]; 
				resultIdx++;
			}
		}
		if(resultIdx == 0) {
			return null;
		} else {
			return resultArr;
		}
	}
	
	// 책 대출, 반납
	public int manageBooks(String bookName, String lent) {
		for(int i=0; i<booksArr.length; i++) {
			if(booksArr[i] == null ) {
				break;
			}
			if(bookName.equals(booksArr[i].getBookName())) {
				if(lent.equals("Y")) {
					if(booksArr[i].getLent().equals("Y")) {
						booksArr[i].setLent("N");
						booksArr[i].setDueDate("220922");
						return 1; // 대출처리
					} else {
						booksArr[i].setLent("Y");
						booksArr[i].setDueDate("000000");
						return 0; // 반납처리
					}
				} else {
					return -2; // 종료
				}
			}
		}
		return -1; // 잘못된 입력
	}
}
