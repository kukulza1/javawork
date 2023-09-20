package costant.enums;

import java.util.Calendar;

public class EnumWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today;
		
		Calendar cal = Calendar.getInstance();
		int week =cal.get(Calendar.DAY_OF_WEEK);
		
		Week today1 = null;
		
		switch(week) {
		case 1:
			today1=Week.SUNDAY; break;
		case 2:	
			today1=Week.MONDAY; break;
		case 3:	
			today1=Week.TUESDAY; break;
		case 4:	
			today1=Week.WEDNESDAY; break;
		case 5:	
			today1=Week.THURSDAY; break;
		case 6:	
			today1=Week.FRIDAY; break;
		case 7:	
			today1=Week.SATURDAY; break;
		default:
			System.out.println("요일이 없습니다.");
		}
		System.out.println("today is " +today1);
		
		if(today1 == Week.SUNDAY) {
			System.out.println("일요일에는 영화보러갑니다");
		}else {
			System.out.println("열공합니다.");
		}
		

	}

}
