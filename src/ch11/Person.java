package ch11;

//this는 자기 자신의 인스턴스에 대한 Address
public class Person {
	private String name;
	private int age;
	
	public Person() {
		this("이름없음", 1); //this로 오버로딩된 다른 생성자를 호출할 수 있다.
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person getPerson() {
		return this; //객체 자신의 주소값 반환
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		
		System.out.println(person.getPerson());
		System.out.println(person.getPerson().name);
		System.out.println(person.getPerson().age);
		System.out.println(person.name);
		System.out.println(person.age);
		
	}

}
