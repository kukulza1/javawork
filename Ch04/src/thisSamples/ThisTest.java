package thisSamples;

public class ThisTest {

	public static void main(String[] args) {
		//생성된 인스턴스 - bDay와 클래스의 this속성과 주소가 같다.
		BirthDay bDay=new BirthDay();
		bDay.setYear(2023);
		
		System.out.println(bDay);	
		//bDay.printThis();
		

	}

}
