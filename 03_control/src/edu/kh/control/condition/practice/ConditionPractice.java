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
		// ++윤년을 추가해보기
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("연도를 입력하세요 : ");
		int year = sc.nextInt();
		
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();

		int day;
		
		int flag = 0; // 윤년을 확인하는 용도. 윤년이면 -1, 평년이면 0
		if( year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			flag = -1;
			System.out.println(year + "년은 윤년입니다.");
		}
		
		// 4로 나누어 떨어지면서, 100으로 나누어 떨어지지 않거나 400으로 나눠지는 경우
		
		switch(month) {
		case 2:
			if(flag == -1) {
				day = 29;
			} else {
				day = 28;
			}
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 30; break;
		case 4: case 6: case 9: case 11 :
			day = 31; break;
		default :
			day = 0;
		}
		
		if(day==0) {
			System.out.printf("%d월은 잘못 입력된 달입니다.", month);
		} else {
			System.out.printf("%d년의 %d월은 %d일까지 있습니다.", year, month, day);
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
		
		if(bmi < 18.5) {
			result = "저체중";
		} else if(bmi < 23) {
			result = "정상체중";
		} else if(bmi < 25) {
			result = "과체중";
		} else if(bmi < 30) {
			result = "비만";
		} else {
			result = "고도비만";
		}
		
		System.out.printf("BMI 지수 : %f\n%s", bmi, result);
	}
	
	public void practice5() {
		// ++ 점수 비율을 직접 입력할 수 있게 만들어보기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("================= 점수 입력 =================");
		
		System.out.print("중간 고사 점수 : ");
		double mid = sc.nextInt();

		System.out.print("기말 고사 점수 : ");
		double fin = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		double assignment = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		double attendance = sc.nextInt();
		
		// 입력받은 성적을 비율에 맞게 변경시켜줌
		
		System.out.println("================= 비율 입력 =================");
		System.out.println();
		System.out.print("중간 고사 비율 : ");
		double midRate = sc.nextDouble();

		System.out.print("기말 고사 비율 : ");
		double finRate = sc.nextDouble();
		
		System.out.print("과제 비율 : ");
		double assignmentRate = sc.nextDouble();
		
		
		if(midRate + finRate + assignmentRate == 0.8) {
			
			mid *= midRate;
			fin *= finRate;
			assignment *= assignmentRate;
			
			double score = mid + fin + assignment + attendance;
			
			System.out.println("================= 결과 =================");
			
			if(attendance <= 14) {
				System.out.printf("Fail [출석 횟수 부족 (%.0f/20)]", attendance);
			} else {
				System.out.printf("중간 고사 점수(20) : %.1f\n"
						+ "기말 고사 점수(30) : %.1f\n"
						+ "과제 점수		(30) : %.1f\n"
						+ "출석 점수		(20) : %.1f\n"
						+ "총점 : %.1f\n"
						, mid, fin, assignment, attendance, score);
				
				if(score < 70) {
					System.out.println("Fail [점수 미달]");
				} else {
					System.out.println("PASS");
				}
			}
		} else {
			System.out.println("비율이 적절하지 않습니다.");
		}

		
	

	}
}
