package edu.kh.inheritance.model.vo;


public class Student extends Person{
	
	// 자식 클래스 student에
	// 부모 Person 클래스의 멤버, 메소드를 상속
	
	
	// extends :  확장하다
	// -> 자식이 자기의 메머 + 부모의 멤머를 가지고 되어 몸집이 커짐
//	private String name;
//	private int age;
	
	private int grade; // 학년
	private int classRoom; // 반
	
	public Student() {
		//new Person(); Person 객체를 아예 새로 만드는 것
		super(); // super 생성자
		//Person(); 부모 클래스의 생성자는 상속되지 않음
		//그런데, 자식 객체에 부모 객체를 생성하려면(상속) 생성자가 필요함. 그러면 부모 객체를 어떻게 생성할 수 있을까?
		//-> super 생성자를 사용함
		
		// 부모의 생성자를 참조하기 위해서 사용하는 생성자
		// 자식 생성자 내부 첫 번쨰 출에만 작성이 가능함
		
		// -> 자식 생성자 첫 번째 줄에 super()생성자 미 작성 시 컴파일러가 자동 추가
	}
	
	public Student(String name, int age, int grade, int classRoom) {
		this.grade = grade;
		this.classRoom = classRoom;
		
		// this.age() = age;
		// 만약 부모클래스의 멤버변수가 캡슐화되어있다면...
		// 상속받은 자식클래스도 부모클래스의 private 영역에는 직접 접근할 수 없음
		
		//  자식클래스에서 멤버변수를 사용하려면
		
		// 1. getter/setter를 이용
		setName(name);
		setAge(age);
		
		// 2. super() 생성자를 사용함
		// super(name, age);
	}
	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	// Person으로부터 상속을 받은 introduce() 메서드를 재정의하겠음 : 오버라이딩
	
	
	@Override
	public void introduce() {
		// System.out.println("이름 : " + super.getName());
	                                                                         	//								name은 상속받은 멤버변수이며 private이므로 간접접근해야함
		// System.out.println("나이 : " + super.getAge());
		
		super.introduce(); // 오버라이딩 되지 않은, 부모 클래스가 가진 메서드를 introduce()를 호출
		
		System.out.println("학년 : " + this.getGrade());
		System.out.println("반 : " + this.getClassRoom());
		System.out.println("안녕하세요.");
	}
	
	/* Annotation(@) : 컴파일러에게 남기는 메모, 컴파일러용 주석
	 * -> 컴파일러에게 해당 코드가 무엇을 의미하는지, 아니면 해당 코드를 수행하기 전에 무엇을 해야 하는지 알려줌
	 * 
	 * @Override
	 * 1) 컴파일러에게, 해당 메서드는 오버라이딩 되었음을 알림
	 * 2) 오버라이딩이 가능한지, 잘못 작성되지는 않았는지 검사 (오버라이딩을 했는데 에러가 발생 -> 오타, 없는 메서드를 오버라이딩 시도 등)
	 * 
	 * 
	 * */
	
	
	
	
	
	
}
