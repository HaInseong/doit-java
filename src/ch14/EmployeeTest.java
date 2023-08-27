package ch14;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeHa = new Employee();

		Employee employeeChoi = new Employee();
	
		System.out.println(employeeHa.getEmployeeId());
		System.out.println(employeeChoi.getEmployeeId());
		System.out.println(Employee.getSerialNum());

	}

}
