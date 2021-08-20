package setapi;

import java.util.HashSet;

public class SetDemo2 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		System.out.println("It is empty "+hs.isEmpty());
		System.out.println("Size "+hs.size());
		hs.add(20);
		hs.add(10);
		hs.add(40);
		hs.add(50);
			hs.add(50);
		hs.add(30);
		hs.add(null);
			hs.add(null);
		System.out.println(hs);
		hs.remove(10);
		System.out.println(hs);
		System.out.println("Search "+hs.contains(40));
		System.out.println("Search "+hs.contains(100));
		System.out.println("It is empty "+hs.isEmpty());
		System.out.println("Size "+hs.size());
	}

}
