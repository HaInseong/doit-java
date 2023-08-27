package ch13;

//객체간 협력
public class TakeTransTest {

	public static void main(String[] args) {
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Subway subwayGreen = new Subway(2);
		
		studentJ.takeBus(bus100); 
		//1. 위에서 생성한 버스의 인스턴스를 매개변수로 Student 객체로 넘겨준다. 
		//2. Student 객체의 메서드에서 넘겨받은 버스 인스턴스로 객체간 연결을 하여 버스 객체의 메소드를 사용한다.
		//3. 객체간 연결로 인해 활용된 모든 객체의 필드에 영향을 준다.
		studentT.takeSubway(subwayGreen);
		
		studentJ.showStudentInfo();
		studentT.showStudentInfo();
		
		bus100.showBusInfo();
		subwayGreen.showSubwayInfo();
	}

}
