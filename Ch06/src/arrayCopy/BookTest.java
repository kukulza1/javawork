package arrayCopy;


public class BookTest {

	public static void main(String[] args) {
		//객체를 저장할 크기가 3인배열 생성
		Book[] books = new Book[3];
		
		
		Book book1 = new Book("개미","베르나르");
		Book book2 = new Book("소설","SB");
		Book book3 = new Book("미생","조태호");
		
		//인덱스 순서에 따라 저장
		books[0]= book1;
		books[1]= book2;
		books[2]= book3;
		
		
		
		
		
		//1개출력
		System.out.println(books[2]);
		
		//전체
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i]);
		}
		
		//System.out.println(book1);
		//System.out.println(book1.toString());

	}
}


