package ch04;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "Lee");
		studentLee.studentAddress = "서울시 강남구";
		studentLee.showStudentInfo();
		System.out.println("get을 이용한 name값 가져오기: " + studentLee.getStudentName());
		
		System.out.println();
		
		Student studentKim = new Student(101, "Kim", "NewYork");
		studentKim.showStudentInfo();
		System.out.println("get을 이용한 name값 가져오기: " + studentKim.getStudentName());
		
		System.out.println();
		
		System.out.println(studentKim); //16진수, 참조변수가 가리키는 객체의 주소를 클래스 풀네임 @ 해시코드(참조값)로 출력해준다.
		System.out.println(studentLee);
	}

}
