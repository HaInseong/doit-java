package ch09;

public class BirthDayTest {

	public static void main(String[] args) {
		BirthDay birthDay = new BirthDay();
		
		birthDay.setBirthDay(19); 
		birthDay.setYear(2023);
		birthDay.setMoth(12);
		
		System.out.println(birthDay.isValid());

	}

}
