package ch08;

//view의 역할
public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student(100, "인성1");
		Student student2 = new Student(101, "인성2");
		
		student1.setKoreanSubject("국어", 100);
		student1.setMathSubject("수학", 100);
		student1.showStudentScore();
		
		student2.setKoreanSubject("국어", 99);
		student2.setMathSubject("수학", 100);
		student2.showStudentScore();
		
	}
}
