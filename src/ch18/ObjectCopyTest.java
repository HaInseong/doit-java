package ch18;

//객체 배열의 깊은 복사 = 각은 객체를 가르키는 인스턴스가 아닌 새로운 인스턴스 생성하여 각각 다른 참조값을 가진다. 그러므로 값의 변경도 각각 유효하게 적용된다.
public class ObjectCopyTest {
	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		for(int i=0; i<library.length; i++) {
			copyLibrary[i] = new Book();
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		library[0].setAuthor("박완서");
		library[0].setTitle("나목");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println();
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
	}

}
