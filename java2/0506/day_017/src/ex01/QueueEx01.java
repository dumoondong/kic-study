package ex01;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("홍길동");
		queue.offer("박문수");
		queue.offer("이몽룡");
		
		System.out.println(queue.toString());
		//System.out.println(queue.poll());
		System.out.println(queue.toString());
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
