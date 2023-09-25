package dataInputOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx2 {

	public static void main(String[] args) {
		
		try {
		
			OutputStream os = new FileOutputStream("C:/File/test2.db");
			byte[]arr= {10,20,30,40,50};
			
			//배열의 모든바이트를 쓰기
			os.write(arr);
			
			os.flush();
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
