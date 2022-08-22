package my.practice.oop.vo;

// 객체를 저장하는 클래스
public class Books {
	
	private String bookName;
	private String author;
	private String lent;
	private String dueDate;
	
	// 기본 생성자
	public Books() {}
	
	// 매개변수 생성자
	public Books(String bookName, String author, String lent, String dueDate) {
		
		this.bookName = bookName;
		this.author = author;
		this.lent = lent;
		this.dueDate = dueDate;
		
	}
	
	
	// getter / setter
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLent() {
		return lent;
	}

	public void setLent(String lent) {
		this.lent = lent;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	 
	 
}
