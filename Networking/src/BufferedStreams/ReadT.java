package BufferedStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadT {

	public static void main(String[] args) {
        try {
			BufferedReader br = new BufferedReader(new FileReader("word.txt"));
			
			String data;
			String[]word = null;
			while((data =br.readLine())!=null) {
				//System.out.println(data);
				word = data.split(" ");
			}
		/*int dice =	(int)(Math.random()*6+1);
		System.out.println(dice);*/
			int rnd = (int)(Math.random()*word.length);
			System.out.println(word[rnd]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
