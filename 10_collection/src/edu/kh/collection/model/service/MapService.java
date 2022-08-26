package edu.kh.collection.model.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import edu.kh.collection.model.vo.Student;

public class MapService {

	/* Map : key 와 value 한 쌍이 데이터가 되어 이를 모아둔 객체
	 * 
	 * - key : Map에 저장된 데이터를 구분하는 용도
	 * 			-> Set의 특징을 지님(순서 x, 중복 x, equals(), hashCode 오버라이딩 필요)
	 * 
	 * - value : Map에 실제 저장된 값을 의미
	 * 			-> List의 특징을 지님(중복 O)
	 * 
	 */
	
	 
	public void ex1() { // Map 기초 사용법(선언, 추가, 중복확인)
		
		// Map<Key 제네릭, Value 제네릭>
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// Map에 값 추가 : map.put(key, value)
		map.put(1, "홍길동");
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "이길동");
		map.put(5, "박길동");
		map.put(6, "최길동");
		
		// Map의 중복 확인
		// 1) key 중복 -> key가 중복되면 기존 key에 덮어씀
		map.put(1, "홍홍홍");
		
		// 2) value 중복 -> value는 중복을 허용(key로 구별됨)
		map.put(7, "최길동");
		
		System.out.println(map);
		// == System.out.println(map.toString); println에 참조변수를 사용하면 끝에 toString을 적은 것처럼 자동으로 처리됨
	}

	public void ex2() { // Map 용도, 활용1(저장, 출력)
		
		Student std = new Student();

		// Map은 언제 사용하면 좋을까?
		// 1) 재사용이 적은 VO를 대체하는 경우(service.vo)
		// 2) 한번에 다량의 데이터를 전달하는 경우, 데이터의 명확한 구분을 위해 사용
		
		// *** Student vo를 Map으로 바꿔서 사용해보자 ***
		
		Map<String, Object> student = new HashMap<String, Object>();
		
		// 값 추가
		std.setName("홍길동"); // vo
		student.put("name", "홍길동");

		std.setAge(15);
		student.put("age", 15);

		std.setAddress("서울시 중구");
		student.put("address", "서울시 중구");

		std.setGender('남');
		student.put("gender", '남');

		std.setScore(100);
		student.put("score", 100);
		
		System.out.println(std);
		System.out.println(student);
		
		System.out.println("---------- 한 줄씩 출력 ----------");
		// value 각각 얻어와서 출력하기
		// std (vo) : 한 줄씩 가져와야함
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getAddress());
		System.out.println(std.getGender());
		System.out.println(std.getScore());
		
		System.out.println("-------------------------------");
		
		// student(map) : 한 줄씩 가져와도 되지만
		//				  반복문을 사용
		System.out.println( student.get("name"));
		System.out.println( student.get("age"));
		System.out.println( student.get("address"));
		System.out.println( student.get("gender"));
		System.out.println( student.get("score"));
		
		System.out.println("-------------------------------");
		// keySet() : Map에서 key 부분만 추출해서 set 형태로 반환함
		// student.keySet() -> set<String>형태를 반환
		// *** for/while/if 문 작성 시 블럭{ }이 없으면 다음 한줄에만 영향을 미침
		for(String key : student.keySet()) System.out.println(student.get(key));
		
		
		
	}

	public void ex3() { // Map 활용2(TreeSet, TreeMap 등)
		
		// 제네릭 안에 제네릭을 넣을 수 있음
		Map< String, Set<Integer> > map = new TreeMap<>();
											// 타입 추론 적용(자바 11버전부터)
		// 타입 추론 : 참조변수의 제네릭을 보고, 생성되는 컬렉션 객체의 제네릭을 추측함
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("횟수 입력 : ");
		int count = sc.nextInt();
		
		for(int i=1; i<=count; i++) {
			
			// TreeSet응 이용해서 로또번호 생성
			// lotto set 생성
			Set<Integer> lotto = new TreeSet<>(); // 타입 추론 적용됨
			
			while(lotto.size() < 6) {
				int ran = (int)(Math.random() * 45) + 1;
				lotto.add(ran);
				// ran에 Auto Boxing 적용됨
				
			}
			
			// map에 lotto set 저장
			map.put(i + "회", lotto);
		}
		
		// 출력
		// keySet에 저장한 후 꺼냄
		for(String key : map.keySet() ) {
			System.out.println(key + ": " + map.get(key));
		}
	}
	
	
	
	
}
