package dataInputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest {

	public static void main(String[] args) {
		String originFile = "C:/File/harvest1.jpg";
		String copyFile = "C:/File/harvest2.jpg";
		try {
			InputStream is = new FileInputStream(originFile);//원본파일
			OutputStream os = new FileOutputStream(copyFile);
			while(true) {
				int num = is.read();
				if(num == -1)break;
				os.write(num);//파일에 쓰기
			}
			os.flush();//버퍼비우기
			is.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
