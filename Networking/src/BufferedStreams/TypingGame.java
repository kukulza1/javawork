package BufferedStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader("word.txt"));
			String data;
			String[]word = null;
			while((data =br.readLine())!=null) {
				word = data.split(" ");
			}
			Scanner sc = new Scanner(System.in);
			int n =1;//문제번호
			double start,end;
			System.out.println("타자연습게임-준비되면 엔터");
			sc.nextLine();
		    start = System.currentTimeMillis();
		    while(n<3) {
		    	System.out.println("문제"+n);
		    	int rnd = (int)(Math.random()*word.length);
				System.out.println(word[rnd]);
		    	//String Q = word[rnd];
		    	//System.out.println(Q);
		    	
		    	String answer = sc.nextLine();
		    	if(answer.equals(word[rnd])) {
		    		System.out.println("통과!");
		    		n++;
		    	}else {
		    		System.out.println("오타! 다시도전");
		    	}
		    }
			end = System.currentTimeMillis();
			System.out.printf("게임끝 소요시간:%.2f초",(double)(end-start)/1000);
		    sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
