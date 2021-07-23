package com.sunil.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NameMapTester {

	public static void main(String[] args) {

		Map<String, String> nameAndfavFood = new HashMap<String, String>();
		nameAndfavFood.put("sunil", "MuttonBiriyani");
		nameAndfavFood.put("sachin", "masala dosa");
		nameAndfavFood.put("Darshan", "ChickenBiriyani");
		nameAndfavFood.put("Aishwarya", "Anna Sambar");
		nameAndfavFood.put("Mridula", "FishCurry");

		System.out.println(nameAndfavFood.size());

		Set<String> key = nameAndfavFood.keySet();

		Iterator<String> it = key.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
			
		}
		
		Collection<String> values = nameAndfavFood.values();
		Iterator<String> itvalues = values.iterator();
		while(itvalues.hasNext()) {
			String st = itvalues.next();
			System.out.println(st);
		}
		
		for(String a :nameAndfavFood.keySet()){
			System.out.println("key : "  + a + "values "  + nameAndfavFood.get(a));
		}


	}

}
