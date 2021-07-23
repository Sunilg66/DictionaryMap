package com.sunil.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountryMapTester {

	public static void main(String[] args) {
		
		Map<String, Double> nameAndPopulation = new HashMap<String, Double>();
		nameAndPopulation.put("India", 1380000.00d);
		nameAndPopulation.put("UnitedStates", 3318000.00d);
		nameAndPopulation.put("Brazil", 2208000.00d);
		nameAndPopulation.put("Russia", 1358000.00d);
		nameAndPopulation.put("Japan", 2258000.00d);
		nameAndPopulation.put("Germany", 1988000.00d);
		
		System.out.println(nameAndPopulation.size());
		
		Set<String> key = nameAndPopulation.keySet();
		
		Iterator<String> it = key.iterator();
		
		while (it.hasNext()) {
			String string = it.next();
			Double itr = nameAndPopulation.get(string);
			System.out.println("country :  " + string +" " + "population : " + itr);
			
		}
		
		Collection<Double> values = nameAndPopulation.values();
		
		Iterator<Double> itvalues = values.iterator();
		while(itvalues.hasNext()) {
			Double d = itvalues.next();
			System.out.println("population : " +  d);
		}
		
		Iterator<String> keyandvalues = key.iterator();
		while(keyandvalues.hasNext()) {
			String s = keyandvalues.next();
			System.out.println("key : " + s );
		}
		
	}

}
