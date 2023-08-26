package ch04;

public class Student {
	int studentId;
	String studentName;
	String studentAddress;
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + studentAddress);
	}
	
	public String getStudentName() {
		return studentName;
	}
	

}
