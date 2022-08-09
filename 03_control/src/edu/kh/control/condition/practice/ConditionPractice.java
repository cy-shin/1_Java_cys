package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		String result;
		
		if(num <= 0) {
			result = "양수만 입력해주세요.";
		} else if(num % 2 == 0) {
			result = "짝수입니다.";
		} else {
			result = "홀수입니다.";
		}
		
		System.out.println(result);
			
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		// 합계
		int sum = kor + eng + math;
		
		// 평균
		double avg = sum / 3.0; // double형 리터럴 3.0으로 나누어서 결과값도 double형이 된다

		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균 : %.1f\n"
					+ "축하합니다, 합격입니다!", kor, math, eng, sum, avg);
		} else {
			System.out.printf("불합격입니다.");
		}
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		int day;
		
		switch(month) {
		case 2:
			day = 28; break;
		case 1: case 3: case 5: case 7: case 9: case 11:
			day = 30; break;
		case 4: case 6: case 8: case 10 : case 12:
			day = 31; break;
		default :
			day = 0;
		}
		
		if(day==0) {
			System.out.printf("%d월은 잘못 입력된 달입니다.", month);
		} else {
			System.out.printf("%d월은 %d일까지 있습니다.", month, day);
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();

		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		String result;
		
		if(bmi<18.5) {
			result = "저체중";
		} else if(bmi<23) {
			result = "정상체중";
		} else if(bmi<25) {
			result = "과체중";
		} else if(bmi<30) {
			result = "비만";
		} else {
			result = "고도비만";
		}
		
		System.out.printf("BMI 지수 : %f\n%s", bmi, result);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int midRaw = sc.nextInt(); // 중간고사 원점수
		double mid = midRaw * 0.2; // 중간고사 원점수 * 가중치

		System.out.print("기말 고사 점수 : ");
		int finRaw = sc.nextInt(); // 기말고사 원점수
		double fin = finRaw * 0.3; // 기말고사 원점수 * 가중치
		
		System.out.print("과제 점수 : ");
		int assignmentRaw = sc.nextInt(); // 과제 원점수
		double assignment = assignmentRaw * 0.3; // 과제 원점수 * 가중치
		
		System.out.print("출석 횟수 : ");
		int attendanceRaw = sc.nextInt(); // 출석 횟수
		double attendance = attendanceRaw * 1.0; // 출석 횟수 * 가중치
		
		double score = (mid) + (fin) + (assignment) + (attendance);
		
		int check = 0; // 출석 횟수가 미달인지 아닌지 확인 (-1이면 미달)
		
		String result;
		
		if(attendance <= 14) {
			check = -1; // 출석 횟수 미달인 경우 check를 -1로 바꿈
			result = "Fail";
		} else if(score < 70) {
			result = "Fail [점수 미달]";
		} else {
			result = "PASS";
		}
		
		System.out.println("================= 결과 =================");
		
		if(check == -1) {
			System.out.printf("%s [출석 횟수 부족 (%d/20)]", result, attendanceRaw);
		}

		if(check == 0) {
			
			System.out.printf("중간 고사 점수(20) : %.1f\n"
							+ "기말 고사 점수(30) : %.1f\n"
							+ "과제 점수		(30) : %.1f\n"
							+ "출석 점수		(20) : %.1f\n"
							+ "총점 : %.1f\n"
							+ "%s"
							, mid, fin, assignment, attendance, score, result);
		}
	}
}
