package datareaderwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadEx1 {
	public static void main(String[] args) {
		//try 객체생성~catch
		try(Reader read1 = new FileReader("c:/File/test.txt");) {
			while(true) {
					int data = read1.read();
					//System.out.println(data);
					if(data==-1)break;
					System.out.print((char)data+" ");
			   }
			}catch (IOException e1) {
			   e1.printStackTrace();
} 
}
}
