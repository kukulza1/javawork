package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocaldateTimeT {

	public static void main(String[] args) {
		// LocaldateTime클래스 사용
		LocalDateTime dateT = LocalDateTime.now();
		System.out.println(dateT);
		
		//날짜.시간 포맷 설정 "yyyy/mm/dd hh:mm:ss a"
		DateTimeFormatter dtFormat =
				DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss a");
		System.out.println(dateT.format(dtFormat));
		
		//날짜설정
		LocalDate date= LocalDate.now();
		System.out.println(date);
		
		//시간설정
		LocalTime time =LocalTime.now();
		System.out.println(time);
		//시간설정
		DateTimeFormatter timeformat=DateTimeFormatter.ofPattern("hh:mm:ss a");
		System.out.println(time.format(timeformat));
		
		//특정 날짜 지정하기
		LocalDate startDay = LocalDate.of(2023, 8, 1); 
		LocalDate today =LocalDate.of(2023, 9, 15);
		//지나온 날짜 계산하기
		long passedT = ChronoUnit.DAYS.between(startDay, today); 
		System.out.println(passedT + "일이 지났습니다.");
		
 
	}

}
