package ch16;

import java.util.Calendar;

public class SchoolTest {

	public static void main(String[] args) {
		
		School school1 = School.getInstance(); //싱글톤 객체는 외부에서 new 할 수 없어서 static 메소드로 선언해두었으므로 클래스 변수를 통해 호출해야한다. 
		School school2 = School.getInstance();
		
		System.out.println(school1 == school2); //같은 객체를 가르키는 주소값을 가지므로 true가 반환된다.
		
		Calendar calendar = Calendar.getInstance(); 
		//날짜, 시간은 이 객체가 가지는 인스턴스의 값이 여러개가 되고 여러개가 생성이 되면 문제가 된다. 그러므로 유일한 객체인 싱글톤을 적용한다.
	}

}
