package employee.model.sevice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import employee.model.vo.Employee;
import employee.model.vo.OM;

public class OMService {

	OM om = new OM();
	
	List<OM> list = new ArrayList<>();
	
	public OMService() {
		// int empId, String empName, String empNo, String email,
		// String phone, String departmentTitle, String jobName, int salary
		list.add(0, new OM(1, "홍길동", "700101-1******", "redroadcoin@", "000-0000-0000", "재무", "부장", 6000000));
		list.add(1, new OM(2, "일지매", "750202-1******", "journalhawk@", "111-1111-1111", "인사", "부장", 6300000));
		list.add(2, new OM(3, "임꺽정", "800303-2******", "nnervous@", "222-2222-2222", "홍보", "차장", 5100000));
		list.add(3, new OM(4, "김흥부", "900404-2******", "heungboo@", "333-3333-3333", "기획", "부장", 6500000));
		list.add(4, new OM(5, "이놀부", "930505-1******", "greedy@", "555-5555-5555", "재무", "대리", 3300000));
		list.add(5, new OM(6, "박까치", "960707-2******", "ilikegourd@", "777-7777-7777", "인사", "대리", 3400000));
		list.add(6, new OM(7, "최뱁새", "000808-3******", "veryfast@", "888-8888-8888", "인사", "사원", 2300000));
		list.add(7, new OM(8, "정황새", "011010-4******", "conditions@", "999-9999-9999", "기획", "주임", 2800000));
	}

	/** 1. 새로운 사원 정보 추가
	 * @param empName
	 * @param empNo
	 * @param email
	 * @param phone
	 * @param departmentTitle
	 * @param jobName
	 * @param salary
	 */
	public void registration(String empName, String empNo, String email, String phone, String departmentTitle, String jobName, int salary) {
		int empId = list.size() + 1;
		String empNoHide = "";
		for(int i=0; i<empNo.length(); i++) {
			if(i>=8) empNoHide += '*';
			if(i<8) empNoHide += empNo.charAt(i);
		}
		list.add(new OM(empId, empName, empNoHide, email, phone, departmentTitle, jobName, salary));
	}
	
	/** 2. 전체 사원 정보 조회
	 * @return 전체 리스트
	 */
	public List selectAll() {
		List<OM> resultList = list;
		return resultList;
	}

	
	/** 3. 사번이 일치하는 사원 정보 조회
	 * @param inputId : 입력한 사번
	 * @return 사번이 일치하는 사원의 정보를 저장한 리스트
	 */
	public List<OM> selecyById(int inputId) {
		List<OM> resultList = new ArrayList<>();
		for(OM om : list) {
			if(inputId==om.getEmpId()) {
				resultList.add(om);
			}
		}
		return resultList;
	}
	
	
	/** 4. 사번이 일치하는 사원 정보 수정
	 * @param agree
	 * @param inputId
	 * @param email
	 * @param phone
	 * @param departmentTitle
	 * @param jobName
	 * @param salary
	 * @return
	 */
	public void updateById(int inputId, String email, String phone, String departmentTitle, String jobName, int salary) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getEmpId()==inputId) {
				if(!(email.equals("0"))) list.get(i).setEmail(email);
				if(!(phone.equals("0"))) list.get(i).setPhone(phone);
				if(!(departmentTitle.equals("0"))) list.get(i).setDepartmentTitle(departmentTitle);
				if(!(jobName.equals("0"))) list.get(i).setJobName(jobName);
				if(salary != 0) list.get(i).setSalary(salary);
			}
		}
	}
	
	/** 5. 사번이 일치하는 사원 정보 삭제
	 * @param inputId
	 * @return 
	 */
	public void deleteById(int inputId) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getEmpId()==inputId) {
				list.remove(i);
			}
			
		}
	}
	
	/** 6. 입력 받은 부서와 일치 모든 사원 정보 조회
	 * @param inputTitle : 입력한 부서명
	 * @return 부서명이 일치하는 사원의 정보를 저장한 리스트
	 */
	public List<OM> selectByTitle(String inputTitle) {
		List<OM> resultList = new ArrayList<>();
		for(OM om : list) {
			if(inputTitle.equals(om.getDepartmentTitle())) {
				resultList.add(om);
			}
		}
		return resultList;
	}
	
	
	/** 7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회
	 * @param inputSalary ; 입력한 급여
	 * @return 입력한 급여 이상을 받는 사원의 정보를 저장한 리스트
	 */
	public List<OM> selectBySalary(int inputSalary) {
		List<OM> resultList = new ArrayList<>();
		for(OM om : list) {
			if(inputSalary<=om.getSalary()) {
				resultList.add(om);
			}
		}
		return resultList;
	}
	
	/** 8. 부서별 급여 합 전체 조회
	 * @return 부서별 급여 합계가 저장된 리스트
	 */
	public Map<String, Integer> titleSalary() {
		Map<String, Integer> map = new HashMap<>();
		
		// 1. 급여명을 저장하고 0으로 초기화
		for(OM om : list) {
			map.put(om.getDepartmentTitle(), 0);
		}
		// 2. 부서에 급여를 누적함
		for(OM om : list) {
			for(String title : map.keySet()) {
				if(om.getDepartmentTitle().equals(title)) {
					int tmp = map.get(title) + om.getSalary();
					map.put(title, tmp);
				}
			}
		}
		return map;
	}
	
}
