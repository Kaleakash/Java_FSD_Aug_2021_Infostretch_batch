package setapi;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashDemo {

	public static void main(String[] args) {
		HashSet ls = new HashSet();							// random 
		//LinkedHashSet ls = new LinkedHashSet();		maintain order. 
		ls.add(30);
		ls.add(10);
		ls.add(20);
		ls.add(50);
		ls.add(70);
		ls.add(40);
		System.out.println(ls);
	}

}
