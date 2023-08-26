package ch04;

public class Student {
	int studentId;
	String studentName;
	String studentAddress;
	
	public Student() {
		
	}
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public Student(int studentId, String studentName, String studentAddress) { //생성자 메소드 오버로딩
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + studentAddress);
	}
	
	public String getStudentName() {
		return studentName;
	}
	

}
