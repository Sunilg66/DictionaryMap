package com.sunil.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AadharMapTester {

	public static void main(String[] args) {
		
		Map<Long,Long> aadharAndMobile = new HashMap<Long,Long>();
		aadharAndMobile.put(850146825670l, 8861484849l);
		aadharAndMobile.put(970525425425l, 9647894152l);
		aadharAndMobile.put(327912518563l, 8861947528l);
		aadharAndMobile.put(648791505515l, 8174524986l);
		aadharAndMobile.put(379014056552l, 7754832255l);
		
		System.out.println(aadharAndMobile.size());
		
		System.out.println(aadharAndMobile.containsKey(970525425425l));
		
		System.out.println(aadharAndMobile.containsValue(8861484849l));
		
		Set<Long> key = aadharAndMobile.keySet();
		Iterator<Long> it = key.iterator();
		for(Long val  : aadharAndMobile.keySet()) {
			System.out.println(" aadharnum : " + val);
		}
		
		Collection<Long> values = aadharAndMobile.values();
		Iterator<Long> itvalues = values.iterator();
		while(itvalues.hasNext()) {
			Long num = itvalues.next();
			System.out.println("mobile num : " + num);
		}	
		
		
		Set<Long> keyset = aadharAndMobile.keySet();
		Iterator<Long> itr = keyset.iterator();
	    while(itr.hasNext()) {
	    	Long val = itr.next();
	    	Long value = aadharAndMobile.get(val);
	    	System.out.println(" key : " + val + " " + "values : " + value);
	    }
		

	}

}
