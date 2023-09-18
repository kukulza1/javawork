package constant;

public class PrintFormat {

	public static void main(String[] args) {
		// printf("문자열 포맷",객체)
		//대응 서식 :정수 %d 실수 %f 문자%s
		//줄바꿈 문자 \n,탭(띄어쓰기), \t
		
		int year =2023;
		System.out.println("올해는"+year+"입니다.");
		System.out.printf("올해는 %d년 입니다.\n",year);
		
		float weight=63.7f;
		System.out.printf("그것의 무게는 %.2f입니다\n",weight); //%f %.2f
		
		String nick="얼음공주";
				System.out.printf("그녀의 별명은 %s입니다\n",nick);
				
		// /t 용법
				//int n= 0; //0으로 초기화
				//n=n+1;//n +=1;
				String table="";// 빈문자열 초기화
				table +="------------------\n";
				table +="이름\t나이\t나라\n";
				table +="강감찬\t82\t고려\n";
				table +="------------------\n";
				System.out.println(table);
                
	}

}
