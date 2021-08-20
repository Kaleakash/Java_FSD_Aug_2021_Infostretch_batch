package mapapi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapRetrieve {

	public static void main(String[] args) {
		Map hm = new HashMap();
		hm.put(1,"Raj");
		hm.put(2,"Ramesh");
		hm.put(3,"Raju");
		// converting map to set 
		Set ss =  hm.entrySet();
		Iterator ii = ss.iterator();
		while(ii.hasNext()) {
			//Object obj = ii.next();
			//System.out.println(obj);
			Map.Entry me = (Map.Entry)ii.next();
			System.out.println(me.getKey()+"------------- "+me.getValue());
		}
		
	}

}
