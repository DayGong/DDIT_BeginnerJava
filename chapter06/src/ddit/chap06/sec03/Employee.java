package ddit.chap06.sec03;

public class Employee {
	// 사원번호, 사원명, 부서명, 전화번호
	private int empID;
	private String empName;
	private String deptName;
	private String telNum;

	Employee(int empID, String empName, String deptName, String telNum) {
		this.empID = empID;
		this.empName = empName;
		this.deptName = deptName;
		this.telNum = telNum;
	}
	
	@Override
	public String toString() {
		String res = "-----------------------------------";
		res = res+"\n사원번호: "+empID;
		res = res+"\n사원명: "+empName;
		res = res+"\n부서명: "+deptName;
		res = res+"\n전화번호: "+telNum;
		
		return res;
	}
}
