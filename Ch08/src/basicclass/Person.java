package basicclass;

public class Person {
	//필드
	private String name;
	private int age;
	
	//생성자
    public Person() {
    	
    }
    //매서드
    public Person(String name,int age) {
    	this.name=name;
    	this.age=age;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
}
