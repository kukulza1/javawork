package collection.list;

//vo(Value Object)-자료형

public class Board {
	//필드 
	private String title;
	private String content;
	private String writer;
	
	public Board(String title,String content,String writer) {
		this.title=title;
		this.content=content;
		this.writer=writer;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setContent(String content) {
		this.content=content;
	}
	public String getContent() {
		return content;
	}
	public void setWriter(String writer) {
		this.writer=writer;
	}
	public String getWriter() {
		return writer;
	}
}
