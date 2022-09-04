package employee.model.view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import employee.model.sevice.OMService;
import employee.model.vo.OM;

public class OMView {
	OMService service = new OMService();
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
			case 1: registration(); break;
			case 2: selectAll(); break;
			case 3: selectById(); break;
			case 4: updateById(); break;
			case 5: deleteById(); break;
			case 6: selectByTitle(); break;
			case 7: selectBySalary(); break;
			case 8: titleSalary(); break;
			case 0: System.out.println("프로그램을 종료합니다. "); break;
			default: System.out.println("잘못된 입력입니다. ");
			}
		} while(input!=0);
	}
	
	/**
	 *  1. 새로운 사원 정보 추가
	 */
	public void registration() {
		System.out.println("[새로운 사원 정보 추가]");
		System.out.print("이름 : ");
		String empName = sc.next();
		
		System.out.print("주민번호 : ");
		String empNo = sc.next();
		
		System.out.print("이메일 : ");
		String email = sc.next();
		
		System.out.print("전화번호 : ");
		String phone = sc.next();
		
		System.out.print("부서 : ");
		String departmentTitle = sc.next();
		
		System.out.print("직급 : ");
		String jobName = sc.next();
		
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		
		service.registration(empName, empNo, email, phone, departmentTitle, jobName, salary);
	}
	
	/**
	 *  2. 전체 사원 정보 조회
	 */
	public void selectAll() {
		System.out.println("[전체 사원 정보 조회]");
		forPrint(service.selectAll());
	}
	
	/**
	 *  3. 사번이 일치하는 사원 정보 조회
	 */
	public void selectById() {
		int inputId = 0;
		System.out.println("[사번이 일치하는 사원 정보 조회]");
		System.out.print("사번 입력 : ");
		inputId = sc.nextInt();
		sc.nextLine();
		
		forPrint(service.selecyById(inputId));
	}
	
	/**
	 *  4. 사번이 일치하는 사원 정보 수정
	 */
	public void updateById() {
		System.out.println("[사번이 일치하는 사원 정보 수정]");
		int inputId = forSelect();
		int agree = -1;
		if(inputId!=-1) {
			forPrint(service.selecyById(inputId));
			System.out.printf("정말로 해당 사원의 정보를 수정하겠습니까?(Y/N)");
			String tmp = sc.nextLine();
			if (tmp.toUpperCase().equals("Y")) agree = 1;
			if (tmp.toUpperCase().equals("N")) agree = 0;
		} 
		if(agree == 1) {
			System.out.println("수정을 원하지 않는 항목에는 0 입력");
			System.out.print("이메일 : ");
			String email = sc.next();

			System.out.print("전화번호 : ");
			String phone = sc.next();

			System.out.print("부서 : ");
			String departmentTitle = sc.next();

			System.out.print("직급 : ");
			String jobName = sc.next();

			System.out.print("급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();

			service.updateById(inputId, email, phone, departmentTitle, jobName, salary);

			System.out.println("정보가 수정되었습니다.");
		}
		if(agree == 0) System.out.println("작업이 취소되었습니다.");
		if(agree == -1) System.out.println("사번이 일치하는 사원을 찾을 수 없습니다. ");		
	}
	/**
	 *  5. 사번이 일치하는 사원 정보 삭제
	 */
	public void deleteById() {
		System.out.println("[사번이 일치하는 사원 정보 삭제]");
		int inputId = forSelect();
		int agree = -1;
		if(inputId!=-1) {
			forPrint(service.selecyById(inputId));
			System.out.printf("정말로 해당 사원의 정보를 삭제하겠습니까?(Y/N)");
			String tmp = sc.nextLine();
			if (tmp.toUpperCase().equals("Y")) agree = 1;
			if (tmp.toUpperCase().equals("N")) agree = 0;
		} 
		if(agree == 1) {
			service.deleteById(inputId);
			System.out.println("정보가 삭제되었습니다.");
		}
		if(agree == 0) System.out.println("작업이 취소되었습니다.");
		if(agree == -1) System.out.println("사번이 일치하는 사원을 찾을 수 없습니다. ");
	}
	
	/**
	 *  6. 입력 받은 부서와 일치 모든 사원 정보 조회
	 */
	public void selectByTitle() {
		String inputTitle = "";
		System.out.println("[입력 받은 부서와 일치 모든 사원 정보 조회]");
		System.out.print("부서 입력 : ");
		inputTitle = sc.nextLine();
		
		forPrint(service.selectByTitle(inputTitle));
	}
	
	/**
	 *  7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회
	 */
	public void selectBySalary() {
		int inputSalary = 0;
		System.out.println("[입력 받은 급여 이상을 받는 모든 사원 정보 조회]");
		System.out.print("급여 입력 : ");
		inputSalary = sc.nextInt();
		sc.nextLine();
		
		forPrint(service.selectBySalary(inputSalary));
	}
	
	/**
	 *  8. 부서별 급여 합 전체 조회
	 */
	public void titleSalary() {
		Map<String, Integer> resultMap = new HashMap<>();
		
		System.out.println("[부서별 급여 합 전체 조회]");
		resultMap = service.titleSalary();
		System.out.printf("%-10s |%s", "부서", "총액\n");
		for(String title : resultMap.keySet() ) {
			System.out.printf("%-10s  %d원\n", title, resultMap.get(title));
		}
	}
	
	/**
	 *  출력용 메서드
	 * @param resultList 
	 */
	public void forPrint(List<OM> resultList) {
		List<OM> printList = resultList;
		System.out.printf("%-3s|%-10s|%-15s|%-19s|%-19s|%-16s|%-9s|%-9s\n",
					"사번",
					"이름",
					"주민번호",
					"이메일",
					"전화번호",
					"부서",
					"직급",
					"급여");
		for(OM om : printList) {
			System.out.printf("%-3d %-11s %-15s %-20s  %-20s %-17s%-10s%-10d\n",
					om.getEmpId(),
					om.getEmpName(),
					om.getEmpNo(),
					om.getEmail(),
					om.getPhone(),
					om.getDepartmentTitle(),
					om.getJobName(),
					om.getSalary());
		}	
	}
	
	/**
	 *  조회용 메서드
	 *  @return 입력한 사번을 반환
	 *   -1 : 사번을 찾을 수 없는 경우
	 */
	public int forSelect() {
		int inputId = 0;
		System.out.print("사번 입력 : ");
		inputId = sc.nextInt();
		sc.nextLine();
		if(service.selecyById(inputId).isEmpty()) inputId = -1;
			
		return inputId;
	}
}
