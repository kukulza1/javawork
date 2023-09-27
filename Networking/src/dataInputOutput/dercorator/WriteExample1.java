package dataInputOutput.dercorator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample1 {

	public static void main(String[] args) {
		//파일에 문자열 쓰기- writer->FileWriter
		try(Writer writer = new FileWriter("message.txt")){
			
			//문자열쓰기
			String msg="좋은 하루입니다!!\n행운을 빕니다\n감삼다.";
			writer.write(msg);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
