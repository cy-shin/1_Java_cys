package employee.model.sevice;

import java.util.ArrayList;

import employee.model.vo.Improved;

public class ImprovedService {
	
	Improved i = new Improved();
	
	ArrayList<Improved> empList = new ArrayList<>();
	
	public ImprovedService() {
		// int empId, String empName, String empNo,
		// String email, String phone, private String departmentTitle,
		// private String jobName, private int salary
		empList.add(0, new Improved(1,"일길동","123456-1234567", "hgd1@", "00000000000", "인사관리부", "부장", 7200000));
		empList.add(1, new Improved(2,"이길동","123456-1234567", "hgd2@", "00000000000", "영업부", "부장", 7200000));
		empList.add(2, new Improved(3,"삼길동","123456-1234567", "hgd3@", "00000000000", "총무부", "부장", 7200000));
		empList.add(3, new Improved(4,"사길동","123456-1234567", "hgd4@", "00000000000", "총무부", "시원", 2700000));
	}
	
	// 출력용 메서드
	// 리스트를 입력받아서 리스트를 출력?
	public void forPrint(ArrayList<Improved> list) {
		for(Improved i : empList) {
			System.out.println(i);
		}
	}
	
	public ArrayList<Improved> returnList() {
		ArrayList<Improved> resultList = new ArrayList<>();
		int input = 3000000;
		int idx = 0;
		for(Improved i : empList) {
			if(empList.get(idx).getSalary() >= input) {
				resultList.add(empList.get(idx));
			}
		}
		return resultList;
		
	}
	
	
	
	
}
