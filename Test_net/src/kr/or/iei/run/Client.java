package kr.or.iei.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		try {
			//서버에 연결요청 및 객체 생성
			Socket socket = new Socket("localHost",8000);
			System.out.println("클라연결성공");
			
			//데이터 보내기(송신)
			String sendM ="자바 네트워크 프로그래밍";
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF(sendM);
			dos.flush();
			System.out.println("클라이언트 데이터 전송:"+sendM);
			
			//데이터받기(수신)
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String receiveM = dis.readUTF();
			System.out.println("[클라] 데이터를 받음:"+receiveM);
			
			
			
			
			
			socket.close();
			System.out.println("클라연결해제");
		} catch (UnknownHostException e) {//host컴퓨터이름이 잘못됬을때
			e.printStackTrace();
		} catch (IOException e) {//ip,port번호에 에러가 발생했을때
			e.printStackTrace();
		}

	}

}
