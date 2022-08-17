package edu.kh.array.practice;

import java.util.Scanner;

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
		System.out.print("주민등록번호(-포함)");
		String idNum = sc.next();
	}
	
	
}
