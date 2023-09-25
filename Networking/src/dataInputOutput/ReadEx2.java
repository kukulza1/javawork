package dataInputOutput;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		InputStream is =new FileInputStream("C:/File/test1.db");
		
		byte[]data = new byte[1024];//데이터를 읽을 배열 생성
		while(true) {
			int num=is.read(data); //배열을 읽을 바이트 수
			if(num==-1)  break;
			for(int i=0; i<num; i++) {
				System.out.println(data[i]+" ");
			}
			
		}
		is.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}

	}

}
