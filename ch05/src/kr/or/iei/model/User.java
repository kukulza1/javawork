package kr.or.iei.model;
//회원 클래스(자료형) 정의
public class User {
       //필드(속성)
	private String id;///필드이름
	private String pwd;
	private String name;
	
	
	public User() {
		//기본생성자
		//System.out.println("user클래스 의생성자입니다");
	}
	public User(String id,String pwd,String name) {
		this.id =id;
		this.pwd =pwd;//생성자필요
		this.name =name;
		//set+필드이름()-입력,get+필드이름()함수-출력
	}
	public void setid(String id) {
		this.id = id;
	}
	
	public String getid() {
		return id;
	}
	public void setpwd(String pwd) {
		this.pwd = pwd;
	}
	public String getpwd() {
		return pwd;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
}
