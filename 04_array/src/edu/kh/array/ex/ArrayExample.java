package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
	
	/* ============= 배열 (자료구조) ================
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것 
	 * - 묶여진 변수들은 하나의 이름(배열명)으로 불러지고,
	 * 	 각 변수들은 index를 이용하여 구분함.
	 * 
	 * */
	
	public void ex1() {
		
		// 배열 맛보기
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		
		int[] arr = new int[4]; // [] 배열 기호
		// int형 변수 4개를 묶음으로 다룰 수 있는 배열을 생성하고 이를 arr이라고 명명함
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		int sum2 = 0;
		for(int i=0; i<4; i++) { // i = 0 1 2 3
			System.out.println(arr[i]);
			sum2 += arr[i];
		}

		System.out.println("합계 : " + sum2);
		
		System.out.println("======== 직접 출력 시 ========");
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		System.out.println(num4);
//		int sum1 = num1 + num2 + num3 + num4;
//		System.out.println(sum1);
		
	}
	
	public void ex2() {
		
		int[] arr;	// int 타입의 배열 arr을 선언
					// 배열의 시작 주소를 저장하는 변수(참조형, 4byte)
		
		arr = new int[4];	// HEAP 영역에 int자료형 4칸짜리 배열을 할당(생성)
							// 할당된 배열 공간의 시작 주소를 변수 arr에 대입
	
							// 현재 배열 arr의 길이 : 4
		
		System.out.println("배열 길이 : " + arr.length);	// arr이 참조하고 있는 배열의 길이
	
		System.out.println("컴파일러가 정말로 0으로 초기화해줬을까?");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		// 참고 : STACK 영역은 컴파일러가 자동으로 초기화해주지 않는다
		
		System.out.println("\n============================================================\n");
		
		
		// 배열 초기화
		
		// 1) 인덱스를 이용한 초기화
		arr[0] = 100;	// arr int[] 참조형 변수가 참조하는 배열의 0번 인덱스 = 100 
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;	// arr int[] 참조형 변수가 참조하는 배열의 3번 인덱스 = 300
		
		// *** for문을 이용해 배열에 저장된 모든 값을 출력 ***
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+ i + "] = " + arr[i]);
		}

		
		System.out.printf("\n============================================================\n");

		// 2) for문을 이용한 초기화
		//    -> 배열의 각 인덱스에 대입되는 값이 일정한 "규칙성"이 있는 경우에 for문을 이용해서 초기화를 하기도 함
		
		// int 10개를 저장하는 배열의 각 요소(index)에 10, 20, 30 ..... 100까지 대입해보겠다.
		int[] arr2 = new int[10];
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = (i+1) * 10;
		}
		
		for(int i=0; i<arr2.length; i++) {
			System.out.printf("arr2[%d] = %d\n", i, arr2[i]);
		}
		
		// 3) 선언과 동시에 초기화
		
		
	}
	
	public void ex3() {
		// 2) for문을 이용한 초기화
		
		// 5명의 키(cm)를 입력받고, 평균을 구해보기
		
		double[] heightArr = new double[5];
		
		Scanner sc = new Scanner(System.in);
		
		// 2-1) 배열에 값 저장
		for(int i=0; i<heightArr.length; i++) {
			System.out.printf("%d번 키 입력 : ", i+1);
			heightArr[i] = sc.nextDouble();
		}
		
		// 배열에 값이 잘 대입되었는지 임시 확인
//		System.out.println(heightArr); // 배열 명을 직접 입력하면, 배열의 값이 아니라 배열의 시작 주소가 해시코드 형태로 출력됨
//		System.out.println(Arrays.toString(heightArr)); // Arrays.toString(배열명)을 사용하면 일렬로 출력됨

		System.out.println(); // 줄바꿈

		double sum = 0; // 합계~
		
		// 2-2) 배열 값을 하나씩 출력하고 sum에 더함
		System.out.print("입력 받은 키 : ");
		
		for(int i=0; i<heightArr.length; i++) {
			sum += heightArr[i];
			System.out.print(heightArr[i] + " ");
		}
		
		// 2-3) 평균 키를 출력하고 싶음
		
		System.out.printf("\n\n평균 : %.2fcm", sum / heightArr.length);
	}
	
	public void ex4() {
		int[] arr = new int[3];
		// java.lang.ArrayIndexOutOfBoundsException 배열의 인덱스 범위를 초과한 경우
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void ex5() {
		// 3. 배열의 선언과 동시에 (할당/생성 및) 초기화
		
		int[] arr = {10, 20, 30, 40};
		// 1) int 배열을 참조하는, int형 변수 arr을 선언
		// 2) int형 4칸짜리 배열을 heap 영역에 할당(생성) *new 연산자는 생략됨
		//	  각각의 인덱스를 10, 20, 30으로 바로 초기화하였음
		// 3) 할당된 배열의 시작 주소를 arr 변수에 대입한다
		// 저장할 값이 정해져있을 때
		
		System.out.println("배열 길이 : " + arr.length);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void ex6() {
		// 점심 메뉴 뽑기 프로그램
		
		String[] menuArr = {"김밥+라면", "KFC", "맘스터치", "서브웨이",
							"백반", "순대국", "곰탕", "파스타", "삼겹살", "빵"};
		
		// 배열의 index 범위 내 난수가 발생하였음
		int ran = (int)(Math.random() * menuArr.length);
		
		System.out.printf("오늘의 점심 메뉴는? %s", menuArr[ran]);
	}
	
	// ========================= 배열 응용 ===========================
	
	public void ex7() {
		
		// 인원 수를 입력 받아 그 크기만큼의 정수 배열을 선언 및 할당
		// 인원 수 만큼 점수를 반복해서 입력 받아,
		// 합계, 평균, 최고점, 최저점
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 받을 인원 수 : ");
		int size = sc.nextInt();
		
		int[] scoreArr = new int[size];
		
		int sum = 0;
		
		for(int i=0; i<scoreArr.length; i++) {
			System.out.print( i+1 + "번 점수 입력 : ");
			scoreArr[i] = sc.nextInt();
			sum += scoreArr[i];
		}
		
		System.out.println();	// 줄 바꿈

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum/scoreArr.length);
		int max = scoreArr[0];
		int min = scoreArr[0];
		
		for(int i=1; i<scoreArr.length; i++) {
			if(min > scoreArr[i]) {
				int tmp = min;
				min = scoreArr[i];
				scoreArr[i] = tmp;
			} else if(max < scoreArr[i]) {
				int tmp = max;
				max = scoreArr[i];
				scoreArr[i] = tmp;
			}
		}
		
		System.out.printf("최고점 : %d \n최저점 : %d", max, min);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
