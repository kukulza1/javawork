package dataInputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx1 {

	public static void main(String[] args) {
		// 입력스트림 객체를 생성
		try {
			InputStream is = new FileInputStream("C:/File/test1.db");
			while(true) {
				int data=is.read();
				if(data==-1)  break;//==-1 (데이터가 없음)
				System.out.println((char)data);
			}
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
