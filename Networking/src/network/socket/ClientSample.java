package network.socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSample {

	public static void main(String[] args) {
		//Socket 객체 생성및 연결요청
		try {
			Socket socket = new Socket("localhost",50001);
			System.out.println("[클라이언트연결성공]");
			
			socket.close();
			System.out.println("[클라이언트연결해제]");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
