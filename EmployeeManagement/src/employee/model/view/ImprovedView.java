package employee.model.view;

import java.util.Scanner;

public class ImprovedView {
	Scanner sc = new Scanner(System.in);
	
	public void displayMenu() {
		int input = 0;
		do {
			System.out.println("----------- 사원 관리 프로그램 -----------");
			System.out.println("1. 새로운 사원 정보 추가");
			System.out.println("2. 전체 사원 정보 조회");
			System.out.println("3. 사번이 일치하는 사원 정보 조회");
			System.out.println("4. 사번이 일치하는 사원 정보 수정");
			System.out.println("5. 사번이 일치하는 사원 정보 삭제");
			System.out.println("6. 입력 받은 부서와 일치 모든 사원 정보 조회");
			System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");
			System.out.println("8. 부서별 급여 합 전체 조회");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 선택 > ");
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break;
			case 7: break;
			case 8: break;
			case 0: System.out.println("프로그램을 종료합니다. "); break;
			default: System.out.println("잘못된 입력입니다. ");
				
			}
		} while(input!=0);
	}
	
	/**
	 *  A. 공용 출력 메서드
	 */
	public void forPrint() {
		
	}
	
	/**
	 *  B. 공용 수정 메서드
	 */
	public void forUpdate() {
		
	}
	
	/**
	 *  C. 공용 조회 메서드
	 */
	public void forSelect() {
		
	}
}
