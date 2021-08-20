package listapi;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// normal array and ArrayList 
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.10);
		al.add("Ravi");
		System.out.println(al);
		System.out.println(al.get(1));
		al.add(1, 20);
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		al.set(1, 200);
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		//al.remove(10);					// by default index position 
		al.remove(new Integer(10));	// remove by value 
		//al.remove(1);						// remove by index 
		System.out.println(al);
	}

}
