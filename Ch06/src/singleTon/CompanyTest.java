package singleTon;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company1 company1 = Company1.getInstance();
		Company1 company2 = Company1.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		System.out.println(company1 == company2);//true

	}

}
