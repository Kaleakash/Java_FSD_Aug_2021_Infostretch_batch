package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

	public static void main(String[] args) {
		// List API without Generics 
//		List ll = new ArrayList();
//		ll.add(10);
//		ll.add(10.10);
//		ll.add("Raj");
//		ll.add(20);
//		
//		Object	obj = ll.get(1);
//		Integer i = (Integer)obj;
//		int n = i.intValue();
//		System.out.println(n);
		// Collection Framework with Generics 
		// CollectionClass<Type> referenceName = new ClassName<Type>();
		//Integer, Float, Double, String, Employee, Customer, 
		List<Object> ll = new ArrayList<>();
		ll.add(10);
		ll.add(10.10);
		ll.add("Raj");
		ll.add(20);
		
		List<String> list = new ArrayList<String>();
		list.add("Raj");
		list.add("Raju");
		list.add("Ram");
		list.add("Ali");
		
		String name = list.get(0);		// auto-unboxing : converting object to string / primitive 
		System.out.println(name);
		
	}

}
