package network.socket3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class EcoClient {

	public static void main(String[] args) {
		//Socket 객체 생성및 연결요청
		try {
			Socket socket = new Socket("localhost",50001);
			System.out.println("[클라이언트연결성공]");
			
			//데이터 보내기
			String sendMessage="오늘도 즐거운하루!";
			OutputStream os = socket.getOutputStream();
			byte[] bytes = sendMessage.getBytes("utf-8");//인코딩
			os.write(bytes);
			os.flush();
			System.out.println("[클라이언트]데이터 전송:"+sendMessage);
			
			//서버가 보낸 데이터 받기
			InputStream is = socket.getInputStream();
			bytes= new byte[1024];
			int readBytes = is.read(bytes);
			
			//디코딩
			String receiveM = new String(bytes, 0, readBytes, "utf-8");
			System.out.println("[클라]데이터 받음:"+receiveM);
			
			socket.close();
			System.out.println("[클라이언트연결해제]");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
