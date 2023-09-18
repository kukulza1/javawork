package dates;

import java.util.Calendar;

public class CalendarT2 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		//지나온 시간 측정
		//1970.1.1 자정 이후부터 측정 -밀리초
		//유닉스 시스템 소프트웨어 개시된 시간
		// ms(밀리초)=0.001 1/백만(마이크로초), 1/1억(ns,나노초)
		//System.out.println(24*60*60*1000);
		long passedT = cal.getTimeInMillis();
		
		System.out.println(passedT);
		
		//일로 환산
		passedT = passedT/(24*60*60*1000);
		System.out.println(passedT);
		
		//시작일,종료일 설정
		Calendar startDay = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		startDay.set(2023, 9, 1);
		today.set(2023, 9, 15);
	long betweenT = today.getTimeInMillis()-startDay.getTimeInMillis();
	betweenT= betweenT/(24*60*60*1000);
	System.out.println(betweenT);
	
	System.out.println(System.currentTimeMillis());
	
	System.out.println(System.nanoTime());

	}

}
