package inheritance.Person;

public class Main {

	public static void main(String[] args) {
		//lee가 person 필드를 사용할수 있음
		Engineer lee = new Engineer("SB",31,111);
		System.out.println("이름:"+ lee.getName());
		System.out.println("나이"+ lee.getAge());
		System.out.println("사번"+lee.getCompanyId());
	//	lee.name="SB";
	//	lee.age=31;
	//	lee.companyId =111;
	}

}
