package steaminfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoSteram1 {

	public static void main(String[] args) {
	List<Integer> li = new ArrayList<>();
	li.add(10);li.add(11);li.add(12);li.add(13);li.add(14);li.add(15);
	li.add(16);li.add(16);li.add(17);li.add(18);li.add(19);li.add(20);
	Iterator<Integer> ii = li.iterator();
	int countNum=0;
	while(ii.hasNext()) {
		int n = ii.next();
		if(n%2==0) {
			countNum++;
		}
	}
	
//		Stream<Integer> ss = li.stream();
//		Stream<Integer> ss1 = ss.filter(v->v%2==0);			// get only even number 
//		ss1.forEach(v->System.out.println(v));		// destory 
		//ss.forEach(v->System.out.println(v));
		
		//li.stream().filter(v->v%2==0).forEach(v->System.out.println(v));
	//li.stream().filter(v->v%2==0).mapToInt(v->v+100) .forEach(v->System.out.println(v));
	//long count = li.stream().count();		// long 
	//long count = li.stream().filter(v->v%2==0).count();			//to find number of ever number 
	
	List<Integer>oddNumber =li.stream().filter(v->v%2 !=0 ).collect(Collectors.toList());
		oddNumber.forEach(v->System.out.println(v));
	}

}
