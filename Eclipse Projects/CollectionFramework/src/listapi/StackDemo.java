package listapi;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack ss = new Stack();
		System.out.println("Size "+ss.size());
		ss.push(100);
		ss.push(200);
		ss.push(300);
		ss.push(400);
		System.out.println(ss);
		System.out.println(ss.pop());   // it remove top most element 
		System.out.println(ss);
		System.out.println(ss.peek()); // it display top most element but doesn't remove 
		System.out.println(ss);
		System.out.println("Search "+ss.search(300));		// element postion from top 
		System.out.println("Search "+ss.search(1000));		// -1 if not present
	}

}
