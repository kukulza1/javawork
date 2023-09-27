package dataInputOutput.dercorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineTest2 {

	public static void main(String[] args) {
		//FileReader에 버퍼드리더 보조스트림연결
		try(BufferedReader br = new BufferedReader(
				new FileReader("src/dataInputOutput/dercorator/ReadLineTest2.java"))){
			int lineNo = 1;//행변수
			
			while(true) {
				String data = br.readLine();//1행
				if(data == null)break;
				System.out.println(lineNo+" "+data);
				lineNo++;//행 수 1증가
			}
			
		}catch(IOException e){
			e.printStackTrace();
			
		}

	}

}
