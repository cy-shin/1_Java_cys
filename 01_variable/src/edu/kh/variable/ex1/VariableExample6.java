package edu.kh.variable.ex1;

//자바측에서 미리 만들어둔 Scanner 기능을 가져옴
import java.util.Scanner;
//해당 클래스에서 사용 가능하게 만듦
//*사용하지 않고 있으면 노란 밑줄이 쳐짐



public class VariableExample6 {

	// 메인 메서드
	public static void main(String[] args) {
		
								
		// Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게 하는 역할
		
		// 1) class 위에 import java.util.Scanner; 를 작성
		
		// 2) 얻어온 Scanner 생성
		Scanner sc = new Scanner(System.in);
		// -> sc라는 이름으로 Scanner 사용 가능
		
		// 3) Scanner로 입력 받기
		
		
		
		// 정수 : sc.nextInt();
		
		System.out.println("입력받은 두 정수의 합 구하기");
		
		System.out.print("정수 입력 1 : ");
		int input1 = sc.nextInt();
		// 키보드로부터 다음 정수를 입력받아 그 값을 input1 변수에 대입함
		
		
		System.out.print("정수 입력 2 : ");
		int input2 = sc.nextInt();
		// 키보드로부터 다음 정수를 입력받아 그 값을 input2 변수에 대입함
		
		System.out.printf("%d + %d = %d \n",input1, input2, input1 + input2);
		
		
		
		
		
		// 실수 : sc.nextDouble();
		
		System.out.println("입력받은 두 실수의 합 구하기");
		
		System.out.print("실수 입력 1 : ");
		double input3 = sc.nextDouble();
		// 키보드로부터 다음 실수를 입력받아 그 값을 input3 변수에 대입함
		
		System.out.print("실수 입력 2 : ");
		double input4 = sc.nextDouble();
		// 키보드로부터 다음 실수를 입력받아 그 값을 input4 변수에 대입함
		
		System.out.printf("%.2f + %.2f = %.2f \n",input3, input4, input3 + input4);
		
		
		// 문자열 : sc.next(); or sc.nextLine();
		
		System.out.print("이름을 입력해주세요! : ");
		
		String name = sc.next(); // 다음 입력되는 단어 하나만 입력받아 변수에 대입
								 // 단어 = 띄어쓰기 없는 문자열
								 // 예) Helloworld = 단어, Hello world =/= 단어
		
		System.out.println(name + "님, 오늘 하루도 고생하셨습니다.");
	}
}
