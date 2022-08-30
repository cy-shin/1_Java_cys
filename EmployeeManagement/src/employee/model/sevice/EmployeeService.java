package employee.model.sevice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import employee.model.vo.Employee;

public class EmployeeService {

	ArrayList<Employee> list = new ArrayList<>();
	
	
	public EmployeeService() {
		list.add(0, new Employee(1, "홍길동", "700101-1******", "redroadcoin@", "000-0000-0000", "재무", "부장", 6000000));
		list.add(1, new Employee(2, "일지매", "750202-1******", "journalhawk@", "111-1111-1111", "인사", "부장", 6300000));
		list.add(2, new Employee(3, "임꺽정", "800303-2******", "nnervous@", "222-2222-2222", "홍보", "차장", 5100000));
		list.add(3, new Employee(4, "김흥부", "900404-2******", "heungboo@", "333-3333-3333", "기획", "부장", 6500000));
		list.add(4, new Employee(5, "이놀부", "930505-1******", "greedy@", "555-5555-5555", "재무", "대리", 3300000));
		list.add(5, new Employee(6, "박까치", "960707-2******", "ilikegourd@", "777-7777-7777", "인사", "대리", 3400000));
		list.add(6, new Employee(7, "최뱁새", "000808-3******", "veryfast@", "888-8888-8888", "인사", "사원", 2300000));
		list.add(7, new Employee(8, "정황새", "011010-4******", "conditions@", "999-9999-9999", "기획", "주임", 2800000));
	}

	
	
	/** 사원 정보 추가
	 * @param empName
	 * @param empNo
	 * @param email
	 * @param phone
	 * @param departmentTitle
	 * @param jobName
	 * @param salary
	 * @return
	 */
	public int addEmployee(String empName, String empNo, String email, String phone, String departmentTitle, String jobName, int salary) {
		// 주민번호 가리기
		String empNoHide = "";
		for(int i=0; i<empNo.length(); i++) {
			if(i<8) empNoHide += empNo.charAt(i);
			if(i>=8) empNoHide += "*";
		}
		
		int idx = list.size();
		int empId = idx + 1;
		
		list.add(idx, new Employee(empId, empName, empNoHide, email, phone, departmentTitle, jobName, salary));
		return 1;		
	}
	
	
	/** 2. 전체 정보 조회
	 * @return
	 */
	public Employee[] viewAll() {
		Employee[] resultArr = new Employee[list.size()];
		for(int i=0; i<list.size(); i++) {
				resultArr[i] = new Employee(list.get(i).getEmpId(),
					    list.get(i).getEmpName(),
					    list.get(i).getEmpNo(),
					    list.get(i).getEmail(),
					    list.get(i).getPhone(),
					    list.get(i).getDepartmentTitle(),
					    list.get(i).getJobName(),
					    list.get(i).getSalary());
		}
		return resultArr;
	}
	
	
	/** 3. 사번으로 조회
	 * @param inputId
	 * @return
	 */
	public Employee[] empIdSelect(int inputId) {
		Employee[] resultArr = new Employee[list.size()];
		int resultIdx = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getEmpId()==inputId) {
				resultArr[resultIdx++] = new Employee(list.get(i).getEmpId(),
					    list.get(i).getEmpName(),
					    list.get(i).getEmpNo(),
					    list.get(i).getEmail(),
					    list.get(i).getPhone(),
					    list.get(i).getDepartmentTitle(),
					    list.get(i).getJobName(),
					    list.get(i).getSalary());
				
			}
		}
		if(resultIdx == 0) return null;
		return resultArr;
	}
	
	
	/** 4. 사번을 검색해서 정보 수정
	 * @param inputId 입력한 사번
	 * @param email
	 * @param phone
	 * @param departmentTitle
	 * @param jobName
	 * @param salary
	 * @return 사번에 해당하는 이름
	 */
	public String employeeUpdate(int inputId, String email, String phone, String departmentTitle, String jobName, int salary) {
		if(!(email.equals("0"))) list.get(inputId).setEmail(email);
		if(!(phone.equals("0"))) list.get(inputId).setPhone(phone);
		if(!(departmentTitle.equals("0"))) list.get(inputId).setDepartmentTitle(departmentTitle);
		if(!(jobName.equals("0"))) list.get(inputId).setJobName(jobName);
		if(!(salary==0)) list.get(inputId).setSalary(salary);
		return list.get(inputId).getEmpName();
	}
	
	/** 5. 사번을 검색해서 삭제
	 * @param inputid : 입력한 사번
	 * @param input : 
	 *  N : 삭제 안함
	 *  Y : 삭제 
	 * @return 
	 * -1 : 삭제 안함
	 *  그외 : 삭제
	 */
	public int employeeDelete(int inputId, String agree) {
		int deleteIdx = -1;
		
		if(agree.toUpperCase().equals("Y")) {
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getEmpId() == inputId) {
					deleteIdx = i;
					list.remove(deleteIdx);
					break;
				}
			}
		}
		if (agree.toUpperCase().equals("N")) {
			deleteIdx = -1;
		}
		return deleteIdx;
		
	}
	
	
	/** 6. 부서 내 사원 전체 조회
	 * @param input
	 * @return
	 */
	public Employee[] selectTitle(String input) {
		Employee[] resultArr = new Employee[list.size()];
		int resultIdx = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getDepartmentTitle().equals(input)) {
				resultArr[resultIdx++] = new Employee(list.get(i).getEmpId(),
					    list.get(i).getEmpName(),
					    list.get(i).getEmpNo(),
					    list.get(i).getEmail(),
					    list.get(i).getPhone(),
					    list.get(i).getDepartmentTitle(),
					    list.get(i).getJobName(),
					    list.get(i).getSalary());
			}
		}
		if(resultIdx == 0) return null;
		return resultArr;
	}
	
	/** 7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회
	 * @param input
	 * @return
	 */
	public Employee[] selectSalaryUp(int input) {
		Employee[] resultArr = new Employee[list.size()];
		int resultIdx = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getSalary() >= input) {
				resultArr[resultIdx++] = new Employee(list.get(i).getEmpId(),
					    list.get(i).getEmpName(),
					    list.get(i).getEmpNo(),
					    list.get(i).getEmail(),
					    list.get(i).getPhone(),
					    list.get(i).getDepartmentTitle(),
					    list.get(i).getJobName(),
					    list.get(i).getSalary());
			}
		}
		if(resultIdx == 0) return null;
		return resultArr;
	}


	/** 8. 부서별 급여 합 전체 조회
	 * @return 부서 및 부서별 급여 총계가 적힌 Map
	 */
	public Map<String, Integer> salarySum() {
		Map<String, Integer> departMap = new HashMap<>();
		// 1. 리스트에 적힌 부서를 map에 저장
		// 2. 리스트에서 부서를 확인하고, map의 키와 같으면 map의 키에 해당하는 값에 더함
		
		// 리스트에 적힌 부서를 map의 key 부분에 저장하고 value는 0으로 초기화함
		for(int i=0; i<list.size(); i++) {
			departMap.put((list.get(i).getDepartmentTitle()), 0);
		}
		
		for(int i=0; i<list.size(); i++) { // 리스트에 순차접근
			for(String s : departMap.keySet()) { // 맵에 순차접근
				if(s.equals(list.get(i).getDepartmentTitle())) { // 만약 맵의 key(부서명)과 리스트의 부서명이 같으면
					departMap.put(s, departMap.get(s) + list.get(i).getSalary());
					// departMap의 현재 키(s)에 해당하는 값(현재 map에 저장된 salary)를 불러와 리스트에 저장된 샐러리를 더해 누적한다.
					// put 메서드를 이용해, 현재 키에 해당하는 값(샐러리)을 앞서 계산해 얻은 누적 샐러리로 덮어쓴다
				}
			}
		}
		// 부서 값 찾아서 sum만들기
		
		return departMap;
		
	}
	
}
