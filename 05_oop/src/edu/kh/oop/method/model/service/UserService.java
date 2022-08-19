package edu.kh.oop.method.model.service;

import edu.kh.oop.method.model.vo.User;

public class UserService {
	
	
	// 회원 가입 서비스 메서드
	public User signUp(String userId, String userPw, 
			           String userName, int userAge, char userGender) {
	// 반환형에 클래스(User)를 적었음
	// == 반환되는 값이 해당 클래스를 이용해서 만들어진 객체의 주소 값
		
		// 기본 생성자를 이용해서 User 객체를 생성
		User u = new User();
		
		// setter를 이용해서 매개변수로 전달 받은 값을 세팅
		u.setUserId(userId);
		u.setUserPw(userPw);
		u.setUserName(userName);
		u.setUserAge(userAge);
		u.setUserGender(userGender);
		
		return u; // User 객체의 시작 주소를 반환
	}
	
	// 로그인 서비스 메서드
	public int login(String id, String pw, User user) {
		// 입력된 id, pw에다가 가입한 회원정보를 가지고 있는 객체의 주소
		
		// 회원가입을 안하고 로그인을 시도하는 경우
		if(user == null) {
			return -1; // 회원가입 해주세요
			
		} else { // 가입은 했음
			
			// id 및 pw 비교
			if(user.getUserId().equals(id) && user.getUserPw().equals(pw)) {
				// id 및 pw 모두 일치함 = 로그인 성공
				return 1; // 로그인 성공
				
			} else {
				// id pw 중 하나라도 다른게 있음
				return 0; // 로그인 실패
			}
		}
	}
	
	// 회원정보 수정 서비스
	public void updateUser(String name, int age, char gender, User loginUser) {
		loginUser.setUserName(name);
		loginUser.setUserAge(age);
		loginUser.setUserGender(gender);
	}
	
}
