package regexp;

import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) {
         //전화번호 형식 검증-경로 슬래시('\')와구분을위해서 한개 더블임 
		//'\d'는[0-9]와 같음 //{3,4}-최소 3개,최대3개
		String regExp ="(02|010)-\\d{3,4}-\\d{4}";
		String phone = "010-1234-5678";
		//matches()는 검증결과를 true false로 반환함
		boolean result = Pattern.matches(regExp, phone);
		
		//System.out.println(result);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과일치하지 않습니다.");
		}
		//계좌번호
		regExp = "\\d{2}-\\d{2,3}";
		String account = "aa-12-334";
		result = Pattern.matches(regExp, account);
		if(result) {
			System.out.println("올바른 형식입니다");
		}else {
			System.out.println("계좌번호형식이 아닙니다 올바른형식으로 입력해 주세요");
		}
	}

}
