package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.collection.model.vo.Student;

// 기능 제공용 클래스
public class StudentService {
	
	// 부모 타입 참조 변수 List <강한 타입 : Student>
	private List<Student> stdList = new ArrayList<Student>();
												// Student 타입으로 제한된 ArrayList 객체를 생성함

	public StudentService() {
		stdList.add(new Student("남길동", 17, "서울시 강남구", 'M', 80));
		stdList.add(new Student("중길동", 20, "서울시 중구" , 'F', 70));
		stdList.add(new Student("북길동", 19, "서울시 강북구", 'M', 60));;
	}
	/** stdList에 학생 정보 추가 메서드
	 * @param name
	 * @param age
	 * @param address
	 * @param gender
	 * @param score
	 * @return
	 * true : 학생 정보 추가 성공 시
	 * false : 학생 정보 추가 실패 시
	 */
	public boolean addStudent(String name, int age, String address, char gender, int score) {
		
//		// 제네릭 확인 테스트
//		List test1 = new ArrayList();
//		List<String> test2 = new ArrayList<String>();
//		List<Integer> test3 = new ArrayList<Integer>();
//		
//		// List.add(E e)	   -> 기본적인 형식, 제네릭 <E>에 작성되는 타입으로 모든 E가 변화함(=타입 제한)
//		// test1.add(Object e) -> 타입 제한 x, 모든 참조 변수가 object 타입(E 생략시 최상위 타입인 Object가 입력됨)
//		// test2.add(String e) -> 타입 제한 O, 모든 참조 변수가 String 타입
//		// test3.add(Integer e)-> 타입 제한 O, 모든 참조 변수가 Integer 타입
		
		Student std = new Student(name, age, address, gender, score); // Student 객체가 만들어짐
		// 1. 전달받은 값으로 Student 객체를 만들었고
		
		// boolean add(Student e) : add() 결과가 boolean이 반환
		return stdList.add(std); 
		// 2. Student 타입의 stdList(리스트)에 객체를 저장하고
		// 3. 이 값을 view로 반환함
	}
	
	/** 학생 전체 조회 시 stdList 반환 메서드
	 * @return
	 */
	public List<Student> getStdList() {
		return stdList;
	}
	
	
	/** 학생 정보 수정 메서드
	 * @param idx
	 * @param address
	 * @param score
	 * @return
	 * true : 인덱스가 일치하는 학생 정보 수정 성공 시
	 * false : 인덱스가 일치하는 학생이 없음
	 */
	public boolean updatedStudent(int idx, String address, int score) {
		
		// 입력받은 idx가 stdList에 실제 존재하는 요소의 인덱스 범위를 넘어 선 경우 or 음수인 경우
		if( idx >= stdList.size() || idx < 0) {
			return false;
			
		} else {
			stdList.get(idx).setAddress(address); // 입력한 인덱스에 해당하는 Student 리스트의 인덱스 번호에 해당하는 address를 set함
			stdList.get(idx).setScore(score);
			return true;
		}
		
	}
	
	
	/** 학생 정보 제거
	 * @param idx
	 */
	public Student removeStudent(int idx) {
		
		// 일치하는 인덱스가 있으면
		// 해당 학생 정보를 stdList에서 제거하고
		// 제거된 학생 정보를 반환함
		
		// 일치하는 index가 없으면 null 반환
		
		if( idx < 0 || idx >= stdList.size() ) {
			return null;
		} else {
			// 리스트에서 제거된 요소를 반환함
			return stdList.remove(idx);
		}
		
		
	}
}
