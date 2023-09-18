package inheritance.Person;

//Engineer가 person을 상속받음

public class Engineer extends Person{
	int companyId;
	
	//매개변수 있는 생성자를 상속받을땐 super()사용
	public Engineer(String name, int age, int company) {
		super(name,age);
		this.companyId = companyId;//자식클래스의 필드 초기화
	}
       public int getCompanyId() {
    	   return companyId;
       }
}
