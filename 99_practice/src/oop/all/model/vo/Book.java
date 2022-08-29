package oop.all.model.vo;

public class Book {
	
	// 멤버변수 선언
	private String bookId;
	private String bookName;
	private String author;
	private String publisher;
	private String location;
	private String bookStatus;
	
	
	// 기본생성자 작성
	public Book() {
		
	}
	
	// 매개변수 생성자 작성
	public Book(String bookId, String bookName, String author, String publisher, String location, String bookStatus) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.location = location;
		this.bookStatus = bookStatus;
	}
	
	// getter - setter 작성
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookId() {
		return bookId;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookName() {
		return bookName;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublisher() {
		return publisher;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation() {
		return location;
	}
	
	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}
	public String getBookStatus() {
		return bookStatus;
	}
	
}
