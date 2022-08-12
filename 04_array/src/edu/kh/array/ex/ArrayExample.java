package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.DebugGraphics;

public class ArrayExample {
	
	/* ============= 배열 (자료구조) ================
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것 
	 * - 묶여진 변수들은 하나의 이름(배열명)으로 불러지고,
	 * 	 각 변수들은 index를 이용하여 구분함.
	 * 
	 * */
	
	public void ex0() {
		Scanner sc = new Scanner(System.in);
		
		// 배열 값 무작위로 섞어보기
		
		String[] arr = {"*", " ", " ", " ", " ", " ", " ", " ", " ", " "};
		String[] arr2 = new String[arr.length];
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			int ran = (int)(Math.random()*arr.length);
			String tmp = arr[i];
			arr[i] = arr[ran];
			arr[ran] = tmp;
		}
		
		System.out.println("*을 섞었습니다.");
		
//		System.out.println(Arrays.toString(arr));

		// 배열 arr2를 공백으로 정리
		for(int i=0; i<arr.length; i++) {
			arr2[i] = " ";
		}
		
		// 배열에서 문자열 '*' 찾아보기
		System.out.println("*의 위치를 있을까요?");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");
			System.out.println(Arrays.toString(arr2));

			System.out.print("몇 번째 자리? : ");
			int input = sc.nextInt();
			if(arr[input-1].equals("*")) {
				System.out.println("정답");
				break;
			} else {
				arr2[input-1] = arr[input];
				System.out.println("다시 시도해보세요");
			}
		}
		
	}
	
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
		
		// 최고점수 최저점수 
		int max = scoreArr[0];
		int min = scoreArr[0];
		// 배열의 첫 번째 인덱스 값을 최고/최저 비교 기준으로 삼음
		
		System.out.println();	// 줄 바꿈

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum/scoreArr.length);
		
		// breakpoint를 지정한 라인 이전에 멈춘다!
		
		// for문을 breakpoint로 지정하면, 증감식이 해석되기 전에 멈춘다! (debug mode)
		
		// else - if가 속도는 더 빠르나, 유지보수 측면에서는 불리함
		for(int i=1; i < scoreArr.length; i++) {
			
			if(max < scoreArr[i]) {
				max = scoreArr[i];
			}
			
			if(min > scoreArr[i]) {
				min = scoreArr[i];
			}
		}
		
		System.out.printf("최고점 : %d \n최저점 : %d", max, min);
	}
	
	public void ex8() {
		
		// 배열 내 데이터 검색!
		
		// 입력 받은 정수가 배열에 존재하면 몇 번 인덱스에 존재하는지 출력하세요.
		// 단, 없다면 "존재하지 않습니다"를 출력하세요.
		
		
		int[] arr = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int search = sc.nextInt();
		
		boolean flag = true;
		// for문이 종료된 후에도 flag가 true이면 찾는 값이 존재하지 않는다!
		// false면 찾는 값이 존재한다!!
		
		// arr 배열에 대한 순차/반복 접근 : 배열의 모든 값에 1번씩 접근
		for(int i=0; i<arr.length; i++) {
			if(search == arr[i]) { 
				System.out.println(i + "번 째 인덱스에 존재합니다.");
				flag = false; // 값을 찾았으므로, flag를 false로 바꿨음
				break; // arr배열에는 중복 데이터가 없으므로, break문으로 탈출
			}
		}
		
		if(flag) {
			System.out.println("존재하지 않습니다.");
		}
		
		
	}
	
	public void createLottoNumber() {
		// 배열을 이용한 중복 데이터 제거 + 정렬
		
		// 1. 1 ~ 45 사이의 중복되지 않은 난수 6개
		
		// 2. 생성된 난수를 오름차순으로 예쁘게 정렬
		
		System.out.println("***** 로또 번호 생성기 *****");
		
		// 난수 6개를 저장할 배열 lotto를 선언 및 공간을 할당
		int[] lotto = new int[6];
		
		// 난수를 생성하여 lotto 배열에 추가!
		for(int i=0; i<lotto.length; i++) {
			int ran = (int)(Math.random()*45+1);
			lotto[i] = ran; // 난수를 배열 요소에 대입
			for(int x=0; x<i; x++) {
				if(ran==lotto[x]) {
					i--; 
					// i 값을 인위적으로 감소시켜서
					// 바깥쪽 for문의 증감식(i++)이 실행되었을 때 i값이 현재 값을 유지하도록 만듦
					break; // 추가 검사가 불필요하기 때문에 break문으로 탈출~
				}
			}
		}
		
		// lotto 배열에 저장된 모든 값 출력
		System.out.println(Arrays.toString(lotto));
		
		// Arrays.sort(배열명) : 배열 내 값을 오름차순으로 정렬해줌
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
	}
	
	public void ex9() {
		// 얕은 복사
		// - 참조하는 주소만을 복사하여
		// 서로 다른 참조 변수가 하나의 배열(또는 객체)를 참조하게 하는 복사
		
		// 특징 : 하나의 배열을 참조하기 때문에 값을 공유하게 된다.
		
		int[] arr = {99, 70, 80, 50, 40};
		
		// arr 변수에 저장된 배열의 시작 주소를 copyArr에 대입(얕은 복사)
		int[] copyArr = arr;

		// 주소 확인 -> 같음
		System.out.println("arr : " + arr);
		System.out.println("copyArr : " + copyArr);
		
		// 값 변경
		System.out.println("[변경 전]");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		// 복사본의 값을 변경했는데 원본도 같이 변함 -> 값을 공유!
		// (동일한 배열을 참조하고 있다!)
		copyArr[2] = 10000;
		
		System.out.println("[변경 후]");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
	}
	
	public void ex10() {
		// 깊은 복사
		// - 원본과 같은 자료형, 크기의 새로운 배열을 만들고
		//	 원본의 데이터를 모두 복사하는 방법
		// === 복제
		
		// 깊은 복사 : 원본 데이터를 보존하면서 복사본의 데이터 가공을 진행하는 경우
		
		
		int[] arr = {99, 70, 80, 50, 40};
		
		// 깊은 복사를 위한 배열 선언 및 할당
		int[] copyArr = new int[arr.length];
		
		// 원본 데이터를 모두 복사
		
		// 1) for문을 이용한 방법 (index가 동일하다는 특징을 이용)
//		for(int i=0; i<copyArr.length; i++) {
//			copyArr[i] = arr[i]; 
//		}
		
	    // 2. System.arraycopy(원본배열, 원본 복사 시작 인덱스, 복사배열, 복사배열의 삽입 시작 인덱스, 복사길이); 
//		System.arraycopy( arr, 0, copyArr, 0, copyArr.length);
		
		// 3. 복사할 배열 변수 = Arrays.copyOf(원본 배열, 복사할 길이)
//		copyArr = Arrays.copyOf(arr, arr.length);
		
		// 주소 확인 -> 다름
		System.out.println("arr : " + arr);
		System.out.println("copyArr : " + copyArr);
		
		// 값 변경
		System.out.println("[변경 전]");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		// 복사본의 값을 변경하자 복사본만 바뀌고 원본에는 영향이 없음
		// -> 데이터 공유 x -> 서로 다른 배열!
		copyArr[2] = 10000;
		
		System.out.println("[변경 후]");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
	}
	
	public void ex11() {
		
		// null 의미
		// -참조하는 것(배열, 객체)이 없다
		
		int[] arr1 = new int[3];
		
		System.out.println(arr1 == null);
		// arr1 == null is false >>> arr1 참조 변수가 무언가를 참조하고 있다.
		
		if(arr1 != null) { // arr1이 참조하는 배열이 있을 때에만 수행
			System.out.println(arr1[0]);
		}
		
		System.out.println("=================================");
		
		// int[] arr2;
		// 배열 참조변수를 선언만 했을 때는 -> 저장된 값이 없음
		// 그래서 print문으로 출력하려고 하면 오류 발생함
		
		int[] arr2 = null;
		// 배열 참조변수를 선언 및 null로 초기화 -> 값을 가짐!
		// 값을 가지고 있으나, 참조하는게 없다는 뜻
		
		System.out.println(arr2); 
		
		// arr2가 참조하는 배열이 없을 때 새로운 배열을 생성하여 그 배열의 시작주소를
		// arr2에 대입한다
		if(arr2 == null) {
			arr2 = new int[4];
		}
		
		System.out.println(arr2);
		// null값에서 어떤 배열의 주소값으로 바뀜!!
	}
	
}
