package interfaceEx.inheritance;

public class MyclassT {

	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		
		X x = m1;
		x.X();
		
		Y y = m1;
		y.y();
		System.out.println("=================");
		//X와Y를 상속한 Myinterface의 인스턴스 ic1생성
		Myinterface ic1 = m1;
		ic1.X();
		ic1.Y();
		ic1.method();

	}

}
