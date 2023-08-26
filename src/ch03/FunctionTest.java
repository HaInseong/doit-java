package ch03;

public class FunctionTest {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2); //main함수의 지역변수
		
		System.out.println(total);
		
		sayHello("하이");
		
		int sum = clacSum();
		System.out.println(sum);
	}
	
	//main함수가 static이기 때문에 main에서 호출하는 함수도 static이어야 함.
	public static int addNum(int num1, int num2) {//addNum함수의 지역변수, main의 매개변수와 메서드의 매개변수는 같지 않아도 된다. type만 같으면 된다.
		return num1+num2;
	}
	
	public static void sayHello(String str) { //반환값이 없는 메소드
		System.out.println(str);
	}
	
	public static int clacSum() {
		int i;
		int sum = 0;
		for(i=0; i<=100; i++) {
			sum += i;
		}
		return sum;
	}

}
