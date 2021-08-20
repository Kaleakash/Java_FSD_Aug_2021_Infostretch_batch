package queueapi;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		// Queue : First In First Out 
		//Priority queue first in first out base upon the priorty 
		PriorityQueue pq =  new PriorityQueue();
		pq.add(3);
		//pq.add(1);
		pq.add(2);
		pq.add(6);
		pq.add(4);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}
}
