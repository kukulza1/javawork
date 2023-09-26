package datareaderwriter;

import java.io.Writer;
import java.io.FileWriter;
import java.io.IOException;

public class WriteEX1 {

	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("c:/File/test.txt");
		char a = 'A';
		char b = 'B';
		
		char[] arr = {'c','d','e'};
		
		String str = "kukulza";
		
	
		
		writer.write(a);
		writer.write(b);
		writer.write(str);
		writer.write(arr);
		
		writer.flush();
		writer.close();
		
		
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
