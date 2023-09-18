package typingGame;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		//영어 단어가 무작위로 화면에 출제되면 타이핑하기
		//오타가 없으면"통과",오타가 있으면"다시 도전"
		//10문제 수행
		//시간측정
		
		String[] words = {"ant","bear","chicken","cat","dog","eagle","frog","horse","monkey","tiger"};
		Scanner sc =new Scanner(System.in);
          int n =1;
          double start, end;
          System.out.println("영타게임, 준비되면 엔터");
          sc.nextLine();
          start = System.currentTimeMillis();//시작전시간
          
          
		while(n < 5) {
		//System.out.println(words.length);
		int rand=(int)(Math.random()*words.length);
		
		System.out.println("문제"+n);
		
		String question = words[rand];
		
		System.out.println(question);
		
		String answer = sc.nextLine();
		
		if(question.equals(answer)) {
			
			System.out.println("통과!");
			
			n++;
		}else {
			System.out.println("오타! 재도전");
		}
		
    
	}
		end = System.currentTimeMillis();
		System.out.println("게임끝 소요시간:"+(end-start)/1000+"초입니다.");
		 sc.close();
	}
	
	
}
