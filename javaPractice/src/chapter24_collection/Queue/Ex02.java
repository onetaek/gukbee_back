package chapter24_collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

class Message{
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}

public class Ex02 {
	//Queue를 이용한 메시지 큐
	public static void main(String[] args) {
		//Stack은 clas 이지만 Queue은 interface
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "길동"));
		messageQueue.offer(new Message("sendSMS", "성훈"));
		messageQueue.offer(new Message("sendKaKakaotalk", "두께"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냈습낟.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 메일을 보냈습낟.");
				break;
			
			case "sendKaKakaotalk":
				System.out.println(message.to + "님에게 메일을 보냈습낟.");
			break;
			}
		}
	}

}
