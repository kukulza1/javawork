package kr.or.iei.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	private static ServerSocket serversocket;

	public static void main(String[] args) {
		System.out.println("===================================================");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요.");
		System.out.println("===================================================");
		
		startServer();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String key = sc.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		sc.close();
		
		//서버종료
		stopserver();
	}
	public static void startServer() {
		//항상 대기 -스레드 만들기
		Thread thread = new Thread() {
			public void run() {
				try {
					serversocket = new ServerSocket(8000);
					System.out.println("서버시작");
					//항상 클라이언트 연결대기
					while(true) {
						System.out.println("\n서버 연결요청기다림\n");
						//서버가 연결요청 수락함
						Socket socket =  serversocket.accept();
						
						//ip확인
						InetSocketAddress isa = 
								(InetSocketAddress) socket.getRemoteSocketAddress();
						String clientIp = isa.getHostString();
						System.out.println("[서버]"+clientIp+"의 연결요청을 수락함.");
						
						//데이터 받기(수신)
						InputStream is = socket.getInputStream();
						DataInputStream dis = new DataInputStream(is);//기반스트림 생성자의 매개변수로 연결
						String message = dis.readUTF();
						System.out.println("서버 데이터 받음:"+message);
						
						//데이터 보내기(송신)
						String sm = "서버메세지 전송";
						//OutputStream os= socket.getOutputStream();
						DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						dos.writeUTF(sm);
						System.out.println("서버에서 데이터전송:"+sm);
						
						socket.close();//소켓종료
						System.out.println("서버"+clientIp+"의 연결을해제함 ");
					}
					
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("서버"+e.toString());
				}
			}
		};//스레드끝
		thread.start();
	}
	//서버 종료
	public static void stopserver() {
		try {
			serversocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("서버종료됨");
	}

}
