package ch14;

public class Employee {
	
	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		employeeId = serialNum++;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public static int getSerialNum() {
		int i = 0; //메모리 생성이 보장되어야 하는 인스턴스 변수만 사용불가할 뿐, 지역변수는 사용 가능하다.
//		employeeName = "Lee"; //static 메소드는 인스턴스 생성없이 사용 가능하지만 인스턴스 변수는 그것이 아니므로 인스턴스 변수는 static 메소드 내에서 사용할 수 없다.
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Employee.serialNum = serialNum;
	}
	
}
