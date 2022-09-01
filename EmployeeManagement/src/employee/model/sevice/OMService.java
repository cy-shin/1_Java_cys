package employee.model.sevice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import employee.model.vo.OM;

public class OMService {

	OM om = new OM();
	
	List<OM> list = new ArrayList<>();
	
	public OMService() {
		// int empId, String empName, String empNo, String email,
		// String phone, String departmentTitle, String jobName, int salary
		list.add(0, new OM(1,"일길동","123456-1234567", "hgd1@", "00000000000", "인사부", "부장", 7200000));
		list.add(1, new OM(2,"이길동","123456-1234567", "hgd2@", "00000000000", "영업부", "부장", 7200000));
		list.add(2, new OM(3,"삼길동","123456-1234567", "hgd3@", "00000000000", "총무부", "부장", 7200000));
		list.add(3, new OM(4,"사길동","123456-1234567", "hgd4@", "00000000000", "총무부", "시원", 2700000));
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
	
	
	public int updateById(String agree, int inputId, String email, String phone, String departmentTitle, String jobName, int salary) {
		boolean flag = false;
		
		if(flag) return 0;
		return -1;
	}
	
	/** 5. 사번이 일치하는 사원 정보 삭제
	 * @param agree
	 * @param inputId
	 * @return 
	 *  0 : 삭제 완료
	 * -1 : 삭제 취소
	 */
	public int deleteById(String agree, int inputId) {
		boolean flag = false;
		if(agree.toUpperCase()=="Y") {
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getEmpId()==inputId) {
					list.remove(i);
					flag = true;
				}
			}
		}
		if(flag) return 0;
		return -1;
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
