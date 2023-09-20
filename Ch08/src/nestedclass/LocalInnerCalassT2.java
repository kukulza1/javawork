package nestedclass;

class Out{
	int outNum = 100;
	static int sNum=200;
	
	//클래스 이름을 사용하지 않은 익명(Annoymous)클래스
	Runnable run1 = new Runnable(){
		int localN = 20;
		@Override
		public void run() {
			System.out.println(outNum+"(외부클래스의 인스턴스 변수)");
			System.out.println(sNum+"(외부클래스의 정적 변수)");
			System.out.println(localN+"(내부클래스의 맴버 변수)");
		
		}
		
	};
	
}

public class LocalInnerCalassT2 {

	public static void main(String[] args) {
		Out o1 = new Out();
		o1.run1.run();

	}

}
