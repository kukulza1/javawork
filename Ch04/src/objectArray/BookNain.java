package objectArray;

public class BookNain {

	public static void main(String[] args) {
		/*Book[] library = new Book[3];
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}*/
		//객체생성(배열에 저장)
		/*library[0] = new Book("자바 프로그램","백은종");
		library[1] = new Book("웹 표준의정석","SB");
		library[2] = new Book("스프링부트","GG");*/
		
		Book[]library= {
				new Book("자바 프로그래밍 입문","박은종"),
				new Book("웹 표준의 정석","고경희"),
				new Book("스프링부트","ㅎㅎ")
				
		};
		
		//출력
		library[0].showBookInfo();
	
		System.out.println("======================");
		//전체출력
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i].showBookInfo());
			
	    
		}
		System.out.println("====================================");
		//향상된 for문
				for(Book book : library)
					System.out.println(book.showBookInfo());
	}

}
