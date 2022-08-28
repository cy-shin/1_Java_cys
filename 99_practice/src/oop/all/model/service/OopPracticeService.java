package oop.all.model.service;


import oop.all.model.vo.OopPractice;

public class OopPracticeService {
	OopPractice o = new OopPractice();
	
	OopPractice[] arr = new OopPractice[10];
	
	// 기본 생성자를 이용하면 멤버변수를 초기화할 수 있음
	public OopPracticeService() {
		arr[0] = new OopPractice("[00000]", "목민심서", "정약용", "1출판사", 1, "대출가능");
		arr[1] = new OopPractice("[00001]", "목민심서", "정약용", "2출판사", 1, "대출중");
		arr[2] = new OopPractice("[00002]", "흠흠신서", "정약용", "1출판사", 1, "파손분실");
		arr[3] = new OopPractice("[00003]", "유배지에서 보낸 편지", "정약용", "3출판사", 2, "대출중");
		arr[4] = new OopPractice("[00004]", "구운몽", "김만중", "3출판사", 3, "대출중");
		arr[5] = new OopPractice("[00005]", "홍길동전", "허균", "3출판사", 3, "대출중");
	}                             
	
	
	public OopPractice[] nameSelect(String input) {
		OopPractice[] resultArr = new OopPractice[arr.length];
		
		int resultIdx = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == null) break;
			if(arr[i].getBookName().equals(input)) {
				resultArr[resultIdx] = arr[i];
				resultIdx++;
			} else if(arr[i].getAuthor().equals(input)) {
				resultArr[resultIdx] = arr[i];
				resultIdx++;
			} else if(arr[i].getPublisher().equals(input)) {
				resultArr[resultIdx] = arr[i];
				resultIdx++;
			}
		}
		
		if(resultIdx == 0) {
			return null;
		} else {
			return resultArr;
		}
		
	}
	public OopPractice[] printBookInfo(int idx) {
		OopPractice[] resultArr = new OopPractice[arr.length];
		
		if(arr[idx] == null) {
			return null;
		}
		else {
			resultArr[idx] = arr[idx];
			return resultArr;
		}
	}

	/** 도서 대출/반납관리
	 * @param idx 책 인덱스 번호
	 * return
	 * -1 : 작업 취소
	 *  0 : 대출가능 -> 대출중
	 *  1 : 대출중 -> 대출가능
	 *  2 : 작업 불가
	 */
	public int checkOut(int idx, String input) {
		if(input=="N") { // N = 작업 취소
			return -1;
		} else {
			// 도서가 대출중인지 아닌지 구분
			if(arr[idx].getBookstatus().equals("대출가능")) {
				arr[idx].setBookStatus("대출중");
				return 0;
			} else if(arr[idx].getBookstatus().equals("대출중")) {
				arr[idx].setBookStatus("대출가능");
				return 1;
			} else {
				return 2;
			}
		}
	}


}
