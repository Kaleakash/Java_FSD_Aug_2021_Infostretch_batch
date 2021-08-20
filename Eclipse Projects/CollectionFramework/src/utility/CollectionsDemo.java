package utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		List<String> ss = new ArrayList<>();
		ss.add("Raj");ss.add("Vijay");ss.add("Dinesh");ss.add("Mahesh");ss.add("Ajay");
		System.out.println("Before Sort");
		for(String str : ss) {
			System.out.println(str);
		}
		Collections.sort(ss);
		System.out.println("After Sort");
		for(String str : ss) {
			System.out.println(str);
		}
	}

}
