package employee.model.view;

import java.util.Map;
import java.util.Scanner;

import employee.model.sevice.EmployeeService;
import employee.model.vo.Employee;

public class EmployeeView {
	private EmployeeService service = new EmployeeService(); // 출력용 객체
	private Employee[] resultArr; // 출력용 객체
	private int tmpId = -1; // 임시 사번
	private Scanner sc = new Scanner(System.in);
	

	
	public void displayMenu() {
		int input = 0;
		do {
			resultArr = null;
			
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
			case 1: addEmployee(); break;
			case 2: selectAll(); resultArrPrint(); break;
			case 3: employeeSelectIntro(); employeeSelect(); resultArrPrint(); break;
			case 4: employeeSelect();  resultArrPrint(); employeeUpdate(); break;
			case 5: employeeSelect();  resultArrPrint(); employeeDelete(); break;
			case 6: selectTitle(); resultArrPrint(); break;
			case 7: selectSalaryUp(); resultArrPrint(); break;
			case 8: salarySum(); break;
			case 0: System.out.println("프로그램을 종료합니다. "); break;
			default: System.out.println("잘못된 입력입니다. ");
				
			}
			
		} while(input!=0);
		
	}
		
	/**
	 *  1. 새로운 사원 정보 추가
	 */
	public void addEmployee() {
		System.out.println("새로운 사원 정보 추가");
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
		
		int result = service.addEmployee(empName, empNo, email, phone, departmentTitle, jobName, salary);
		if(result == 1) {
			System.out.println("새로운 사원이 등록되었습니다. ");
		}
	}
	
	/**
	 *  2. 전체 조회
	 */
	public void selectAll() {
		System.out.println("[전체 사원 정보 조회]");
		resultArr = service.viewAll();
	}
	
	/**
	 * 3. 사번이 일치하는 사원 정보 조회
	 */
	public void employeeSelectIntro() {
		System.out.println("[사번이 일치하는 사원 정보 조회]");
		
	}
	
	/**
	 *  4. 사번이 일치하는 사원 수정
	 */
	public void employeeUpdate() {
		if(resultArr!=null) {
			System.out.println("[사번이 일치하는 사원 정보 수정]");
			System.out.println("수정을 원하지 않는 항목이 있는 경우 0 입력");
			System.out.print("이메일 : ");
			String email = sc.nextLine();
			System.out.print("전화번호 : ");
			String phone = sc.nextLine();
			System.out.print("부서 : ");
			String departmentTitle = sc.nextLine();
			System.out.print("직급 : ");
			String jobName = sc.nextLine();
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			
			String result = service.employeeUpdate(tmpId, email, phone, departmentTitle, jobName, salary);
			System.out.println(result + " 사원의 정보가 수정되었습니다.");
		}
		if(resultArr==null) System.out.println("사번을 확인해주세요");
	}
	
	/**
	 *  5. 사번을 검색해서 삭제 -> B
	 */
	public void employeeDelete() {
		String input = "";
		if(resultArr!=null) {
			
			System.out.print("경고 : 해당 사원의 정보를 삭제하시겠습니까? ( Y / N ) : ");
			input = sc.next();
			int result = service.employeeDelete(tmpId, input);
			
			if(result==-1) {
				System.out.println("사원 정보 삭제가 취소되었습니다.");
			} else {
				System.out.println("사원 정보가 삭제되었습니다.");
			}
		}
	}
	
	/**
	 *  6. 입력 받은 부서와 일치 모든 사원 정보 조회
	 */
	public void selectTitle() {
		String input = "";
		System.out.println("[입력 받은 부서와 일치 모든 사원 정보 조회]");
		System.out.print("부서 :  ");
		input = sc.nextLine();
		
		resultArr = service.selectTitle(input);
	}
	
	/**
	 *  7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회
	 */
	public void selectSalaryUp() {
		int input = 0;
		System.out.println("[입력 받은 급여 이상을 받는 모든 사원 정보 조회]");
		System.out.print("급여(원) :  ");
		input = sc.nextInt();
		sc.nextLine();
		
		resultArr = service.selectSalaryUp(input);
	}
	
	/**
	 * 8. 급여를 모아서 출력
	 */
	public void salarySum() {
		Map<String, Integer> resultMap = service.salarySum();
		
		for(String key : resultMap.keySet() ) {
			System.out.println(key + ": " + resultMap.get(key));
		}
		
	}
	
	
	
	/**
	 *  A. 출력 메서드
	 */
 	public void resultArrPrint() {
		if(resultArr == null) {
			System.out.println("검색 결과가 없습니다. ");
		}
		if(resultArr != null) {
			System.out.printf("%-3s|%-10s|%-15s|%-19s|%-19s|%-9s|%-9s|%-9s\n","사번","이름","주민번호","이메일","전화번호","부서","직급","급여");
			for(int i=0; i<resultArr.length; i++) {
				if(resultArr[i]==null) break;
				System.out.printf("%-4d %-10s %-16s %-20s  %-20s %-10s%-10s%-10d\n",
									resultArr[i].getEmpId(),
									resultArr[i].getEmpName(),
									resultArr[i].getEmpNo(),
									resultArr[i].getEmail(),
									resultArr[i].getPhone(),
									resultArr[i].getDepartmentTitle(),
									resultArr[i].getJobName(),
									resultArr[i].getSalary());
			}
			System.out.println(); // 줄 바꿈
			
		}
	}
 	
 	/**
	 *  B. 사번을 검색해서 값 받아오기
	 */
	public void employeeSelect() {
		int input = 0;
		System.out.print("사번 :  ");
		input = sc.nextInt();
		sc.nextLine();
		tmpId = input;
		
		resultArr = service.empIdSelect(input);
	}
}
