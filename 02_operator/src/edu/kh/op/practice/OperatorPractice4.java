package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int score1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int score2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int score3 = sc.nextInt();
		
		// 합계
		int sum = score1 + score2 + score3;
		
		// 평균
		double avg = sum / 3.0;
		
		String result = (score1 >= 40 && score2 >= 40 && score3 >= 40 && avg >=60)?
						"합격" : "불합격";

	
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println(result);
	
	}
}
