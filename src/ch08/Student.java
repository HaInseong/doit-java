package ch08;

//Controller + Service 역할
public class Student {
	int studentId;
	String studentName;
	
	Subject korean = new Subject();
	Subject math = new Subject();

// 해당 클래스의 속성으로 해당되지 않는 속성들이므로 따로 클래스를 과목으로 분리하여 작성한다.
//	int koreanStore;
//	int mathScore;
//	
//	String KoreanName;
//	String mathName;
	
	public Student(int id, String name) {
		this.studentId = id;
		this.studentName = name;
		
//		korean = new Subject(); //해당 클래스의 인스턴스를 생성하지 않으면 해당 클래스의 필드, 메소드를 사용할 수 없다.
//		math = new Subject(); 
	}
	
	public void setKoreanSubject(String name, int score) {
		korean.subjectName = name;
		korean.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentScore() {
		int total = korean.score + math.score;
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
	}
}
