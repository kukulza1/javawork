package dataInputOutput.dercorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataINOutputTest {

	public static void main(String[] args) {
		//정수,실수,문자열쓰기
		
		try {
			//기반스트림
			OutputStream os = new FileOutputStream("./data.db");
			//보조스트림
			DataOutputStream dos = new DataOutputStream(os);
			
			//기본타입자료쓰기
			dos.writeInt(1); //정수형자료
			dos.writeUTF("승범");//문자열 자료
			dos.writeDouble(99.3);
			
			dos.writeInt(2);
			dos.writeUTF("우영우");
			dos.writeDouble(93.2);
			
			dos.flush();
			dos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		//바이트 데이터 읽기
		try(InputStream is = new FileInputStream("./data.db");
			DataInputStream dis = new DataInputStream(is)){

            //기본타입 읽기
			for(int i=0;i<2;i++) {
			int num = dis.readInt();
			String name = dis.readUTF();
			double score = dis.readDouble();
			System.out.println(num+":"+name+":"+score);
			}
		}catch(IOException e){
			e.printStackTrace();
	}

}
}
