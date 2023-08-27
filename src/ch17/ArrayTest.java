package ch17;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int arr2[] = new int[10];
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		//배열의 크기가 n개라고 하면 배열의 인덱스는 0부터 n-1까지 있다.
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println();
		
		int[] ids;
		ids = new int[] {10, 20, 30};
		
		for(int id : ids) { 
			//배열의 처음부터 끝까지 순회를 할 때는 향상된 for문 사용한다.
			//ids배열의 인덱스 0번부터 n-1까지 하나씩 돌면서 각각의 데이터들을 같은 타입인 id라는 변수에 넣어주라는 의미이다.
			System.out.println(id);
		}
		
		System.out.println();
		
		int[] arr = new int[10];
		for(int i=0, num=1; i<arr.length; i++, num++) {
			arr[i] = num;
		}
		
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total);
		
		System.out.println();
		
		int count = 0;
		double[] dArr = new double[5]; //배열의 전체 사이즈와 요소의 사이즈는 다를 수 있다.
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
		double mtotal = 1;
		
		for(int i=0; i<count; i++) {
			mtotal *= dArr[i];
		}
		System.out.println(mtotal);
		
		System.out.println();
		
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch++;
		}
		for(char alpha : alphabets) {
			System.out.print(alpha + "   ");
		}
	}
}
