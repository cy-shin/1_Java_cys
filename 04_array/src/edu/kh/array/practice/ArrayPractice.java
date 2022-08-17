package edu.kh.array.practice;

import java.util.Scanner;
import java.util.function.IntConsumer;

public class ArrayPractice {

	public void practice1() {
		int[] arr = new int[9];
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+ " " );
			if(i % 2==0) {
				sum += arr[i];
			}
		}
		
		System.out.println("\n짝수 번쨰 인덱스 합 : " + sum);
		
	}
	
	public void practice2() {
		
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i=arr.length-1; i>=0; i--) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			if(i % 2 ==1) {
				sum += arr[i];
			}
		}
		
		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
		
		
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("양의 정수 : ");
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+ " " );
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.printf("입력 %d : ", i);
			arr[i] = sc.nextInt();
		}
		
		boolean flag = false;
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]== search ) {
				System.out.printf("인덱스 : %d\n", i);
				flag = true;
			}
		}
		
		if(!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}

	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		System.out.print("검색할 문자 : ");
		char search = sc.next().charAt(0);
		
		char[] arr = new char[str.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i); 
		}
		
		int count = 0;
		
		System.out.printf("%s에 %s가 존재하는 위치(인덱스) : ", str, search);
		
		for(int i=0; i<arr.length; i++) {
			if(search == arr[i]) {
				System.out.printf("%d ",i);
				count++;
			}
		}
		
		System.out.printf("\n%s 개수 : %d", search, count);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		for(int i=0; i<arr.length; i++) {
			System.out.printf("배열 %d번쨰 인덱스에 넣을 값 : ",i);
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " " );
			sum += arr[i];
		}
		System.out.println();
		System.out.println("총 합 : " + sum);	
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.next();
		
		char[] idNumArr = new char[14];
		for(int i=0; i<idNumArr.length; i++) {
			if(i>7) {
				idNumArr[i] = '*';
			} else {
				idNumArr[i] = idNum.charAt(i);
			}
		}
		
		for(int i=0; i<idNumArr.length; i++) {
			System.out.print(idNumArr[i]);
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		int length = 0;
		
		while(true) {
			System.out.print("정수 : ");
			length = sc.nextInt();
			if(length % 2 == 1 && length>=3) {
				break;
			}
			System.out.println("다시 입력하세요.");
		}
		
		int[] arr = new int[length];
		
		int num = 1;
		
		for(int i=0; i<arr.length/2+1; i++) {
			arr[i] = num++; 
		}
		for(int i=arr.length/2; i<arr.length; i++) {
			arr[i] = --num; 
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(!(i == arr.length-1)) {
				System.out.print(", ");
			}
		}
	}

	public void practice9() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int ran = (int)(Math.random()*10)+1;
			arr[i] = ran; 
		}
		
		System.out.print("발생한 난수 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice10() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int ran = (int)(Math.random()*10)+1;
			arr[i] = ran; 
		}
		int min = arr[0];
		int max = arr[0];
		
		System.out.print("발생한 난수 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.printf("최대값 : %d\n최소값 : %d", max,min);
		
		
	}
	
	public void practice11() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int ran = (int)(Math.random()*10)+1;
			arr[i] = ran; 
			for(int j=0; j<i; j++) {
				if(ran == arr[j]) {
					i--;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() { // 더 효율적인 방법 찾아보기
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			int ran = (int)(Math.random()*46)+1;
			arr[i] = ran; 
			for(int j=0; j<i; j++) {
				if(ran == arr[j]) {
					i--;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp; 
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char[] arr = new char[str.length()];
		
		// 1. 먼저 문자열의 내용을 문자 배열에 옮기기
		for(int i=0; i<str.length(); i++) {
			arr[i]=str.charAt(i); 
		}
		
		// 개수를 셀 때 사용할 변수 count
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			boolean flag = true;
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				count++;
				System.out.print(arr[i]);
				if(i != arr.length-1) {
					System.out.print(", ");
				}
			}
		}
		System.out.println();
		System.out.println("문자 개수 : " + count);
	}

	public void practice14() {
		Scanner sc = new Scanner(System.in);
		
		// 첫 배열 크기 지정
		System.out.print("배열의 크기를 입력하세요 : ");
		int length = sc.nextInt();
		sc.nextLine();
		
		// 첫 배열 선언, 할당
		String[] list = new String[length];

		int index = 0; // 배열 인덱스 번호
		
		while(true) {
			while(index < list.length) {
				System.out.print((index+1) + "번쨰 문자열 : ");
				String str = sc.nextLine();
				list[index] = str;
				index++;
			}
			
			// 추가 입력?
			System.out.print("더 값을 입력하시겠습니까?(Y/N)");
			String and = sc.next();
			
			// 입력 안하는 경우 >>> 탈출
			if(and.equals("N") || and.equals("n")) {
				break;
			}
			
			// 입력 하는 경우
			System.out.print("더 입력하고 싶은 개수 : ");
			length += sc.nextInt();
			sc.nextLine();
			
			// 기존 배열의 길이 + 추가할 개수만큼의 길이를 가진 배열 생성
			String[] temp = new String[length];
			
			// 배열 복사중...
			for(int i=0; i<list.length; i++) {
				temp[i] = list[i];
			}
			
			// 원본 배열 할당
			list = new String[length];
			
			for(int i=0; i<temp.length; i++) {
				list[i] = temp[i];
			}
		}
		
		// 리스트를 출력해요
		System.out.print("[");
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i]);
			if(i != list.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
			
		
		
	}

	public void practice15() {
		String[][] arr = new String[3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] =  "(" + i + ", " + j + ")";
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}
	
	public void practice16() {
		int[][] arr = new int[4][4];
		
		int num = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice17() {
		int[][] arr = new int[4][4];
		
		int num = arr.length*arr[0].length;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num--;
			}
		}

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice18() {
		int[][] arr = new int[4][4];
		
		int sum = 0;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				int ran = (int)(Math.random()*10)+1;
				arr[i][j]= ran;
				arr[i][arr.length-1] += ran;
				arr[arr[i].length-1][j] += ran;
				sum += ran;
			}
		}
		
		arr[arr.length-1][arr[0].length-1] = sum;

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		
		int row = 0;
		int col = 0;
		
		while(true) {
			System.out.print("행 크기 : ");
			row = sc.nextInt();
			if(row > 10 || 1 > row) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			break;
		}
		
		while(true) {
			System.out.print("열 크기 : ");
			col = sc.nextInt();
			if(col > 10 || 1 > col) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			break;
		}
		
		// 배열 생성
		char[][] arr = new char[row][col];
		
		// A : 65 ~ Z : 90
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				int ran = (int)(Math.random()*26) + 65;
				arr[i][j] = (char)ran;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%s ",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void charCheck() {
		char ch = 'Z';
		System.out.println((int)ch);
	}
	
	public void practice20() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		char[][] arr = new char[row][];
		
		char abc = 'a';
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d열의 크기 : ", i);
			int col = sc.nextInt();
			arr[i] = new char[col];
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = abc++;
			}
		}

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice21() {
		
	}
	
}
