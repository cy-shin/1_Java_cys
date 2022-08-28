package oop.all.model.vo;

// 책 등록(객체배열까지)
public class OopPractice {
	
	// 멤버변수
	private String bookId; // 청구기호?
	private String bookName; // 책 이름
	private String author; // 저자 이름
	private String publsher; // 출판사명
	private int floor; // 보관중인 층
	private String bookStatus; // 책 상태(대출가능, 대출중, 파손/분실)
	
	// 기본생성자
	public OopPractice() {}
	
	// 매개변수 생성자
	public OopPractice(String bookId, String bookName, String author, String publisher, int floor, String bookStatus) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.publsher = publisher;
		this.floor = floor;
		this.bookStatus = bookStatus;
	}
	
	// getter
	public String getBookId() {
		return bookId;
	}
	
	// setter
	public void setBookId() {
		this.bookId = bookId;
	}
	
	// getter
	public String getBookName() {
		return bookName;
	}
	
	// setter
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	// getter
	public String getAuthor() {
		return author;
	}
	
	// setter
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// getter
	public String getPublisher() {
		return publsher;
	}
	
	// setter
	public void setPublisher(String publisher) {
		this.publsher = publisher;
	}
	
	// getter
	public int getFloor() {
		return floor;
	}
	
	// setter
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	// getter
	public String getBookstatus() {
		return bookStatus;
	}
	
	// setter
	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}
}