package com;

import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {
		LinkedList ll  = new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(300);
		ll.add(400);
		ll.add(400);
		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
	}

}
