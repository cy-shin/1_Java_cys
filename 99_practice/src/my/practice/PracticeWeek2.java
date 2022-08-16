package my.practice;

import java.util.Scanner;
import java.util.Arrays;
public class PracticeWeek2 {
	
	public void keyword() {

		// 메인 메서드
		//public static void main(String[] args) {   };
		
		// Scanner
		//Scanner sc = new Scanner(System.in);
		
		/* ===== 스캐너 사용 ====
		 * 1. import java.util.Scanner; 로 import
		 * 2. Scanner sc(스캐너명) = new Scanner(System.in); 으로 스캐너 호출
		 * 3. 자료형 변수명 = sc.next(); 처럼 변수에 대입하고 변수를 이용해 사용
		 * 주의) .nextLine();을 다른 스캐너 뒤에 쓸 경우, \n 때문에 입력을 받지 못할 수 있음.
		 * 	
		 */
		
		//int ran = (int)(Math.random()*100)+1;
		//System.out.println(ran);
		
		/* ===== 난수 생성 =====
		 * Math.random() : 0 이상 1 미만의 double형 실수를 생성함
		 * n을 곱하고 (int)로 강제형변환을 해주면 정수로 된 난수를 생성할 수 있음
		 * 
		 */
		
		
	}

	public void operator() {
		int j = 0;
		for(int i = 0; i<10; i++) {
			System.out.println("j = " + j++);
		}
		j = 0;
		for(int i = 0; i<10; ++i) {
			System.out.println("j = " + ++j);
		}
	}
	
	
	
	public void condition() {
		// if문
		Scanner sc = new Scanner(System.in);
//		System.out.print("현재 온도는?");
//		double degree = sc.nextDouble();
//		if(degree >= 33.0) {
//			System.out.println("폭염 주의");
//		} else {
//			System.out.println("특보 없음");
//		}
		
		// if ~ else if 문
		System.out.print("현재 온도는? >");
		double degree = sc.nextDouble();
		if(degree >= 35.0) {
			System.out.println("폭염 경보");
		} else if(degree >= 33.0) {
			System.out.println("폭염 주의보");
		} else {
			System.out.println("특보 없음");
		}
		
		// switch문
		System.out.print("메뉴 : ");
		String localNum = sc.next();
		
		switch(localNum) {
		case "햄버거" :
			System.out.println(5000);
			break;
		case "치즈스틱" :
			System.out.println(3000);
			break;
		case "콜라" :
			System.out.println(2000);
			break;
		case "세트" :
			System.out.println(7000);
			break;
		}
		
		// 삼항연산자
		int price = 50000;
		boolean buy = price>5000? true: false;
		System.out.println(buy);
	}

	public void loop() {
		// for문
		// for(초기식; 조건식; 증감식) {
		// 		반복해서 수행할 문장
		// }
		// 조건식을 만족하는 동안 블록 내의 문장을 반복 수행함
		// 실행 순서 : 초기식 -> 조건식 -> 블럭 내 문장 수행 -> 증감식 -> 조건식 ...
	
		for(int i=1; i<=10; i++) {
			System.out.println(i + "*");
		}
		int j = 0;
		
		for(;;) {
			System.out.println(j+++"**");
			if(j>=10) {
				break;
			}
		}
		
		// while문
		// 조건식만 명시하고, 증감식은 블럭 내에 작성함
		while(true) {
			System.out.println("안녕하세요");
			break;
		}
		
		// do while문
		// 최소 1번 이상 반복을 보장함
		do {
			System.out.println("안녕하세요");
		} while(true);
		
	}

	public void array() {
		int[] arr; // int타입 배열을 참조하는 참조변수 arr을 stack 영역에 선언
		arr = new int[3]; // heap영역에 int타입의 값 3개를 저장할 수 있는 공간을 할당
						  // 할당된 공간의 주소가 변수 arr에 대입됨
		
		int[] arr2 = new int[15]; // 할당과 선언 동시에
		
		// 배열 초기화
		// 1. 인덱스번호로 직접 초기화
		arr[1] = 1;
		
		// 2. for문으로 초기화
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = i;
		}
		
		// 3. 선언과 동시에 초기화
		
		int[] arr3 = { 1, 2, 3, 4, 5};
		
		// 배열 출력
		// 1. for문
		// 2. import java.util.Array;
		//	  Arrays.toString(배열)
		
		// 얕은 복사 : 배열의 주소값만 복사함. 새로운 배열이 생기는게 아니고, 한 배열을 두 변수가 동시에 참조
		int[] arr2Copy = arr2;
		System.out.println("arr2 주소 = " + arr2);
		System.out.println("arr2Copy 주소 = " + arr2Copy);
		
		// 깊은 복사 : 원본과 같은 자료형, 크기를 가진 새로운 배열을 만들고 원본의 데이터를 복제
		// 깊은 복사 방법
		
		// 1. for문 이용
		// 2. System.arraycopy(원본 배열, 시작 인덱스, 복사할 배열, 시작 인덱스, 복사할 길이)
		int[] arr3Copy = new int[5];
		System.arraycopy(arr3, 0, arr3Copy, 0, arr3.length);
		System.out.println("arr3 주소 = " + arr3);
		System.out.println("arr3Copy 주소 = " + arr3Copy);
		System.out.println("arr3 = " + Arrays.toString(arr3));
		System.out.println("arr3Copy = " + Arrays.toString(arr3Copy));
		
		
		// 3. Arrays.copyOf(원본 배열, 복사할 길이)
		int[] arr3Copy2;
		arr3Copy2 = Arrays.copyOf(arr3, arr3.length);
		System.out.println("arr3Copy2 주소 = " + arr3Copy2);
		System.out.println("arr3Copy2 = " + Arrays.toString(arr3Copy2));
		
		
	}

	public void array2() {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		// 얕은 복사
		int[] arrShallow = new int[5];
		arrShallow = arr;
		
		System.out.println("주소값 : " + arr);
		System.out.println("주소값 : " + arrShallow);
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr : " + Arrays.toString(arrShallow));
		
		// 깊은 복사
		int[] arrDeep = new int[5];
		System.arraycopy(arr, 0, arrDeep, 0, arrDeep.length);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arrDeep : " + Arrays.toString(arrDeep));
		
		// 깊은 복사 2
		int[] arrDeep2 = new int[5];
		arrDeep2 = Arrays.copyOf(arr, arrDeep.length);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arrDeep2 : " + Arrays.toString(arrDeep2));
		
		
		// 2차원 배열
		int[][] arrDimension = new int[5][7];
		int[][] arrDimension2;
		arrDimension = new int[5][7];
	}

}
