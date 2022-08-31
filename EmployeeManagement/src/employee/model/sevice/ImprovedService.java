package employee.model.sevice;

import java.util.ArrayList;

import employee.model.vo.Improved;

public class ImprovedService {
	
	Improved i = new Improved();
	
	ArrayList<Improved> empList = new ArrayList<>();
	
	public ImprovedService() {
		empList.add(0, new Improved(int empId, String empName, String empNo, String email, String phone, private String departmentTitle, private String jobName, private int salary))
	}
}
