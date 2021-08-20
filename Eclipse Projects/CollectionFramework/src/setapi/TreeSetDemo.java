package setapi;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// it internally implements SortedSet interface. 
		TreeSet ts = new TreeSet();			// by default asc order. 
		ts.add(4);
		ts.add(1);
		ts.add(2);
		ts.add(5);
		System.out.println(ts.headSet(3));
		System.out.println(ts.tailSet(3));
		//ts.add(10.10);
		ts.add(3);
		System.out.println(ts);
	}

}
