package chapter24_collection.Queue;

import java.util.LinkedList;
	
/**
 * 1. enQueue : 큐의 맨뒤에 값을추가
 * 2. deQueue : 큐의 맨 앞의 자료 제거
 * @author Administrator
 *
 */

class MyQueue{
	private LinkedList<String> linkedList = new LinkedList<String>();
	
	public void enQueue(String data) {
		linkedList.add(data);//큐의 맨 뒤에 추가
	}
	public String deQueue() {
		int len = linkedList.size();
		if(len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return (linkedList.remove(0)); // 맨 앞의 자료 반환하고 배열에서 제거.
	}
	
	public String peek() {
		int len = linkedList.size();
		if(len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return (linkedList.get(len -1)); //맨뒤에 있는 자료 반환
	}
}

public class Ex01 {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.peek());
		System.out.println(queue.deQueue());
		System.out.println(queue.peek());
		System.out.println(queue.deQueue());
		System.out.println(queue.peek());
	}
}
