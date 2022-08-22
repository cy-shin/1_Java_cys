package edu.kh.objectarray.model.vo;

// 값 저장용 클래스 (객체로 만들어진 후 값을 저장하는 용도의 객체로 사용함... 데이터관리)
public class Student {
	
	// 멤버변수(필드)
	private int grade; // 학년
	private int classRoom; // 반
	private int number; // 번호
	private String name; // 이름
	
	private int kor; // 국어 점수
	private int eng; // 영어 점수
	private int math; // 수학 점수
	
	// 생성자
	public Student() {}
	
	// 매개변수 생성자
	// 위에서 생성한 기본생성자와 이름이 중복되지만, 매개변수가 달라서 오류가 발생하지 않는다 => 오버로딩
	public Student(int grade, int classRoom, int number, String name) {
		
		// this. 참조변수
		this.grade = grade;
		this.classRoom = classRoom;
		this.number = number;
		this.name = name;
		
	}
	
	// 위에서 생성한 매개변수 생성자와 이름이 중복되지만, 매개변수가 달라서 오류가 발생하지 않는다 => 오버로딩
	public Student(int grade, int classRoom, int number, String name, int kor, int eng, int math) {
		
		// this.grade = grade;
		// this.classRoom = classRoom;
		// this.number = number;
		// this.name = name;
		
		// this() 생성자
		this(grade, classRoom, number, name);
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	// getter : 값을 반환함, 매개변수가 없고 반환형이 있음
	public int getGrade() {
		return grade;
	}
	
	// setter : 값을 가져와서 초기화함
	public void setGrade(int grade) {
		this.grade = grade;
		// 현재 객체의 멤버변수 grade에 매개변수 grade의 값을 대입함
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	// alt + shift + s 또는 source 메뉴
	// -> r 또는 generate getters and setters
	
	
}
