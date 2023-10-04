package jsondata.lib;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketClient {
	ChatServer cs;
	Socket socket;
	String clientIp;
	String chatname;
	DataInputStream dis;
	DataOutputStream dos;
	
	public  SocketClient(ChatServer cs, Socket socket) {
		try {
			this.cs=cs;
			this.socket = socket;
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			
			InetSocketAddress isa =
					(InetSocketAddress)socket.getRemoteSocketAddress();
			   this.clientIp = isa.getHostString();
			} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void receive() {
		try {
			ChatServer.threadPool.execute(()->{
				while(true) {
					String receiveJson = dis.readUTF();
				
			JSONObject = new JSONObject(reciveJson);
			
			String command = jsonObject.getString("command");
			switch(command) {
			case "incoming":
				this.chatName = jsonObject.getString("data");
				break;
			case "message":
				this.chatname =jsonObject.getString("data");
				break;
			}
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		}
	}
			public void send(String json) {
				try {
					dos.writeUTF(json);
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			public void close() {
				
			}

}
