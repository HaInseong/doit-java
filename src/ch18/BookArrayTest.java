package ch18;

public class BookArrayTest {

	public static void main(String[] args) {
		//지금은 Book이라는 데이터타입을 직접 가져다가 썼지만, JDK에서 제공하는 객체 배열을 구현한 ArrayList를 사용하면 여러가지 메소드가 제공되서 편해진다.
		Book[] library = new Book[5];
		
		for(Book book : library) {
			System.out.println(book);
		}
		
		System.out.println();
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		for(Book book : library) {
			System.out.println(book);
			book.showBookInfo();
		}
	}

}
