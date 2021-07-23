package com.sunil.dictionary;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GovtOfficialsMapTester {

	public static void main(String[] args) {
		
		Map<String,Long> govtofficialsandsal = new HashMap<String,Long>();
		govtofficialsandsal.put("President", 500000l);
		govtofficialsandsal.put("VicePresident", 400000l);
		govtofficialsandsal.put("PrimeMinister",280000l);
		govtofficialsandsal.put("Governors",350000l);
		govtofficialsandsal.put("ChiefJustice", 280000l);
		
		System.out.println(govtofficialsandsal.size());
		System.out.println(govtofficialsandsal.containsKey("PrimeMinister"));
		System.out.println(govtofficialsandsal.containsValue(500000l));
		System.out.println(govtofficialsandsal.remove("ChiefJustice"));
		System.out.println(govtofficialsandsal.size());

		
		Set<String> key = govtofficialsandsal.keySet();
		Iterator<String> it = key.iterator();
		for (String string : govtofficialsandsal.keySet()) {
			System.out.println("GovtOfficials : " + string);
			
		}
		
		for(Long sal : govtofficialsandsal.values() ) {
			System.out.println("salary : " + sal);
		}
		
		for(String a : govtofficialsandsal.keySet()) {
			System.out.println(" key : " + a + " " + "values : " + govtofficialsandsal.get(a));
		}
		
	   
	   
		
		
		
		
		

	}

}
