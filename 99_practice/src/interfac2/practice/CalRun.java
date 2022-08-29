package interfac2.practice;

import java.util.Scanner;

public class CalRun {
	public static void main(String[] args) {
		
		MyCalculator cal = new MyCalculator();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 반지름 입력 : ");
		int r = sc.nextInt();
		System.out.println("원의 넓이 : " + cal.circleArea(r));

		System.out.print("수입 입력 : ");
		int income = sc.nextInt();
		System.out.println("납부할 세금 : " + cal.tax(income));
		
		System.out.print("거리(km) 입력 : ");
		double km = sc.nextDouble();
		System.out.println(cal.kmToM(km) + " 마일");
		
		
	}
}
