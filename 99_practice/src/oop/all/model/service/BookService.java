package oop.all.model.service;

import oop.all.model.vo.Book;
import oop.all.model.vo.OopPractice;

public class BookService {
	
	Book b = new Book();
	
	// 객체 배열 생성
	Book[] arr = new Book[10];
	
	// 기본생성자로 멤버변수인 배열에 기본값 저장
	public BookService() {
		
		arr[0] = new Book("00000", "목민심서", "정약용", "A출판사", "사회", "대출가능");
		arr[1] = new Book("00001", "유배지에서 보낸 편지", "정약용", "B출판사", "사회", "대출가능");
		arr[2] = new Book("00002", "구운몽", "김만중", "C출판사", "문학", "대출중");
		arr[3] = new Book("00003", "홍길동전", "허균", "B출판사", "문학", "대출불가");
		arr[4] = new Book("00004", "목민심서", "정약용", "A출판사", "사회", "대출가능");
		
	}
	
	
	/** 통합검색
	 * @param input
	 * @return 검색한 도서의 객체배열
	 */
	public Book[] bookSelect(String input) {
		// 1. 결과를 저장할 객체배열 생성
		Book[] resultArr = new Book[arr.length];
		int resultArrIdx = 0;
		
		// 2. 검색값이 있는지 확인
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==null) {
				break;
			} else {
				if(arr[i].getBookName().equals(input)) {
					resultArr[resultArrIdx] = arr[i];
					resultArrIdx++;

				} else if(arr[i].getAuthor().equals(input)) {
					resultArr[resultArrIdx] = arr[i];
					resultArrIdx++;

				} else if(arr[i].getPublisher().equals(input)) {
					resultArr[resultArrIdx] = arr[i];
					resultArrIdx++;
				}
			}
		}
		if(resultArrIdx==0) {
			return null;
		} else {
			return resultArr;
		}
	}

	/** 책 정보 출력
	 * @param idx
	 * @return 한줄만 출력
	 */
	public Book[] printBookInfo(int idx) {
		Book[] resultArr = new Book[arr.length];
		
		if(arr[idx] == null) {
			return null;
		}
		else {
			resultArr[idx] = arr[idx];
			return resultArr;
		}
	}
	
	/** 대출반납
	 * @param idx
	 * @param input
	 * @return
	 *  -1 : 작업 취소
	 *   0 : 대출 처리
	 *   1 : 반납 처리
	 *   2 : 작업 불가
	 */
	public int checkOut(int idx, String input) {
		if(input=="N") { // N = 작업 취소
			return -1;
		} else {
			// 도서가 대출중인지 아닌지 구분
			if(arr[idx].getBookStatus().equals("대출가능")) {
				arr[idx].setBookStatus("대출중");
				return 0;
			} else if(arr[idx].getBookStatus().equals("대출중")) {
				arr[idx].setBookStatus("대출가능");
				return 1;
			} else {
				return 2;
			}
		}
	}




	
	/** 도서등록
	 * @param bookId
	 * @param bookName
	 * @param author
	 * @param publisher
	 * @param location
	 * return
	 *  -1 : 목록 초과
	 *   0 : 추가 완료
	 */
	public int bookUpdateOld(String bookId, String bookName, String author, String publisher, String location) {
		int idx = -1;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==null) {
				idx = i;
				break;
			}
		}
		
		if(idx==-1) {
			return -1;
		}
		
		arr[idx] = new Book(bookId, bookName, author, publisher, location, "대출불가");

		return 0;
	}

	/** 도서등록(청구기호 자동생성)
	 * @param bookId
	 * @param bookName
	 * @param author
	 * @param publisher
	 * @param location
	 * return
	 *  -1 : 목록 초과
	 *   0 : 추가 완료
	 */
	public int bookUpdate(String bookName, String author, String publisher, String location) {
		int idx = -1;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==null) {
				idx = i;
				break; // break문 주의
			}
		}
		
		if(idx==-1) {
			return -1;
		}

		String bookId = "";
		
		if(idx<10) {
			bookId = "0000" + idx;
		} else if (idx<100) {
			bookId = "000" + idx;
		} else if (idx<1000) {
			bookId = "00" + idx;
		} else if (idx<10000) {
			bookId = "0" + idx;
		}
		
		
		arr[idx] = new Book(bookId, bookName, author, publisher, location, "대출불가");
		
		return 0;
	}
	
	/** 도서관리
	 * @param idx
	 * @param input
	 * @return
	 */
	public int statusUpdate(int idx, String input) {
		if(input=="N") { // N = 작업 취소
			return -1;
		} else {
			// 도서가 대출불가인지 아닌지 구분
			if(arr[idx].getBookStatus().equals("대출불가")) {
				arr[idx].setBookStatus("대출가능");
				return 0;
			} else if(arr[idx].getBookStatus().equals("대출가능")) {
				arr[idx].setBookStatus("대출불가");
				return 1;
			} else {
				return 2;
			}
		}
	}
}
