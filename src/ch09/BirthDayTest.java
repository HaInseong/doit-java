package ch09;

public class BirthDayTest {

	public static void main(String[] args) {
		BirthDay birthDay = new BirthDay();
		BirthDay birthDay2 = new BirthDay();
		
		birthDay.setBirthDay(19); 
		birthDay.setYear(2023);
		birthDay.setMoth(12);
		
		System.out.println(birthDay.isValid());
		
		System.out.println();
		
		System.out.println(birthDay); //참조변수가 가르키는 값과 printThis() 안에서 this가 가르키는 참조값은 똑같이 생성된 인스턴스 Address를 가르킨다.
		birthDay.printThis();
		
		System.out.println();
		
		System.out.println(birthDay2);
		birthDay2.printThis();

	}

}
