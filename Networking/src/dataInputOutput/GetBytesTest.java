package dataInputOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class GetBytesTest {

	public static void main(String[] args) {
		//outputStream은 문자열 쓰기를 지원하지 않지만
		//string클래스가 getBytes()를 지원해줌
		//바이트 기반으로 데이터 보내기
        try(OutputStream os = new FileOutputStream("C:/File/out.txt")) {
			String data = "hi.\n좋은하루되세여";
			
			
				os.write(data.getBytes());
				os.flush();//잔류버퍼비우기
				//os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
