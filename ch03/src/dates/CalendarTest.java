package dates;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		//연도
		int year = cal.get(Calendar.YEAR);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.print(year+"년");
	
		
		//월(배열 기준- 0:1월)
       int month = cal.get(Calendar.MONTH)+1;
       System.out.print(month+"월");
       
       //일(date)
       int date = cal.get(Calendar.DATE);
       System.out.print(date+"일");
       
       //요일(day) 1:일 2:월 3:화 4:수 5:목 6:금 7:토
       int day = cal.get(Calendar.DAY_OF_WEEK);
       //System.out.print(day);
       
       String[] days = {"일","월","화","수","목","금","토"};
       
       System.out.print(days[day-1]+"요일");
       
       //시간
       System.out.print(cal.get(Calendar.HOUR)+"시");
       //분
       System.out.print(cal.get(Calendar.MINUTE)+"분");
       //초
       System.out.print(cal.get(Calendar.SECOND)+"초");
       
	}

}
