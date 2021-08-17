package com;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(2, "Raj");
		hm.put(1, "Raju");
		hm.put(3, "Ramesh");
		hm.put(2, "Ravi");
		hm.put(null, "Vijay");
		hm.put(null,"Ajay");
		hm.put(7, null);
		hm.put(6, null);
		System.out.println(hm);
	}

}
