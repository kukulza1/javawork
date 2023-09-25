package functioninterface.object;

public class LamdaPersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		
		//추상메서드 구현
		p1.action(()->{
			System.out.println("출근합니다");
			System.out.println("프로그래밍을합니다");
		});
		
		p1.action(()->{
			System.out.println("퇴근합니다");
		});

	}

}
