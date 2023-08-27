package ch16;

public class School {
	
	private static School instance = new School(); //instance가 유일한 객체를 가르키는 참조변수이다.
	//싱글톤은 한 개의 객체는 있어야 하는데, 이 한 개는 내부에서 만든다.
	
	
	private School() {
		//외부에서 School 객체 생성 불가
	}
	
	
	public static School getInstance() { //만들어진 유일한 객체를 외부에서 가져다 쓸 수 있도록 메소드를 작성해준다.
		if(instance == null) {
			instance = new School(); //혹시라도 instance가 만들어지지 않았다면 이곳에서 생성하는 코드를 추가해준다.
		}
		return instance;
	}
}
