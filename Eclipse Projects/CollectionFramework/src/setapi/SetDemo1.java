package setapi;

import java.util.HashSet;
class A {}
class B {}
public class SetDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		int a=10;								// primitive 
		System.out.println(a);
		Integer b = new Integer(a);		// wrapper class		object  
		float c = b.floatValue();			// float value. 		primitive of type float 
		System.out.println(b);
		Integer d = 20;		// auto-boxing : converting primitive to Integer object. 	
		
		hs.add(b);
		hs.add(d);				// auto-boxing : converting Integer object to Object class object 
			hs.add(30);		// auto-boxing : converting primitive to Object class object 
								hs.add(10.20);
		hs.add("Raj");
		
		A obj1 = new A();
		hs.add(obj1);
		B obj2 = new B();
		hs.add(obj2);
	}

}
