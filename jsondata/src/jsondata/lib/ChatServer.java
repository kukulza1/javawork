package jsondata.lib;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;

public class ChatServer {
	ServerSocket serverSocket;
	ChatServer cs;
	//스레드풀
	ExecutorService threadPool = Executors.newFixedThreadPool(100);
	
	//채팅방
	//Map<>
	Map<String,SocketClient> chatroom=
			Collections.synchronizedMap(new HashMap<>());
	
	public void start() throws IOException { 
	
			serverSocket = new ServerSocket(6000);
			System.out.println("[서버]시작");
			//항상연결대기 - 스레드 만들기
			Thread thrd = new Thread() {
				public void run() {
					try {
						while(true) {
							//연결수락및 소켓 객체 생성
							Socket socket = serverSocket.accept();
							//소켓 클라이언트 객체생성
							SocketClient sc =  new SocketClient(ChatServer.this,socket);
							}
					}catch(IOException e) {
						e.printStackTrace();
					}
				}
			
	

				

		
		//클라이언트와 통신할 소켓 추가
			public void addSocketClient(SocketClient cs) {
				String key = cs.chatname+"@"+cs.clientIp;
				chatroom.put(key, cs);
				System.out.println("입장:"+key);
				System.out.println("현재채팅자수"+chatroom.size()+"\n");
			}
			public void removeSocketClient(SocketClient cs) {
				String key = cs.chatname+"@"+cs.clientIp;
				chatroom.remove(key);
				System.out.println("나감"+key);
				System.out.println("현재채팅자수"+chatroom.size()+"\n");
			}
			
			public void sendToall(SocketClient sender,String message) {
				JSONObject root = new JSONObject();
				root.put("clientIp", sender.clientIp);
				root.put("chatname", sender.chatname);
				root.put("message", message);
				String json = root.toString();//문자열 얻기
				
				//반복자 얻기
				Collection<SocketClient> socketClient = chatroom.values();
				for(SocketClient sc:socketClient) {
				sc.send();
				}
				
			
				//key:채팅방이름
				//String key = SocketClient.ch
			}
					
			
		
	
	
	
	public void stop() {
		try {
			serverSocket.close();
			threadPool.shutdown();
			System.out.println("서버종료됨");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
		ChatServer cserver = new ChatServer();
		cserver.start();
		
		System.out.println("===================================================");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요.");
		System.out.println("===================================================");
		
  Scanner sc = new Scanner(System.in);
		
		while(true) {
			String key = sc.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		sc.close();
		cserver.stop();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
			}
	




