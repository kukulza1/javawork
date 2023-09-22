package collection.list.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> dic = new HashMap<>();
		
		//단어와 정의 만들기
		dic.put("2진수", "컴퓨터가 사용함");
		dic.put("알고리즘", "어떤문제를 해결하기위해 정해진 절차");
		dic.put("버그", "프로그램이 적절하게동작하는데 실패하거나오류가 발생하는코드");
		dic.put("깃허브", "분산버전 관리틀인 깃 저장소 호스팅을 지원하는 웹서비스");
		
		//String word = dic.get("깃허브");
		//System.out.println(word);
		
		//UI생성
		System.out.println("==========================");
		System.out.println("프로그램을 종료하려면 q또는Q를 입력하고Enter키를 누르세요");
		System.out.println("===========================");
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("검색할 단어를 입력하시오.");
			String word = sc.nextLine();//입력대기중
		
			//종료하기
			//대문자를 소문자로 변환하는 문자열 함수 -toLoweCase()
			if(word.toLowerCase().equals("q")) {
				System.out.println("프로그램을 종료합니다.");
			    break;
			}
			
			String define = dic.get(word);
			if(define != null) {
			System.out.println(define);
			break;
			}else {
				System.out.println(word+"는 없는단어입니다");
			}
			sc.close();
		}
	
	}
}


