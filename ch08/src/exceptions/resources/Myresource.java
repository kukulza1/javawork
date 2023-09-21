package exceptions.resources;

public class Myresource implements AutoCloseable{
	//필드
	private String text;
	//생성자
	public Myresource(String text) {
		this.text = text;
		System.out.println("Myresource:("+text+")읽기");
		
	}
	//매서드
	public String read1() {
		System.out.println("Myresource:("+text+")읽기");
		return"100";
	}
	public String read2() {
		System.out.println("Myresource:("+text+")읽기");
		return"123a";
	}
	@Override
	public void close() throws Exception {
		System.out.println("Myresource:("+text+")닫기");
		
	}
	

}
