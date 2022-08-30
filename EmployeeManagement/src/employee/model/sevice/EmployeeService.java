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
		list.add(0, new Employee(1, "홍길동", "000000-0000000", "redroadonecoin", "000-0000-0000", "재무", "대리", 3300000));
		list.add(1, new Employee(2, "홍길동", "111111-1111111", "redroadonecoin", "111-1111-1111", "인사", "과장", 6000000));
		list.add(2, new Employee(3, "김둘리", "222222-2222222", "redroadonecoin", "222-2222-2222", "인사", "사원", 2700000));
		list.add(3, new Employee(4, "이도우너", "333333-3333333", "redroadonecoin", "333-3333-3333", "인사", "대리", 3000000));
		list.add(4, new Employee(5, "박또치", "123456-1234567", "redroadonecoin", "123-1234-1234", "인사", "대리", 3000000));
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
		int idx = list.size() - 1;
		int empId = idx + 1;
		list.add(idx, new Employee(empId, empName, empNo, email, phone, departmentTitle, jobName, salary));
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
	 * @param input
	 * @return
	 */
	public Employee[] empIdSelect(int input) {
		Employee[] resultArr = new Employee[list.size()];
		int resultIdx = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getEmpId()==input) {
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
	
	
	public String employeeUpdate(int tmpId, String email, String phone, String departmentTitle, String jobName, int salary) {
		if(!(email.equals("0"))) list.get(tmpId).setEmail(email);
		if(!(phone.equals("0"))) list.get(tmpId).setPhone(phone);
		if(!(departmentTitle.equals("0"))) list.get(tmpId).setDepartmentTitle(departmentTitle);
		if(!(jobName.equals("0"))) list.get(tmpId).setJobName(jobName);
		if(!(salary==0)) list.get(tmpId).setSalary(salary);
		return list.get(tmpId).getEmpName();
	}
	
	/** 5. 사번을 검색해서 삭제
	 * @param tmpid : 사번
	 * @param input 
	 *  N : 삭제 안함
	 *  Y : 삭제 
	 * @return 
	 * -1 : 삭제 안함
	 *  그외 : 삭제
	 */
	public int employeeDelete(int tmpId, String input) {
		int deleteIdx = -1;
		
		if(input.toUpperCase().equals("Y")) {
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getEmpId() == tmpId) {
					deleteIdx = i;
					list.remove(deleteIdx);
					break;
				}
			}
		}
		if (input.toUpperCase().equals("N")) {
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


	public Map<String, Integer> salarySum() {
		Map<String, Integer> departMap = new HashMap<>();
		
		// 부서 중복 제거
		for(int i=0; i<list.size(); i++) {
				departMap.put((list.get(i).getDepartmentTitle()), 0);
		}
		// 부서 값 찾아서 sum만들기
		
		return departMap;
		
	}
	
	
	
	
//	public Employee[] listGet(int resultIdx) {
//		Employee[] tempArr = new Employee[list.size()];
//		tempArr[resultIdx] = new Employee(list.get(resultIdx).getEmpId(),
//			    							  list.get(resultIdx).getEmpName(),
//			    							  list.get(resultIdx).getEmpNo(),
//			    							  list.get(resultIdx).getEmail(),
//			    							  list.get(resultIdx).getPhone(),
//			    							  list.get(resultIdx).getDepartmentTitle(),
//			    							  list.get(resultIdx).getJobName(),
//			    							  list.get(resultIdx).getSalary());
//		return tempArr;
//	}

	
}
