package chatroom;

import java.io.IOException;
import java.net.DatagramSocket;

public class ChatRoom {
	public static void main(String[] args) throws IOException {
		DatagramSocket dsSend = new DatagramSocket();
		DatagramSocket dsReceive = new DatagramSocket(6545);
		
		Thread t1= new Thread(new SendThread(dsSend));
		Thread t2 = new Thread(new ReceiveThread(dsReceive));
		
		t1.start();
		t2.start();
		
		
	}
}
