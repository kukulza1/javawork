package basicclass;

public class Book{ //extends Object {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	//매서드 재정의

	@Override
	public String toString() {
		return bookTitle+","+bookNumber;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	

}
