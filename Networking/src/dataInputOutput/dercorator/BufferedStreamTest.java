package dataInputOutput.dercorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamTest {

	public static void main(String[] args) {
		//보조스트림은 단독으로 사용불가
		//기반스트림을 생성자로 사용하여 쓸수있음
		String originFile = "C:/File/harvest1.jpg";
		String copyFile = "C:/File/harvest3.jpg";
		long start,end;//시간측정 변수
		
		try {
			InputStream is = new FileInputStream(originFile);
			OutputStream os = new FileOutputStream(copyFile);
			
			//보조스트림객체생성
			BufferedInputStream bis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			start = System.currentTimeMillis();
			 int data;
			 while((data=bis.read())!=-1) { //바이트 데이타 읽음
				 bos.write(data);//바이트 데이터 쓰기
			 }
			 bis.close();
			 bos.close();
			 end = System.currentTimeMillis();
			 System.out.println("복사소요시간"+(end-start)+"ms");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
