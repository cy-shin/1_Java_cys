package edu.kh.objectarray.model.service;

import edu.kh.objectarray.model.vo.Student;

// model : 비즈니스 로직(데이터 가공, 관리, DB 연결 등을 담당)
// service : 기능 제공용 클래스
public class StudentManagementService {

	// Student 참조변수 5개를 저장할 수 있는 객체 배열 생성
	private Student[] stdArr = new Student[5];
	
	// 기본 생성자
	public StudentManagementService() {
		stdArr[0] = new Student(3, 5, 17, "홍길동", 100, 30,  70);
		stdArr[1] = new Student(2, 3, 11, "홍길동", 50,  100, 80);
		stdArr[2] = new Student(1, 7,  3, "김미영", 100, 100, 30);
		stdArr[3] = new Student(3, 8,  6, "장원영", 50,  70,  100);
	}
	
	

	// view에 입력한 addStudent의 값을 전달받아 처리하는 메서드
	
	/** 학생 추가 서비스 메서드
	 * @param grade
	 * @param classRoom
	 * @param number
	 * @param name
	 * @return 0 또는 1
	 */
	public int addStudent(int grade, int classRoom, int number, String name) {
		
		// 배열에 addStudent에서 받아온 값을 저장해야 하는데...
		// 먼저 배열의 공간이 비어있는지 아닌지 확인해야 함!
		// 배열 요소 중 아무것도 참조하지 않는 (null) 인덱스를 찾기
		// 단, 모든 인덱스가 배열을 참조하는 경우, 0을 반환함
		
		// null인 인덱스가 있다 -> 해당 인덱스에 객체 주소 대입 후 1을 반환
		// null인 인덱스가 없다 -> 0을 반환함
		
		// null 인덱스 찾기
		int idx = -1; // null인 인덱스가 몇 번째인지 저장하는 용도의 변수

		for(int i=0; i<stdArr.length; i++) {
			if(stdArr[i] == null) { // null인 경우 = 빈자리가 있다 = 새 학생을 추가할 수 있음
				idx = i;
				break;

			}
		}
		
		if(idx == -1) { // null인 인덱스가 없는 경우
			return 0; // 현재 메서드를 종료하고 호출한 곳으로 돌아간다. 0을 가지고.
		}
		// ==================================================================//
		
		// null인 인덱스에 학생 객체를 생성해서 주소를 대입
		stdArr[idx] = new Student(grade, classRoom, number, name);
		
		return 1;
	}
	
	// stdArr의 getter를 만들어서 view로 반환
	public Student[] getStdArr() {
		return stdArr;
	}
	
	/** 학생 1명 정보 조회(인덱스) 서비스 메서드
	 * @param idx(검색할 인덱스 번호)
	 * @return idx값에 따른 결과(문자열)
	 */
	public String selectIndex(int idx) {
		// stdArr의 인덱스 범위 : 0 ~ 4
		if(idx < 0 || idx >= stdArr.length) { // 범위 초과 시
			return "입력된 값이 인덱스 범위를 초과했습니다.";
		} else {
			if(stdArr[idx]==null) { // null을 참조하는 인덱스인 경우
			return "해당 인덱스에 학생 정보가 존재하지 않습니다.";
			} else { // 범위 초과도 아니고, null도 아님 == 학생 정보가 존재함
				String str = "이름	: " + stdArr[idx].getName();
					   str += "\n학년	: " + stdArr[idx].getGrade();
					   str += "\n반	: " + stdArr[idx].getClassRoom();
					   str += "\n번호	: " + stdArr[idx].getNumber();
					   str += "\n국어	: " + stdArr[idx].getKor() + "점";
					   str += "\n영어	: " + stdArr[idx].getEng() + "점";
					   str += "\n수학	: " + stdArr[idx].getMath() + "점";
				
				return str;
			}
		}
	}
	
	
	/** 학생 정보 조회(이름) 서비스 메서드
	 * @param name (입력받은 이름)
	 * @return 
	 * null : 검색 결과가 없음
	 * resultArr(null 아님) : 검색 결과가 있음
	 */
	public Student[] selectName(String name) {
		
		// stdArr 객체 배열의 각 인덱스가 참조하는 Student 객체가 있음.
		// student 객체의 필드 값 중 name과 입력받은 name이 일치하면
		// 해당 Student 객체의 주소를 별도 객체 배열에 저장해서 메서드 종료시 반환
		
		// 검색 결과 저장용 객체 배열
		Student[] resultArr = new Student[stdArr.length];
		
		
		// resultArr에서 값을 대입할 인덱스 번호를 나타내는 변수~
		int resultIdx = 0;
		
		// stdArr 배열에 순차접근 하려고 함
		for(int i=0; i<stdArr.length; i++) {
			
			if(stdArr[i] == null) {
				break; // 반복 종료
			}
			
			// 학생 이름.equals(입력 이름)
			if(name.equals(stdArr[i].getName())) {
				resultArr[resultIdx] = stdArr[i];
				resultIdx++;
				// 대입되는 인덱스(resultIdx)를 다음으로 이동시키겠다
			}
		}
		
		// 검색할 수 없는 경우
		if(resultIdx == 0) {
			return null;
		} else {
			return resultArr;
		}
		
//		boolean flag = false; // 검색 결과가 있으면 true 없으면 false;
//		String str = "";
//		
//		for(int i=0; i<stdArr.length; i++) {
//			String temp = "";
//			if(stdArr[i] == null) {
//				break;
//			}
//			if(name.equals(stdArr[i].getName())) {
//				flag = true;
//				temp += "\n------------------";
//				temp += "\n이름	: " + stdArr[i].getName();
//				temp += "\n학년	: " + stdArr[i].getGrade();
//				temp += "\n반	: " + stdArr[i].getClassRoom();
//				temp += "\n번호	: " + stdArr[i].getNumber();
//				temp += "\n국어	: " + stdArr[i].getKor() + "점";
//				temp += "\n영어	: " + stdArr[i].getEng() + "점";
//				temp += "\n수학	: " + stdArr[i].getMath() + "점";
//				temp += "\n------------------\n";
//			} 
//			str += temp;
//		}
//		
//		if(!flag) {
//			str = "해당하는 학생을 찾을 수 없습니다.";
//		}
//		
//		return str;
		
	}
	
	/** 학생 정보 수정 서비스 메서드
	 * @param idx
	 * @param kor
	 * @param eng
	 * @param math
	 * @return
	 * -1 : idx가 stdArr 배열의 범위를 초과한 경우
	 *  0 : stdArr[i] == null 인 경우
	 *  1 : 정상적으로 수정이 된 경우
	 * 
	 */
	public int updateStudent(int idx, int kor, int eng, int math) {
		if(stdArr[idx] == null) {
			System.out.println("해당 인덱스에 학생 정보가 존재하지 않습니다.");
			return 0;
			
		} else if(idx >= stdArr.length) {
			
			return -1;
			
		} else {
			
			stdArr[idx].setKor(kor); // setter에 값을 대입하여 값을 변경
			stdArr[idx].setEng(eng);
			stdArr[idx].setMath(math);
			
			return 1;
		}
		
	}
}
