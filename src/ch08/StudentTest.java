package ch08;

//view의 역할
public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student(100, "인성1"); //studentId, studentName이 private 변수이지만 이는 매개변수를 전달하는 것이므로 private 변수와 무관하다.
		Student student2 = new Student(101, "인성2");
		
		student1.setKoreanSubject("국어", 100);
		student1.setMathSubject("수학", 100);
		student1.showStudentScore();
		
		student2.setKoreanSubject("국어", 99);
		student2.setMathSubject("수학", 100);
		student2.showStudentScore();
		
		System.out.println();
		
		System.out.println(student1.getStudentName() + " 학생의 학번은 "+student1.getStudetId() + "입니다.");
		System.out.println(student2.getStudentName() + " 학생의 학번은 "+student2.getStudetId() + "입니다.");
		 
		System.out.println();
		
		student2.setStudentName("인성3");
		student2.showStudentScore();
	}
}
