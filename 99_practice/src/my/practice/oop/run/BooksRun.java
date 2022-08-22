package my.practice.oop.run;

import my.practice.oop.view.BooksView;

// 실행을 위한 클래스
public class BooksRun {
	public static void main(String[] args) {
		BooksView view = new BooksView();
		
		view.displayMenu();
	}
}
