package my.practice.oop.service;

import my.practice.oop.vo.Books;

public class BooksService {
	
	private Books[] booksArr = new Books[10];
	
	public BooksService() {
		booksArr[0] = new Books("책1", "저자", 0, "000000");
		booksArr[1] = new Books("책2", "만해", 0, "000000");
		booksArr[2] = new Books("책", "정도", 1, "220822");
		booksArr[3] = new Books("책4", "원흥", 0, "000000");
		booksArr[4] = new Books("책2", "명진", 0, "000000");
	}
	
	
	
	
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
}
