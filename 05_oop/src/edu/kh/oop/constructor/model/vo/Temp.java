package edu.kh.oop.constructor.model.vo;

public class Temp {

		private int num;
		private String name;
		
		// 생성자
		
		// 1. 생성자가 하나도 작성되지 않으면, 컴파일러가 기본 생성자를 추가해줌
		// 2. 매개변수 생성자가 작성되어 있으면, 컴파일러가 기본 생성자를 추가해주지 않음
		//	  따라서 매개변수 생성자를 사용하는 경우 기본 생성자도 반드시 작성
		// >>> 기본 생성자는 왠만해선 작성해줄것
		
		
		// 기본 생성자
		public Temp() { }
		
		
		
		// 매개변수 생성자
		public Temp(int num, String name) {
			this.num = num;
			this.name = name;
			
		}


}
