package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ObjectInOutStreamTest {

	public static void main(String[] args) {
		// 맴버의객체를 역직렬화 해서 파일에 쓰기
		//인코딩(encording-코드화하다(이진수)<->디코딩(decording-코드를 푸는것)
		//역직렬화 저장된 내용이나 전송받은 내용을 다시 복원(디코딩)하는것
		try(OutputStream os= new FileOutputStream("object.dat");
			ObjectOutputStream oos = new ObjectOutputStream(os)){
			Member m1 = new Member("ssb123","승범");
			product p1 = new product("스마트폰",1200000);
			int num[] = {1,2,3,4};
			
			//파일에 쓰기
			oos.writeObject(m1);
			oos.writeObject(p1);
			oos.writeObject(num);
			
			
			oos.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		//객체를 역직렬화 해서 파일에서읽기
		try(InputStream is= new FileInputStream("object.dat");
				ObjectInputStream ois= new ObjectInputStream(is)){
		//파일을 읽어서 객체로 복원
		Member m2= 	(Member)ois.readObject();
		product p2 =(product)ois.readObject();
		int[] num1 = (int[])ois.readObject();
		System.out.println(m2);
		System.out.println(p2);
		System.out.println(Arrays.toString(num1));
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
