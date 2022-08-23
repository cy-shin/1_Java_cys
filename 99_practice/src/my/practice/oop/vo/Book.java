package my.practice.oop.vo;

// 객체를 저장할 클래스
public class Book {

	// 멤버변수
	private String bookName; // 도서 제목
	private String bookAuthor; // 도서 저자
	private String bookLocate; // 도서 위치 (1층, 2층, 3층)
	private String bookStatus; // 도서 상태 (파손, 분실, 대출가능, 대출중)
	private String bookDueDate; // 도서 반납기한
	
	// 기본생성자
	public Book() {
	
		
	}
	
	// 매개변수 생성자 (alt + shift + s -> r)
	public Book(String bookName, String bookAuthor, String bookLocate, String bookStatus, String bookDueDate) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookLocate = bookLocate;
		this.bookStatus = bookStatus;
		this.bookDueDate = bookDueDate;
	}
	
	
	// getter / setter (alt + shift + s -> o)
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookLocate() {
		return bookLocate;
	}

	public void setBookLocate(String bookLocate) {
		this.bookLocate = bookLocate;
	}

	public String getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}

	public String getBookDueDate() {
		return bookDueDate;
	}

	public void setBookDueDate(String bookDueDate) {
		this.bookDueDate = bookDueDate;
	}
	
	
}
