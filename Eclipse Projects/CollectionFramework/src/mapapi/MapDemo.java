package mapapi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(2, "Raj");							// unorder 
		hm.put("abc","Raju");
		hm.put(3,"Rajesh");
		System.out.println(hm);
//		System.out.println(hm.get(1));
//		System.out.println(hm.containsKey(1));
//		System.out.println(hm.containsValue("Raju Kumar"));
//		LinkedHashMap hm = new LinkedHashMap();			// order 
//		hm.put(2, "Raj");
//		hm.put(1,"Raju");
//		hm.put(3,"Rajesh");
//		System.out.println(hm);
		
//		TreeMap hm = new TreeMap();			// asc order as a key 
//		hm.put(2, "Raj");
//		hm.put(1,"Raju");
//		hm.put(3,"Rajesh");
//		System.out.println(hm);

		// Hashtable 			by default method are synchronized. 
	}

}
