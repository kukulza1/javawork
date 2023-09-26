package dataInputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest2 {
    //close()사용하지않는방법:try~with~resource문
	public static void main(String[] args) {
		//바이트 단위로 읽어서 쓰기(복사)
		String originFile = "C:/File/harvest1.jpg";
		String copyFile = "C:/File/harvest2.jpg";
		long start,end;//시간측정 변수
		 
			try(InputStream is = new FileInputStream(originFile);//원본파일
			OutputStream os = new FileOutputStream(copyFile);){
				start=System.currentTimeMillis();
					
			while(true) {
				int data = is.read();
				if(data == -1)break;
				os.write(data);//파일에 쓰기
			}
		 /* byte[] data = new byte[1024];
		  
		  while(true) {
			  int readbyte = is.read(data);
			  if(readbyte == -1)break;
			  for(int i=0; i<readbyte; i++) {
				  os.write(data[i]);
			  }
		  }*/
		  
			os.flush();//버퍼비우기
			end = System.currentTimeMillis();//복사후 시간
			System.out.println("복사소요시간"+(end-start)+"ms");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	

	}

}
