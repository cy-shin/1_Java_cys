package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	public static void main(String[] args) {

		// sc.next() : 한 단어 입력, (띄어쓰기 미포함)
		// 			-> 띄어쓰기, 엔터가 입력 종료를 의미
		
		// sc.nextLine() : 한 문장(한 줄) 입력(띄어쓰기 포함)
		//			-> 엔터가 입력 종료를 의미
		// 입력버퍼 때문에 문제가 생길 수 있음..
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next(); 
		// String name = sc.nextLine();
		
		System.out.print("학년(정수) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(정수) : ");
		int classNum = sc.nextInt();
		
		System.out.print("번호(정수) : ");
		int idNum = sc.nextInt();
		
		sc.nextLine(); // 입력 버퍼 맨 앞에 남아있는 엔터(\n)을 사용함
		
		System.out.print("성별(남학생/여학생) : ");
		// String gender = sc.next(); 
		String gender = sc.nextLine(); 
		// 1. nextLine()을 사용했더니 문제가 발생함(입력할 차례인데 넘어가짐)
		// 2. 앞서 번호 입력 단계에서, nextInt() 함수를 따라서 정수를 입력하고 엔터를 누르면 "정수\n"이 입력버퍼에 남는다
		// 3. nextInt()함수가 정수를 꺼내 사용하면 "\n"이 입력버퍼 맨 앞에 남아있게 된다.
		// 4. nextLine()은 "\n"을 종료 시그널로 받아들이기 때문에, 내용을 입력하지 못하고 바로 종료됨
		
		
		// ** 해결 방법 **
		// 입력버퍼 맨 앞에 있는 엔터(개행문자)를 제거해주면 됨
		// 맨 앞에 엔터(개행문자)가 남는 경우 : next(), nextInt() 등 nextLine()을 제외한 모든 Scanner 입력 관련 함수
		// nextLine()을 추가로 적어두면 엔터(\n)를 사용(제거)하면서 이후 nextLine()을 입력했을 때 정상적으로 사용할 수 있게됨..
		
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점입니다.\n", grade, classNum, idNum, name, gender, score);
	}
}
