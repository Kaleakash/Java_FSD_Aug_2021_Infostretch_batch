package listapi;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LinkedList use Node concept. 
		// single linked list node divided into two parts 
		// value and reference of next element. 
		// double linked list node divieded into three parts pre ref value next ref 
		// in double linked list first node pre ref link to null and last node next ref refer node
		// circular linked list all node are connected to each other using ref. 
		// by default Java pre-defined API use double linked list 
		LinkedList ll = new LinkedList();
		ll.add(10);
									ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(1, 100);
		System.out.println(ll);
		ll.addFirst(1000);
		ll.addLast(2000);
		System.out.println(ll);
		
	}

}
