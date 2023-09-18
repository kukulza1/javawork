package arrayCopy;

public class Book {
	String bookName;
	String author;
	
	public Book() {}//기본생성자
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
		
	}
	public void setBookname(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookName() {
		return bookName;
		
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	//객체의 문자열정보 재정의
	@Override
	public String toString() {
		return bookName+","+author;
	}
}
