package nestedclass;

//지역내부 클래스
class Outer{
	int outNum = 100;
	static int sNum=200;
	
	//메서드
	Runnable getRunnable() {
		final int num = 10; //로컬변수
		
		class MyRunnable implements Runnable{
              int localN = 20;
           
			@Override
			public void run() {
				//num=20; 상수로 변환되어 변경불가
				System.out.println(outNum+"(외부클래스의 인스턴스 변수)");
				System.out.println(sNum+"(외부클래스의 정적 변수)");
				System.out.println(localN+"(내부클래스의 맴버 변수)");
				System.out.println(num);
			}
			
		}
		/*MyRunnable mr = new MyRunnable();
		return mr;*/
		
		return new MyRunnable();
	}
}
public class LocalinnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o1 = new Outer();
		o1.getRunnable().run();

	}

}
