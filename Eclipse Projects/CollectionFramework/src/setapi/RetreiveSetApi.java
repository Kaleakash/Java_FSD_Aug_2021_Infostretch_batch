package setapi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RetreiveSetApi {

	public static void main(String[] args) {
	
		Set ss = new HashSet();
		ss.add(10);
		ss.add(20);
		ss.add(30);
		ss.add(40);
		System.out.println(ss);
		System.out.println("for enhanced loop");
		for(Object a:ss) {
			System.out.println(a);
		}
		Iterator ii = ss.iterator();
		while(ii.hasNext()) {
			Object obj = ii.next();
			System.out.println(obj);
		}
	}

}
