package calctime;

public class SystemTime {

	public static void main(String[] args) {
		// 성능 테스트 소요 시간 측정 -ms,ns
		
		
		//long st = System.currentTimeMillis();//현재까지의 시간(밀리초)
		long st = System.nanoTime();
		long sum =0;
		for(int i=1; i<1000000; i++) {
			sum += i;
		}
           //System.out.println(sum);
           
           //long end= System.currentTimeMillis();
		long end = System.nanoTime();
           System.out.println(sum);
           System.out.println((end-st)/1000000);
	}
	

}
